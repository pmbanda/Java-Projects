/*Author:	Peter Eugene Mbanda
*Date:		9/18/2015
*Purpose:	sqrt exception
*/
import java.util.*;
public class SqrtException
{
	public static void main(String[] args) 
	{
		//create a scanner and the class level variables 
		Scanner input = new Scanner( System.in);
		double numEntry;
		double result;
		System.out.println();

		try{
			//user prompt 
			System.out.print("Enter a number to determine the square root >> ");
			numEntry = input.nextDouble(); 

			result = Math.sqrt(numEntry);//convert to square root 

			System.out.println("Sqrt of " + numEntry + " is " + result );
		}
		catch( Exception e ){
			System.out.println("Error - cant obtain square root ");
			System.out.println(e.getMessage());
		}
		

	}
}