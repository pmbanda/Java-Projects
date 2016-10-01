
//Author:	Peter eugene Mbanda
//Date:		2/23/2015
//Purpose:	Determine the invoice and the invoice date with the balance on the invoice with wrong inputs 
public class Invoice2
{
		//declare the class variables 
	private int invoiceNumber;
	private double balanceDue;
	private int month;
	private int day;
	private int year;

	//declare the class constructor
	public Invoice2(int invoice, double balance, int month, int day, int year)
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
		//assign day argument to the field
		this.day = day;
			if( day < 1 ) 
				this.day = 0;//if the day is less than 1 assign 0 to day
			if( (month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)  && day > 31 ) 
				this.day = 31;//if the day is greater than 31 and falls in the following months above assign 31
			else if( (month == 4) || (month == 6) || (month == 9) || (month == 11)  && day > 30 ) 
				this.day = 30;//if the day is greater than 31 and falls in the following months above assign 30
			else if( (month == 2 ) && day > 28 )
				this.day = 28;//if the day is greater than 28 and falls in the following months above assign 28	
			else if( month == 0 )
				this.day = 0;//if month is zero assign zero to day 

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