package chapterB;

/*Author: 	Peter Mbanda
*Program: 	Temperature conversion java 
*Purpose: 	This program converts the temperature from fahrenheight to celcius 
*Date: 		1/9/2015
*/

//import the scanner package
import java.util.Scanner ;

public class FahrenheightToCelcius
{
	public static void main(String[] args) 
	{
		//create the scanner object
		Scanner input = new Scanner (System.in);
		
		//declare the variables 
		double fahrenheight;
		double celcius;

		//prompt the user for input 
		System.out.print("Enter the temperature in degree fahrenheight: ");
		fahrenheight = input.nextDouble();

		//calculate celcius
		celcius = ( fahrenheight - 32 ) * ( 5 / 9.0 ); 
		
		//display result in two decimal places 
		celcius = (int)(celcius * 100 ) / 100.0;
		
		//display results 
		System.out.println(fahrenheight + " Fahrenheight is equivalent to " + celcius + " Celcius ");

		input.close();
	}
}