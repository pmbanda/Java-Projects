

/*Author 	Peter Eugene Mbanda
 * Program 		Array of sorting Strings in Java 
 */
import java.util.Scanner;
public class DayWeek 
{
	private enum Week { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };	
		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner ( System.in );//create a scanner object 
		Week weekDay;
		
		System.out.print("Days of the week >> ");
		//iterate to display the days of the week
		for (  Week day : Week.values()) 
			System.out.print( day + " " );
		System.out.println();//empty white space 
		System.out.println();
		
		System.out.print("Enter a day >> ");//user prompt 
		String dayEntry = sc.next().toUpperCase();
		weekDay = Week.valueOf(dayEntry);//obtain the string value and convert 
		//to enumeration type 
		
		switch( weekDay )//use switch statement to determine the openung hours 
		{
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
				System.out.println("Open 9AM - 9PM ");
				break;
			case SATURDAY:
				System.out.println("Open 10AM - 6PM");
				break;
			case SUNDAY:
				System.out.println("Open 11AM - 5PM");
				break;
		}
		sc.close();
	}

}
