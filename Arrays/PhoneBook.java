

/*
 * Author:		Peter Eugene Mbanda
 * Date:		4/23/2015
 * Purpose:		Store user and phone number in the array and display elements in the array.
 */
import java.util.Scanner;//import the scanner class 

import javax.swing.JOptionPane;

public class PhoneBook 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//initialize the Scanner class 
		int listNumber = 5;//total list of people
		String [] userName = new String[listNumber];//Create array user name 
		long [] phoneNumber = new long[listNumber];//create the array list number 
		int count = 0;//initialize the count to store the total users 
		int i;
		boolean valid = false;
		long validPhone = 0 ;
		
		
		for (i = 0; i < listNumber ; i++) 
		{
			++count;
			System.out.print("Enter user name " + ( i + 1 ) + " >> ");//user name entry 
			userName[i] = input.nextLine();
			
			/*If the user name is equivalent to the letter zzz 
			 * the i array count is maximized to total in order to terminate the loop
			 * and the count is decremented to terminate the loop 
			 */
			if ( userName[i].equalsIgnoreCase("zzz"))
			{
				System.out.println();
				i = listNumber;
				--count;
				break;
			}
			
			System.out.print("Enter user phone number " + ( i + 1 ) + " >> ");//use prompt 
			phoneNumber[i] = input.nextLong();//phone number entry
			input.nextLine();
		
			
			System.out.println();//empty line space 
		}
		
		/*
		 * Iterate over the array to display the values 
		 */
		for ( i = 0; i < listNumber; i++) 
		{
			System.out.println("User " + ( i + 1 ));//increment by one since loop starts at zero
			System.out.println("Name: " + userName[i]);
			System.out.println("Phone Number: "+ phoneNumber[i]);
			System.out.println("------------------------------------");
		}
		System.out.println("Number of users = " + count );//count the total number of users excluding the zzz entry 
		
		System.out.println();
		/*
		* iterate list to determine users number after name entry 
		*/
		System.out.print("Type user name to display the user details >> ");//prompt user for entry 
		String nameEntry = input.nextLine();//name entry 
		
		for ( i = 0; i < listNumber ; ++i ) 
		{
			/*
			 * Loop to determine whether the name matches any array element
			 */
			if( nameEntry.equalsIgnoreCase(userName[i].toString()))
			{
				valid = true;//assign true if match is found
				validPhone = phoneNumber[i];
				i = listNumber;//assign the total list number in order to terminate the array
			}else
			{
				valid = false;
			}

		}
		
		if ( valid )//if boolean is true display the message
		{
			JOptionPane.showMessageDialog(null, nameEntry + " Number is :  " + validPhone);//display the user phone number 
		}
		else//if boolean is false display the error message below
		{
			JOptionPane.showMessageDialog(null, "You entered a wrong name  " ); 
		}
		
		input.close();
	}

}
