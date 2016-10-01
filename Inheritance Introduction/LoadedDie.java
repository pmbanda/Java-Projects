/*Author:	Peter Eugene Mbanda
*Date:		8/24/2015
*Purpose:	Die game
*/
import java.util.*;
public class LoadedDie extends Die
{
	Random r = new Random();//instantiate the random generator
	public LoadedDie()
	{
		super();
		dieValue = r.nextInt(5) + 2;//generate random integer between 2 and 6 inclusive
	}
	
	//obtain the loaded dice value 
	public int getDieValue()
	{
		return dieValue;
	}

}