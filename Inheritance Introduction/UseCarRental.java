/*Author:	Peter Mbanda 
*Date:		08/21/2015
*Purpose:	Car rental service 
*/
public class UseCarRental
{
	public static void main(String[] args) 
	{
		//create the cat rental objects and assign the parameters 
		CarRental carRent = new CarRental("Patrick", 73156, "fullsize", 10 );
		LuxuryCarRental luxRent = new LuxuryCarRental("Angelica", 73100, "fullsize", 10);
		//display the original car rental values 
		System.out.println();
		carRent.display();

		System.out.println();
		System.out.println();
		//display the luxury car rental values 
		luxRent.display();
	}
}