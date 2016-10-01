/*Author:	Peter Mbanda 
*Date:		08/21/2015
*Purpose:	Automotives 
*/
public class Vehicle
{
	//declare the class fields
	private int numWheels;
	private int mpg;

	//create the class constructor 
	public Vehicle( int wheels, int milesPerGallon )
	{
		numWheels = wheels;
		mpg = milesPerGallon;
	}

	//toString method to display values object values
	public String toString()
	{
		return "Number of wheels " + Integer.toString(numWheels) + "\n" +
			   "Miles per Gallon " + Integer.toString(mpg) + "\n" ;
	}
}