package chapterI;

/*Author:		Peter Eugene Mbanda
*Purpose:		Create class containning the ID and sales person
*Date:			5/15/2015
*/
import java.util.*;
public class SalesPersonSort
{
	//create the class fields 
		static int arrayNums = 3;
		static int idNum;
		static double sales;
		static SalesPerson [] sp = new SalesPerson[arrayNums];//create a salesperson array containing 7 objects 
		static int arrayPos;
		private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		//iterare through the array while assigning values to the objects created
		for ( int x = 0  ;  x < sp.length ; ++x ) 
		{
			sp[x] = arrayEntry( sp , x );
		}

		System.out.println("Before Sorting Array ");
		System.out.println("----------------------------------");
		//iterate through the loop to display the original values 
		for ( int x = 0  ;  x < sp.length ; ++x ) 
		{
			System.out.println("ID Number : " + sp[x].getIdNumber());//display id number 
			System.out.println("Sales Amount : " + sp[x].getSalesAmount());//display the sales amount
			System.out.println();
		}
		//prompt user to select the type of sort 
		System.out.println("(Press 1 to sort by ID or 2 to sort by Sales Amount )");
		int input = sc.nextInt();

		switch(input)
		{
			case 1:
				displayByID(sp);//invoke method to display the sorted array by id
				break;
			case 2:
				displayBySalesAmount(sp);//invoke method to display the sorted array by sales amount
				break;
			default:
			System.out.println("Sorry - You entered the wrong value (Enter 1 or 2)");
				break;
		}
	}

	//User input and array assigned values in form of a prompt
	static SalesPerson arrayEntry( SalesPerson [] obj, int arrayPos )
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);//initialize the scanner for object input
			
		System.out.print("Enter user " + (arrayPos + 1) + " ID number >> " );
		idNum = input.nextInt();
		obj[arrayPos] = new SalesPerson( idNum , 0.00);
		System.out.print("Enter user " +  (arrayPos + 1) + " Sales amount  >> " );
		sales = input.nextDouble();
		obj[arrayPos] = new SalesPerson( idNum , sales);
		System.out.println();

		return obj[arrayPos]; //return an object to the method 
	}

	static void displayByID(SalesPerson  [] si )
	{
		SalesPerson temp;//create a temporary object to use in swap values
		for ( int x = 0 ; x < si.length ; ++x) //outer matrix iteration 
		{
			for ( int y = 0  ;  y < si.length - 1 ; ++y ) //inner iteration to determine bubble sort 
			{
				if( si[y].getIdNumber() > si[y + 1].getIdNumber())
				{
					//Perform Swap
					temp = si[y];
					si[y] = si[y + 1];
					si[y + 1] = temp;
				}
			}
		}
		
		System.out.println("After Sorting Array by ID " );
		System.out.println("----------------------------------");
		//use loops to display the sorted list of arrays
		for ( int i = 0 ; i < si.length ; ++i ) 
		{
			System.out.println("ID Number " + si[i].getIdNumber() + " ");
			System.out.println("Sales Amount " + si[i].getSalesAmount() + " ");
			System.out.println();
		}
	}

	static void displayBySalesAmount(SalesPerson  [] si )
	{
		SalesPerson temp;//create a temporary object to use in swap values
		for ( int x = 0 ; x < si.length ; ++x) //outer matrix iteration 
		{
			for ( int y = 0  ;  y < si.length - 1 ; ++y ) //inner iteration to determine bubble sort 
			{
				if( si[y].getSalesAmount() > si[y + 1].getSalesAmount())
				{
					//Perform Swap
					temp = si[y];
					si[y] = si[y + 1];
					si[y + 1] = temp;
				}
			}
		}
		
		System.out.println("After Sorting Array by Sales Amount " );
		System.out.println("----------------------------------");
		//use loops to display the sorted list of arrays
		for ( int i = 0 ; i < si.length ; ++i ) 
		{
			System.out.println("ID Number " + si[i].getIdNumber() + " ");
			System.out.println("Sales Amount " + si[i].getSalesAmount() + " ");
			System.out.println();
		}
	}
	

}