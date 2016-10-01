package chapterE;

//Author:	Peter eugene Mbanda
//Date:		2/23/2015
//Purpose:	Determine the invoice and the invoice date with the balance on the invoice

public class Invoice
{
	//declare the class variables 
	private int invoiceNumber;
	private double balanceDue;
	private int month;
	private int day;
	private int year;
	//declare the class constructor
	public Invoice(int invoice, double balance, int month, int day, int year)
	{
		//if the invoice number is less than 1000 set the value to 0 
		invoiceNumber = invoice;
			if( invoice < 1000 )
				invoiceNumber = 0;

		balanceDue = balance;
		//if the month is less than 1 or is gereater than 12 set the value to 0
		this.month = month;
			if( month < 1 || month > 12 )
				this.month = 0;
		//if the day is less than 1 or is gereater than 31 set the value to 0
		this.day = day;
			if( day < 1 || day > 31 )
				this.day = 0;//if the monrth is less than 1 or is gereater than 12 set the value to 0
		//if the year is less than 2011 or is gereater than 2017 set the value to 0
		this.year = year;
			if( year < 2011 || year > 2017 )
				this.year = 0;
	}
	//use the display method to display the results
	public void display()
	{
		System.out.println("Invoice number " + invoiceNumber);
		System.out.println("Balance due " + balanceDue);
		System.out.println("Month " + month);
		System.out.println("Day " + day);
		System.out.println("Year " + year);
		System.out.println();

	}
}