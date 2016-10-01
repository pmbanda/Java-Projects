package chapterD;

//Author:	Peter Eugene Mbanda 
//Date:		2/10/2015
//Program:	Compute tax based on different arguments 

public class Billing
{	//Declare the class fields 
	@SuppressWarnings("unused")
	private double price;
	@SuppressWarnings("unused")
	private int quantity;
	@SuppressWarnings("unused")
	private double couponValue;
	private double tax = 0.08 ;

	public double computeBill(double price)
	{
		double total;
		this.price = price;//assign the parameter price to the fields var
		total = price + ( price * tax ) ;//add 8% tax to the price after getting product of price and tax 
		return total;//return the total amount to the method 
	}

	public double computeBill(double price , int quantity )
	{
		double total;
		this.price = price ;//assign price to field variable 
		this.quantity = quantity;//assign quantity to field variable 
		total = (price * quantity) ;//multiply the price and the quantity 
		total += ( total * tax );//return the product to the tax
		return total;//return the total to the method 
	}

	public double computeBill(double price , int quantity, double couponValue )
	{
		double total;
		this.price = price ;//assign price to field variable 
		this.quantity = quantity;//assign quantity to field variable
		total = price * quantity ;//multiply the price and the quantity 
		total -= couponValue;//reduce the result by the coupon value 
		total += ( total * tax );
		return total;//return the total to the method 
	}
}
