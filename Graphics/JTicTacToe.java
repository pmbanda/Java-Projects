/*Author        Peter Eugene Mbanda
*Date           12/8/2015
*Purpose        Tic Tac Toe Game
*Compilation    javac JTicTacToe.java
*Execution      java JTicTacToe
*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JTicTacToe extends JFrame implements ActionListener
{
    //set class level variables 
    //by instantiating the labels and obtaint the content pane 
    JLabel title = new JLabel("Tic Tac Toe ");
    Font bigFont = new Font("Monaco",Font.BOLD,28);//set title font 
    JLabel prompt = new JLabel("Choose one button ");
    JPanel mainPanel = new JPanel(new GridLayout(3, 3, 2, 2));
    JPanel header = new JPanel(new FlowLayout());
    static JPanel result = new JPanel(new FlowLayout());
    static JLabel gameWinner = new JLabel(" Winning Status....");
    Container con = getContentPane();
    static final int TOTAL_BUTTONS = 9;
    static JButton buttons[] = new JButton[TOTAL_BUTTONS];
    int count = 0, compGen;//declare variables to be used in program
    Random randNum = new Random();
    HashSet <Integer> hs = new HashSet<Integer>();
    boolean valid;
  
    
    public JTicTacToe()
    {
        /*Set the layout as border layout 
        * and add the panels header and main game panel to the container 
        */
        con.setLayout(new BorderLayout());
        con.add(header,BorderLayout.NORTH);
        con.add(mainPanel,BorderLayout.CENTER);
        header.add(title);
        title.setFont(bigFont);
        header.add(prompt);
        con.add(gameWinner,BorderLayout.SOUTH);
        gameWinner.setFont(new Font("Monaco", Font.BOLD, 20));
        gameWinner.setForeground(Color.red);
        //iterate through buttons array and instantiate all the game buttons 
        for (int i = 0; i < buttons.length ; ++i) 
        {
            buttons[i] = new JButton();
            mainPanel.add(buttons[i]);
            //set an action listener to the buttons
            buttons[i].addActionListener(this);
        }
        
        
        //result.add(gameWinner,BorderLayout.SOUTH);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //obtain the source that caused the event change
        Object obj = e.getSource();
        
        //iterate through all the panels   
        for (int i = 0; i < buttons.length; i++) 
        {
            if( obj == (buttons[i]))
            {
                buttons[i].setText("x");//set the button text to x 
                buttons[i].setFont(new Font("Monaco",Font.BOLD,16));
                hs.add(i);//add the number selectes to the hash list 
                count++;
                    if ( count == 5)
                    {
                        //if player chooses 10 x values return the control to the calling method
                        return;
                    }
                do
                {
                    compGen = randNum.nextInt(9);//genarate a random number 
                }
                while ( hs.contains(compGen));//if number is contained in the hash set generate another number 
                break;
            }   
            con.validate();
        }
      
        buttons[compGen].setText("o");//set the button text to o with the generated number 
        buttons[compGen].setFont(new Font("Monaco",Font.BOLD,16));
        hs.add(compGen);//add generated number to the hash set 
           
        winningStatus();

        con.validate();
        
    }
    public static void winningStatus()
    {
    /*
    * Method will verify whether the user has won the game or computer
    * vertically diagonally or horizontally
    */
        if( buttons[0].getText().equalsIgnoreCase("x") && buttons[4].getText().equalsIgnoreCase("x") && buttons[8].getText().equalsIgnoreCase("x") )
        {	String message = "Player Won !!! Game Over !!! "; gameWinner.setText(message);   }
        else if( buttons[0].getText().equalsIgnoreCase("o") && buttons[4].getText().equalsIgnoreCase("o") && buttons[8].getText().equalsIgnoreCase("o") )
        {	String message = "Computer Won !!! Game Over !!! "; gameWinner.setText(message);  }
        if( buttons[2].getText().equalsIgnoreCase("x") && buttons[4].getText().equalsIgnoreCase("x") && buttons[6].getText().equalsIgnoreCase("x") )
        {	String message = "Player Won !!! Game Over !!! "; gameWinner.setText(message);  }
        else if( buttons[2].getText().equalsIgnoreCase("o") && buttons[4].getText().equalsIgnoreCase("o") && buttons[6].getText().equalsIgnoreCase("o") )
        {	String message = "Computer Won !!! Game Over !!! "; gameWinner.setText(message);  }
        if( buttons[1].getText().equalsIgnoreCase("x") && buttons[4].getText().equalsIgnoreCase("x") && buttons[7].getText().equalsIgnoreCase("x") )
        {	String message = "Player Won !!! Game Over !!! "; gameWinner.setText(message); }
        else if( buttons[1].getText().equalsIgnoreCase("o") && buttons[4].getText().equalsIgnoreCase("o") && buttons[7].getText().equalsIgnoreCase("o") )
        {	String message = "Computer Won !!! Game Over !!! "; gameWinner.setText(message); }
		
        if( buttons[0].getText().equalsIgnoreCase("x") && buttons[3].getText().equalsIgnoreCase("x") && buttons[6].getText().equalsIgnoreCase("x") )
        {	String message = "Player Won !!! Game Over !!! "; gameWinner.setText(message);  }
        else if( buttons[0].getText().equalsIgnoreCase("o") && buttons[3].getText().equalsIgnoreCase("o") && buttons[6].getText().equalsIgnoreCase("o") )
        {	String message = "Computer Won !!! Game Over !!! "; gameWinner.setText(message);  }
        if( buttons[1].getText().equalsIgnoreCase("x") && buttons[4].getText().equalsIgnoreCase("x") && buttons[7].getText().equalsIgnoreCase("x") )
        {	String message = "Player Won !!! Game Over !!! "; gameWinner.setText(message); }
        else if( buttons[1].getText().equalsIgnoreCase("o") && buttons[4].getText().equalsIgnoreCase("o") && buttons[7].getText().equalsIgnoreCase("o") )
        {	String message = "Computer Won !!! Game Over !!! "; gameWinner.setText(message);  }
        if( buttons[2].getText().equalsIgnoreCase("x") && buttons[5].getText().equalsIgnoreCase("x") && buttons[8].getText().equalsIgnoreCase("x") )
        {	String message = "Player Won !!! Game Over !!! "; gameWinner.setText(message);  }
        else if( buttons[2].getText().equalsIgnoreCase("o") && buttons[5].getText().equalsIgnoreCase("o") && buttons[8].getText().equalsIgnoreCase("o") )
        {	String message = "Computer Won !!! Game Over !!! "; gameWinner.setText(message);  }
			
        if( buttons[0].getText().equalsIgnoreCase("x") && buttons[1].getText().equalsIgnoreCase("x") && buttons[2].getText().equalsIgnoreCase("x") )
        {	String message = "Player Won !!! Game Over !!! "; gameWinner.setText(message);  }
        else if( buttons[0].getText().equalsIgnoreCase("o") && buttons[1].getText().equalsIgnoreCase("o") && buttons[2].getText().equalsIgnoreCase("o") )
        {	String message = "Computer Won !!! Game Over !!! "; gameWinner.setText(message);  }
        if( buttons[3].getText().equalsIgnoreCase("x") && buttons[4].getText().equalsIgnoreCase("x") && buttons[5].getText().equalsIgnoreCase("x") )
        {	String message = "Player Won !!! Game Over !!! "; gameWinner.setText(message); }
        else if( buttons[3].getText().equalsIgnoreCase("o") && buttons[4].getText().equalsIgnoreCase("o") && buttons[5].getText().equalsIgnoreCase("o") )
        {	String message = "Computer Won !!! Game Over !!! "; gameWinner.setText(message);  }
        if( buttons[6].getText().equalsIgnoreCase("x") && buttons[7].getText().equalsIgnoreCase("x") && buttons[8].getText().equalsIgnoreCase("x") )
        {	String message = "Player Won !!! Game Over !!! "; gameWinner.setText(message);  }
        else if( buttons[6].getText().equalsIgnoreCase("o") && buttons[7].getText().equalsIgnoreCase("o") && buttons[8].getText().equalsIgnoreCase("o") )
        {	String message = "Computer Won !!! Game Over !!! "; gameWinner.setText(message);  }
	
      
    } 
    public static void main(String[] args) 
    {
        //constants WIDTH and HEIGHT for JFrame
        final int WIDTH = 380;
        final int HEIGHT = 500;
        //instantiate class TicTacToe
        JTicTacToe myFrame = new JTicTacToe();
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //set size and make frame visible
        myFrame.setSize(WIDTH, HEIGHT);
        myFrame.setVisible(true);
    }
    
    
}