package chapterC;

/*Author:	Peter Eugene Mbanda
*Program: 	Display user accounts information
*Date:		1/20/2015
*/

public class BankAccount
{	
	/*
	*Declare the instance variables
	*/
	private String name;
	private int accNumber;
	private double accBalance;
	

	/*
	*Method used to initialize the instance variables with 
	*the class name used. Also known as the default constructor 
	*/
	public BankAccount()
	{
		name = "Lupita Nyong'o " ;
		accNumber = 12345678 ;
		accBalance = 1000.00 ;
	}

	/*
	*Create the setter and getter methods for each field declared above 
	*/
	public void setName(String theName)
	{
		name = theName ;//assign the parameter to the variable
	}

	public String getName()
	{
		return name ;//return the name to the calling method
	}

	public void setAccNumber(int theAccNumber)
	{
		accNumber = theAccNumber ;//assign the parameter to the variable
	}

	public int getAccNumber()
	{
		return accNumber ;//return the account number to the calling method
	}

	public void setAccBalance(double theBalance)
	{
		accBalance = theBalance ;//assign the parameter to the variable
	}

	public double getAccBalance() 
	{
		return accBalance ;//return the balance to the calling method
	}
	/*
	*Method used to deduct the monthly fee of the account
	*/
	public double deductMonthlyFee()
	{
		return accBalance = accBalance -  4 ;
	}

	//displays the policy of the account no method required for this 
	public static void explainAccountPolicy()
	{
		System.out.println("$4 service fee will be deducted each month. ");
	}
	
}