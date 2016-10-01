
//Author:	Peter Eugene Mbanda
//Date:		modified 1/3/2016
//Purpose: 	determine the factorials

public class EverySum
{
	public static void main(String[] args) 
	{
		//number to be determined 
		int T_NUM = 50;
		//class level variables 
		int i;
		int j;
		int sum;
		
		//outer loop for the total set of numbers 
		for ( i = 1 ; i <= T_NUM ; ++i )
		{	
			sum = 0;//initialize the sum 

			//loop inner loop from 1 to number equal to outer loop 
			for ( j = 1 ; j <= i  ; ++j )
			{
				sum += j;//perform sum 
			}
			System.out.print( "Sum 1 and " + i + " is : " + sum );//display the results 
			System.out.println();//empty space to separate the loop
			
		}
	}
}