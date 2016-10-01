/*Compilation: javac ValidCheckDigits.java
* Execution: java ValidCheckDigits
*
* Date:		10/7/2015		
* Author:	Peter Eugene Mbanda
* Purpose: 	Determine a number values whether valid or not 
*/
import java.nio.file.*;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.*;

public class ValidCheckDigits
{
	//class level variables 
		static int lengthString;
		static String numString;

	public static void main(String[] args) 
	{
		//Create a path of the file 
		//and declare the class level variables 
		Path file = Paths.get("H:\\Java\\Chapter13\\Account.txt");
		Path validFile = Paths.get("H:\\Java\\Chapter13\\Accountvalid.txt");
		
		//main level variables 
		int num;
		InputStream in;
		boolean valid = false;

		try
		{
			//create the input stream and read the file contents using the buffered reader 
			in = Files.newInputStream( file );
			BufferedReader br = new BufferedReader( new InputStreamReader( in ));

			//create the output stream and write the file contents using the buffered writer
			OutputStream out = Files.newOutputStream( validFile );
			BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( out ));

			numString = br.readLine();//read the line of text 
			while( numString != null )
			{
				//used method to check the number validity 
				valid = isValid( numString );

				if( valid )
				{
					//write only values that pass the true criteria 
					String s = numString + " Is Valid " + valid; 
					bw.write(s);
					bw.newLine();
				}
					System.out.println(numString + " Is Valid " + valid );

				numString = br.readLine();//read the line of text 
			}
			//close the buffered reader and buffered writer 
			br.close();
			bw.close();
		} 
		catch(IOException e)
		{
			//in case of input output error throw exception
			e.printStackTrace();
		}
		catch(Exception e)
		{
			//in case of any error throw exception
			e.printStackTrace();
		}


	}

	public static boolean isValid( String numberString )
	{
		boolean valid = false;
		int number;
		int total = 0;
		//convert the value to an integer
		//determinre the length of the string
		number = Integer.valueOf( numberString ); 
		lengthString = numberString.length();

		//determine the last digit
   		char c = numberString.charAt( (lengthString - 1) );
   		int lastDigit = Character.getNumericValue(c);

   		//accumulate the total of the first five numbers 
   		c = numberString.charAt(0); 
   		int num1 = Character.getNumericValue(c);
   		total += num1;

   		c = numberString.charAt(1);
   		int num2 = Character.getNumericValue(c); 
   		total += num2;

   		c = numberString.charAt(2); 
   		int num3 = Character.getNumericValue(c); 
   		total += num3;

   		c = numberString.charAt(3); 
   		int num4 = Character.getNumericValue(c);
   		total += num4; 

   		c = numberString.charAt(4); 
   		int num5 = Character.getNumericValue(c);
   		total += num5; 

   		//determine the remainder for total of all the five digits 
   		int digOver10 = ( total % 10 );

   		if( lastDigit == digOver10 )
   			valid = true;//assign the boolean true if the last number and the remainder is equal
   		else
   			valid = false;//else assign the value false 

   		return valid;//return the boolean value 
	}
}