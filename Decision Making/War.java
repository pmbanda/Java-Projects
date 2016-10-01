

/*Author: 	Peter Eugene Mbanda
*Program:	Random card picks
*Date:		2/25/2015
*/
import java.util.Scanner;
import java.util.Random;

public class War
{	//declare the global variables 
	private static int value ;
	private static int compValue;
	private static String alphabet = "shdc";
	private static char playerSuit;
	private static char compSuit;
	private static final int CARDS_IN_SUIT = 13;

	public static void main(String[] args) 
	{
		System.out.println();
		Random r = new Random();//generate the random class object and instantiate
		Scanner input = new Scanner(System.in);//generate the scanner class and instantiate

		System.out.println("Please enter card value between 1 and 13.");//user prompt
		int entry = input.nextInt();
		setValue(entry);

		
		playerSuit = alphabet.charAt(r.nextInt(alphabet.length()));//get the selected character
		System.out.println("You have chosen card number " + getValue() + " belonging to suit " + playerSuit );//display the results
		System.out.println();
	
		compValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);//generate the computers random number
		compSuit = alphabet.charAt(r.nextInt(alphabet.length()));
		System.out.println("The computer chose card  " + compValue + " belonging to suit " + compSuit );//display the computers selection

		if ( getValue() == compValue )//check if the values match
		{
			System.out.println();
			System.out.println("Both Selected the same value of cards ");
		}
		else if ( getValue() > compValue )//check if the users value is greater than the computers value
		{
			System.out.println();
			System.out.println("Player defeated the computer");
		}
		else if ( compValue > getValue() )
		{
			System.out.println();
			System.out.println("Computer defeated the player");//check if the computers value is greater than the users 
		}else 
		{
			if ( (compValue == getValue() ) && ( compSuit == playerSuit ) )//determine if the cards chosen are the same and display the correct error message 
				System.out.println("You cannot choose the same cards !!!impossible!!!");

		}
		input.close();
	}
	static void setValue(int entryValue)
	{
		if( entryValue < 1 || entryValue > 13 )//determine if the players selection falls within the range of values
		{
			System.out.println();
			System.out.println("<<You entered " + entryValue + ">>"+
				"\n<<Your number cannot be below 1 and exceed 13>>");
			System.out.println();
			value = 1;//assign to one if does not fall within range

		}
		else
		{
			value = entryValue ;//else assign the input value
		}
	}

	static int getValue()
	{
		return value ;//return value
	}


}