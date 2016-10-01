/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Book Publishing
*/
import java.util.*;
public class StoryDemo
{
	public static void main(String[] args) 
	{
		//class level variables 
		final int numObjects = 2;
		int x;
		Scanner input = new Scanner(System.in);

		//create a variable array to invoke methods 
		Novel []novel = new Novel[numObjects];
		Novella []novella = new Novella[3];
		ShortStory []shortStory = new ShortStory[numObjects];

		/*create object of class 
		*and invoke the class methods 
		*/
		novel[0] = new Novel();
		novel[0].setTitle("Harry Potter The Goblet Of Fire ");
		novel[0].setAuthor("J. K. Rowling");
		novel[0].setPages( 120 );

		novel[1] = new Novel();
		novel[1].setTitle("Seven Habits Of Effective People ");
		novel[1].setAuthor("Stephen Covey ");
		novel[1].setPages( 55 );

		//display the object and its contents 
		System.out.println("------Novel Publishing------");
		for ( x = 0 ; x < novel.length ; ++x )
		{
			System.out.println(novel[x]);
		}

		System.out.println();

		/*create object of class 
		*and invoke the class methods 
		*/
		novella[0] = new Novella();
		novella[0].setTitle("10000 Hours  ");
		novella[0].setAuthor("Malcom Gladwell");
		novella[0].setPages( 132 );

		novella[1] = new Novella();
		novella[1].setTitle("No Excuses ");
		novella[1].setAuthor("Brian Tracy ");
		novella[1].setPages( 28 );

		novella[2] = new Novella();
		novella[2].setTitle("Power Of Self Confidence ");
		novella[2].setAuthor("Brian Tracy ");
		novella[2].setPages( 60 );

		//display the object and its contents 
		System.out.println("------Novella Publishing------");
		for ( x = 0 ; x < novella.length ; ++x )
		{
			System.out.println(novella[x]);
		}

		System.out.println();

		/*create object of class 
		*and invoke the class methods 
		*/
		shortStory[0] = new ShortStory();
		shortStory[0].setTitle("A Window Opens ");
		shortStory[0].setAuthor("Elizabeth Egans ");
		shortStory[0].setPages( 58 );

		shortStory[1] = new ShortStory();
		shortStory[1].setTitle("Purity ");
		shortStory[1].setAuthor("Jonathan Franzen ");
		shortStory[1].setPages( 40 );

		//display the object and its contents 
		System.out.println("------Short Story Publishing------");
		for ( x = 0 ; x < shortStory.length ; ++x )
		{
			System.out.println(shortStory[x]);
		}
	}
}