// ControlFrame.java chapter 07
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ControlFrame extends JFrame
{
	private JPanel mainPanel;
	private final JPanel calcPanel;
	private JSlider widthJSlider;
	private JTextField xValTextField;
	private JTextField yValTextField;
	private JLabel calcJLabel;
	private JButton calcJButton;
	
	private String xStr;
	private String yStr;
	
	public ControlFrame(String title)
	{
		super( title );
		mainPanel = new JPanel(new BorderLayout());
		mainPanel.setSize(200, 250);
		
		calcPanel = new JPanel(new FlowLayout());
		calcPanel.setSize(200, 200);
		
		final DrawControlPanel drawPanel = new DrawControlPanel();
		drawPanel.setSize(200, 200);
		this.setContentPane( mainPanel );
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');
		JMenuItem aboutItem = new JMenuItem("About...");
		aboutItem.setMnemonic('A');
		fileMenu.add(aboutItem);
		aboutItem.addActionListener(new ActionListener() // Beginning of anonymous inner class
		{
			
			@Override
			public void actionPerformed(ActionEvent event) 
			{
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog( ControlFrame.this, "This application provides enhanced\n"
						+ "control over multimedia projects. ", "About", JOptionPane.PLAIN_MESSAGE);
				
			}
		}	// end of anonymous inner class
		);
		final JMenuBar bar = new JMenuBar();	// create a JMenuBar so we can attach menu's to it
		setJMenuBar( bar );		// Attach the JMenuBar to the ControlFrame
		bar.add(fileMenu);		// Add the file menu to the JMenuBar
		
		final JMenu colorMenu = new JMenu("Color");
		colorMenu.setMnemonic('C');
		
		JMenuItem redItem = new JMenuItem("Red");
		colorMenu.add(redItem);
		redItem.addActionListener(new ActionListener() // beginner of anonymous inner class
		{
			public void actionPerformed(ActionEvent event)
			{
				drawPanel.setFillColor(Color.RED);
				repaint();
			}
		}	// end of anonymous inner class
		);
		
		JMenuItem blueItem = new JMenuItem("Blue");
		colorMenu.add(blueItem);
		blueItem.addActionListener(new ActionListener() // beginner of anonymous inner class
		{
			public void actionPerformed(ActionEvent event)
			{
				drawPanel.setFillColor(Color.BLUE);
				repaint();
			}
		}
		);	// end of anonymous inner class
		// I'm here at the calculate menu item slide 12 on the notes @ 3:33
		// slide 13 important information on the execution of the
		// program and the different execution of the event handlers
		
		JMenuItem calcPanelItem = new JMenuItem("Calculate");
		calcPanelItem.setMnemonic('C');
		fileMenu.add(calcPanelItem);
		calcPanelItem.addActionListener(new ActionListener()
		{
			public void actionPerformed ( ActionEvent event)
			{
				bar.remove( colorMenu );
				mainPanel.remove( drawPanel);
				mainPanel.remove(widthJSlider);
				xValTextField.setText("");
				yValTextField.setText("");
				calcJLabel.setText("");
				mainPanel.add(calcPanel, BorderLayout.CENTER);
				validate();
				repaint();
			}
		}
		);
		
		JMenuItem drawPanelItem = new JMenuItem("DrawPanel");
		drawPanelItem.setMnemonic('D');
		fileMenu.add( drawPanelItem );
		drawPanelItem.addActionListener(new ActionListener()
		{
			public void actionPerformed( ActionEvent event )
			{
				mainPanel.remove(calcPanel);
				bar.add( colorMenu );
				drawPanel.setBackground( Color.WHITE);
				mainPanel.add( drawPanel, BorderLayout.CENTER);
				mainPanel.add( widthJSlider, BorderLayout.SOUTH);
				validate();
				repaint();
			}
		}
		);
	
		JMenuItem exitItem = new JMenuItem( "Exit" );
		exitItem.setMnemonic( 'x');
		fileMenu.add( exitItem );
		exitItem.addActionListener( new ActionListener() 
		{

			public void actionPerformed(ActionEvent event) 
			{
				System.exit(0);
				
			}
		}
		);
		
		widthJSlider = new JSlider( SwingConstants.HORIZONTAL,0,100, drawPanel.getOvalWidth());
		widthJSlider.setMajorTickSpacing(10);
		widthJSlider.setPaintTicks( true );
		
		widthJSlider.addChangeListener(new ChangeListener() 
		{
			
			public void stateChanged(ChangeEvent e) 
			{
				drawPanel.setOvalWidth( widthJSlider.getValue());
				repaint();
				
			}
		});
	}// slide 15
}








