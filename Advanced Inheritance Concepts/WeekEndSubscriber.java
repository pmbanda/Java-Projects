/*Author:	Peter Eugene Mbanda 
*Date:		9/8/2015
*Purpose: 	Newspaper application
*/
public class WeekEndSubscriber extends NewspaperSubscriber{

	//declate the service type as final
	private final String serviceType = "Weekend Subscriber ";

	public WeekEndSubscriber(){
		setRate();
	}

	//implement the rate from the abstract method from the super
	public void setRate(){
		rate = 2.00;
	}

	//override the to string method from the object class 
	public String toString(){
		
		System.out.println(serviceType);
		return "Address >>> " + getAddress() + "\nRate >>> $" + getRate();	
	}
}