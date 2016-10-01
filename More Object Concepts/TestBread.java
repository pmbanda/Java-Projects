
//Author:	Peter Eugene Mbanda 
//Date:		2/10/2015
//Program:	Compute Compute bread and the amount of calorie 

public class TestBread
{
	public static void main(String[] args) 
	{
		/*
		*Instantiate the three objects 
		*/
		System.out.println();//empty white space 
		
		System.out.println(Bread.MOTTO);
		//invoke the methods to display the data
		Bread bread1 = new Bread( "Wheat " , 345 );//pass the arguments to the method
		bread1.displayData();
		Bread bread2 = new Bread( "Italian " , 1000);//pass the arguments to the method
		bread2.displayData();
		Bread bread3 = new Bread( "rye " , 256);//pass the arguments to the method	
		bread3.displayData();

	}
}