package chapterD;
//Author: 	Peter Mbanda
//Date:		3/27/2015
//Purpose:	Determine the calendar object

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CertificateOfDeposit 
{
	//Declare the instance variables 
	private int certificateNumber;
	private String lastName;
	private double balance;
	private GregorianCalendar issueDate;
	private GregorianCalendar maturityDate;
	Calendar date = null;
	
	//Create parameters on the constructor
	public CertificateOfDeposit(int certNumber, String lastName, double balance, GregorianCalendar issueDate)
	{
		this.certificateNumber = certNumber;
		this.lastName = lastName;
		this.balance = balance;
		this.issueDate = issueDate;
		this.maturityDate = issueDate;
		maturityDate.add(Calendar.YEAR, 1);
	}
	
	//set method for the certificate number
	public void setCertificateNumber( int certNumber)
	{
		certificateNumber = certNumber;
	}
	//get method 
	public int getCertificateNumber()
	{
		return certificateNumber;
	}

	//set method for the last name 
	public void setLastName( String lastName)
	{
		this.lastName = lastName;
	}
	//get method 
	public String getLastName()
	{
		return lastName;
	}

	//set method for the balance
	public void setBalance( double balance)
	{
		this.balance = balance;
	}
	//get method 
	public double getBalance()
	{
		return balance;
	}
	
	//set method for the issue date
	public void setIssueDate(GregorianCalendar issueDate)
	{
		this.issueDate = issueDate;
	}
	//get method 
	public GregorianCalendar getIssueDate()
	{
		return issueDate;
	}
	
	//set method for the maturity date
	public void setMaturityDate(GregorianCalendar maturityDate)
	{
		this.maturityDate = maturityDate;
	}
	//get method 
	public void getMaturityDate()
	{
		date.add(Calendar.DATE, 1);
	}
	
	//create method to display the values 
	public void displayValues()
	{
		//Ad 1 to the months sonce 0 12 january hence 1 becomes january
		System.out.println("Certificate Number >> " + getCertificateNumber());
		System.out.println("Last Name  >> " + getLastName());
		System.out.println("Balance >> " + getBalance() );
		System.out.println("Issue Date >> " + getIssueDate().toString());
		//System.out.println("Maturity Date >> " + getMaturityDate().toString());
		
	}
}
