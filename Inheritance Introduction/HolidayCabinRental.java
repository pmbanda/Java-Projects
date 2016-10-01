/*Author:	Peter Mbanda 
*Date:		08/21/2015
*Purpose:	Cabin rentals
*/
public class HolidayCabinRental extends CabinRental
{
	private double surcharge = 150.00;

	public HolidayCabinRental( int cbnNum )
	{
		super( cbnNum );
		surcharge += super.getRentRate();
	}

	public void display()
	{
		System.out.println("--Weekend Cabin--");
		System.out.println("Cabin Number " + super.getCabinNum() );
		System.out.println("Rent Rate " + surcharge );
	}
}