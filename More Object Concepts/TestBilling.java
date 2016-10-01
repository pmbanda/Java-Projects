package chapterD;

//Author:	Peter Eugene Mbanda 
//Date:		2/10/2015
//Program:	Compute tax based on different arguments 

public class TestBilling
{
	public static void main(String[] args) 
	{
		/*
		*Instantiate the methods 
		*/
		Billing myBilling1 = new Billing();
		Billing myBilling2 = new Billing();
		Billing myBilling3 = new Billing();
		/*
		*Perform the method calls for all the three objects
		*instantiated
		*/
		System.out.println();
		System.out.println("One parameter method $" + myBilling1.computeBill( 60.00 ));
		System.out.println("Two parameter method $" + myBilling2.computeBill( 45.00 , 10 ));
		System.out.println("Three parameter method $" + myBilling3.computeBill( 20.50 , 100 , 50.00 ));

	}
}