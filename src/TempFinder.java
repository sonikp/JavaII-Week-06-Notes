import java.io.*;

/**
 * Program 109; 
 * Class to find the temperature in a web page
 * @author sonikp
 *
 */

public class TempFinder
{
	/**
	 * Method to find the temperature in the passed file
	 * @param fileName the name of the file to look in
	 */
	public String getTemp(String fileName)
	{
		String seq = "<b>&deg";
		String temp = null;
		String line = null;
		
		// try from the file
		try 
		{
			// read from the file
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			// loop til the end of the file or find sequence
			while ((line = reader.readLine()) != null && line.indexOf(seq) < 0)
			{}
			
			// if there is a current line
			if ( line != null )
			{
				// find temperature
				int degreeIndex = line.indexOf(seq);
				int startIndex = line.lastIndexOf('>', degreeIndex);
				temp = line.substring(startIndex + 1, degreeIndex);
			}
		}
		catch (FileNotFoundException ex)
		{
			SimpleOutput.showError("Couldn't find file " + fileName);
			fileName = FileChooser.pickAFile();
			temp = getTemp(fileName);
		}
		catch (Exception ex)
		{
			SimpleOutput.showError("Error during read or write");
			ex.printStackTrace();	
		}
		return temp;
	}
	
	public static void main(String[] args)
	{
		TempFinder finder = new TempFinder();
		FileChooser.setMediaPath("/Users/Shared/Java-Libraries/CourseCD/mediasources/");
		String file = FileChooser.getMediaPath("ajc-weather.html");	// /Users/Shared/Java-Libraries/CourceCD/mediasources/ajc-weather.html
		String temp = finder.getTemp(file);
		if ( temp == null )
		{
			System.out.println("Sorry, no temp was found in " + file);
		}
		else
		{
			System.out.println("The current temperature is " + temp);
		}
	}
}

















