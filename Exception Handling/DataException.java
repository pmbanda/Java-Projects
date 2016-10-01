/*Compilation: javac PartAndquantityEntry.java
* Execution: java PartAndquantityEntry
*
* Date:		10/7/2015		
* Author:	Peter Eugene Mbanda
* Purpose: 	custom exception class   
*/
public class DataException extends Exception
{
	public DataException( String message )
	{
		super( message );//assign error message according to error caught
	}

}