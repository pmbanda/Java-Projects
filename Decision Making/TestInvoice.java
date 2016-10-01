package chapterE;

//Author:	Peter eugene Mbanda
//Date:		2/23/2015
//Purpose:	Determine the invoice and the invoice date with the balance on the invoice

public class TestInvoice
{
	public static void main(String[] args) 
	{	//create an argument to determine the action on the invoice with balance 
		//and the date 
		Invoice myInvoice1 = new Invoice(1254, 588.58 , 5, 25, 2012);
		Invoice myInvoice2 = new Invoice(54877, 25.58 , 11, 10, 2014);
		Invoice myInvoice3 = new Invoice(34866, 1088.58 , 5, 30, 2016);
		Invoice myInvoice4 = new Invoice(96622, 2088.58 , 5, 25, 2013);

		//call the display method to the client on the different objects
		myInvoice1.display();
		myInvoice2.display();
		myInvoice3.display();
		myInvoice4.display();
	}
}