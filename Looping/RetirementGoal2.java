
//Author:	Peter Eugene Mbanda
//Date:		3/6/2015
//Purpose:	Determine the retirement

import java.util.Scanner;//import the scanner class 

public class RetirementGoal2 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);//instantiate the scanner object 
		//declare the variables 
		
		double amount;
		int years;
		double rate = 0.05;
		double total;

		//prompt the user for input
		System.out.println();
		System.out.print("Enter the number of years until retirement? >> ");
		years = input.nextInt();//enter the input to the scanner
		
		//use the while statement to determine the correct input
		while ( years <= 0 )
		{
			System.out.print("You entered " + years + " enter the correct positive value?\n");
			System.out.print("Enter the number of years until retiement? >> ");
			years = input.nextInt();//enter the input to the scanner 
		
		}

		//prompt the user for the amount
	
		System.out.print("Enter the amount you can save annually? >> ");
		amount = input.nextDouble();
		System.out.println();
		
		//prompt till user gets the correct input 
		while ( amount <= 0 )
		{
			System.out.print("You entered " + amount + " enter the correct positive value? \n");
			System.out.print("Enter the amount you can save annually? >> ");
			amount = input.nextDouble();
		}
		
		for (int i = 1; i <= years; i++) //iterate on the number of years 
		{
			//display the results
			total = amount * ( 1 + ( rate * i) );
			System.out.printf("After year %d the balance is %.3f \n" , i ,total );
		}
		System.out.println();
		
	}

}
