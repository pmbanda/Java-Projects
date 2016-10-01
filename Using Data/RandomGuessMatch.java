

//Author: 	Peter Mbanda
//program: 	Random guess 
//date: 	12/17/2014

//import class Scanner
import java.util.Scanner; 

public class RandomGuessMatch
{
	public static void main (String [] args )
	{	
		Scanner input = new Scanner(System.in);

		//declare the variables
		int guess, random;

		//prompt user for guess
		System.out.print("Guess a number between 1 and 5? ");
		guess = input.nextInt();

		//Generate random number and display 
		random = 1 + (int)(Math.random() * 5) ;

		System.out.println();//empty white space 
		
		//display random number 
		//also display guessed number 
		System.out.println("Random number is " + random);
		System.out.println("Guessed number is " + guess);
		
		//obtain the difference 
		System.out.println("Difference between the random number and guessed number is " + (random - guess));
		//determine whether random and guess are equal using boolean expression
		System.out.println("Guess equal to random number is " + ((random - guess) == 0 ));

		
		input.close();
	}
}