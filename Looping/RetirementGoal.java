
//Author:	Peter Eugene Mbanda
//Date:		modified 1/6/2016
//Purpose:	Determine the retirement

import java.util.Scanner;//import the scanner class 

public class RetirementGoal 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);//instantiate the scanner object 
		//declare the variables 
		
		double amount;
		int years;
		double rate = 5.00;
		double total = 0;

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
		//display the retirement money
		System.out.println("You will have $" + amount + " at Retirement ");
		System.out.println();
		
	}

}
