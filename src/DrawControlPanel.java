// chapter 07
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawControlPanel extends JPanel
{
	private Color fillColor = Color.CYAN;
	private int ovalWidth = 90;
	
	public DrawControlPanel()
	{
		setSize( 200, 200 );
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent(g); 	// invoke the super class paint component
		this.setBackground( Color.WHITE );
		g.setColor(fillColor);
		g.fillOval(50, 50, ovalWidth, 60);
	}
	
	public void setFillColor(Color fillColor)
	{
		this.fillColor = fillColor;
	}
	
	public void setOvalWidth(int ovalWidth)
	{
		this.ovalWidth = ovalWidth;
	}
	
	public int getOvalWidth()
	{
		return ovalWidth;
	}
	
	
}