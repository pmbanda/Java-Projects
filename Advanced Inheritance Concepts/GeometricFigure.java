/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Shapes and Values app
*/
public abstract class GeometricFigure{

	//declare the class variables 
	private int height;
	private int width;
	private String figureType;
	private double area;

	//class constructor and parameters with the area method 
	public GeometricFigure( int height, int width, String figure ){
		this.height = height;
		this.width = width;
		figureType = figure;
		area();
	}
	//create the height and width and figure  accessor methods 
	public int getHeight(){
		return height;
	}

	public int getWidth(){
		return width;
	}

	public String getFigure(){
		return figureType;
	}

	//abstract class area 
	public abstract double area();
}