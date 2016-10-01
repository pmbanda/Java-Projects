package chapterG;

//Author:	Peter Eugene Mbanda
//Date:		3/30/2015
//Purpose: 	Count words 

import java.util.*;
public class CountWords
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//instantiate the scanner method 

		System.out.println("Enter several words --you can include characters-- and punctuation marks ");//prompt the user for input 
		String userName = input.nextLine();//user input 

		StringTokenizer myString = new StringTokenizer(userName);
		int numberOftokens = myString.countTokens();//count tokens in a string will exclude the number of spaces 

		for ( int x = 0 ; x < userName.length()  ; x++ ) 
		{
			if ( userName.charAt(x) == '!' || userName.charAt(x) == '-' || userName.charAt(x) == '?' || userName.charAt(x) == ',' || userName.charAt(x) == '.' || userName.charAt(x) == '_' )
			{
				--numberOftokens;
			}
			
		}
	
		System.out.println();
		System.out.println("The number of words in the string is " + numberOftokens);//display the results 


		input.close();
	}
}