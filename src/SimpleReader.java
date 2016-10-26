import java.io.*;

/**
 * Program 102: Sample class to read from a file
 * 
 * Class that allows you to easily read and print out the contents of a file
 * @author sonikp
 *
 */

public class SimpleReader
{
	/**
	 * Method to read a file and print out the contents
	 * @param fileName the name of the file to read from
	 */
	public void readAndPrintFile(String fileName)
	{
		String line = null;
		
		// try to do the following
		try
		{
			// create the buffered reader
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			// Loop while there is more data
			while((line = reader.readLine()) != null)
			{
				// print the current line
				System.out.println(line);
			}
			
			// close the reader
			reader.close();
		}
		catch(FileNotFoundException ex)
		{
			SimpleOutput.showError("Couldn't find " + fileName + " please pick it.");
			fileName = FileChooser.pickAFile();
			readAndPrintFile(fileName);
		}
		catch(Exception ex)
		{
			SimpleOutput.showError("Error reading file " + fileName);
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		//String fileName = FileChooser.pickAFile();
		
		
		SimpleReader reader = new SimpleReader();
		reader.readAndPrintFile("400x300.jpg");	//		test.txt
		
	}
}