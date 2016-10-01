

//Author:	Peter Mbanda
//Date:		1/16/2015
//Purpose:	Compute annual policy premiums

import java.util.Scanner;//import Scanner Class

public class Insurance
{
	public static void main(String[] args)
	 {
		//create and initialize the Scanner
		Scanner sc = new Scanner(System.in);

		//prompt the user for input
		System.out.print("Enter your year of birth e.g 1990 >> ");
		int birthYear = sc.nextInt();
		
		System.out.println();//empty line
		
		System.out.print("Enter the current calendar year e.g 2015 >> ");
		int currentYear = sc.nextInt();
		
		System.out.println();//empty line 

		System.out.println("Insurance cost is $" + premiumAmount(birthYear,currentYear));//display the premium amount
		sc.close();
	 }

	static double premiumAmount(int birth , int current )
	{
		//declare variables
		int differenceInYear, decade, premium;

		differenceInYear = (current - birth) ;//determine age 

		decade = differenceInYear / 10 ;//determine the decade length

		premium =  ( decade + 15 ) * 20 ;//calculate the premiun

		return premium; //return the result
	}
}