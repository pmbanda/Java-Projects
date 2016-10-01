/*Compilation: javac DisplaySavedEmployeeList.java
* Execution: java DisplaySavedEmployeeList
*
* Date:		10/8/2015		
* Author:	Peter Eugene Mbanda
* Purpose: 	display id num and last name based on first user name input 
*/
import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class DisplaySelectedFirstNames
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);//instantiate the scanner class 
		Path file = Paths.get ("H:\\java\\Chapter13\\Employeelist.txt");//determine the class path 

		//create an array of strings 
		String [] array = new String[3];
		String s = "";//initialize value s to nothing 
		String delimiter = ",";//separates the file values 
		
		//Class level variables 
		String stringID;
		String firstName;
		String lastName;
		String userInput;
		boolean valid = false;//boolean to determine valid input 

		try{
			//open file stream 
			InputStream input = new BufferedInputStream( Files.newInputStream( file, READ ));
			BufferedReader reader = new BufferedReader( new InputStreamReader ( input ));

			System.out.println();
			System.out.print("Enter first name >>");//user prompt 
			userInput = sc.next();

			s = reader.readLine();//read line in file 

			while( s != null )
			{
				array = s.split( delimiter );
				//Separate the file contents 
				//and assign the values to the array indices 
				stringID = array[0];
				firstName = array[1];
				lastName = array[2];

				if( userInput.equalsIgnoreCase( firstName))
				{
					//determine if the user name on file matches the user input 
					s = stringID + delimiter + firstName + delimiter + lastName + System.getProperty("line.separator");
					System.out.print( s );//display file content
					valid = true;
				}
				s = reader.readLine();//reread file 
			}
			reader.close();
			if ( !valid )//if user name is not found in the file display message 
				System.out.println("You entered wrong name ");
		}
		catch( IOException e )
		{
			//error if file is not read properly
			System.out.println( e.getMessage());
		}
		catch( Exception e )
		{
			//general exception
			System.out.println( e.getMessage());
		}
	}
}