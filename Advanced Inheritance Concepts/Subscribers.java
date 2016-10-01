/*Author:	Peter Eugene Mbanda 
*Date:		9/8/2015
*Purpose: 	Newspaper application
*/
import java.util.*;
public class Subscribers{

		//enum class for the constants 
		public enum Subscriber { WEEKDAY, WEEKEND, SEVENDAY };

	public static void main(String[] args) {

		//declare the global methods in main method
		Subscriber type;
		String addressInput, sub ;
		Scanner sc = new Scanner(System.in);
		NewspaperSubscriber newsPaper;

		System.out.println();
		//prompt the user for the service type
		System.out.println("Enter the type of service ( weekday, weekend or sevenday ) ");
		sub = sc.nextLine().toUpperCase();
		type = Subscriber.valueOf(sub);//convert to enum value 

		//create object depending on the enum value 
		switch(type){

			case WEEKDAY:
				newsPaper = new WeekDaySubscriber();
				System.out.println();
				System.out.println("Enter the users street address ");
				addressInput = sc.nextLine();
				newsPaper.setAddress(addressInput);
				newsPaper.setRate();

				System.out.println();
				System.out.println();

				System.out.println(newsPaper);
				break;
			case WEEKEND:
				newsPaper = new WeekEndSubscriber();
				System.out.println();
				System.out.println("Enter the users street address ");
				addressInput = sc.nextLine();
				newsPaper.setAddress(addressInput);
				newsPaper.setRate();

				System.out.println();
				System.out.println();

				System.out.println(newsPaper);
				break;
			case SEVENDAY:
				newsPaper = new SevenDaySubscriber();
				System.out.println();
				System.out.println("Enter the users street address ");
				addressInput = sc.nextLine();
				newsPaper.setAddress(addressInput);
				newsPaper.setRate();

				System.out.println();
				System.out.println();

				System.out.println(newsPaper);
				break;

		}
	}
}