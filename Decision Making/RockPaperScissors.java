package chapterE;

//Author:	Peter Eugene Mbanda
//Date:		2/23/2015	
//Purpose:	Determine the winner on choosing between rock paper or scissors

import java.util.Scanner;//import the Scanner class 
public class RockPaperScissors
{
	public static void main(String[] args) 
	{	
		int user, comp;//declare the variables

		Scanner input = new Scanner(System.in);//initialize the scanner object

		//user prompt 
		System.out.println("Player ONE Enter the numbers 1 , 2 or 3 ");
		System.out.println("1 represents \"Rock\"");
		System.out.println("2 represents \"Paper\"");
		System.out.print("3 represents \"Scissors\">>>>>");
		user = input.nextInt();
		System.out.println("You entered " + user);//display the user value 

		System.out.println();
		//computer generated pick 
		System.out.println("Computer Pick ");
		System.out.println("1 represents \"Rock\"");
		System.out.println("2 represents \"Paper\"");
		System.out.println("3 represents \"Scissors\"");
		comp = (int)(Math.random() * 3 + 1);
		System.out.println("Computer Picked " + comp);//display the computer value 
		System.out.println();

		/*
		*use the select statements below 
		*to determine the winner between the computer and
		*the user in the game 
		*/
		if ( user == comp )
			System.out.println("Player ONE and player TWO tied ");
		else if ( (user == 1) && (comp == 3) )
			System.out.println("Rock beats scissors, because a rock can break a pair of scissors");
		else if ( (user == 3) && (comp == 1) )
			System.out.println("Rock beats scissors, because a rock can break a pair of scissors");
		else if ( (user == 3) && (comp == 2) )
			System.out.println("Scissors beats paper, because scissors can cut paper");
		else if ( (user == 2) && (comp == 3) )
			System.out.println("Scissors beats paper, because scissors can cut paper");
		else if ( (user == 2) && (comp == 1) )
			System.out.println("Paper beats rock, because a piece of paper can cover a rock ");
		else if ( (user == 1) && (comp == 2) )
			System.out.println("Paper beats rock, because a piece of paper can cover a rock ");
		
		input.close();
	}
}