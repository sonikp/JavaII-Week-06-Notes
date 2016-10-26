import java.io.*;


public class Student extends Object
{
	/********************************************
	 * Class that describes a student. A student has a 
	 * name and an array of grades/ You can get information
	 * about a student such as his/her name and grade 
	 * average.
	 * Eclipse: Generate Javadocs:
	 * Project menu, generate javadocs
	 * 
	 * @author: SonikP
	 */
	
	
	///////////////////fields///////////////////////
	private String name;
	private double[] gradeArray;
	
	///////////////////constructors//////////////////
	public Student()
	{
		
	}
	
	public Student(String theName)
	{
		this.name = theName;
	}
	
	public Student(String theName, double[] theGradeArray)
	{
		this.name = theName;
		this.gradeArray = theGradeArray;
	}
	
	
	/**
	 * Program 101: Constructor that takes a Delimited String
	 * @param delimString student information as a delimited string
	 * @param nameDelim what delimits the name field from the grades
	 * @param gradeDelim what delimits the grades
	 */
	public Student(String delimString, String nameDelim, String gradeDelim)
	{
		// split string based on name delimiter
		String[] splitArray = delimString.split(nameDelim);
		this.name = splitArray[0].trim();
		
		// get the grade string and break in and convert to double
		String grades = splitArray[1];
		String[] gradeStrArray = null;
		if ( grades != null )
		{
			gradeStrArray= grades.split(gradeDelim);
			this.gradeArray = new double[gradeStrArray.length];
			for ( int i = 0; i < gradeStrArray.length; i++)
			{
				this.gradeArray[i] = Double.parseDouble(gradeStrArray[i]);
			}
			
		}
		
	}
	

	
	///////////////////methods///////////////////////
	/************************************************
	 * Method to return the average of the grades for 
	 * this student.
	 * @return the average og the grades or 0.0 if no 
	 * grade array or no grades
	 */
	public double getAverage()
	{
		double average = 0.0;
		
		if (this.gradeArray != null && this.gradeArray.length > 0)
		{
			double sum = 0.0;
			for ( int i = 0; i < this.gradeArray.length; i++)
			{
				sum = sum + this.gradeArray[i];
			}
			average = sum / this.gradeArray.length;
		}
		return average;
	}
	
	// getter, get name
	public String getName() 
	{
		return this.name;
	}

	// getter, get grade at a specific location
	public double getGrade(int index) 
	{
		return this.gradeArray[index];
	}
	
	// setter, student name
	public boolean setName(String theName)
	{
		boolean result = false;
		
		if (this.name == null)
		{
			this.name = theName;
			result = true;
		}
		return result;
	}
	
	/*********************************
	 * Method to set a grade in the grade array
	 * @param index the index to set the grade at
	 * @param newGrade the new grade to use
	 * @return true if success, else false
	 */
	public boolean setGrade(int index, double newGrade)
	{
		if (newGrade < 0 || this.gradeArray == null)
		{
			return false;
		}
		else
		{
			this.gradeArray[index] = newGrade;
			return true;
		}
	}
	
	// setter, gradeArray
	public boolean setGradeArray(double[] theArray)
	{
		boolean result = false;
		
		// only set the gradeArray if it is null
		if ( this.gradeArray == null)
		{
			this.gradeArray = theArray;
			result = true;
		}
		return result;
	}
	
	
	public String toString()
	{
		return "Student object named: " + this.name +
				" Average: " + this.getAverage();
	}
	
	/////////////////main///////////////////
	public static void main(String[] args)
	{
		
		
		
		// Program 101: test constructor that takes a delimited string
		Student student3 = new Student("Susan Ericson:50,60,70,80,90,100",":",",");
		System.out.println(student3);
		
		/*
		Student student1 = new Student("Barb Ericson");
		System.out.println(student1);
		double[] gradeArray1 = {90,88,95,96,93};
		Student student2 = new Student("Mark Guzdial", gradeArray1);
		System.out.println(student2);
		*/
		
		
		/*
		
		Student student1 = new Student();
		System.out.println(student1.name);
		double[] gArray = {80, 90, 95, 87, 98};
		System.out.println(new Student("Ron Farmer", gArray));
		double[] gArray2 = {92, 94, 97, 93};
		System.out.println(new Student("Sue Lane",gArray2));
		double[] gradeArray3 = {55, 85, 73, 92, 81};
		Student student1 = new Student("Bill Simpson", gradeArray3);
		System.out.println(student1.getAverage());
		*/
		
		
		/*
		Student student = new Student();
		System.out.println(new Student());
		System.out.println(new Student());
		
		Student s1 = new Student();
		Student s2 = s1;
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(student.getClass());
		
		
		
		Student student1 = new Student();
		Class studentClass = student1.getClass();
		System.out.println(studentClass);
		
		Class parentClass = studentClass.getSuperclass();
		System.out.println(parentClass);
		student1.getClass();
		*/
		
	}
}

