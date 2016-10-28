public class Ch11Pr6CartoonPanel extends Picture
{
	/**
	 * Class for Chapter 11.6 Problems
	 * Create an array of 'Picture' objects and displays them from left to right 
	 * like a cartoon in a newspaper. Use 'scale()' to scale pictures to fit
	 */
	
	/////////////////fields/////////////////////
	private Picture[] picArray = new Picture[5];
	private int index = 0;
	
	////////constructor////////////
	public Ch11Pr6CartoonPanel()
	{}
	
	public Ch11Pr6CartoonPanel(Picture[] array)
	{
		this.picArray = array;
	}
	
	/////////////methods////////////////
	
	public void add(Picture a)
	{
		
		if (index < picArray.length)
		{
			picArray[index] = a;
			System.out.println("Pic added at index " + index);
			index++;
		}
	}
	
	public static void main(String[] args)
	{
		// set media path
		FileChooser.setMediaPath("/Users/Shared/Java-Libraries/CourseCD/mediasources/");
		
		// create Cartoon Panel object to store the array of objects
		Ch11Pr6CartoonPanel cartoonPanel = new Ch11Pr6CartoonPanel();
		
		// create the picture objects
		Picture pic1 = new Picture(FileChooser.getMediaPath("temple.jpg"));
		Picture pic2 = new Picture(FileChooser.getMediaPath("wall.JPG"));
		Picture pic3 = new Picture(FileChooser.getMediaPath("shops.jpg"));
		Picture pic4 = new Picture(FileChooser.getMediaPath("statue.jpg"));
		Picture pic5 = new Picture(FileChooser.getMediaPath("redDoor.jpg"));
		
		// add the picture objects to the array
		cartoonPanel.add(pic1);
		cartoonPanel.add(pic2);
		cartoonPanel.add(pic3);
		cartoonPanel.add(pic4);
		cartoonPanel.add(pic5);
		
		
		System.out.println(cartoonPanel.picArray[0]);
		System.out.println(cartoonPanel.picArray[1]);
		System.out.println(cartoonPanel.picArray[2]);
		System.out.println(cartoonPanel.picArray[3]);
		System.out.println(cartoonPanel.picArray[4]);
		
		// use overlap from lesson 4/5 picture class
		
		
	}
}