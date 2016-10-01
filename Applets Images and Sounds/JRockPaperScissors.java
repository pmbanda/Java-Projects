/*
Author:     Peter Eugene Mbanda
Date:       11/12/2015
Purpose:    Rock paper scissors application

Compilation:javac JRockPaperScissors.java
Execution:  java JRockPaperScissors
*/
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

public class JRockPaperScissors extends JApplet implements ActionListener 
{
    //class level variables 
    JLabel game_title = new JLabel("        Rock, Paper, Scissors            ");
    JLabel prompt = new JLabel("Choose one button");
    JLabel results = new JLabel("---------Results---------");
    JLabel player = new JLabel("");
    JLabel computer = new JLabel("");
    JLabel winner = new JLabel();
    JLabel overallPlay = new JLabel(" ");
    JButton rock = new JButton("Rock");
    JButton paper = new JButton("Paper");
    JButton scissors = new JButton("Scissors");
    Container con = getContentPane();
    //create a string to store the computer results of choice 
    //and the players 
    String decision = " ";
    String champ = " ";
    //accumulator to store the number of wins against the loses and ties 
    int playerWon = 0;
    int compWon = 0;
    int tie = 0;
    
    public void init()
    {
        //set the flow layout 
        con.setLayout(new FlowLayout());
        con.add(game_title);
        game_title.setFont(new Font("Monaco", Font.BOLD, 22));
        con.add(prompt);
        prompt.setFont(new Font("Monaco", Font.BOLD, 22));
        results.setFont(new Font("Monaco", Font.BOLD, 22));
        //add the buttons and the label to the container 
        con.add(rock);
        con.add(paper);
        con.add(scissors);
        con.add(results);
        //add the action listener to the buttons 
        rock.addActionListener(this);
        paper.addActionListener(this);
        scissors.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
      //determine the object selected 
       Object source = e.getActionCommand();
       //display the item picked 
       if( source == rock )
           player.setText("You picked " + source );
       else if( source == paper )
           player.setText("You picked " + source );
       else
           player.setText("You picked " + source );
       con.invalidate();
       con.validate();
       con.add(player);
       player.setFont(new Font("Arial", Font.BOLD, 18));
       
       //random number to display the computers choice 
       int comp = (int)(Math.random() * 3 + 1);
       if( comp == 1)
           decision = "Rock";
       else if ( comp == 2)
            decision = "Paper";
       else
            decision = "Scissors";
       computer.setText("Computer picked " + decision );
       computer.setFont(new Font("Arial", Font.BOLD, 18));
       con.add(computer);
       
       /*
       decision statements to determime the winner either the computer or player based on the choice 
       */
        if ( source == decision )
        {
            winner.setText("Winner: Draw/Tie");//in case of a tie 
            ++tie;
        }	
        else if ( (source.equals("Rock")) && (decision.equals("Scissors")) )
        {
            winner.setText("Winner: You won");
            ++playerWon;
        }	
	else if ( (decision.equals("Rock")) && (source.equals("Scissors")) )
        {
		winner.setText("Winner: Computer won");
                ++compWon;
        }
	else if ( (source.equals("Scissors")) && (decision.equals("Paper")) )
        {
		winner.setText("Winner: You won");
                ++playerWon;
        }
	else if ( (decision.equals("Scissors")) && (source.equals("Paper")) )
        {
		winner.setText("Winner: Computer won");
                ++compWon;
        }
	else if ( (source.equals("Paper")) && (decision.equals("Rock")) )
        {
		winner.setText("Winner: You won");
                ++playerWon;
        }
	else if ( (decision.equals("Paper")) && (source.equals("Rock")) )
        {
		winner.setText("Winner: Computer won");
                ++compWon;
        }
        //ass the text and display contents on the canvas 
        con.add(winner);
        winner.setForeground(Color.magenta);
        con.add(overallPlay);
        overallPlay.setForeground(Color.red);
        winner.setFont(new Font("Arial", Font.BOLD, 18));
        overallPlay.setFont(new Font("Arial", Font.BOLD, 18));
        overallPlay.setText("You: " + playerWon + " Computer: " + compWon + " Ties: " + tie);
    }
    
}
