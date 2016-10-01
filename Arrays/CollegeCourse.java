
public class CollegeCourse 
{
	//create the class attributes
	private String courseID;
	private int creditHours;
	private String letterGrade;
	
	/*
	 * Create a getter and setter method for the course ID
	 */
	
	public void setCourseID(String courseID)
	{
		this.courseID = courseID;
	}
	
	public String getCourseID()
	{
		return courseID;
	}
	/*
	 * Create a getter and setter method for the credit hours 
	 */
	public void setCreditHours(int creditHours)
	{
		this.creditHours = creditHours;
	}
	
	public int getCreditHours()
	{
		return creditHours;
	}
	/*
	 * Create a getter and setter method for the letter grade 
	 */
	
	public void setLetterGrade(String letterGrade)
	{
		this.letterGrade = letterGrade;
	}
	
	public String getLetterGrade()
	{
		return letterGrade;
	}

}
