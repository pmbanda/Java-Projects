

//Author: 	Peter Eugene Mbanda
//Date:		2/20/2015
//Purpose: 	Details on digital cameras

public class DigitalCamera
{
	//Declare the field class variables 
	private String brand;
	private double pixelNum;
	private double price;

	//Create a default constructor 
	public DigitalCamera(String brandName, double pixel)
	{
		brand = brandName;
		//perform the calculations based on the number of pixels 
		if( pixel > 10 )
			pixelNum = 10;
		else
			pixelNum = pixel;
		
		if ( pixel <= 6 )
			price = 99.00;	
		else 
			price = 129.00;
	}
	//display the camera details 
	public void displayCameraDetails()
	{
		System.out.println();
		System.out.println("Customer purchase " + brand );
		System.out.println("With " + pixelNum + " megapixels ");
		System.out.println("Priced at $" + price );
		System.out.println();
	}

}