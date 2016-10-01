/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Shapes and Values app
*/
import java.util.*;
public class UseGeometric{
	public static void main(String[] args) {
		
		int numArray = 5;//array number 
		/*
		*create the teo array objects 
		*/
		GeometricFigure shapeSQ [] = new GeometricFigure[numArray];
		GeometricFigure shapeTR [] = new GeometricFigure[numArray];
		int x;
		//use for loop to assign value to array depending to the number declared for array 
		for ( x = 0 ; x < numArray ; ++x ) {
			Random r = new Random();//generate a random number 
			int sq = r.nextInt(20) + 1;//first random number generated 
			int tr = r.nextInt(20) + 1;//second random number generated 
			//Square object 
			shapeSQ[x] = new Square( sq, tr, "Square ");
			//Generate the ransom numbers again
			sq = r.nextInt(20) + 1;
			tr = r.nextInt(20) + 1;
			System.out.println();
			//Triangle object 
			shapeTR[x] = new Triangle( sq, tr, "Triangle ");
		}

		//display the objects created 
		for ( x = 0 ; x < numArray ; ++x ) {

			System.out.println(shapeSQ[x]);
			System.out.println(shapeTR[x]);
		}
	}
}