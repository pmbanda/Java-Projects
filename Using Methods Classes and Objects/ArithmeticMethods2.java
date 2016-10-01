package chapterC;

/*Author:	Peter Eugene Mbanda 
*Date:		January 15th 2015
*Purpose:	Perform calculation based on different user inputs
*/

import java.util.Scanner;//import thr java Scanner 

public class ArithmeticMethods2
{
	public static void main(String[] args) 
	{
		//Instantiate a Scanner object 
		Scanner input = new Scanner (System.in );

		//declare the variables 
		int x , y ;

		//prompt for user input
		System.out.print("Enter the first number>> ");
		x = input.nextInt();
		
		//prompt for the second user input
		System.out.print("Enter the second number>> ");
		y = input.nextInt();
		
		System.out.println();
		
		//Display the results for first user
		System.out.println("First Number plus 10 is >> " + displayNumberPlus10(x));
		System.out.println("First Number plus 100 is >> " + displayNumberPlus100(x));
		System.out.println("First Number plus 1000 is >> " + displayNumberPlus1000(x));
		
		System.out.println();
		//display the results for second user
		System.out.println("Second Number plus 10 is >> " + displayNumberPlus10(y));
		System.out.println("Second Number plus 100 is >> " + displayNumberPlus100(y));
		System.out.println("Second Number plus 1000 is >> " + displayNumberPlus1000(y));

		input.close();
	}

	/*
	*Pass parameters in the methods add by 10 
	*add by 100 and finally add by 1000
	*/
	public static int displayNumberPlus10(int num)
	{
		return ( num + 10 ) ;
	}

	public static int displayNumberPlus100(int num)
	{
		return ( num + 100 ) ;
	}

	public static int displayNumberPlus1000(int num)
	{
		return ( num + 1000 ) ;
	}
}