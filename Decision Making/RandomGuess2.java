package chapterE;

//Author: Peter Mbanda
//program: Random guess 
//date: 12/17/2014

import java.util.Scanner;//import the Scanner class 

public class RandomGuess2
{
	public static void main (String [] args )
	{
		Scanner input = new Scanner (System.in);//create a scanner object 

		System.out.println("Guess of a number between 1 and 10? ");//prompt user for guess
		int guess = input.nextInt();
		System.out.println("Your guess is  " + guess );
		int computerGuess = ((int)(Math.random()*10 + 1));

		System.out.println("The computer Generated " + computerGuess );//Generate random number and display 

		if ( guess == computerGuess )
			System.out.println("You guessed the correct value !!!! ");//if user gets correct guess congratulations
		else if
			( guess > computerGuess )
			System.out.println("Your guess is too high");//else display message for high guess than computers
		else if( guess < computerGuess)
			System.out.println("Your guess is too low");//else display message for low guess than computers
		input.close();
	}
}