package chapterI;

/*Author 	Peter Eugene Mbanda
 * Program 		Array of sorting Strings in Java 
 */
import java.util.*;

public class SalesPersonDatabase 
{	
		//class field variables 
		static int salesInput , option, idNum , index, delNum ;
		static double salesAmt;
		static char selectionChar;
		static String selection;
		static boolean cont = false;
		static Scanner sc = new Scanner( System.in );//invoke Scanner object 
		static HashSet<Integer> hs = new HashSet<Integer>();
		
	public static void main(String[] args) 
	{
		//prompt for the total number required for users in database 
		System.out.print("Enter number of Sales Person's \nFor Database between ( 1 - 20 ) inclusive >> ");
		salesInput = sc.nextInt();
		ArrayList<SalesPerson > al = new ArrayList<SalesPerson>(salesInput);
		SalesPerson [] sp = new SalesPerson[salesInput];
		System.out.println();
		
		//prompt for the database access option 
		System.out.print("Do you want to access the Database \nEnter ( \"Y\" for yes and \"N\" for No ) >> ");
		selectionChar = sc.next().charAt(0);
		selection = Character.toString(selectionChar);
		System.out.println();
		
		while( selection.equalsIgnoreCase("Y") )//continue prompt if the user wants to access the database 
		{
			System.out.print("To ADD record to Database enter ( 0 ) , To DELETE enter ( 1 ) , "
					+ "\nAnd to CHANGE enter ( 2 ) >> ");
			option = sc.nextInt();
			System.out.println();
			
			switch (option)
			{
				case 0:
					addRecord( sp, al );
						break;
				case 1:
					deleteRecord( sp, al );
						break;
				case 2:
					changeRecord( sp, al );
					break;
			}
			System.out.println();
			/*
			 * displlay the array and its contents 
			 */
			for (SalesPerson salesPerson : al) 
			{
				System.out.println( salesPerson );
			}
			System.out.println();
			
			//prompt for the database access option 
			System.out.print("Do you want to access the Database \nEnter ( \"Y\" for yes and \"N\" for No ) >> ");
			selectionChar = sc.next().charAt(0);
			selection = Character.toString(selectionChar);
			System.out.println();
		}
		sc.close();
	}
	public static void addRecord( SalesPerson[] sp , ArrayList<SalesPerson > al )//add option 
	{
		if ( al.size() == salesInput)
		{
			//Terminate database application if full
			System.out.println("**Error - The Database is full**");
			System.exit(0);
		}
		else
		{	 	
			for (int i = al.size(); i < salesInput ; i++) 
			{
				do{	
					//reprompt user if they enter an id that already exists 
					System.out.print("Enter ID number >> ");
					idNum = sc.nextInt();
				}while( hs.contains(idNum));//check if id has already been entered
				hs.add(idNum);//add id number to hashset
				
				System.out.print("Enter sales value >> ");
				salesAmt = sc.nextDouble();
				sp[i] = new SalesPerson( idNum, salesAmt );
				al.add( i ,sp[i] );
			}
		}
		sc.nextLine();
		System.out.println();
	}
	public static void deleteRecord( SalesPerson[] sp, ArrayList<SalesPerson > al )//delete option 
	{
		if ( al.isEmpty())
		{
			//Terminate database application if empty 
			System.out.println("**Error - Cannot Delete Empty Database**");
			System.exit(0);
		}
		else
		{
			//user prompt for item to be deleted 
			System.out.print("Enter ID of number to DELETE  >> ");
			delNum = sc.nextInt();
			
			for (int i = 0; i < al.size() ; i++) 
			{
				/*loop to determine if the number 
				 * entered exists in the database else terminate the application 
				 */
				if ( sp[i].getIdNumber() == delNum )
				{
					index = al.indexOf( sp[i]);//obtain the index of the number entered 
					i = al.size();
					cont = true;
				}else
					cont = false;
			}
			if( cont == false )
			{
				System.out.println("ID entered does not exist ");
				System.exit(0);
			}
			al.remove( index );//remove the object from database 
		}
		sc.nextLine();
		System.out.println();
	}
	public static void changeRecord( SalesPerson[] sp , ArrayList<SalesPerson > al  )//change option
	{
		if ( al.isEmpty())
		{
			//Terminate database application if empty 
			System.out.println("**Error - Cannot Change Empty Database**");
			System.exit(0);
		}
		else
		{
			do{	
				//reprompt user if they enter an id that doesnt exists 
				System.out.print("Enter ID number >> ");
				idNum = sc.nextInt();
			}while( !hs.contains(idNum));
			
			for (int i = 0; i < al.size() ; i++) 
			{
				/*loop to determine if the number 
				 * entered exists in the database else terminate the application 
				 */
				if ( sp[i].getIdNumber() == idNum )
				{
					index = al.indexOf( sp[i]);//obtain the index of the number entered 
				}
			}
			al.remove( sp[index] );//remove the object from database
			System.out.print("Enter sales value >> ");
			salesAmt = sc.nextDouble();
			 
			sp[index] = new SalesPerson( idNum, salesAmt );
			al.add( sp[index] );
		}
		sc.nextLine();
		System.out.println();
	}
}
