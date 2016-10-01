

//Author:		Peter Eugene Mbanda
//Date:			5/5/2015
//Purpose:		Calendar app 
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CertificateOfDepositArray 
{
	//create field variables
	private int certificateNumber;
	private String lastName;
	private double balance;
	private GregorianCalendar issueDate;
	private GregorianCalendar maturityDate;
	
	//create the class constructor 
	public CertificateOfDepositArray(int certNumber, String lastName, double balance, GregorianCalendar issueDate)
	{
		this.certificateNumber = certNumber;
		this.lastName = lastName;
		this.balance = balance;
		this.issueDate = issueDate;
		this.maturityDate = issueDate;
		maturityDate.add(Calendar.YEAR, 1);
	}
	
	//accessor amd the mutator methods 
	public void setCertificateNumber( int certNumber)
	{
		certificateNumber = certNumber;
	}
	
	public int getCertificateNumber()
	{
		return certificateNumber;
	}
	
	public void setLastName( String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setBalance( double balance)
	{
		this.balance = balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	//create the mutator methods for issue date 
	public void setIssueDate(GregorianCalendar issueDate)
	{
		this.issueDate = issueDate;
	}
	
	public GregorianCalendar getIssueDate()
	{
		return issueDate;
	}
	
	//create the mutator method for maturity date with the parameters 
	public void setMaturityDate(GregorianCalendar maturityDate)
	{
		this.maturityDate = maturityDate;
	}
	
	//access the maturity date 
	public GregorianCalendar getMaturityDate()
	{
		return maturityDate;
	}
	
	//display the calendar values 
	public void displayValues()
	{
		System.out.println("Certificate Number >> " + getCertificateNumber() );
		System.out.println("Last Name  >> " + getLastName() );
		System.out.println("Balance >> " + getBalance() );
		System.out.println("Issue Date >> " + (getIssueDate().get(Calendar.MONTH) + 1) + "\u2044" + getIssueDate().get(Calendar.DAY_OF_MONTH) +"\u2044" + getIssueDate().get(Calendar.YEAR) );
		System.out.println("Maturity Date >> " + (getMaturityDate().get(Calendar.MONTH) + 1) + "\u2044" + getMaturityDate().get(Calendar.DAY_OF_MONTH) +"\u2044" + getMaturityDate().get(Calendar.YEAR) );
		
	}
}
