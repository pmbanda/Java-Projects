package chapterB;

/*Author: 	Peter Mbanda
*Program: 	Eggs
*Purpose: 	Determine the egg sales 
*Date: 		1/6/2015
*/

//import the scanner package
import java.util.Scanner ;

public class Eggs 
{
	public static void main(String[] args) 
	{
		//declare object Scanner
		Scanner input = new Scanner (System.in ); 

		//variable declaration
		int eggs, dozenNumber, looseEggs;
		double dozenCost = 3.25, looseEggsCost = 0.45 ;

		//Declare constant dozen which equals 12
		final int DOZEN = 12; 

		//prompt the user to enter the amount
		System.out.print("Enter the number of eggs to be bought: "); 
		eggs = input.nextInt();
		
		System.out.println(); 

		//determine the number of dozens
		dozenNumber = eggs / DOZEN;
		
		//determine the number of loose eggs
		looseEggs = eggs % DOZEN;
		
		//Calculate cost of dozens
		dozenCost *= dozenNumber ;
		
		//calculate the cost of loose eggs
		looseEggsCost *= looseEggs;

		//display the results 
		System.out.println("You ordered " + eggs + " eggs.Thats " + dozenNumber + " dozen at $3.35 a dozen \nand " 
			+ looseEggs +" loose eggs at 45.0 cents each for a total of $" + (dozenCost + looseEggsCost) ) ;

		input.close();

	}
}