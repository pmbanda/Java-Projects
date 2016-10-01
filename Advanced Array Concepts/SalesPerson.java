package chapterI;

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
	public int getIdNumber()                     
	{  
		return ID_NUMBER;   
	}
	public void setIdNumber(int idNumber)        
	{ 
		ID_NUMBER = idNumber;	
	}
	
	/*Create a getter and setter method for the sales amount 
	*/
	public double getSalesAmount()      
	{  
		return annualSalesAmount;   
	}
	public void setSalesAmount(double annualSales )    
	{  
		annualSalesAmount = annualSales;   
	}
	
	public String toString()
	{
		return "ID number =  " + getIdNumber() +  ",  AnnualSalesAmount = " + getSalesAmount(); 
	}
	
	

}