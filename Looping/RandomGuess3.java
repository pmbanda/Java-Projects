package chapterF;
//Author: Peter Mbanda
//program: Random guess 
//date: 3/9/2015

import java.util.Scanner;//import the Scanner class 
public class RandomGuess3
{

	public static void main(String[] args) 
	{
		int guess;
		int computerGuess;
		int count = 0;

		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);//create a scanner object 

		do 
		{
			System.out.println();
		System.out.print("Guess of a number between 1 and 10? >> ");//prompt user for guess
		guess = input.nextInt();
		System.out.println("Your guess is  " + guess );
		computerGuess = ((int)(Math.random()*10 + 1));
		System.out.println("The computer Generated " + computerGuess );//Generate random number and display 

 			if ( guess == computerGuess )
			System.out.println("You guessed the correct value !!!! ");//if user gets correct guess congratulations
			else if
			( guess > computerGuess )
			System.out.println(">> Your guess is too high");//else display message for high guess than computers
			else if( guess < computerGuess)
			System.out.println(">> Your guess is too low");//else display message for low guess than computers

			++count;//increment the count by one 
			System.out.println("Attempt " + count);

		}while ( guess != computerGuess );

		System.out.println();
		System.out.println("Number of attempts you took = " + count);
		
	}
}