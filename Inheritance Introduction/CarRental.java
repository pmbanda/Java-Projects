/*Author:	Peter Mbanda 
*Date:		08/21/2015
*Purpose:	Car rental service 
*/
public class CarRental
{
	//declare the class level variables 
	protected String name;
	protected int zipCode;
	protected String size;
	protected int duration;
	protected double dailyRate;
	protected double total;

	//create a class constructor
	public CarRental( String usrName , int usrZip, String carSize, int timeDuration )
	{
		name = usrName;
		zipCode = usrZip;

		/*The daily rate is determined 
		* by the car size
		*/
		size = carSize;
		if ( size.equalsIgnoreCase("Economy"))
			dailyRate = 29.99;
		else if ( size.equalsIgnoreCase("Midsize"))
			dailyRate = 38.99;
		else if ( size.equalsIgnoreCase("Fullsize"))
			dailyRate = 43.50;

		duration = timeDuration;
		total = dailyRate * duration;//total calculated by multiplying daily rate and duration
	}
	//create a display method  
	public void display()
	{
		System.out.println("<< Regular Rental >> ");
		System.out.println("User Name : " + name );
		System.out.println("User Zip Code : " + zipCode );
		System.out.println("Car Size : " + size );
		System.out.println("Daily Rate : " + dailyRate );
		System.out.println("Duration : " + duration + " days ");
		System.out.println("Total Fee : " + ( total * 100 ) / 100.00  );
	}

}