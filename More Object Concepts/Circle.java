package chapterD;
//Author:	Peter Eugene Mbanda 
//Date:		2/10/2015
//Program:	Compute circles area and diameter  

public class Circle 
{
	/*
	*Declare the class variables 
	*/
	private double radius;
	private double diameter;
	private double area;
	
	//create the class constructor 
	public Circle()
	{
		radius = 1;
		diameter = ( radius * 2 );
		area = ( Math.PI * radius * radius );
	}
	//create the setter method
	public void setRadius( double radius )
	{
		this.radius = radius;
		diameter = ( radius * 2 );
		area = ( Math.PI * radius * radius );
	}
	//getter method to obtain the radius 
	public double getRadius()
	{
		return radius;
	}
	//display the results
	public void display()
	{
		System.out.println("Radius " + getRadius() + 
				"\nDiameter " + diameter +
				"\nArea of " + (int)(area * 100) / 100.0 );
	}

}