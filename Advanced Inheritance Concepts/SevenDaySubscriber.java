/*Author:	Peter Eugene Mbanda 
*Date:		9/8/2015
*Purpose: 	Newspaper application
*/
public class SevenDaySubscriber extends NewspaperSubscriber{

	private final String serviceType = "Seven Day Subscriber ";

	//declate the service type as final
	public SevenDaySubscriber(){
		setRate();
	}

	//implement the rate from the abstract method from the super
	public void setRate(){
		rate = 4.50;
	}

	//override the to string method from the object class 
	public String toString(){
		
		System.out.println(serviceType);
		return "Address >>> " + getAddress() + "\nRate >>> $" + getRate();
	}

}