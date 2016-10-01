package chapterD;
//Author:	Peter Eugene Mbanda 
//Date:		2/10/2015
//Program:	Compute bread and the amount of calorie

public class Bread
{
	//declare the class variables
	private String breadType;
	private int caloriePerSlice;
	public static final String MOTTO = "The staff of life ";
	private static int count = 0;

	public Bread( String bread , int calorie )
	{
		//assign three parameters to the data fields
		breadType = bread ;
		caloriePerSlice = calorie ;
		count += 1;
	}
	
	//get method to return the bread type 
	public String getBreadType()
	{
		return breadType;
	}
	
	//get method to return the calorie amount 
	public int getCalorie()
	{
		return caloriePerSlice;
	}

	public void displayData()
	{
		System.out.println("Bread " + count + " contains " + getBreadType()
			+ " and has " + getCalorie() + " calories ");
	}
}