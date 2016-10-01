package chapterF;
//Author:	Peter Eugene Mbanda
//Date:		modified 1/3/2016
//Purpose: 	determine the numbers that go evenly on the selected numbers

public class PerfectJava
{
	public static void main(String[] args) 
	{	
		//declare the variables i for outer loop j for inner loop
		int i, j, var;
		final int TOTAL_NUMS = 1000;
		
		System.out.print("Perfect numbers between 1 and " + TOTAL_NUMS + " >> "  );
		//gets the first 100 values in the for loop
		for ( i = 1 ; i <= TOTAL_NUMS ; i++ ) 
		{
			int sum = 0;//sum variable to save the collected sum
	
			//nested for loop to obtain the even values in count from 1 to 100
			for ( j = 1 ; j <= TOTAL_NUMS  ; j++ ) 
			{
				if ( j == i )//breaks and stops the loop if number equals itself
				{
					break;
				}
				else
				{
					//if the remainder is 0 the number evenly goes into the divison
					var = i % j;
					if ( var == 0 )
					{
						sum += j;//store the number into the sum 
					}
				}
			}
			if ( sum == j )//if the sum equals the number in the nested loop display perfect number 
				System.out.print( i + " , ");//display on console
		}
		System.out.println();//empty white space
	}
}