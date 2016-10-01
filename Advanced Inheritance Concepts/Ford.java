/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Auto app
*/
public class Ford extends Auto{

	//implement the method set price that was declared as abstract 
	public void setPrice(){
		price = 20000;
	}

	//method for returning the current value of the objects state 
	public String toString(){
		return getCarMake() + " price is " + getPrice();
	}
}