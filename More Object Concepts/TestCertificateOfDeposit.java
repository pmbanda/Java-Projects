package chapterD;
//Author: 	Peter Mbanda
//Date:		3/27/2015
//Purpose:	Determine the calendar object

import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCertificateOfDeposit 
{

	public static void main(String[] args) 
	{
		int certificate;
		String name;
		Double bal;
		GregorianCalendar dateOfIssue1 = new GregorianCalendar( 1900,1,4 );//1st gregorian calendar instantiated  
		GregorianCalendar dateOfIssue2 = new GregorianCalendar( 2000,2,2 );//2nd gregorian calendar instantiated  
		GregorianCalendar dateOfIssue3 = new GregorianCalendar( 1997,2,2 );//3rd gregorian calendar instantiated 
		
		
		CertificateOfDeposit cert1 = new CertificateOfDeposit( 0000, null, 0.00, dateOfIssue1 );//1st constructor arguments passed 
		CertificateOfDeposit cert2 = new CertificateOfDeposit( 0000, null, 0.00, dateOfIssue2 );//2nd constructor arguments passed
		CertificateOfDeposit cert3 = new CertificateOfDeposit( 0000, null, 0.00, dateOfIssue3 );//3rd constructor arguments passed
		
		Scanner input = new Scanner(System.in);//initialize the scanner class 
		
		System.out.print("Enter your last name: ");//user prompt
		name = input.nextLine();
		cert1.setLastName(name);//assign the name to the parameter
		
		System.out.print("Enter the certificate number: ");
		certificate = input.nextInt();
		cert1.setCertificateNumber(certificate);//assign the certificate number to the parameter
		
		System.out.print("Enter the account balance: ");//user prompt
		bal = input.nextDouble();
		cert1.setBalance(bal);//assign the balance to the parameter
		
		
		System.out.println();
		input.nextLine();
		
		System.out.print("Enter your last name: ");//user prompt
		name = input.nextLine();
		cert2.setLastName(name);//assign the last name to the parameter
		
		System.out.print("Enter the certificate number: ");//user prompt
		certificate = input.nextInt();
		cert2.setCertificateNumber(certificate);//assign the certificate number to the parameter
		
		System.out.print("Enter the account balance: ");//user prompt
		bal = input.nextDouble();
		cert2.setBalance(bal);//assign the balance to the parameter
		
		System.out.println();
		
		cert1.displayValues();//display values
		System.out.println();
		cert2.displayValues();//display values
		
		System.out.println();
		cert3.displayValues();//display constructor values 
		
		input.close();
		
	}

}
