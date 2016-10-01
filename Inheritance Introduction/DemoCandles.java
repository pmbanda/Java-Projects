/*Author:	Peter Mbanda 
*Date:		08/21/2015
*Purpose:	Candle Sizes 
*/
public class DemoCandles
{
	public static void main(String[] args) 
	{
		Candle regCandle = new Candle();//instantiate the parent class 
		ScentedCandle scentCandle = new ScentedCandle();//instantiate child class 
		
		//invoke both the parent and child methods 
		regCandle.setColor( " Magenta ");
		regCandle.setHeight( 22.0 );
		regCandle.display();

		System.out.println();

		scentCandle.setScent( " Lavender ");
		scentCandle.setHeight( 22.0 );
		scentCandle.display();



	}
}