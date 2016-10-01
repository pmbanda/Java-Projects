

/*Author: 	Peter Mbanda
*Program: 	Project sales interactive java 
*Purpose: 	This program calculates the next year's projection in sales 
*Date: 		1/6/2015
*/

import java.util.Scanner ;//import the scanner package 

public class ProjectedSalesInteractive
{
	public static void main(String[] args) 
	{
		//constant percent increase in sales 
		final double INCREASE_SALES_PERCENTAGE = 0.10 ; 
		
		//variables representing the year sales total in dollars 
		double northSales, southSales;	

		Scanner input = new Scanner(System.in );//create a scanner object

		//prompt the user for input 
		System.out.print("Enter the total for the North sales in dollars: ") ; 
		northSales = input.nextDouble();
		
		System.out.println();
		
		//prompt the user for input 
		System.out.println("Enter the total for the South sales in dollars: ");
		southSales = input.nextDouble();
		System.out.println();

		//Calculate north percentage increase
		//calculate the south percentage increase
		northSales += INCREASE_SALES_PERCENTAGE * northSales; 
		southSales += INCREASE_SALES_PERCENTAGE * southSales; 
		
		//display the results 
		System.out.println("Next years sales projection for the Northern Sales will be " + northSales ) ;
		System.out.println("Next years sales projection for the Southern Sales will be " + southSales ) ;

		input.close();
	}
}