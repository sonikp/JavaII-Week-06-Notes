import java.awt.*;

/**
 * Class to take a string and encode the string into a picture file. Also
 * then decode that same string out of the picture file.
 * 
 * 
 */


public class Steganographer extends Picture
{
	
	/////////////fields///////////////////
	private String fileName;
	
	/////////////constructors/////////
	public Steganographer()
	{
		super();
	}
	
	public Steganographer(String fileName)
	{
		super(fileName);
	}
	
	////////////methods//////////////////
	/*
	public void clearBlue()
	{
		
		
		Pixel[] pixelArray = this.getPixels();
		Pixel pixel = null;
		int index = 0;
		
			  
		for ( Pixel value : pixelArray)
		{
		
			//System.out.println(value.getBlue());
			//value.setBlue(0);
			//value.setBlue(value.getBlue());
			System.out.print("index:\t" + index + "\tred: \t" + value.getRed() + "\tgreen:\t" + value.getGreen() + "\tblue:\t" + value.getBlue() + "\n");
			index++;
		}
	}
	*/
	public void encodePicture()
	{
		Pixel[] pixelArray = this.getPixels();
		//Pixel value = null;
		Pixel currPixel = null;
		//int x,y;
		int numCount = 0;
		int colorValue = 0;
		
		for ( int i = 0; i < pixelArray.length; i++)
		{
			
			
			if (isPrime(i)) 
			{
				System.out.println(i);
				currPixel = pixelArray[i];
				//System.out.println(i);
	   			colorValue = currPixel.getRed();
	   			System.out.println(colorValue);
	   			currPixel.setRed(0);
				
				//DEBUG: System.out.print("index:\t" + i + "\tred: \t" + currPixel.getRed() + "\tgreen:\t" + currPixel.getGreen() + "\tblue:\t" + currPixel.getBlue() + "\n");
	   			numCount++;
			}
    
			
			
			
			
		}
		System.out.println(numCount++);
	}
	
	/*
	public void clearBlue3(Picture fileName )
	{

		Pixel currPixel = null;
		int x,y;
		
		// loop columns
		for ( x = 0; x < this.getWidth(); x++ )	
		{
			// loop rows
			for ( y = 0; y < this.getHeight(); y++ ) 
			{
				currPixel = this.getPixel(x, y);
				System.out.println("x\t" + x + "\ty\t" + y + "\tred: \t" + currPixel.getRed() + "\tgreen:\t" + currPixel.getGreen() + "\tblue:\t" + currPixel.getBlue());
			}
		}
		
		
		
	}
	*/
	
	public void messageArray(String message)
	{
		
	}
	
	public void reDraw()
	{
		
		
		Pixel[] pixelArray = this.getPixels();
		Pixel pixel = null;
		int x, y;
			  
		// loop through the columns
		for ( y = 0; y < this.getWidth(); y++)
		{
			// loop through rows
			for ( x = 0; x < this.getHeight(); x++)
			{
				
				//System.out.println("\ty\t" + y + "\tx\t" + x);
				pixel = this.getPixel(x, y);
				System.out.println("x\t" + x + "\ty\t" + y + "red: \t" + pixel.getRed() + "\tgreen:\t" + pixel.getGreen() + "\tred:\t" + pixel.getRed() + "\n");
			}
		
			
		}
	}
	
	
	   public static boolean isPrime(int n) 
	   {
	       if (n <= 1) {
	           return false;
	       }
	       for (int i = 2; i < Math.sqrt(n); i++) 
	       {
	           if (n % i == 0) {
	               return false;
	           }
	       }
	       return true;
	   }
	
	
	///////////////main////////////
	
	
	public static void main(String[] args)
	{
		// get read file and add characters to an array
		String secretMessage = FileChooser.getMediaPath("LittleMessage.txt");
		Steganographer stegoMessage = new Steganographer(secretMessage);
		
		
		/*
		/// get picture working///////
		String fileName = FileChooser.getMediaPath("gokart.png");	//Hungry-small.png	//gokart.png  // on this pic 522105 index's
		Steganographer steganObj = new Steganographer(fileName);
		System.out.println(steganObj);
		System.out.println("Height:\t" + steganObj.getHeight() + "\tWidth\t" + steganObj.getWidth());
		//steganObj.clearBlue();
		steganObj.encodePicture();
		steganObj.explore();
		//steganObj.clearBlue3(steganObj);
		*/
		
		
//		steganObj.reDraw();
		
//		

		/*
		// dead code from prime num generator
			int start = 1;
		   int end = 20;
		   int numCount = 0;
		   
	       for (int i = start; i <= end; i++) 
	       {
	           if (isPrime(i)) 
	           {
	               System.out.println(i);
	               numCount++;
	           }
	       }
	       System.out.println("\n\n" + numCount);
		
		*/
		
	}
	
	
}