

//Author: 	Peter Eugene Mbanda
//Date:		2/20/2015
//Purpose: 	Details on digital cameras

public class TestDigitalCamera
{
	public static void main(String[] args)
	{
		//create four objects 
		DigitalCamera cannon = new DigitalCamera( "Cannon " , 15 );
		DigitalCamera kodak = new DigitalCamera( "Kodak " , 8 );
		DigitalCamera nikon = new DigitalCamera( "Nikon " , 4 );
		DigitalCamera olympus = new DigitalCamera( "Olympus " , 20 );

		//display the results 
		cannon.displayCameraDetails();
		kodak.displayCameraDetails();
		nikon.displayCameraDetails();
		olympus.displayCameraDetails();
	}
}