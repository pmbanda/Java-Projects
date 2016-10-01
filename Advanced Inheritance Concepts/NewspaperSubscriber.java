/*Author:	Peter Eugene Mbanda 
*Date:		9/8/2015
*Purpose: 	Newspaper application
*/
public abstract class NewspaperSubscriber{

	//declare the class variables 
	private String address;
	protected double rate;

	//getter methods for the address and rate 
	public String getAddress(){
		return address;
	}

	public double getRate(){
		return rate;
	}
	//setter method for the street assress 
	public void setAddress( String address ){
		this.address = address;
	}
	//absract method rate with no body implemented 
	public abstract void setRate();

	//create an equal method to determine if the objects are the same based on the address 
	public void equal( NewspaperSubscriber newsPaper ){
		if ( this.address == newsPaper.address )
			System.out.println("Subscribers are equal ");
		else
			System.out.println("Subscribers are NOT equal ");
	}



}