/*Author:	Peter Eugene Mbanda
*Date:		9/8/2015
*Purpose:	Book Publishing
*/
public abstract class Story
{
	//create the field variables 
	private String title;
	private String author;
	private int numPages;
	private String message;

	//getter  methods to access the values 
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public int getPages(){
		return numPages;
	}
	public String getMessage(){
		return message;
	}
	//mutator methods to change field values 
	public void setTitle( String title ){
		this.title = title;
	}
	public void setAuthor( String author ){
		this.author = author;
	}

	public abstract void setPages( int numPages );

	public void setMessage( String message ){
		this.message = message;
	}


} 