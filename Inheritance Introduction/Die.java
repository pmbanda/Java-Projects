/*Author:	Peter Eugene Mbanda
*Date:		8/24/2015
*Purpose:	Die game
*/
import java.util.*;
public class Die
{
	//declare field variable
	protected int dieValue;
	Random r = new Random();//instantiate the random generator

	//create a class constructor 
	public Die()
	{
		dieValue = r.nextInt(6) + 1; 
	}

	//getter method for die value
	public int getDieValue()
	{
		return dieValue;
	}
}