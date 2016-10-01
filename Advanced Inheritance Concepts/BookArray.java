/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Book array 
*/
import java.util.*;
public class BookArray{

	public static void main(String[] args) {

		int number = 2;//number of the array elements 
		int x;
		String title;
		Scanner sc = new Scanner(System.in);//invoke the scanner method
		Book[] fic  = new Book[number];//create an array of fiction books 
		Book[] nonFic  = new Book[number];//non fiction array 

		//for loop for definite number to be looped 
		for ( x = 0 ; x < fic.length ; ++x ) {
			System.out.println();
			System.out.print("Enter Fiction Title >> ");
			title = sc.nextLine();
			fic[x] = new Fiction(title);

			System.out.print("Enter Non-Fiction Title >> ");
			title = sc.nextLine();
			nonFic[x] = new NonFiction(title);
			System.out.println();
		}

		System.out.println();
		System.out.println();

		//for loop for definite number to be looped and displayed
		for ( x = 0 ; x < fic.length ; ++x ) {

			System.out.println(fic[x]);
			System.out.println(nonFic[x]);
			System.out.println();
		}
	}
}