/*Author:	Peter Eugene Mbanda
*Date:		9/18/2015
*Purpose:	negative error 
*/
import java.util.*;
public class NegativeArray
{
	public static void main (String[] args)
	{
		//class level variables 
		Scanner input = new Scanner(System.in);
		int size = 0;
		System.out.println();
		try
		{
			//user prompt for array size 
			System.out.print("Enter the number of array objects >> ");
			size = input.nextInt();
			//declare the array 
			int []array = new int[size];
			System.out.println("You entered an array successfully consisting " + size + " objects ");

		}
		catch( InputMismatchException e )
		{
			//input mismatch exception error message
			System.out.println("Array Not Created ");
			System.out.println("Sorry - wrong input ERROR ");
		}
		catch( NegativeArraySizeException e )
		{
			//negative array exception message 
			System.out.println("Array Not Created ");
			System.out.println("Sorry - negative input ERROR ");
		}
	}
}