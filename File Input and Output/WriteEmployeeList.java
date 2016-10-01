/*Compilation: javac WriteEmployeeList.java
* Execution: java WriteEmployeeList
*
* Date:		10/8/2015		
* Author:	Peter Eugene Mbanda
* Purpose: 	write user input to file 
*/
import java.nio.file.Paths.*;
import java.nio.file.*;
import java.io.OutputStreamWriter.*;
import java.io.*;
import java.io.OutputStream.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class WriteEmployeeList
{
	public static void main(String[] args) 
	{
		//Scanner class to invoke the scanner methods 
		Scanner input = new Scanner ( System.in );

		//class variables 
		String id_string;
		String first_name;
		String last_name;
		String delimiter = ",";//same line separator
		String s = "";
		final String QUIT = "999";//unique field to quit application

		try{
			/*
			* class path 
			* created if the file does not exist 
			* buffered output stream instance to write to file
			* through the output stream
			* from the buffered writer 
			*/
			Path file = Paths.get("H:\\java\\Chapter13\\Employeelist.txt");
			OutputStream out = new BufferedOutputStream( Files.newOutputStream( file, CREATE ));
			BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( out ) );

			System.out.println();
			//user prompt 
			System.out.print("Enter ID number >> ");
			id_string = input.nextLine();

			//loop until user enters the quit value 
			while( !(id_string.equals(QUIT)) ){
				//prompt first name and last name 
				System.out.print("Enter first name >> ");
				first_name = input.nextLine();
				System.out.print("Enter last name >> ");
				last_name = input.nextLine();
				//assign the input to the srtring s with delimiter
				s = id_string + delimiter + first_name + delimiter + last_name ;
				//write to the file 
				writer.write( s );
				writer.newLine();//create a newline to separate the values 
				System.out.println();
				
				System.out.print("Enter ID number or "  + QUIT + " to Quit >> ");
				id_string = input.nextLine();
			}
			/*
			*flush buffer and close the writer 
			*/
			writer.flush();
			writer.close();

		}catch( Exception e ){
			/*
			*Catches the exception on the try block in case of any runtime 
			*/
			System.out.println("The exception caught is " + e.getMessage());
		}

	}
}