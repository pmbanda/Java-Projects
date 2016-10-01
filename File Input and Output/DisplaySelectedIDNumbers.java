/*Compilation: javac DisplaySavedEmployeeList.java
* Execution: java DisplaySavedEmployeeList
*
* Date:		10/8/2015		
* Author:	Peter Eugene Mbanda
* Purpose: 	display user info based on ID entry 
*/
import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class DisplaySelectedIDNumbers
{
	public static void main(String[] args) {
		
		//create class variables 
		int id;
		String idString;
		Scanner input = new Scanner( System.in );//scanner to read keyboard input 

		try{
			/*
			* class path for file location
			* buffered input stream instance to read from file
			* through the input stream
			* from the buffered reader
			*/
			String s = "000,xxxxxxx,xxxxxxx" + System.getProperty("line.separator");
			final int SIZE = s.length();
			byte [] data = s.getBytes();
			ByteBuffer buf = ByteBuffer.wrap( data );
			FileChannel fc = null;
			final String QUIT = "999";//constant variable to terminate loop
			int count = 0;

			System.out.println();
			Path file = Paths.get("H:\\java\\Chapter13\\Employeelist.txt");

			/*
			*Read the file to determine the length of the file 
			*/
			BufferedReader reader = new BufferedReader(new InputStreamReader(  Files.newInputStream(file, READ)));
			int lines = 0;
			while (reader.readLine() != null)
			{
				lines++;//accumelate the number of lines 
			} 
			reader.close();
			

			fc = ( FileChannel )Files.newByteChannel( file , READ );//create a file channel to seek data

			//User prompt for id number 
			System.out.print("Enter ID number or " + QUIT + " to quit >> ");
			idString = input.nextLine();

			while( !(idString.equals(QUIT)) )
			{
				count++;
				//converd idstring to integer and wrap in byte buffer 
				id = Integer.parseInt( idString );
				buf = ByteBuffer.wrap( data );
				//determine position and the byte size
				fc.position( (id - 1) * SIZE );
				fc.read( buf );
				s = new String( data );//assign data to string 

				if ( id > lines )
				{
					System.out.println("The ID# " + id + " does not exist ");
					System.exit(0);
				}
				else
					System.out.println("ID # " + id + "  " + s );

				System.out.print("Enter ID number or " + QUIT + " to quit >> ");
				idString = input.nextLine();
			}

			fc.close();//close the file channel

		}
		catch( IOException e )
		{
			/*
			*Catches the exception on the try block in case of any runtime 
			*/
			System.out.println("The exception caught is " + e.getMessage());
		}
		catch( Exception e )
		{
			/*
			*Catches the exception on the try block in case of any runtime 
			*/
			System.out.println("The exception caught is " + e.getMessage());
		}
	}
}