import java.util.Random;
/**
 * Class to generate random sentences
 * @author sonikp
 *
 */

public class SentenceGenerator
{
	///////////////////fields////////////////
	private String[] nounArray = {"Mark", "Adam", "Angela", "Larry", "Jose", "Matt", "Jim"};
	private String[] verbArray = {"runs", "skips", "sings", "leaps", "jumps", "climbs", "argues", "giggles"};
	private String[] phraseArray = {"in a tree", "over a log", "very loud", "around the bush", "while reading the newspaper",
			"very badly", "while skipping", "instead of grading"};
	private Random randGen  = new Random();
	
	//////////////////methods/////////////////
	/**
	 * Method to generate a random sentence
	 * @return a random sentence
	 */
	public String generateRandomSentence()
	{
		String sentence = 
			nounArray[randGen.nextInt(nounArray.length)] + " " + 
			verbArray[randGen.nextInt(verbArray.length)] + " " +
			phraseArray[randGen.nextInt(phraseArray.length)] + ".";
		return sentence;
	}
	
	public static void main(String[] args)
	{
		SentenceGenerator sentenceGen = new SentenceGenerator();
		for ( int i = 0; i < 5; i++)
		{
			System.out.println(sentenceGen.generateRandomSentence());
		}
	}
}