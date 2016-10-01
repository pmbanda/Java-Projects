package chapterF;
//Author:	Peter Eugene Mbanda
//Date:		3/6/2015
//Purpose:	determine the sales details
import java.util.Scanner;

public class CreatePurchase 
{

	public static void main(String[] args) 
	{
		double amount;
		double invoice;
		//create the objects of the class
		Purchase myPurchase = new Purchase();
		Scanner input = new Scanner(System.in);//initialize the Scanner
		System.out.println();
		do
		{
			//Ensure the user prints number as below else keep on prompting
			System.out.print("Enter the invoice number (between) 1000 - 8000? >> ");
			invoice = input.nextDouble();
			myPurchase.setInvoiceNumber(invoice);
		}
		while (invoice < 1000 || invoice > 8000);
		
		do
		{
			//Ensure the user enters the ccorrect amount else keep on prompting
			System.out.print("Enter the sales amount greater than 0? >> ");
			amount = input.nextDouble();
			myPurchase.setSalesAmount(amount);
		}
		while (amount <= 0 );
		
		myPurchase.display();//display the results
		
		
		input.close();
	}

}
