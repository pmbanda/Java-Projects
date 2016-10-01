/*Author:	Peter Eugene Mbanda
*Date:		9/18/2015
*Purpose:	Bad Subscript array
*/
import java.util.*;
public class BadSubscriptCaught
{
	public static void main(String[] args) 
	{
		//declate the class variables 
		Scanner sc = new Scanner(System.in);
		int pos = 0;

		//declare an array of first names
		String [] names = new String[10] ;

		names[0] = "Peter ";
		names[1] = "Gordon ";
		names[2] = "Amber ";
		names[3] = "Mary ";
		names[4] = "Rachael ";
		names[5] = "Prince "; 
		names[6] = "Nathan ";
		names[7] = "Cyrus ";
		names[8] = "Queen ";
		names[9] = "Arnold ";

		try{
			//prompt for user input
			System.out.print("Enter an integer to determine the name in array  >> ");
			pos = sc.nextInt();
			//display the name and exit the system
			System.out.println("You entered " + names[pos]);
			System.exit(0);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			//display the error in catch clause
			System.out.println("You entered " + pos);
			System.out.print("Error - ");
			System.out.println("Bad array Subscript ");	
		}

		
	}
}