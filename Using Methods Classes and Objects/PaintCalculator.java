

//Author:	Peter Mbanda
//Purpose:	Calculate the amount of paint used with the price of the gallon of paint
//Date:		1/16/2015

//import the Scanner package
import java.util.Scanner;

public class PaintCalculator
{
	//declare global variable area
	//declare constant price per gallon
	private static double area;
	private static final double PRICE_PER_GALLON = 32.00 ;

	public static void main(String[] args) 
	{
		//declare the variables
		double length , width , height , price ; 

		Scanner input = new Scanner (System.in);//create the scanner object
		
		//user prompt for length
		System.out.print("Enter the length of the room >> ");
		length = input.nextDouble();
		
		//user prompt for width
		System.out.print("Enter the width of the room >> ");
		width = input.nextDouble();

		//user prompt for height
		System.out.print("Enter the height of the room >> ");
		height = input.nextDouble();
		
		System.out.println();//empty line.

		area = wallArea(length,width,height);
		
		System.out.println("Number of Gallons Needed " + paintGallons());
		price = paintGallons() * PRICE_PER_GALLON ;
		System.out.println();//empty line.
		System.out.println("The cost to paint a " + length + " by " + width + 
									" foot room with\n" + height + " foot ceilings is $" + price );
		
		input.close();
	}

	static double wallArea(double length , double width , double height )
	{
		//declare area and sides
		double area, sideA, sideB;

		sideA = ( length * height ) * 2 ;
		sideB = ( width * height ) * 2  ;
		
		//calculate the area of room
		area =  sideA + sideB ;

		return area ;
	}

	static double paintGallons()
	{
		//declare variable gallons
		double gallon;

		//amount of paint the gallon covers the wall in square feet 
		final int SQ_FEET_PER_GALLON = 350 ;

		//determine the number of gallons 
		gallon = (double)(area / SQ_FEET_PER_GALLON );

		//return the value gallon to the calling method
		return (int)(gallon * 100 ) / 100.0 ;
	}
	
}