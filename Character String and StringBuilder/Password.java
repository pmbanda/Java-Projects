

//Author:	Peter Eugene Mbanda
//Date:		3/30/2015
//Purpose: 	Password application 

import java.util.Scanner;

public class Password 
{
	//Declare the class level variables
	private static Scanner input = new Scanner(System.in);
	private static String passWord;
	private static String rePassWord;
	private static String emptySpace = " ";
	//private static boolean passCode = false;

	public static void main(String[] args) 
	{
		/*
		*Prompt the user for password from the console 
		*and keep prompting if the password is less than 2 characters or containing a space
		*/
		
		do
		{
			System.out.print("Enter the User name Password >> \n");
			passWord = input.nextLine();
				
		}while ( passWord.equalsIgnoreCase(emptySpace) || passWord.length() < 2 );//repeat loop if condition is true
		

		if ( passWord.length() < 6 || passWord.length() > 10 )//if condition is below 6 and more that 10 characters 
		{
			/*
			*re-prompt the user to enter between 6 and 10 character password
			*/
			do 
			{
				System.out.print("Enter the User name Password between 6 and 10 characters >> \n");
				passWord = input.nextLine();
				
			}while(passWord.length() < 6 || passWord.length() > 10);//while true loop again till condition is met

			System.out.println("Password entered successfully");//password successfully if all conditions met
		}
		else if (passWord.length() > 5 || passWord.length() < 11)
		{
			System.out.println("Password entered successfully");//if condition is met password is successful
		}
		
		if (passWord.equalsIgnoreCase(rePassWord))
			System.out.println("Password entered successfully");
		
		else 
		{
			do
			{
			System.out.print("Re-enter the Password, make sure it matches the first >> \n");
			rePassWord = input.nextLine();
			
			}while( !passWord.equalsIgnoreCase(rePassWord) );
			
			if (passWord.equalsIgnoreCase(rePassWord))
				System.out.println("Password entered successfully");
		}

		
		
	}
	
	

}