/*Author:	Peter Eugene Mbanda 
*Date:		9/8/2015
*Purpose: 	Newspaper application
*/
public class WeekDaySubscriber extends NewspaperSubscriber{

	//declate the service type as final
	private final String serviceType = "Weekday Subscriber ";


	public WeekDaySubscriber(){
		setRate();
	}
	//implement the rate from the abstract method from the super
	public void setRate(){
		rate = 3.50;
	}
	//override the to string method from the object class 
	public String toString(){

		System.out.println(serviceType);
		return "Address >>> " + getAddress() + "\nRate >>> $" + getRate();
	}
}