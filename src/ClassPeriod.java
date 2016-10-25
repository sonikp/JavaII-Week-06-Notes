public class ClassPeriod
{
	////////////////fields//////////////////
	private String teacherName;
	private int periodNumber;
	private Student[] studentArray = new Student[35];
	
	/////////////////constructors///////////////
	/**
	 * No-argument constructor. Leaves fields
	 * with default values. 
	 */
	public ClassPeriod()
	{
		
	}
	
	/**
	 * Constructor that takes the teacher's name
	 * and period number 
	 * @param name the name for the teacher
	 * @param num the number for the class period
	 */
	public ClassPeriod(String name, int num)
	{
		this.teacherName = name;
		this.periodNumber = num;
	}
	
	/////////////////////////methods/////////////////
	
	/**
	 * Method to get the teacher's name
	 * @return the name of the teacher, or null
	 * if none yet
	 */
	public String getTeacherName()
	{
		return teacherName;
	}
	
	/**
	 * Method to get the period number
	 * @return the number for this period
	 */
	public int getPeriodNumber()
	{
		return periodNumber;
	}
	
	/**
	 * Method to get a student based on the index
	 * @return the student at this index or null if none at this
	 * index
	 */
	public Student getStudent(int index)
	{
		return studentArray[index];
	}
	
	/**
	 * Method to set the teacher's name
	 * @param name the name to use 
	 */
	public void setTeacherName(String name)
	{
		this.teacherName = name;
	}
	
	/**
	 * Method to set the period number (if it hasn't been set)
	 * @param num the number to user
	 * @return flag to say if set worked
	 */
	public boolean setPeriodNumber(int num)
	{
		if (this.periodNumber == 0)
		{
			this.periodNumber = num;
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	/** 
	 * Method to set the student at an index 
	 * @param studentObj the student object to use
	 * @param index the index to set the student at
	 */
	public void setStudent(Student studentObj, int index)
	{
		this.studentArray[index] = studentObj;
	}
	
	
	
	
	
	
	
	
	
	
}