

//Author:		Peter Eugene Mbanda
//Date:			5/5/2015
//Purpose:		Determine an array of objects 

import java.util.GregorianCalendar;
import java.util.Scanner;
public class TestCertificateOfDepositArray 
{
	//create the class fields 
		static int certificate;
		static String name;
		static Double bal;

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final int OBJ_NUM = 5;//assign array number to a constant 
		CertificateOfDepositArray  []cert = new CertificateOfDepositArray[OBJ_NUM];//create an array object 
		GregorianCalendar date = new GregorianCalendar( 1900,1,4 );//create a date object 
		
		for ( int x = 0 ; x < OBJ_NUM ; ++x ) 
		{
			System.out.println();
			cert[x] = new CertificateOfDepositArray( 0000, null , 0.00 , date );
			System.out.print("Enter your last name: ");
			name = input.nextLine();
			cert[x].setLastName(name);

			System.out.print("Enter the certificate number: ");
			certificate = input.nextInt();
			cert[x].setCertificateNumber(certificate);

			System.out.print("Enter the account balance: ");
			bal = input.nextDouble();
			cert[x].setBalance(bal);
			input.nextLine();
			System.out.println();
		}

		for ( int x = 0 ; x < OBJ_NUM ; ++x ) 
		{
			cert[x].displayValues();//display the values in the array
			System.out.println();
			System.out.println();
		}
		input.close();
	}

}
