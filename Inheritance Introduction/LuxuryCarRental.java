/*Author:	Peter Mbanda 
*Date:		08/21/2015
*Purpose:	Car rental service 
*/
import java.util.*;
public class LuxuryCarRental extends CarRental
{
	Scanner input = new Scanner(System.in);
	String chauffeurOpt;
	private double chauffeurRate;

	public LuxuryCarRental( String usrName , int usrZip, String carSize, int timeDuration )
	{
		//call super costructor due to the prescence of an argument in this class 
		super( usrName , usrZip, carSize, timeDuration);
		System.out.println();
		System.out.print("Include a Chauffeur in Luxury Rental \"yes\" or \"no\" >> ");
		String chauffeurOpt = input.nextLine();

		/*if user chooser chauffeur assign chauffer value
		*	to the variable else assign 0 to variable 
		*/
		if ( chauffeurOpt.equalsIgnoreCase("Yes"))
		{
			dailyRate = 79.99;
			chauffeurRate = 200.00;
		}
		else if ( chauffeurOpt.equalsIgnoreCase("No"))
		{	
			dailyRate = 79.99;
			chauffeurRate = 0.00;
		}

		total = chauffeurRate + ( dailyRate * duration) ;
	}
	//create a display method  
	public void display()
	{
		System.out.println("<< Luxury Rental >> ");
		System.out.println("User Name : " + name );
		System.out.println("User Zip Code : " + zipCode );
		System.out.println("Car Size : " + size );
		System.out.println("Duration : " + duration + " days " );
		System.out.println("Chauffeur Fee : " + chauffeurRate );
		System.out.println("Daily Rate : " + dailyRate );
		System.out.println("Total : " + ( total * 100 ) / 100.0 );
	}
}	