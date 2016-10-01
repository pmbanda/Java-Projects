/*Compilation: javac Filestatistics2.java
* Execution: java Filestatistics2
*
* Date:		10/7/2015		
* Author:	Peter Eugene Mbanda
* Purpose: 	Determine and compare different files and their ratio
* 			against another 
*/
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.nio.file.attribute.FileTime.*;
import java.io.IOException;

public class FileStatistics2
{
	public static void main(String[] args) 
	{
		int numerator = 0;
		int dinominator = 0;
		try{
			//class path 
			Path fileNotepad = Paths.get("H:\\Java\\Chapter13\\Quote.txt");
			Path fileWordDoc = Paths.get("H:\\Java\\Chapter13\\Quote.docx");
			System.out.println();
			//attribute class to invoke the attribute methods
			BasicFileAttributes attrsNotepad = Files.readAttributes( fileNotepad , BasicFileAttributes.class );
			BasicFileAttributes attrsWordDoc = Files.readAttributes( fileWordDoc , BasicFileAttributes.class );

			System.out.println("File size for >> " + fileNotepad.getFileName() + " << is : " + attrsNotepad.size() );
			System.out.println("File size >> " + fileWordDoc.getFileName() + " << is : " + attrsWordDoc.size() );
			System.out.println();


		}catch( Exception e ){
			//Exception class to obtain any runtime errors during program execution 
			System.out.println("The Exception caught is " + e.getMessage() ) ;
		}

	}
}