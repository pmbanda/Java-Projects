

//Author:	Peter Eugene Mbanda
//Date:		3/30/2015
//Purpose: 	Count string characters

public class CountSpaces
{
	public static void main(String[] args) 
	{
		char space = ' ';//declare the space char variable
		int countSpace = 0;//initialize the counter
		int x;

		String myString = new String("The person who says something is impossible should not interrupt the person who is doing it.");

		//use for loop to loop throgh the string
		for ( x = 0 ; x < myString.length() ; ++x ) 
		{
			if( myString.charAt(x) == space)
				++countSpace;//increment the space counter to determine total spaces
		}

		System.out.println("The string contains " + countSpace + " Spaces ");//display the values 
	}
}