

//Author:	Peter eugene Mbanda
//Date:		2/23/2015
//Purpose:	Determine the invoice and the invoice date with the balance on the invoice with wrong inputs 

public class TestInvoice2
{
	public static void main(String[] args) 
	{
		//create an argument to determine the action on the invoice with balance 
		//and the date 
		Invoice2 myInvoice1 = new Invoice2(1254, 588.58 , 0, 25, 2012);
		Invoice2 myInvoice2 = new Invoice2(54877, 25.58 , 12, 35, 2014);
		Invoice2 myInvoice3 = new Invoice2(34866, 1088.58 , 4, 31, 2016);
		Invoice2 myInvoice4 = new Invoice2(96622, 2088.58 , 2, 32, 2013);

		//call the display method to the client on the different objects
		myInvoice1.display();
		myInvoice2.display();
		myInvoice3.display();
		myInvoice4.display();
	}
	
	
}