/*Author:	Peter Mbanda 
*Date:		08/21/2015
*Purpose:	Candle Sizes 
*/
public class Candle
{
	//declare the class variables 
	private String color;
	private double height;
	private double price;

	//create the get methods 
	public String getColor()
	{
		return color;
	}
	public double getHeight()
	{
		return height;
	}
	public double getPrice()
	{
		return price;
	}

	//Create the setter methods
	public void setColor( String clr )
	{
		color = clr  ;
	}
	public void setHeight( double ht )
	{
		height = ht;
		price = ( 2 * height );//price is $2 per inch(height)
	}

	public void display()
	{
		System.out.println("****Regular candle****");
		System.out.println();
		System.out.println("Color " + getColor() + "\n" + "Height " + getHeight() + "\n" + "Price " + getPrice() );
	}
}