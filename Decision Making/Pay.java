package chapterE;

//Author: 	Peter Eugene Mbanda
//Date:		2/19/2015
//Purpose: 	Determine the employees pay rates and benefits 

//import the appropriate classes to be used in the program
import java.util.*;
import javax.swing.*;

public class Pay
{
	//declare all the class level variables 
	static int skillLevel;
	static double hourlyPayRate;
	static boolean agreeSkill;
	static double hoursWorked;
	static double medicalInsurance = 32.50;
	static double dentalInsurance = 20.00;
	static double longTermDisability = 10.00;
	static double insurance;
	static double regularPay = 0 ;
	static double grossPay = 0 ;
	static double regularAndOvertimePay = 0 ;
	static double deductions = 0 ;
	static double netPay = 0;
	static double overtimeRate = 0;

	public static void main(String[] args)
	{
		Scanner input = new Scanner ( System.in );//instantiate the scanner object

		System.out.println("Enter the skill level 1 , 2 or 3 ");//pronpt the user
		skillLevel = input.nextInt();
		System.out.println();
		agreeSkill = skillLevelCheck(skillLevel);//deternine the selection
		employeeType();

		input.close();
		//skillLevel = skillLevelCheck();
		
	}

	public static boolean skillLevelCheck(int skill)
	{
		/*
		*this method deternines if the appropriate skill level is selected
		*/
		boolean skillCheck;

		if( skill == 1)
			skillCheck = true;
		else if( skill == 2)
			skillCheck = true;
		else if( skill == 3)
			skillCheck = true;
		else 
			skillCheck = false;

		return skillCheck;//return the boolean value to the calling method 

	}

