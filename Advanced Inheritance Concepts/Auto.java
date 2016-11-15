/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Auto app
*/
public abstract class Auto
{

	//declare the variables 
	private String carMake;
	protected double price;

	//create the get methods for the make and price
	public String getCarMake(){
		return carMake;
	}

	public double getPrice(){
		return price;
	}

	//create the mutator method for setting the make of the car
	public void setCarMake( String make ){
		carMake = make;
	}

	//abstract method for the price
	public abstract void setPrice();


}
