package chapterB;

/*Author: 	Peter Mbanda
*Program: 	Inches to feet  interactive java 
*Purpose: 	This program converts the number of inches to feet 
*Date: 		1/6/2015
*/
import java.util.Scanner ;//import the scanner package

public class InchesToFeetInteractive
{
	public static void main(String[] args) 
	{
		//create the scanner object
		Scanner input = new Scanner(System.in); 

		int inches, feet, remainingInch;
		double result ;

		//Declare the constant foot per inch 
		final double FOOT_PER_INCH = 0.08333333 ; 

		//prompt the user for the input
		System.out.print("Enter the length in inches as integer: " ) ; 
		inches = input.nextInt();
		
		System.out.println();

		//determine total feet
		result = inches * FOOT_PER_INCH; 
		
		//determinr the feet in integer
		feet = (int)(result * 100) / 100 ; 
		remainingInch = ((int)(result * 100) % 100) / 10 ;

		//if the remainder is greater than 5 add one to the inches
		if (remainingInch > 5) 
			remainingInch += 1 ;

		//display the results 
		System.out.println(inches + " Inches is equivalent to " + feet + " feet " + remainingInch + " Inches:") ;
	
		input.close();	
		}
}