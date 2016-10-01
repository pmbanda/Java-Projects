
/*Author 	Peter Eugene Mbanda
 * Program 		Array of sorting Strings in Java 
 */
import java.util.*;
public class TicTacToe 
{
	//Create the game TicTac array , declare and initialize the class variables 
	public static String [] ticTac = { "0", "1", "2", "3", "4", "5", "6", "7", "8"  };
	public static int maxArray = 9;
	public static int playTimes = 5;
	public static Random randNum = new Random();
	
	public static void main(String[] args) 
	{
		HashSet <Integer> hs = new HashSet<Integer>();
		Scanner input = new Scanner (System.in );//invoke the scanner method 
		int userInput, count = 0, compGen;//declare variables to be used in program
	
		System.out.println("Welcome to Tic Tac Toe \n"
				+ "You will have X and the computer will have O \n");//user welcome prompt 
		System.out.println("** Array Current State **");
		displayArray();//print array before any values are entered 
			do
			{
				System.out.print("Enter the position you want to play >> ");
				userInput = input.nextInt();
				//Ensure that the input is not equivalent to X and O so as to access if statements 
				if ( !ticTac[userInput].equals("X") && !ticTac[userInput].equals("O"))
				{
					ticTac[userInput] = "X";
					System.out.println("Your move is recorded now the computer will play ");
					displayArray();
					winningStatus( ticTac );
					if( count == 4) { System.out.println("!!! Game Over !!!");displayArray();break; }
						//Regenerate computer generated number if user input and computer generated number are equal
						do
						{
							compGen = randNum.nextInt(8);
						}
						while ( hs.contains(compGen) || compGen == userInput);
						hs.add(userInput);
						hs.add(compGen);
						
						//Ensure that the computer generated number is not equivalent to X and O so as to access if statements 
						if ( !ticTac[compGen].equals("O") && !ticTac[compGen].equals("X") )
						{	
							ticTac[compGen] = "O";
							System.out.println("Computer has Played ");
							displayArray();	
							winningStatus( ticTac );
						}
							
				}
				else
				{
					//Display the error if the user prints the same number twice 
					System.out.print("ERROR ***Selection Already Made***\n");
					--count;//Subtract count so as not to affect the while loop iteration 
				}
					++count;
			}while( count < playTimes );
			input.close();
	}
	public static void displayArray()
	{ 
		//Method to display the current status of the array 
		int count = 0; 
		for ( String ls : ticTac)
		{
			++count;
			System.out.print( ls + "  " );
			if ( count % 3 == 0)//if count is divisible by three create a newline to form 2D array 
				System.out.println();
		}
		System.out.println();
	}
	public static void winningStatus( String [] tictac )
	{
		/*
		* Method will verify whether the user has won the game or computer
		* vertically diagonally or horizontally
		*/
		if( ticTac[0] == "X" && ticTac[4] == "X" && ticTac[8] == "X" )
		{	System.out.println("Player Won !!! Game Over !!! "); System.exit(0); }
		else if( ticTac[0] == "O" && ticTac[4] == "O" && ticTac[8] == "O" )
		{	System.out.println("Computer Won !!! Game Over !!! "); System.exit(0); }
		if( ticTac[2] == "X" && ticTac[4] == "X" && ticTac[6] == "X" )
		{	System.out.println("Player Won !!! Game Over !!! "); System.exit(0); }
		else if( ticTac[2] == "O" && ticTac[4] == "O" && ticTac[6] == "O" )
		{	System.out.println("Computer Won !!! Game Over !!! "); System.exit(0); }
		if( ticTac[1] == "X" && ticTac[4] == "X" && ticTac[7] == "X" )
		{	System.out.println("Player Won !!! Game Over !!! "); System.exit(0); }
		else if( ticTac[1] == "O" && ticTac[4] == "O" && ticTac[7] == "O" )				
		{	System.out.println("Computer Won !!! Game Over !!! "); System.exit(0); }
		
		if( ticTac[0] == "X" && ticTac[3] == "X" && ticTac[6] == "X" )
		{	System.out.println("Player Won !!! Game Over !!! "); System.exit(0); }
		else if( ticTac[0] == "O" && ticTac[3] == "O" && ticTac[6] == "O" )
		{	System.out.println("Computer Won !!! Game Over !!! "); System.exit(0); }
		if( ticTac[1] == "X" && ticTac[4] == "X" && ticTac[7] == "X" )
		{	System.out.println("Player Won !!! Game Over !!! "); System.exit(0); }
		else if( ticTac[1] == "O" && ticTac[4] == "O" && ticTac[7] == "O" )
		{	System.out.println("Computer Won !!! Game Over !!! "); System.exit(0); }
		if( ticTac[2] == "X" && ticTac[5] == "X" && ticTac[8] == "X" )
		{	System.out.println("Player Won !!! Game Over !!! "); System.exit(0); }
		else if( ticTac[2] == "O" && ticTac[5] == "O" && ticTac[8] == "O" )
		{	System.out.println("Computer Won !!! Game Over !!! "); System.exit(0); }
			
		if( ticTac[0] == "X" && ticTac[1] == "X" && ticTac[2] == "X" )
		{	System.out.println("Player Won !!! Game Over !!! "); System.exit(0); }
		else if( ticTac[0] == "O" && ticTac[1] == "O" && ticTac[2] == "O" )
		{	System.out.println("Computer Won !!! Game Over !!! "); System.exit(0); }
		if( ticTac[3] == "X" && ticTac[4] == "X" && ticTac[5] == "X" )
		{	System.out.println("Player Won !!! Game Over !!! "); System.exit(0); }
		else if( ticTac[3] == "O" && ticTac[4] == "O" && ticTac[5] == "O" )
		{	System.out.println("Computer Won !!! Game Over !!! "); System.exit(0); }
		if( ticTac[6] == "X" && ticTac[7] == "X" && ticTac[8] == "X" )
		{	System.out.println("Player Won !!! Game Over !!! "); System.exit(0); }
		else if( ticTac[6] == "O" && ticTac[7] == "O" && ticTac[8] == "O" )
		{	System.out.println("Computer Won !!! Game Over !!! "); System.exit(0); }
			
	}

}
