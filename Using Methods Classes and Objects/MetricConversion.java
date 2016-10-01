package chapterC;

/*Author:	Peter Eugene Mbanda 
*Date:		January 15th 2015
*Purpose:	Perform calculation based on different user inputs
*			to obtain centimeter and liter based on one input
*/

//import the Scanner Class
import java.util.Scanner;

public class MetricConversion 
{
	public static void main(String[] args)
	{
		//declare double variable
		double inputNumber;

		//Scanner object initialization and creation
		Scanner input = new Scanner (System.in);
		
		//user prompt 
		System.out.print("Enter a number >> ");
		inputNumber = input.nextDouble();
		
		System.out.println();

		//call methods to invoke them
		inchesToCentimeters(inputNumber);
		gallonsToLiters(inputNumber);

		input.close();//close the scanner
	}

	static void inchesToCentimeters(double value)
	{
		//declare local variable for method 
		double centimeter; 

		//declare constant for inch to centimeter
		final double CENTIMETER_PER_INCH = 2.54 ;

		centimeter = value * CENTIMETER_PER_INCH ; 
		System.out.println( value + " is equivalent to " + centimeter + " centimeter");//display value
	}
	static void gallonsToLiters(double value)
	{
		//declare local variable for method
		double liter;  

		//declare constant for gallon to liter
		final double LITER_PER_GALLON = 3.7854 ; 

		liter = value * LITER_PER_GALLON ;
		System.out.println( value + " is equivalent to " + liter + " liter");//display value

	}
}