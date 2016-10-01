

/*Author: 	Peter Eugene Mbanda
*Date:		5/5/2015
*Purpose:	Dice game array to determine 5 dice rolls 
*/
import java.util.Arrays;
import java.util.Random;//import random class 
public class FiveDice3
{
	//declare variables 
	static final int NUM_DICE_ROLLS = 5;//total number of dice rolls 
	static int []computer = new int[NUM_DICE_ROLLS];
	static int []human = new int[NUM_DICE_ROLLS];
	static Random generator = new Random();//Random number constructor
	int c,h;

	public static void main(String[] args) 
	{
		//Computer dice roll 
		int num = compDiceRoll();//method call to determine the dice rolls by computer 
		System.out.println();
		System.out.println();	
		
		int num1 = humanDiceRoll();//method call to determine the dice rolls by user
		System.out.println();//empty white space
		
		/*use of the if statement to determine if the computer or the user won the game 
		*/
		if ( num > num1 ){ System.out.println("Computer has won "); }
		else if( num1 > num ){ System.out.println("You have won "); }
		else if( num1 == num  )
		{ 
			System.out.println("-----There's a Tie in Kind----"); 
			
		}
	}

	static int compDiceRoll()
	{
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
		
		for ( int x = 0 ; x < NUM_DICE_ROLLS ; ++x  ) 
		{
			computer[x] = generator.nextInt(6) + 1 ;//computer generated dice number 
		}
		System.out.print("Computer rolled: ");
		for ( int x = 0 ; x < NUM_DICE_ROLLS ; ++x  ) 
		{	
			System.out.print( computer[x]  + " ");//display the dice rolled number for computer 		
		}
		for (int c : computer) 
		{
			//Accumulate the values in the variables depending on the count of rolls 
			if ( c == 1 ){ count1++; }
			if ( c == 2 ){ count2++; }
			if ( c == 3 ){ count3++; }
			if ( c == 4 ){ count4++; }
			if ( c == 5 ){ count5++; }
		}
		
		int [] kindArray = {count1, count2, count3, count4, count5 };
		Arrays.sort(kindArray);//sort the array in ascending order 
		System.out.println();
		System.out.println("The computer selected " + kindArray[4] + " of a kind "  );
		
		return kindArray[4];
	}
	
	static int humanDiceRoll()
	{
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
		for ( int x = 0 ; x < NUM_DICE_ROLLS ; ++x  ) 
		{
			human[x] = generator.nextInt(6) + 1 ;//human generated dice number 
		}

		System.out.print("Human rolled: ");

		for ( int x = 0 ; x < NUM_DICE_ROLLS ; ++x  ) 
		{
			System.out.print( human[x]  + " ");//display the dice rolled number for human 
		} 
		
		for (int h : human) 
		{
			//Accumulate the values in the variables depending on the count of rolls 
			if ( h == 1 ){ count1++; }
			if ( h == 2 ){ count2++; }
			if ( h == 3 ){ count3++; }
			if ( h == 4 ){ count4++; }
			if ( h == 5 ){ count5++; }
		}
		
		int [] userArray = {count1, count2, count3, count4, count5 };
		Arrays.sort(userArray);//sort the array in ascending order 
		System.out.println();
		System.out.println("The User selected " + userArray[4] + " of a kind " );
		
		return userArray[4];
	}
}