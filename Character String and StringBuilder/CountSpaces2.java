package chapterG;

//Author:	Peter Eugene Mbanda
//Date:		3/30/2015
//Purpose: 	Count string characters on user input
import java.util.*;
public class CountSpaces2
{
	public static void main(String[] args) 
	{
		char space = ' ' ;//declare the space char variable
		int countSpace = 0;//initialize the counter
		int x;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string Containing at least one space.");
		String userName = input.nextLine();

		//use for loop to loop throgh the string
		for ( x = 0 ; x < userName.length() ; ++x ) 
		{
			if( userName.charAt(x) == space)
				++countSpace;//increment the space counter to determine total spaces
		}
		System.out.println();
		System.out.println("The string contains " + countSpace + " Spaces ");//display the values 
		input.close();
	}
}