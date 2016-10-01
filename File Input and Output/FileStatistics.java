/*Compilation: javac Filestatistics.java
* Execution: java Filestatistics
*
* Date:		10/7/2015		
* Author:	Peter Eugene Mbanda
* Purpose: 	Create a file and determine its properties 
*/
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.nio.file.attribute.FileTime.*;
import java.io.IOException;

public class FileStatistics
{
	public static void main(String[] args) 
	{

		try{
			//class path 
			Path file = Paths.get("H:\\Java\\Chapter13\\Statistics.txt");

			//attribute class to invoke the attribute methods 
			BasicFileAttributes attrs = Files.readAttributes( file, BasicFileAttributes.class );
			FileTime ft;//file time variable to obtain time modification  

			/*
			*print out file details to the console 
			*by method invocation 
			*/
			System.out.println();
			System.out.println("File name is >> " + file.getFileName());
			System.out.println("The containing folder is >> " + file.toString());
			System.out.println("File size >> " + attrs.size() );
			ft = Files.getLastModifiedTime( file );
			System.out.println("Time of last Modification >> " + ft );

		}catch( IOException e ){
			//Exception class to obtain any runtime errors during program execution 
			System.out.println("The Exception caught is " + e.getMessage() ) ;
		}
		
	}
}