	public static void employeeType()
	{
		Scanner input = new Scanner ( System.in );//create the Scanner object 

		if ( agreeSkill == true )//check if condition matches true for thr selection
		{
			switch ( skillLevel )
			{
				case 1:
					System.out.println();
					hourlyPayRate = 17.00;//declare global variable 
					
					System.out.println("Enter the number of hours worked ");//user prompt 
					hoursWorked = input.nextDouble();
					
					//determine if the hours worked is 40 or greater than 40 to determine if overtime
					if( hoursWorked > 0 && hoursWorked <= 40 )
					{
						regularPay = hoursWorked * hourlyPayRate ;
						grossPay += regularPay;
						overtimeRate = 0;
						regularAndOvertimePay = grossPay;
					}
					else if ( hoursWorked > 40 )
					{
						regularPay = 40 * hourlyPayRate;
						overtimeRate = (hoursWorked - 40) * ( hourlyPayRate * (3/2.0));
						regularAndOvertimePay = regularPay + overtimeRate;
						grossPay = regularAndOvertimePay;
					}
					/*
					*Display the users salaried information on the console 
					*based on the type of user input 
					*and perform the appropriate display 
					*/
					System.out.println();
					System.out.println("Hours Worked " + hoursWorked );
					System.out.println("Hourly pay rate " + hourlyPayRate );
					System.out.println("Regular pay " + regularPay );
					System.out.println("Overtime pay " + overtimeRate );
					System.out.println("Regular and overtime pay " + regularAndOvertimePay);
					System.out.println("Gross pay " + grossPay);
					
					

					break;

				case 2:
					
					hourlyPayRate = 20.00;//local variable 

					System.out.println("Enter the number of hours worked ");//user prompt 
					hoursWorked = input.nextDouble();

					//determine if the hours worked is 40 or greater than 40 to determine if overtime
					if( hoursWorked > 0 && hoursWorked <= 40 )
					{
						regularPay = hoursWorked * hourlyPayRate ;
						grossPay += regularPay;
						overtimeRate = 0;
						regularAndOvertimePay = grossPay;
					}
					else if ( hoursWorked > 40 )
					{
						regularPay = 40 * hourlyPayRate;
						overtimeRate = (hoursWorked - 40) * ( hourlyPayRate * (3/2.0));
						regularAndOvertimePay = regularPay + overtimeRate;
						grossPay = regularAndOvertimePay;
					}
					System.out.println();
					System.out.println("Please select 1 for medical insurance, 2 for dental insurance or \n3 for long term disability insurance ");//user prompt 
					insurance = input.nextDouble();

					if ( insurance == 1 )
					{
						deductions += medicalInsurance;
					}
					else if ( insurance == 2 )
					{
						deductions += dentalInsurance;
					}
					else if ( insurance == 3 )
					{
						deductions += longTermDisability;
					}
					else
					{
						System.out.println();
						System.out.println("Please make the correct selection for dedections ");//error message if the wrong deductions is selected 
						System.out.println();
					}


					if ( deductions > grossPay )
					{
						JOptionPane.showMessageDialog(null,"Deductions cannot exceed gross pay ","DEDUCTIONS ERROR",JOptionPane.WARNING_MESSAGE);//error message if deductions exceed the gross pay
					}
					else
					{
						netPay += ( grossPay - deductions );
					}
					/*
					*Display the users salaried information on the console 
					*based on the type of user input 
					*and perform the appropriate display 
					*/
					System.out.println();
					System.out.println("Hours Worked " + hoursWorked );
					System.out.println("Hourly pay rate " + hourlyPayRate );
					System.out.println("Regular pay " + regularPay );
					System.out.println("Overtime pay " + overtimeRate );
					System.out.println("Regular and overtime pay " + regularAndOvertimePay);
					System.out.println("Total itemized deductions " + deductions );
					System.out.println("Gross pay " + grossPay);
					System.out.println("Net pay after deductions  " + netPay );

					break;

				case 3:
					System.out.println();
					hourlyPayRate = 22.00;//global variable 
					System.out.println("Enter the number of hours worked ");//user prompt 
					hoursWorked = input.nextDouble();

					//determine if the hours worked is 40 or greater than 40 to determine if overtime
					if( hoursWorked > 0 && hoursWorked <= 40 )
					{
						regularPay = hoursWorked * hourlyPayRate ;
						grossPay += regularPay;
						overtimeRate = 0;
						regularAndOvertimePay = grossPay;
					}
					else if ( hoursWorked > 40 )
					{
						regularPay = 40 * hourlyPayRate;
						overtimeRate = (hoursWorked - 40) * ( hourlyPayRate * (3/2.0));
						regularAndOvertimePay = regularPay + overtimeRate;
						grossPay = regularAndOvertimePay;
					}
					System.out.println();
					System.out.println("Please select 1 for medical insurance, 2 for dental insurance or \n3 for long term disability insurance ");//user prompt 
					insurance = input.nextDouble();
					
					//select the type of insurance
					if ( insurance == 1 )
					{
						deductions += medicalInsurance;
					}
					else if ( insurance == 2 )
					{
						deductions += dentalInsurance;
					}
					else if ( insurance == 3 )
					{
						deductions += longTermDisability;
					}
					else
					{
						System.out.println();
						System.out.println("Please make the correct selection");//error message if the wrong deductions is selected 
						System.out.println();
					}

					if ( deductions > grossPay )
					{
						JOptionPane.showMessageDialog(null,"Deductions cannot exceed gross pay ","DEDUCTIONS ERROR",JOptionPane.WARNING_MESSAGE);//error message if deductions exceed the gross pay
					}
					else
					{
						netPay += ( grossPay - deductions );
					}
					/*
					*Display the users salaried information on the console 
					*based on the type of user input 
					*and perform the appropriate display 
					*/
					System.out.println();
					System.out.println("Hours Worked " + hoursWorked );
					System.out.println("Hourly pay rate " + hourlyPayRate );
					System.out.println("Regular pay " + regularPay );
					System.out.println("Overtime pay " + overtimeRate );
					System.out.println("Regular and overtime pay " + regularAndOvertimePay);
					System.out.println("Total itemized deductions " + deductions );
					System.out.println("Gross pay " + grossPay);
					System.out.println("Net pay after deductions  " + netPay );


					break;

				default:
				
			}
			input.close();
		}
		else//display the error message if the wrond skill level is selected
		{
			JOptionPane.showMessageDialog(null,"Please enter the correct skill level\n 1 2 or 3 only ","SKILL ERROR",JOptionPane.WARNING_MESSAGE);
		}

	}

	
}