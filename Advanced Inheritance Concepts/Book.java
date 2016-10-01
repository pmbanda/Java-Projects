/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Book Value application
*/
public abstract class Book
{
	//variables for class level
	private String bkTitle;
	protected double bkPrice;

	//abstract method set price 
	public abstract void setPrice();

	//class constructor 
	public Book( String title )
	{
		bkTitle = title;
		setPrice();
	}

	//accessor methods for title and price 
	public String getTitle()
	{
		return bkTitle;
	}

	public double getPrice()
	{
		return bkPrice;
	}

	

}