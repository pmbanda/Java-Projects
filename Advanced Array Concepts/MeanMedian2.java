

/*Author 	Peter Eugene Mbanda
 * Program 		Array of sorting Strings in Java
 */
import java.util.Arrays;
import java.util.Scanner;
public class MeanMedian2 
{
	private static Scanner input = new Scanner(System.in);
	private static int userEntry;
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number for array as Integer >> ");
		int inputArray = input.nextInt();
		final int totalNumber = inputArray;//determine the number in the array
		int [] num = new int[totalNumber];
		System.out.println();
		//call functions in the main method
		arrayEntry(num);
		Arrays.sort( num);
		display( num );
		calculateMean( num );
		calculateMedian ( num );
	}
	public static void arrayEntry(int [] digits)
	{
		//used to populate the array 
		System.out.println("Number contained in array is >> " + digits.length);
		for (int i = 0; i < digits.length; i++) 
		{
			System.out.print( ( i + 1 ) + ": Enter number >> ");//prompt for user input 
			userEntry = input.nextInt();
			digits[i] = userEntry;//assign the value to the array 
		}
		System.out.println();
	}
	public static void calculateMean( int [] digits )
	{
		double total = 0;//declare the total variable 
		double mean = 0;//declare the mean variable 
		System.out.println(" ");
		for (int i = 0; i < digits.length; i++) 
			total += digits[i];//assign the value to total 
		mean = ( double )( total / digits.length );
		System.out.printf("The mean is %.2f", mean  );//print out the mean value 
		System.out.println();
	}
	public static void calculateMedian( int [] digits )
	{
		//if the array divided by 2 is even perform the if statment
		if ( (digits.length % 2) == 0 )
		{
			int median1 = digits.length / 2;
			int median2 = median1 - 1;
			double mid = ( digits[median1] + digits[median2] ) / 2.0;
			System.out.println("Median is " + mid );
		}
		else
		{
			int median = digits.length / 2;//obtain the media if it is not even number 
			System.out.println("Median is " + digits[median] );//determine the median number by dividing the length by 2 
		}
	}
	public static void display( int [] display )
	{
		System.out.println();
		System.out.print("Numbers entered >> ");//display values 
		//by iterating through the array 
		for (int i = 0; i < display.length; i++) 
			System.out.print( display[i] + "  " );
		System.out.println();
	}
}
