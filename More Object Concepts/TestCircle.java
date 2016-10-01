package chapterD;
//Author:	Peter Eugene Mbanda 
//Date:		2/10/2015
//Program:	Compute circles area and diameter

public class TestCircle 
{
	public static void main(String[] args)
	{
		/*
		*Create three objects from the class Circle 
		*/
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Circle circle3 = new Circle();

		circle1.setRadius( 20 );//pass 20 as an argument 
		circle2.setRadius( 55 );//pass 55 as an argument

		/*
		*call the methods 
		*to display the values using the 
		*instantiated objects .
		*/

		System.out.println();//empty white space 
		circle1.display();
		System.out.println();//empty white space
		circle2.display();
		System.out.println();//empty white space 
		circle3.display();

	}
}