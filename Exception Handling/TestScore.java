/*Author:	Peter Eugene Mbanda
*Date:		9/18/2015
*Purpose:	Enter student scores and check for exceptions 
*/
import java.util.*;
public class TestScore
{
	public static void main(String[] args) 
	{
		//create ID array constituting 5 objects 
		int []numID = new int[]{ 100, 101, 102, 103, 104 };
		int x;
		Scanner input = new Scanner(System.in);//instantiate the scanner object 
		int numEntry[] = new int[numID.length];
		System.out.println();//empty white space 

		displayArray( numID );
		System.out.println();//empty white space 
		
			//iterate through the array 
			for ( x = 0 ; x < numID.length ; ++x ) 
			{
			    try
				{
					//user prompt 
					System.out.print("Enter the student score with ID " + numID[x] + " >> ");
					numEntry[x] = input.nextInt();
					input.nextLine();
					validScore(numEntry, x );

				}//catch the exception 
				catch( ScoreException se )
				{
				//display the exception message 
					System.out.println(se.getMessage());
				}
				if( numEntry[x] < 0 || numEntry[x] > 100  )
						numEntry[x] = 0;//assign zero to number  if an exception is found
			}
			System.out.println();
			displayScore( numID, numEntry );//display all the score

		
	}
	public static void displayArray( int []num )
	{
		System.out.println("***ID numbers for " + num.length + " students*** ");
		for ( int x = 0 ; x < num.length ; ++x ) {
			System.out.println( num[x] );//display the id  with position 
		}
		System.out.println();
	}

	public static void validScore( int [] num , int position) throws ScoreException
	{	
		//this method throws an exception when values do not fall within range 
		if( num[position] < 0 || num[position] > 100  )
		{
			throw new ScoreException();//instantiate the score object 
		}
	}

	public static void displayScore( int [] id, int [] num )
	{

		System.out.println("***ID numbers and students scores*** ");
		for ( int x = 0 ; x < num.length ; ++x ) {
			System.out.println( "ID # " + id[x] + " score " + num[x] );
		}
		System.out.println();
	}
}