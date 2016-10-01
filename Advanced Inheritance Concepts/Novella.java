/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Book Publishing
*/
public class Novella extends Story
{
	private final int LOW_PAGELIMIT = 50;
	private final int UPPER_PAGELIMIT = 100;

	public void setPages( int pages )
	{
		//pass parameter for the message to set number of pages 
		setMessage("The story has " + pages + " pages " );
		
		if ( pages < LOW_PAGELIMIT || pages > UPPER_PAGELIMIT )
		{
			//use of the selection statement to determine if the pages exceed or fall within range 
			int remPages;
			if ( pages < LOW_PAGELIMIT )
			{
				remPages = LOW_PAGELIMIT - pages;
				setMessage( "The story has " + pages + " pages"+ "\n   " + remPages + " pages must be added to qualify a Novella " ) ;
			}
			else if( pages > UPPER_PAGELIMIT )
			{
				remPages = pages - UPPER_PAGELIMIT;
				setMessage( "The story has " + pages + " pages"+ "\n   " + remPages + " pages must be cut to qualify a Novella " ) ;
			}
		}
	}

	//to string method to display the state of the object 
	public String toString()
	{
		getMessage();
		return "We are publishing the story " + getTitle() + " by " + getAuthor() + "\n   " + getMessage(); 
	}
}