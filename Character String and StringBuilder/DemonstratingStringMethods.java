

//Author:	Peter Eugene Mbanda
//Date:		3/30/2015
//Purpose: 	Various string methods 

public class DemonstratingStringMethods
{
	public static void main(String[] args) 
	{
		int indexOfV, indexOfX ;
		String quote = "\"You can never cross the ocean until you have the courage to lose sight of the shore"
						+ " - Christopher columbus\"" ;//declare the quote
		indexOfV = quote.indexOf('v');
		System.out.println("Index of v is " + indexOfV );
		indexOfX = quote.indexOf('x');
		System.out.println("Index of v is " + indexOfX );
		System.out.println("Character at position 16 " + quote.charAt(16));
		System.out.println("Ends with the specified string " + quote.endsWith("bus"));
		System.out.println("Ends with the specified string " + quote.endsWith("car"));
		System.out.println();
		System.out.println("Replace the c character " + quote.replace('c', 'C'));
	}
}