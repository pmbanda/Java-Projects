/*Compilation: javac PartAndquantityEntry.java
* Execution: java PartAndquantityEntry
*
* Date:		10/7/2015		
* Author:	Peter Eugene Mbanda
* Purpose: 	Application class for part number and quantity
*/
import java.util.*;
public class PartAndquantityEntry
{
		//global variables 
		static Scanner input = new Scanner(System.in);
		static DataMessages dm = new DataMessages();

	public static void main(String[] args) 
	{ 
		//instantiate the scanner and create class variables
		System.out.println();
		int pNum = 0;
		int qty = 0; 

		//assign values to object 
		try
		{
			//method entry call
			numEntry( pNum, qty );
			System.out.println("Valid entry ");
		}
		catch( DataException e ){
			//custom data exception class
			System.out.println( "Exception of >>" + e.getMessage() + "<< caught!!! ");
		}catch( InputMismatchException e ){
			//input mismatch  exception class
			System.out.println( "Part or quantity number is not numeric!! ");
		}
		catch( Exception e ){
			//exception class if custom class is not caught 
			System.out.println( "Exception of >>" + e.getMessage() + "<< caught!!! ");
		}
	}

	public static void numEntry( int number, int quantity ) throws DataException
	{
		//part number prompt 
		System.out.print("Enter the part number >> ");
		number = input.nextInt();
	
		if ( number < 0 )
			throw new DataException( dm.messages[2]);//low number exception
		if ( number > 999 )
			throw new DataException( dm.messages[3]);//high number exception

		//quantity number prompt 
		System.out.print("Enter item quantity >> ");
		quantity = input.nextInt();

		if ( quantity < 1 )
			throw new DataException( dm.messages[4]);//low quantity exception
		if ( quantity > 5000 )
			throw new DataException( dm.messages[5]);//high quantity exception
	}

	
}