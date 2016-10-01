/*
Author:     Peter Eugene Mbanda
Date:       11/12/2015
Purpose:    Determine the vowel from consonants 

Compilation:javac JVowelConsonant.java
Execution:  java JVowelConsonant
*/

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JVowelConsonant extends JFrame implements ActionListener
{
        //create 26 letters for letters in the alphabet 
        private static String []alphaLetters = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"
                                            ,"P","Q","R","S","T","U","V","W","X","Y","Z"};
        //create an array of buttons 
        private static JButton []button = new JButton[alphaLetters.length];
        private static final int NUM_SELECT = 8;
        //create panels with grid layout.
        private static JPanel panel1 = new JPanel(new GridLayout( 2,2,5,5));
        private static JPanel panel2 = new JPanel(new GridLayout( 2,2,5,5));
        private static JPanel panel3 = new JPanel(new GridLayout( 2,2,5,5));
        private static JLabel label = new JLabel("Click any button");
    public JVowelConsonant()
    {
        super("Vowel Consonant");
        int i;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container con = getContentPane();
        //create 26 buttons
        for( i = 0 ; i < NUM_SELECT ; i++)
        {
            Random r = new Random();//select a random number
            int randNum = r.nextInt(alphaLetters.length);//number between 0 and 25
            if( i > 3)//if the number is greater than three set on the next panel 
            {
                //add the button to panel2 after a pseudo random number selection
                panel2.add(button[randNum] = new JButton(alphaLetters[randNum]));
                button[randNum].addActionListener(this);
            }else{
                //add the button to panel1 after a pseudo random number selection
                panel1.add(button[randNum] = new JButton(alphaLetters[randNum]));
                button[randNum].addActionListener(this);
            }
        }
        label.setFont(new Font("Arial",Font.ITALIC + Font.BOLD, 18 ));
        panel3.add(label);
        //set a border layout
        setLayout(new BorderLayout());
        con.add(panel1, BorderLayout.WEST);
        con.add(panel2, BorderLayout.EAST);
        con.add(panel3, BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object source = e.getSource();
        //determine the type of object selected and set the text to vowels if number falls on 0,4,8,14,20
        //else set to a constant
        if( source.equals(button[0]) || source.equals(button[4]) || source.equals(button[8]) 
                || source.equals(button[14]) || source.equals(button[20]) )
            label.setText("You clicked a Vowel");
        else
             label.setText("You clicked a Consonant");
        panel3.add(label);//add the label on the panel
    }
    public static void main(String[] args)
    {
        //instatantiate the class 
        JVowelConsonant frame = new JVowelConsonant();
        //declare the height and width 
        final int WIDTH = 500;
        final int Height = 500;
        frame.setSize(WIDTH, WIDTH);
        frame.setVisible(true);//display the frame 
    }
}
