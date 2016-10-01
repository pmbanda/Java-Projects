package chapterG;

//Author:	Peter Eugene Mbanda
//Date:		3/30/2015
//Purpose: 	Manipulation of the string methods  

import java.util.*;
public class ConstructID
{
	public static void main(String[] args) 
	{
		String userName = "";
		String firstName = "";
		String middleName = "";
		String lastName = ""; 
		//char space = ' ';
		//int count = 0;

		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.print("Please enter your full name >> ");
		userName = input.nextLine();

		System.out.println();
		System.out.print("Please enter your street address: --e.g { 34 Elm} in that order--  >> ");
		String address = input.nextLine();

		StringTokenizer spaces = new StringTokenizer(userName);
		StringTokenizer spaces2 = new StringTokenizer(address);

		firstName = spaces.nextToken();
		getInitials(firstName);
		middleName = spaces.nextToken();
		getInitials(middleName);
		lastName = spaces.nextToken();
		getInitials(lastName);

		String numberAddress  = spaces2.nextToken();
		System.out.println();
		System.out.println("Your Computer generated ID is >> " + getInitials(firstName) + getInitials(middleName) + getInitials(lastName)
					+ numberAddress);

		input.close();
	}

	public static String getInitials(String name)
	{
		char initial;
		String stringInitial = null;

		for ( int x = 0 ; x < name.length()  ; x++ ) 
		{
			initial = name.charAt(0);
			stringInitial = Character.toString(initial);
		}

		return stringInitial;
	}
}