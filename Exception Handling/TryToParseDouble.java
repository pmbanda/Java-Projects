/*Author:	Peter Eugene Mbanda
*Date:		9/18/2015
*Purpose:	Parse double error
*/
import java.util.Scanner;
public class TryToParseDouble
{
	public static void main(String[] args) 
	{
		//declare variable and scanner 
		Scanner sc = new Scanner(System.in);
		String numString;
		double num;

		//user prompt stored as string
		System.out.print("Enter a number >> ");
		numString  = sc.next();

		try{
			//covert the srting to a double 
			num = Double.parseDouble(numString);
			System.out.println("You entered " + num);//display the number after convertion 

		}catch( NumberFormatException e){
			//number format exception of the string is not successfully converted 
			num = 0;
			System.out.println("Error - Wrong input Format " + e.getMessage());
			System.out.println("Num is  " + num);
		}
		sc.close();//close scanner class 
	}
}