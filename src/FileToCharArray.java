import java.util.*;
import java.io.*;

public class FileToCharArray extends SimpleSound 
{
	
	private String fileName;
	
	public FileToCharArray(String fileName)
	{
		this.fileName = fileName;
	}
	
	/**
	   * Program 113: Write a sound to a file as text numbers
	   * Method to write out the values on the sound to a file as text
	   * @param fileName the name of the file to write to
	   */
	  public void writeSampleAsText(String fileName)
	  {
		  int value = 0;
		  char[] cbuf = null;
		  // try the following
		  try
		  {
			  // try to open the buffered writer
			  BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			  
			  // loop through the samples
			  for ( int i = 0; i < this.getLength(); i++)
			  {
				  // get the int value
				  value = this.getSampleValue(i);
				  
				  // write it as a string (text)
				  writer.write(String.valueOf(value));
				  
				  writer.write(cbuf );
				  
				  // add the new line
				  writer.newLine();
			  }
			  // close the writer
			  writer.close();
		  }
		  catch (Exception ex)
		  {
			  SimpleOutput.showError("Error during write");
			  ex.printStackTrace();
		  }
	  }
	
	  // program 102:
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
//				System.out.println("this is the function to pick the file");
//				SimpleOutput.showError("Couldn't find " + fileName + " please pick it.");
//				System.out.println("test before pickAFile");
//				fileName = FileChooser.pickAFile();
//				System.out.println("test after pickAFile");
				readAndPrintFile(fileName);
			}
			catch(Exception ex)
			{
				SimpleOutput.showError("Error reading file " + fileName);
				ex.printStackTrace();
			}
		}
	  
	  
	  // attempting an char array
	  public static char[] ReadFileToCharArray(String filePath) throws IOException 
	  {
			StringBuilder fileData = new StringBuilder(1000);
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
	 
			char[] buf = new char[10];
			int numRead = 0;
			while ((numRead = reader.read(buf)) != -1) 
			{
				System.out.println(numRead);
				String readData = String.valueOf(buf, 0, numRead);
				fileData.append(readData);
				buf = new char[1024];
			}
	 
			reader.close();
	 
			return  fileData.toString().toCharArray();	
		}
	  
	  
	  public static void main(String[] args)
	  {
		  
		  
		  char[] charArray = new char[100];
		  String secretMessage = FileChooser.getMediaPath("LittleMessage.txt");
		  BufferedReader buffer = new BufferedReader(new read(secretMessage));
		  int actualBuffered = buffer.read(charArray,0,100);
		  
		  
		  


//     char charArray[] = new char[ 100 ];
//     int i = 0;
//     BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//     int c = 0;
//     while((c = buffer.read()) != -1 && i < 100) 
//     {
//          char character = (char) c;
//          charArray[i++] = character;
//          i++;
//     }
//		  
		  
		  
		  
		  /////////////////////////////////////////
//		  String secretMessage = FileChooser.getMediaPath("LittleMessage.txt");
//		  FileToCharArray secretMsg = new FileToCharArray(secretMessage);
//		  System.out.println(secretMsg);
//		  secretMsg.ReadFileToCharArray(secretMsg);
		  
		  // http://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
		  
		  // read
		  SimpleReader reader = new SimpleReader();
		  reader.readAndPrintFile("LittleMessage.txt");
		  
		  
		  
//		  // write
//		  Sound s = new Sound(FileChooser.getMediaPath("her.wav"));
//		  s.writeSampleAsText(FileChooser.getMediaPath("her.txt"));
		  
		  
		  /*
		  
		  bufferedreader read into char array
		  http://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
		  java beginners bufferedwriter write char
		  
		  http://stackoverflow.com/questions/5694998/bufferedreader-values-into-char-array
		  
		   */
		  
		  
	  }
}