
//Author:	Peter Eugene Mbanda
//Date:		3/6/2015
//Purpose:	determine the sales details

public class Purchase 
{
	//Declare the variables 
	double invoiceNumber;
	double salesAmount;
	double salesTax;
	//include the getter and the setter methods
	public void setSalesAmount( double salesAmount)
	{
		//assign the parameter to the field
		this.salesAmount = salesAmount;
		salesTax =  this.salesAmount * ( 5 / 100.0 );
	}
	
	public void setInvoiceNumber(double invoiceNumber)
	{
		//assign the parameter to the field
		this.invoiceNumber = invoiceNumber;
	}
	
	
	//display the results
	public void display()
	{
		System.out.println();
		System.out.println("Invoice Number " + invoiceNumber);
		System.out.println("Sales amount " + salesAmount);
		System.out.printf("Sales tax %.2f\n" ,salesTax );
		
	}
	
}
