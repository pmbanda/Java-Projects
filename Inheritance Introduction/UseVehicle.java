/*Author:	Peter Mbanda
*Date:		08/21/2015
*Purpose:	Automotives
*/
public class UseVehicle
{
	public static void main(String[] args)
	{
		/*create both the 
		*car and the motorcycle objects
		*/
		Car myCar = new Car( 34 );
		MotorCycle cycle = new MotorCycle( 19 );

		//invoke the toString method for display
		System.out.println("Car");
		System.out.println(myCar);
		System.out.println();
		System.out.println("Motor Cycle");
		System.out.println(cycle);
	}
}
