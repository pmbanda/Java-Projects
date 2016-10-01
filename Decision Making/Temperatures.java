

//Author: 	Peter Eugene Mbanda
//Date:		2/17/2015
//Purpose: 	determine between the heat warning or the freezing temperature

import java.util.Scanner;//Scanner class import 

public class Temperatures
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);//import the scanner class
		System.out.println();//empty white space 
		//user prompts 
		System.out.println("Enter the days highest temperature >> ");
		double high = sc.nextDouble();
		System.out.println();
		System.out.println("Enter the days lowest temperature >> ");
		double low = sc.nextDouble();
		System.out.println();

		//use the selection statements and give the errors based on the selections
		if ( high >= 90)
			System.out.println("\"Heat Warning\"");
		if ( low < 32 )
			System.out.println("\"Freeze Warning\"");
		if ( (high - low) > 40 )
			System.out.println("\"Large temperature swing\"");
		sc.close();
	}
}