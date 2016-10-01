 /*Author:	Peter Eugene Mbanda
*Date:		8/24/2015
*Purpose:	Die game
*/
 public class TestLoadedDice
 {
 	public static void main(String [] args)
 	{
 		/*create the count variable
 		*to keep track of number of rolls  
 		*/
 		int count = 0;
 		int dieCount = 0;

 		for ( int i = 0; i < 1000  ; ++i ) 
 		{
 			//instantiate 2 dice object each time to obtain new dice roll for one die object
 			Die d1 = new Die();
 			Die d2 = new Die();

 			//obtain the first and second dice values
 			d1.getDieValue();
 			d2.getDieValue();
 			//evaluate number of times first die is greater than the second
 			if( d1.getDieValue() > d2.getDieValue() )
 				++dieCount;//increment the count variable
 		}
 		System.out.println();
 		System.out.println("Number of times first Die has higher value than 2nd Die " + dieCount );

 		for ( int i = 0; i < 1000  ; ++i ) 
 		{
 			Die d = new Die();//instantiate object each time to obtain new dice roll
 			LoadedDie ld = new LoadedDie();//instantiate object each time to obtain new dice roll

 			//obtain the first and second dice values
 			d.getDieValue();
 			ld.getDieValue();
 			//evaluate number of times first die is greater than the second
 			if( d.getDieValue() > ld.getDieValue() )
 				++count;//increment the count variable
 		}
 		System.out.println();
 		System.out.println("Number of times Die has higher value than 2nd Loaded Die " + count );
 	}
 }