
//Author:	Peter Eugene Mbanda 
//Date:		2/10/2015
//Program:	Compute using the math class 

public class MathTest
{
	public static void main(String[] args)
	{
		
		System.out.println();//empty white space 
		System.out.println("Square root of 37 is    " + Math.sqrt( 37D ));//determine the square root 
		System.out.println("The sine of 300 is    " + Math.sin( 300D ));//determine the sine of a number  
		System.out.println("The cosine of 300 is    " + Math.cos( 300D ));//determine the cosine of the number  
		System.out.println("The floor of 22.8 is    " + Math.floor( 22.8D ));//determine the floor of the number 
		System.out.println("The ceiling of 22.8 is    " + Math.ceil( 22.8D ));//determine the ceiling of the number  
		System.out.println("The round of 22.8 is    " + Math.round( 22.8F ));//determine the round of the number  
		System.out.println("Larger number between \'D\' character and 71 is    " + Math.max( (int)'D' , 71 ));//determine the maximum between the two numbers 
		System.out.println("Smaller number between \'D\' character and 71 is    " +  Math.min( (int)'D' , 71 ));//determine the minimum between the two numbers  
		System.out.println("Generate a random number between 0 and 20    " + (int)(Math.random() * 20) );//generate a random number between 1 and 20 

	}
}