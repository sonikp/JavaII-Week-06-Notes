import java.io.*;

/**
 * Program 108:
 * Class that searches a file for a given sequence and reports
 * on the name were that sequence was found
 * @author sonikp
 *
 */
public class SequenceSearcher
{
	/**
	 * Method to search for a given sequence and the report on the name
	 */
	public String getNameForSequence(String fileName, String seq)
	{
		String info = "";
		String line = null;
		String name = null;
		
		// try the following
		try
		{
			// reading from the file
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			// loop till end of file of find sequence
			while ((line = reader.readLine()) != null && line.indexOf(seq) < 0)
			{
				// add to string with new line character
				info = info + line + "\n";
			}
			
			// if get here either end of line or we found the sequence
			if(line != null)
			{
				// look backward for the last >
				int firstIndex = info.lastIndexOf('>');
				
				// look forward from the > for the newline character
				int secondIndex = info.indexOf('\n',firstIndex);
				
				// get the name between the > and newline
				name = info.substring(firstIndex + 1, secondIndex);
			}
		}
		catch (FileNotFoundException ex)
		{
			SimpleOutput.showError("Couldn't find file " + fileName);
			fileName = FileChooser.pickAFile();
			getNameForSequence(fileName,seq);
		}
		catch (Exception ex)
		{
			SimpleOutput.showError("Error during read or write");
			ex.printStackTrace();
		}
		return name;
	}
	
	public static void main(String[] args)
	{
		SequenceSearcher searcher = new SequenceSearcher();
		String fileName = FileChooser.getMediaPath("parasite.txt");
		String seq = "ttgtgta";
		String name = searcher.getNameForSequence(fileName, seq);
		if ( name == null )
		{
			System.out.println("The sequence " + seq + " wasn't found in " + fileName);
		}
		else
		{
			System.out.println("The sequence " + seq + " was found in " + name);
		}
	}
}