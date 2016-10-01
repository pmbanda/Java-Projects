/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Auto app
*/
public class UseAuto{

	public static void main(String[] args) {
		
		//ford object to instantiate the ford methods and their implementations 
		Ford ford = new Ford();
		ford.setCarMake("Ford Fiesta ");
		ford.setPrice();
		System.out.println(ford);

		System.out.println();

		//chevy object to instantiate the ford methods and their implementations 
		Chevy chevy = new Chevy();
		chevy.setCarMake("Chevy Impala ");
		chevy.setPrice();
		System.out.println(chevy);
	}
}