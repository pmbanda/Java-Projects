package chapterH;

/*Author:		Peter Eugene Mbanda
*Purpose:		Create class containning the ID and sales person
*Date:			4/20/2015
*/
public class SalesPerson
{
	//Declare the class attributes 
	private int ID_NUMBER;
	private double annualSalesAmount;
	
	//create a class constructor 
	public SalesPerson(int idNumber , double annualSales)
	{
		ID_NUMBER = idNumber;
		annualSalesAmount = annualSales;
	}

	/*Create a getter and setter method for the ID number 
	*/
	public void setIdNumber(int idNumber)        
	{ 
		ID_NUMBER = idNumber;	
	}
	
	public int getIdNumber()                     
	{  
		return ID_NUMBER;   
	}

	/*Create a getter and setter method for the sales amount 
	*/
	public void setSalesAmount(double annualSales )    
	{  
		annualSalesAmount = annualSales;   
	}
	public double getSalesAmount()      
	{  
		return annualSalesAmount;   
	}
	

}