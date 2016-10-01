package chapterE;

//Author: 	Peter Eugene Mbanda
//Date:		2/17/2015
//Purpose: 	determine price of a condominium

import java.util.Scanner;//import the scanner class

public class CondoSales
{

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);//create the scanner object
		System.out.println();

		//prompt the uset for the type of view
		System.out.println("Hello! Please enter 1 for park view, 2 for golf course view, 3 for lake view ");
		int user = input.nextInt();

		if ( user == 1 )
		{
			System.out.println();
			String type = "Park view ";
			double price = 150000 ;
			System.out.println("You have chosen " + type + " which cost " + price  );

		}

		else if ( user == 2 )
		{
			System.out.println();
			String type = "Golf course view ";
			double price = 170000 ;
			System.out.println("You have chosen " + type + " which cost " + price  );
		}

		else if ( user == 3 )
		{
			System.out.println();
			String type = "Lake view ";
			double price = 210000 ;
			System.out.println("You have chosen " + type + " which cost " + price  );
		}

		else//Set the price to 0 if no selection has been made
		 {
			System.out.println();
			double price = 0;
			System.out.println(price);
			System.out.println("Make the correct selection of 1 2 or 3 ");
		}
		input.close();
	}
}