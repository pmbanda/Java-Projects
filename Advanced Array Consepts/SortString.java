package chapterI;

/*Author 	Peter Eugene Mbanda
 * Program 		Array of sorting Strings in Java 
 */
import java.util.Arrays;

public class SortString 
{
	public static void main(String[] args) 
	{
		final int ARRAY_NUMBER = 10;
		String [] values;
		values = new String[ARRAY_NUMBER];
		//assign values to the array 
		values[0] = "Jamal";
		values[1] = "Peter";
		values[2] = "Rachael";
		values[3] = "Betty";
		values[4] = "Larry";
		values[5] = "Caleb";
		values[6] = "Nathan";
		values[7] = "Folie";
		values[8] = "Sally";
		values[9] = "Bobby";
		
		//display the array names 
		System.out.println("Before sorting the array ");
		for (String names: values)
			System.out.println(names);
		//sort the array
		Arrays.sort(values);
		System.out.println();
		System.out.println("After sorting Array ");
		//display the sorted values 
		for (String names: values)
			System.out.println(names);

	}

}
