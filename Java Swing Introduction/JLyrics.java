/*Author:       Peter Eugene Mbanda
 *Date:         10/26/2015
 *Purpose:      Display my favorite song lyrics 
 *compilation   javac JLyrics.java
 *execution     java Jlyrics
 */
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLyrics 
{
    public static void main(String[] args) 
    {
        //Song Lyrics 
        String lyrics = ("<html>Emancipate yourself from mental slavery,<br>" +
                         "None but our self can free our minds.<br>" +
                         "Have no fear for atomic energy,<br>" +
                         "'Cause none of them can stop the time.<br>" +
                         "How long shall they kill our prophets,<br>" +
                         "While we stand aside and look?<br>" +
                         "Some say it's just a part of it,<br>" +
                         "We've got to fulfill the book.<br>" +
                         "<br> <html>");
        //width and height size of the window
        final int WIDTH = 400;
        final int HEIGHT = 220;
        Font headlineFont = new Font( "Monaco", 3 , 14);//declare font type 
        JFrame myFrame = new JFrame("My Favorite Lyrics BOB MARLEY ");
        //assign to the frame object 
        myFrame.setSize(WIDTH, HEIGHT);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel mySong = new JLabel(lyrics);//label instantiation
        mySong.setFont(headlineFont);
        myFrame.setLayout(new FlowLayout());//flow layout 
        myFrame.add(mySong);
        myFrame.setVisible(true);
       
        
    }
}
