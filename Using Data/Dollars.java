package chapterB;

/*Author: 	Peter Mbanda
*Program: 	Dollars java
*Purpose: 	This program converts the amount of dollars entered into 20s 10s 5s ans 1s 
*Date: 		1/6/2015
*/

//import the scanner package
import java.util.Scanner;

public class Dollars 
{
	public static void main(String[] args) 
	{
		//create the scanner object
		Scanner sc = new Scanner(System.in ); 
		
		//Declare the local variables 
		int dollar, twenties, tens, fives, ones, remainder;

		//prompt the user to enter the dollar amount 
		System.out.println("Enter the Dollar amount to be convereted in integer: ");
		dollar = sc.nextInt();
		
		System.out.println();//empty line white space 

		
		//determine the dollar amounts in equivalent numbers 
		//number of twenties
		twenties = dollar / 20;
		remainder = dollar % 20;
		
		//number of tens
		tens = remainder / 10;
		remainder = remainder % 10;
		
		//number of fives
		fives = remainder / 5;
		remainder = remainder % 5;
		
		//number of ones
		ones = remainder;

		//display the output 
		System.out.println("Number of Twenties: " + twenties);
		System.out.println("Number of Tens: " + tens );
		System.out.println("Number of Fives: "+ fives );
		System.out.println("Number of Ones: " + ones );

		sc.close();

	}

}
