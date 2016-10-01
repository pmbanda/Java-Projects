/*Author:	Peter Mbanda 
*Date:		08/21/2015
*Purpose:	Cabin rentals
*/
public class CabinRental
{	
	//declare class variables 
	private int cabinNum; 
	private double rentRate;

	//create the class constructor for this class 
	public CabinRental( int cabin )
	{
		cabinNum = cabin;
		if( cabinNum == 1 || cabinNum == 2 || cabinNum == 3 )
			rentRate = 950;
		else
			rentRate = 1100;
		
	}
	//create the getter and the setter method for both fieds
	public int getCabinNum()
	{
		return cabinNum;
	}

	public double getRentRate()
	{
		return rentRate;
	}

	public void display()
	{
		System.out.println("--Regular Cabin-- ");
		System.out.println("Cabin Number " + getCabinNum() );
		System.out.println("Rent Rate " + getRentRate() );
		System.out.println();
	}
}

