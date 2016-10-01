package chapterH;

/*Author:		Peter Eugene Mbanda
 *Date:			4/22/2015
 *Purpose:		Determine college courses 
 */
public class Student 
{
	//Create class attributes and fields
	private int studentID;
	private CollegeCourse [] cc = new CollegeCourse[5];
	
	/*
	 * Create a getter and setter method for the student ID number 
	 */
	public void setStudentID(int studentID)
	{
		this.studentID = studentID;
	}
	
	public int getStudentID()
	{
		return studentID;
	}
	/*
	 * Create  a setter method for college course and getter method
	 * with the array position in place.
	 */
	public void set(CollegeCourse course, int position )
	{
		cc[position] = course;
	}
	
	public CollegeCourse get(int position )
	{
		return cc[position];
	}

}
