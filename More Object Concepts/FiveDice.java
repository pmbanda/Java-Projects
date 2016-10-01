package chapterD;

//Author:	Peter Eugene Mbanda
//Date:		2/11/2015
//purpose:	dice roll 


public class FiveDice
{
		//class variables
		private static int compDice ;
		private static int playerDice;
		private static int compTotal;
		private static int playerTotal;

	public static void main(String[] args)
	{	 
		//player dice throw

		/*Generate a randon number for the throw 
		*accumulate the total of the throws to the accumulator variable 
		*display the results for the dice throw 
		*the first throw is for the computer and the second is for the player
		*/
		compDice = ((int)(Math.random() * 5 ) + 1);
		compTotal += compDice;
		System.out.println("1st computer dice throw is " + compDice );

		playerDice = ((int)(Math.random() * 5 ) + 1);
		playerTotal += playerDice;
		System.out.println("1st player dice throw is " + playerDice );

		System.out.println();//empty white space

		compDice = ((int)(Math.random() * 5 ) + 1);
		compTotal += compDice;
		System.out.println("2nd computer dice throw is " + compDice );

		playerDice = ((int)(Math.random() * 5 ) + 1);
		playerTotal += playerDice;
		System.out.println("2nd player dice throw is " + playerDice );

		System.out.println();//empty white space

		compDice = ((int)(Math.random() * 5 ) + 1);
		compTotal += compDice;
		System.out.println("3rd computer dice throw is " + compDice );

		playerDice = ((int)(Math.random() * 5 ) + 1);
		playerTotal += playerDice;
		System.out.println("3rd player dice throw is " + playerDice );

		System.out.println();//empty white space

		compDice = ((int)(Math.random() * 5 ) + 1);
		compTotal += compDice;
		System.out.println("4th computer dice throw is " + compDice );

		playerDice = ((int)(Math.random() * 5 ) + 1);
		playerTotal += playerDice;
		System.out.println("4th player dice throw is " + playerDice );

		System.out.println();//empty white space
		
		compDice = ((int)(Math.random() * 5 ) + 1);
		compTotal += compDice;
		System.out.println("5th computer dice throw is " + compDice );

		playerDice = ((int)(Math.random() * 5 ) + 1);
		playerTotal += playerDice;
		System.out.println("5th player dice throw is " + playerDice );

		System.out.println();//empty white space

		System.out.println("Player total " + playerTotal);
		System.out.println("Computer total " + compTotal);
		
	}
}