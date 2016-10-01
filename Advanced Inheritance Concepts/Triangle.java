/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Shapes and Values app
*/
public class Triangle extends GeometricFigure{
	//create the constructor and provide the super parameters 
	public Triangle( int height, int width, String figure ){

		super( height, width, figure );
	}

	//implement the abstaract area 
	public double area(){
 
		double area; //declare variable area

		area = getHeight() * getWidth();//calculate the area 
		return area;//return area to calling method 
	}

	public String toString(){
		return "Height >> " + getHeight() +"\nWidth >> " + getWidth() + "\nFigure >> " + getFigure() + "\nArea >> " + area() + "\n"; 
	}

}