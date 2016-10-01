package chapterE;

//Author: 	Peter Eugene Mbanda
//Date:		2/17/2015
//Purpose: 	determine price of a condominium

import java.util.Scanner;//import the scanner class

public class CondoSales2
{
		//Declare the class variables 
		static double garagePrice = 5000;
		static double total = 0;
		static boolean condoSelect ;
		static int user;
		static int gpSelect;

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);//create the scanner object
		System.out.println();//empty white space 

		//prompt the uset for the type of view
		System.out.println("Hello! Please enter 1 for park view, 2 for golf course view, 3 for lake view ");
		user = input.nextInt();

		if ( user == 1 )//determine if the selection is 1
		{
			/*
			*Declare the global variables 
			*/
			System.out.println();
			condoSelect = true ;
			String type = "Park view ";
			double price = 150000 ;
			
			System.out.println("You have chosen " + type + " which cost " + price  );
			total += price ;//accumulate the results to the total
			System.out.println();

			if ( condoSelect )//selection is true based on the option first selected
			{
				System.out.println("Enter 1 for garage or a 2 for parking space ");
				gpSelect = input.nextInt();

				if ( gpSelect == 1 )
				{
					total += garagePrice;//accumulate the results to the total
					System.out.println("You have chosen " + type + " which cost " + price + " \nwith garage " 
						+  "bringing the total price to $" + total );
				}
				else if ( gpSelect == 2 )
				{
					total += 0;//accumulate the results to the total
					System.out.println("You have chosen " + type + " which cost " + price + " \nwithout garage " 
						+  "bringing the total price to $" + total );
				}
				else
				{
					System.out.println("Make the correct selection");//display the error if wrong selection is made 
				}
			}
			input.close();
			
		}

		else if ( user == 2 )//determine if the selection is 2
		{
			/*
			*Declare the global variables 
			*/
			System.out.println();
			condoSelect = true ;
			String type = "Golf course view ";
			double price = 170000 ;

			System.out.println("You have chosen " + type + " which cost " + price  );
			total += price ;//accumulate the results to the total
			System.out.println();

			if ( condoSelect )//selection is true based on the option first selected
			{
				System.out.println("Enter 1 for garage or a 2 for parking space ");
				gpSelect = input.nextInt();

				if ( gpSelect == 1 )
				{
					total += garagePrice;//accumulate the results to the total
					System.out.println("You have chosen " + type + " which cost " + price + " \nwith garage " 
						+  "bringing the total price to $" + total );
				}
				else if ( gpSelect == 2 )
				{
					total += 0;//accumulate the results to the total
					System.out.println("You have chosen " + type + " which cost " + price + " \nwithout garage " 
						+  "bringing the total price to $" + total );
				}
				else
				{
					System.out.println("Make the correct selection");//display the error if wrong selection is made 
				}
			}

		}

		else if ( user == 3 )//determine if the selection is 3
		{
			/*
			*Declare the global variables 
			*/
			System.out.println();
			condoSelect = true ;
			String type = "Lake view ";
			double price = 210000 ;
			
			System.out.println("You have chosen " + type + " which cost " + price  );
			total += price ;//accumulate the results to the total
			System.out.println();

			if ( condoSelect )//selection is true based on the option first selected
			{
				System.out.println("Enter 1 for garage or a 2 for parking space ");
				gpSelect = input.nextInt();

				if ( gpSelect == 1 )
				{
					total += garagePrice;//accumulate the results to the total
					System.out.println("You have chosen " + type + " which cost " + price + " \nwith garage " 
						+  "bringing the total price to $" + total );
				}
				else if ( gpSelect == 2 )
				{
					total += 0;//accumulate the results to the total
					System.out.println("You have chosen " + type + " which cost " + price + " \nwithout garage " 
						+  "bringing the total price to $" + total );
				}
				else
				{
					System.out.println("Make the correct selection");//display the error if wrong selection is made 
				}
			}

		}

		else 
		{
			System.out.println();
			double price = 0;//assign value to 0 if no selection is made
			System.out.println(price);
		}


	}
}