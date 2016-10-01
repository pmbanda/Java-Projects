package chapterF;
//Author:	 Peter Eugene Mbanda
//Date:		 3/11/2015
//Purpose:	 Determine the game of dice by player and determine if they win or lose

import java.util.*;

public class TwoDice3 
{
	//declare the global variables
	private static int guess;
	private static String guessString;
	private static int num1, num2, sum ;
	private static boolean won = false;
	
	public static void main(String[] args) 
	{

		Random myRandom = new Random();//random number instantiation
		Scanner input = new Scanner(System.in);//scanner class instantiation
		System.out.println();
		System.out.print("Guess a number between 2 and 12 >> ");
		guessString = input.nextLine();//user input 
		guess = Integer.parseInt( guessString );//convert the string to an integer 
		System.out.println();
		
		//check whether guess falls within the number of dice rolls
		if ( guess < 2 || guess > 12 )
		{
			System.out.print("Please enter a number between 2 and 12 ");
		}
		else
		{	
			for (int j = 1; j <= 3 ; j++)
			{
				num1 = myRandom.nextInt(6) + 1 ;//1st dice roll
				num2 = myRandom.nextInt(6) + 1 ;//2nd dice roll
			
				sum = num1 + num2;
				System.out.println( j + " dice roll " + sum);
				if ( guess == sum )
				{
					won = true;
					System.out.println();
					System.out.println("	You won!!");
					break;
				}
			}
			//if the user does not win print computer won 
			if ( !won )
			{
				System.out.println();
				System.out.println("       Computer won");
			}
				
			
		}	
		input.close();
	}

}
