/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Book Publishing
*/
public class ShortStory extends Story
{
	private int PAGELIMIT = 49;

	public void setPages( int pages )
	{
		//pass parameter for the message to set number of pages 
		setMessage("The story has " + pages + " pages ");

		if( pages > PAGELIMIT ){
			int remPages;
			remPages = pages - PAGELIMIT;
			setMessage( "The story has " + pages + " pages"+ "\n   " + remPages + " pages must be cut to qualify a short story " ) ;
		}
	}

	//to string method to display the state of the object 
	public String toString()
	{
		getMessage();
		return "We are publishing the story " + getTitle() + " by " + getAuthor() + "\n   " + getMessage(); 
	}
}