package chapterC;

/*Author: 	Peter Eugene Mbanda
*Program:	Random card picks
*Date:		2/25/2015
*/
public class PickTwoCards
{
	public static void main(String[] args)
	{
		//declare variables
		int myValue;
		
		//declare constant
		final int CARDS_IN_SUIT = 13;
		myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);

		Card first = new Card();//instaniate the card object
		Card second = new Card();//instaniate the card object

		System.out.println();
		first.setSpadesValue(myValue);

		int myValue2 = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		
		System.out.println();
		second.setDiamondsValue(myValue2);
	}
}