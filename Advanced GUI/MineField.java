import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*Author        Peter Eugene Mbanda
*Date           12/8/2015
*Purpose        Game play involving panels change and game over when panel selection becomes Red
*Compilation    javac MineField.java
*Execution      java MineField
*/

public class MineField extends JFrame implements MouseListener
{
    //declare the row and the colums 
    int count = 0;//count the number of panels chosen
    final int ROW = 4;
    final int COLUMN = 5;
    Container con = getContentPane();
    JLabel welcome = new JLabel("Welcome to Mine Field");
    //four by five grid and populate the grid with jpanels
    JPanel MainPanel = new JPanel( new GridLayout( ROW , COLUMN , 2 , 2 ));
    //10 panels on a grid before hitting a bomb
    JPanel [] panels =  new JPanel[ ROW * COLUMN];
    int num;
    int i;
    String message;
    
    public MineField()
    {
        //border layout to set frames
        //north region congratulatory mesage
        con.setLayout(new BorderLayout());
        con.add( welcome , BorderLayout.NORTH );
        welcome.setFont(new Font("Arial ", Font.BOLD + Font.ITALIC , 28));
        //center region for the game
        con.add( MainPanel, BorderLayout.CENTER);
         
        //generate a random number between 1 and 19 using the class math random
        //randomly choose one panel to be the bomb the other 19 are safe
        Random r = new Random();
        num = r.nextInt(20);
        
        for ( i = 0; i < panels.length ; i++) 
        {
            //if i equals random number assign the bomb on panel
            if( i == num )
            {
                panels[i] = new JPanel();
                MainPanel.add( panels[i]);
                panels[i].setBackground(Color.blue);
                panels[i].addMouseListener(this);
            }
            //else assign regular panels 
            else 
            {
                panels[i] = new JPanel();
                MainPanel.add( panels[i]);
                //set all the panels background color to blue 
                panels[i].setBackground(Color.blue);
                panels[i].addMouseListener(this);
            }
        }
        //if player choses 10 before the bomb display the congratulatory message
    }
    @Override
    public void mouseClicked(MouseEvent e) 
    {
        Object obj = e.getSource();//obtain the source that caused the event change
        //iterate through all the panels 
        for (int i = 0; i < panels.length; i++) 
        {
            if( obj.equals(panels[num]))
            {
                panels[num].setBackground(Color.red);//bomb panel turns red on selection
                message = "BOMB GAME OVER!";
                welcome.setText(message);//display the message on the north panel 
                
            }
            if( obj.equals(panels[i]))
            {
                //panel turns white if not a bomb panel
                 panels[i].setBackground(Color.white);
                 count++;//counts the number of white panels selected 
                 if( count == 10)
                 {
                    //display the congrarulatry message
                    message = "Congratulations You Won ";
                    welcome.setText(message);
                   
                 }
            }
        }
      
    }

    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {} 
    
    public static void main(String[] args) 
    {
        //minefield instance 
        MineField mf = new MineField();
        //set width and height 
        final int WIDTH = 600;
        final int HEIGHT = 600;
        mf.setSize(WIDTH, HEIGHT);
        //terminates the application
        mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //make frame visible 
        mf.setVisible(true);
    } 
}