package chapterC;

/*Author:	Peter Eugene Mbanda
*Program: 	Display user accounts information
*Date:		1/20/2015
*/

import java.util.Scanner; //import the scanner class



public class TestBankAccount
{
	public static void main(String[] args)
	{
		/*
		*Create 4 bank account objects 
		*/
	 	BankAccount myAccount1 ; 
	 	BankAccount myAccount2 ;
	 	BankAccount myAccount3 ;

	 	//call the methods and assign each data to the 4 variables;
	 	myAccount1 = getData();
		myAccount2 = getData();
		myAccount3 = getData();

		
		//Pass the arguments to the show value method
		showValues(myAccount1);
		showValues(myAccount2);
		showValues(myAccount3);

		BankAccount myAccount4 = new BankAccount();//default value creation of the object

		showValues(myAccount1);
		showValues(myAccount2);
		showValues(myAccount3);
		showValues(myAccount4);
		
		System.out.println();
		

	}
	//get data method used to return the data to the calling method
	//and its return type is bank account 
	static BankAccount getData()
	{
		/*
		*Declare the local variables
		*/
		String theName;
		int theAccNumber;
		double theBalance;

		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);//create a scanner object

		BankAccount myAccount = new BankAccount();//create the bank accunt object

		System.out.println();

		System.out.print("Enter the user name >> " );//prompt the users name 
		theName = input.nextLine();
		
		myAccount.setName(theName);//pass the argument to the object

		System.out.print("Enter the account number e.g in integer >> ");//prompt the users account number 
		theAccNumber = input.nextInt();
		
		myAccount.setAccNumber(theAccNumber);//pass the argument to the created object

		System.out.print("Enter the account balance >> ");//prompt the users account balance
		theBalance = input.nextDouble();
		
		myAccount.setAccBalance(theBalance);//pass the argument to the created object

		input.nextLine();
		System.out.println();//empty white space

		return myAccount;//return the values to the calling method
		
		
	}
	/*
	*Method used to display all the values 
	*/
	static void showValues(BankAccount display)
	{
		System.out.println("");
		BankAccount.explainAccountPolicy();
		System.out.println("User Name : " + display.getName());
		System.out.println("User Account Number e.g in integer : " + display.getAccNumber());
		System.out.println("Account Balance : " + display.getAccBalance());
		System.out.println("Deducted Monthly Fee : " + display.deductMonthlyFee());
		System.out.println("Balance After Deduction : " + display.getAccBalance());
	}
	
	
}