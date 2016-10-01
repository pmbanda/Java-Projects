/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Book Value application
*/
public class UseBook
{
	public static void main(String[] args) 
	{
		//create a book object for the fiction object 
		Fiction fic = new Fiction("Harry Potter And The Goblet Of Fire ");
		System.out.println(fic);

		System.out.println();

		//create a book object for the fiction object 
		NonFiction nonFic = new NonFiction("Seven Habits Of Highly Effective People ");
		System.out.println(nonFic);
	}
}