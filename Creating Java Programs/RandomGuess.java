package chapterA;

//Author: 	Peter Mbanda
//program: 	Random guess 
//date: 	12/17/2014

public class RandomGuess
{
	public static void main (String [] args )
	{
		//global variable 
		int guess;
		
		//prompt user for guess
		System.out.println("Guess of a number between 1 and 10? ");
		
		//Generate random number and display
		guess = (int)(Math.random() * 10 + 1 );

		//dispalay the number on the console
		System.out.println("The computer Generated " + guess ); 
		
		
	}
}