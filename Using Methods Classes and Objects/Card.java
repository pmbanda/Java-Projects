

/*Author: 	Peter Eugene Mbanda
*Program:	Random card picks
*Date:		2/25/2015
*/

public class Card
{
	//declare class variables as constants
	private static String spades = "spades"; 
	private static String hearts = "hearts";
	private static String diamonds = "diamonds"; 
	private static String clubs = "clubs";
	private static int value ;

	//set the spade selection
	public void setSpadesValue(int selection)
	{
		//restrict the value between 1 and 13
		if( selection < 1 || selection > 13 )
		{
			value = 1;
			System.out.println("You chose " + value + " of " + spades);
		}
		else
		{
			//assign the value if the selection falls within range
			value = selection;
			System.out.println("You chose " + value + " of " + spades);
		}
	}
	//return the value of the card
	public int getSpadesValue()
	{
		return value ;
	}

	public void setHeartsValue(int selection)
	{
		//restrict the value between 1 and 13
		if( selection < 1 || selection > 13 )
		{
			value = 1;
			System.out.println("You chose " + value + " of " + hearts );
		}
		else
		{
			//assign the value if the selection falls within range
			value = selection ;
			System.out.println("You chose " + value + " of " + hearts );
		}
	}
	//return the value of the card
	public int getHeartsValue()
	{
		return value ;
	}

	public void setDiamondsValue(int selection)
	{
		//restrict the value between 1 and 13
		if( selection < 1 || selection > 13 )
		{
			value = 1;
			System.out.println("You chose " + value + " of " + diamonds);
		}
		else
		{
			//assign the value if the selection falls within range
			value = selection;
			System.out.println("You chose " + value + " of " + diamonds);
		}
	}
	//return the value of the card
	public int getDiamondsValue()
	{
		return value ;
	}

	public void setClubsValue(int selection)
	{
		//restrict the value between 1 and 13
		if( selection < 1 || selection > 13 )
		{
			value = 1;
			System.out.println("You chose " + value + " of " + clubs );
		}
		else
		{
			//assign the value if the selection falls within range
			value = selection ;
			System.out.println("You chose " + value + " of " + clubs );
		}
	}
	//return the value of the card
	public int getClubsValue()
	{
		return value ;
	}
	
	
}