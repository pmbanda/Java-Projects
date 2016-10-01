/*Compilation: javac DisplaySavedEmployeeList.java
* Execution: java DisplaySavedEmployeeList
*
* Date:		10/8/2015		
* Author:	Peter Eugene Mbanda
* Purpose: 	display file contents
*/
import java.nio.file.Paths.*;
import java.nio.file.*;
import java.io.InputStreamReader.*;
import java.io.*;
import java.io.InputStream.*;
import static java.nio.file.StandardOpenOption.*;
public class DisplaySavedEmployeeList
{
	public static void main(String[] args) 
	{
		String s = "";//create empty string to store string values 

		try{
			/*
			* class path for file location
			* buffered input stream instance to read from file
			* through the input stream
			* from the buffered reader
			*/
			Path file = Paths.get("H:\\java\\Chapter13\\Employeelist.txt");
			InputStream in = new BufferedInputStream( Files.newInputStream( file, READ ));
			BufferedReader reader= new BufferedReader( new InputStreamReader( in ) );

			System.out.println();
			s = reader.readLine();//assign read string to object 

			//if string is not empty keep on reading from file 
			while( s != null ){
				System.out.println( s );//display the read string on console
				//System.out.println();//empty white line to separate records 
				s = reader.readLine();
			}
		}catch( Exception e ){
			/*
			*Catches the exception on the try block in case of any runtime 
			*/
			System.out.println("The exception caught is " + e.getMessage());
		}
	
	}
}