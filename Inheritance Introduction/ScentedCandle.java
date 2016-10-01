/*Author:	Peter Mbanda 
*Date:		08/21/2015
*Purpose:	Candle Sizes 
*/
public class ScentedCandle extends Candle
{
	/*Declare the variable and 
	*create the getter and setter methods
	*/
	private String scent;
	private double scentPrice;

	public String getScent()
	{
		return scent;
	}
	public void setScent( String fragrance )
	{
		scent = fragrance;
	}

	public void setHeight( double ht  )
	{
		super.setHeight( ht );//use override from super 
		scentPrice = ( 3 * ht );//price is $3 per inch(height) for scented candle 
	}
	

	public void display()
	{
		//display the information about the candle
		System.out.println("****Scented candle**** ");
		System.out.println();
		System.out.println("Scent " + getScent() + "\n" + "Price " + scentPrice );
	}

}