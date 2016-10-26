import java.io.*;

public class SimpleWriter
{
	/**
	 * Program 105
	 * Method to write a silly file
	 */
	public void writeSillyFile()
	{
		try {
			// try to open the buffered writer
			BufferedWriter writer = new BufferedWriter(new FileWriter("silly.txt"));
			// file locates into the current workspace.
			
			// write out the file
			writer.write("Here is some text.");
			writer.newLine();
			writer.write("Here is some text.");
			writer.newLine();
			writer.write("Here is some text.");
			writer.newLine();
			writer.newLine();
			writer.write("THE END");
			writer.newLine();
			writer.close();
		} catch (Exception ex) {
			System.out.println("Error during write of silly.txt");
		}
	}
	
	public static void main(String[] args)
	{
		SimpleWriter writer = new SimpleWriter();
		writer.writeSillyFile();
	}
}