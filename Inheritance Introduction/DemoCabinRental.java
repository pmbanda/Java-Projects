/*Author:	Peter Mbanda 
*Date:		08/21/2015
*Purpose:	Cabin rentals
*/
public class DemoCabinRental
{
	public static void main(String[] args) 
	{
		CabinRental cabin = new CabinRental( 1 );
		HolidayCabinRental holidayCabin = new HolidayCabinRental( 1 );

		cabin.display();
		holidayCabin.display();


	}
}