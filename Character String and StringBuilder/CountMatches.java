

//Author:	Peter Eugene Mbanda
//Date:		3/30/2015
//Purpose: 	Count if strings match 
import java.util.*;
public class CountMatches
{
	public static void main(String[] args) 
	{
		//Declare the variables
		int i;
		int j;
		int similarChar = 0;

		Scanner input = new Scanner(System.in);//instantiate the scanner class

		System.out.print("Enter a string >> ");//user prompt
		String string1 = input.nextLine();

		System.out.print("Enter another string >> ");//user prompt
		String string2 = input.nextLine();

		System.out.println("\nYou entered --" + string1 + "-- as first string ");//display the string
		System.out.println("You entered --"+ string2 + "-- as second string" );//display the strintg

		for ( i = 0 ; i < string1.length() ; ++i ) 
		{
			string1.charAt(i);//display the character on the outer loop

			for ( j = 0 ; j < string2.length() ; ++j ) 
			{
				string2.charAt(j);//display the character in the inner loop\

				if ( string1.charAt(i) == string2.charAt(j))
				{	
					string2.charAt(j);
					++similarChar;
					String convertChar = Character.toString(string2.charAt(j));
					System.out.println("Similar characters " + convertChar);
				}	
			}
		}
		System.out.println("Number of similar characters " + similarChar );
		input.close();
	}
}