package chapterF;
public class Factorials
{
		static final int NUMBER = 11;//numbers to be determined 
		//declare the variable to store the factorial 
		static int []f = new int[NUMBER];

	public static void main(String[] args) 
	{	
		
		

		for ( int i = 1 ; i < NUMBER ; ++i ) 
		{
			//call the factorial function/method 
			f[i] = recursion( i );
		}

		display();
		
	}
	//use of recursion method to determine the factorial of a number
	public static int recursion( int n )
	{
		int result;//define the global variable

		if ( n == 1 )
				return 1;//if number is one return the factorial as 1
		else
		{
			//else invoke the method with number less than one
			//multiplied by the product of the previous number 
			result =  recursion( n - 1  ) * n ;
			return result ;//return the number 
		}
	}
	public static void display()
	{
		for ( int i = 1 ; i < NUMBER ; ++i ) 
			System.out.println("Factorial of " + i + " is: " + f[i] );
	}
}