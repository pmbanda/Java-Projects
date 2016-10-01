/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Book Value application
*/
public class NonFiction extends Book
{
	//create a class constructor since super has constructor 
	public NonFiction( String title )
	{
		super( title );
	}

	//implement the absract method set price 
	public void setPrice()
	{
		bkPrice = 37.99;
	}

	//override the toString method in the object class 
	public String toString()
	{
		System.out.println("Non fiction Book :");
		return getTitle() + "\nCosts $" + getPrice(); 
	}

}