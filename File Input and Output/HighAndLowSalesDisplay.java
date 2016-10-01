/*Compilation: javac HighAndLowSalesDisplay.java
* Execution: java HighAndLowSalesDisplay
*
* Date:     10/7/2015       
* Author:   Peter Eugene Mbanda
* Purpose:  Store employee details on file based on the sales amount
*/
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class HighAndLowSalesDisplay
{
	public static void main(String[] args) 
	{
		//create the class level variables
        int ID;
        String firstName;
        String lastName;
        int amount;
        String delimeter = ",";
        String s = "";
        
        //Enter the sales person sales data 
        //instantiate the scanner class 
        Scanner input = new Scanner( System.in );
        
        //user prompt ID , First name, Last name , Sales amount 
        System.out.print("Enter sales person ID >> ");
        ID = input.nextInt();
        input.nextLine();
        System.out.print("Enter First name >> ");
        firstName = input.next();
        input.nextLine();
        System.out.print("Enter last name >> ");
        lastName = input.next();
        System.out.print("Enter month sales in whole dollar amount >> ");
        amount = input.nextInt();
        input.nextLine();
        
        /*
        if the sales amount is greater than $1000 write the files to 
        the high performers 
        else write the file to the low performers 
        */
        try
        {
            if ( amount > 1000 )
            {
            	String header = String.format("%s ","High Performers File\n");
            	String title = String.format("%3s%15s%15s%8s","ID" , "First Name", "Last Name", "Amount" );
                //create a stream to write to the file 
                Path file = Paths.get("H:\\Java\\Chapter13\\Highperformers.txt");
                OutputStream out = Files.newOutputStream( file );
                BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( out ));
                
                s = String.format("%3d%15s%15s%8d",ID , firstName, lastName, amount );
                bw.write(header);
                bw.newLine();
                bw.write(title);
                bw.newLine();
                bw.write(s);
                bw.newLine();
                
                bw.flush();//flush the buffere writer 
                bw.close();//close the buffered writer 
                
            }

            else
            {
            	String header = String.format("%s ","Low Performers File\n");
            	String title = String.format("%3s%15s%15s%8s","ID" , "First Name", "Last Name", "Amount" );
                //create a stream to write to the file 
                Path file = Paths.get("H:\\Java\\Chapter13\\Lowperformers.txt");
                OutputStream out = Files.newOutputStream( file );
                BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( out ));
                
                s = String.format("%3d%15s%15s%8d",ID , firstName, lastName, amount );
                bw.write(header);
                bw.newLine();
                bw.write(title);
                bw.newLine();
                bw.write(s);
                bw.newLine();
                
                bw.flush();//flush the buffered writer 
                bw.close();//close the buffered writer 
            }
        }
        catch(IOException e )
        {
            //generate message in case the file does not open
            e.getMessage();
        }
        catch( Exception e )
        {
            //generate other general messages caused by other exceptions
            e.getMessage();
        }
	}
}