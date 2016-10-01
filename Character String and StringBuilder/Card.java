

/*Author: 	Peter Eugene Mbanda
*Program:	Random card picks
*Date:		4/8/2015
*/
public class Card
{
	private static String spade = "spades";
	private static String heart =  "Hearts";
	private static String diamond = "Diamonds";
	private static String club = "Clubs"; 
	private static int value;
	private static String rank;  
	

	public void setSpadesValue(int selection)
	{
		if( selection < 1 || selection > 13 )
		{
			value = 1;
			System.out.println("You chose " + value + " of " + spade);
		}
		else
		{
			value = selection;
			System.out.println("You chose " + value + " of " + spade);
		}
	}

	public int getSpadesValue()
	{
		return value ;
	}

	public void setHeartsValue(int selection)
	{
		if( selection < 1 || selection > 13 )
		{
			value = 1;
			System.out.println("You chose " + value + " of " + heart );
		}
		else
		{
			value = selection ;
			System.out.println("You chose " + value + " of " + heart );
		}
	}

	public int getHeartsValue()
	{
		return value ;
	}

	public void setDiamondsValue(int selection)
	{
		if( selection < 1 || selection > 13 )
		{
			value = 1;
			System.out.println("You chose " + value + " of " + diamond);
		}
		else
		{
			value = selection;
			System.out.println("You chose " + value + " of " + diamond);
		}
	}

	public int getDiamondsValue()
	{
		return value ;
	}

	public void setClubsValue(int selection)
	{
		if( selection < 1 || selection > 13 )
		{
			value = 1;
			System.out.println("You chose " + value + " of " + club );
		}
		else
		{
			value = selection ;
			System.out.println("You chose " + value + " of " + club );
		}
	}

	public int getClubsValue()
	{
		return value ;
	}
	
	public String setValue(int r)
	{
		switch(r)
		{
			case 1:
					rank = "Ace ";
					break;
			case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: 
					rank = "2 through 10 ";
					break;
			case 11:
					rank = "Jack ";
					break;
			case 12:
					rank = "Queen ";
					break;
			case 13:
					rank = "King ";
		}
		return rank;
	}
	
}