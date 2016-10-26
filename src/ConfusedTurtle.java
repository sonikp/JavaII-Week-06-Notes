public class ConfusedTurtle extends Turtle
{
	/**
	 * Class for confused turtle. When a confused turtle is like
	 * a but turns right when asked to turn left, and turns
	 * left when asked to turn right.
	 * @author; textbook
	 */
	
	////////////////fields////////////////////////
	
	////////////////constructor////////////////////////
	/**
	 * A constructor that takes a ModelDisplay object
	 * @param modelDisplayObj
	 */
	public ConfusedTurtle(ModelDisplay modelDisplayObj)
	{
		// use parent constructor
		super(modelDisplayObj);
	}
	


	////////////////method//////////////////////////
	/**
	 * Method to turn right (but a confused turtle
	 * will actually turn left)
	 */
	public void turnRight()
	{
		//super.turnLeft();
		super.turn(-90);
	}
	
	/**
	 * Method to turn left (but a confused turtle
	 * will actually turn right)
	 */
	public void turnLeft()
	{
		//super.turnRight();
		super.turn(90);
	}
	
	/**
	 * Method to turn by the passed degrees ( a confused turtle
	 * will turn by 360 - the passed degrees)
	 * @param args
	 */
	public void turn(int degrees)
	{
		super.turn(360 - degrees);
	}
	
	public static void main(String[] args)
	{
		World pond = new World();
		ConfusedTurtle fred = new ConfusedTurtle(pond);
		fred.turn(90);
		fred.forward();
		fred.turnLeft();
		fred.forward();
		fred.turnRight();
		fred.forward();
	}
	
}