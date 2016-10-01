/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Book Publishing
*/
public class Novel extends Story
{
	//field for page limit
	private final int PAGELIMIT = 101;

	public void setPages( int pages )
	{
		//pass parameter for the message to set number of pages 
		setMessage("The story has " + pages + " pages");

		//determine if the pages dont exceed page limit 
		if ( pages < PAGELIMIT )
		{
			int remPages;
			remPages = PAGELIMIT - pages;
			setMessage( "The story has " + pages + " pages"+ "\n   " + remPages + " pages must be added to qualify a Novel " ) ;
		}
	}

	//to string method to display the state of the object 
	public String toString()
	{
		return "We are publishing the story " + getTitle() + " by " + getAuthor() + "\n   " + getMessage(); 
	}
}