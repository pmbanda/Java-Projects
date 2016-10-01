/*
Author:     Peter Eugene Mbanda
Date:       11/12/2015
Purpose:    Determine Color

Compilation:javac JColorFrame.java
Execution:  java JColorFrame
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JColorFrame extends JFrame implements ActionListener
{   
    //create the labels buttond and panels
    JLabel label1 = new JLabel("NORTH");
    JLabel label2 = new JLabel("SOUTH");
    JLabel label3 = new JLabel("Click until all the color is filled or EXIT ");
    JLabel label4 = new JLabel("EAST");
    JLabel label5 = new JLabel("WEST");
    //button
    private JButton button = new JButton("CLICK ME");
    //panels 
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel(new FlowLayout());//set la
    private JPanel panel4 = new JPanel();
    private JPanel panel5 = new JPanel();
    
    
    public JColorFrame()
    {
        super("Color");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        Container con = getContentPane();
        //add panels to the container 
        con.add(panel1, BorderLayout.NORTH);
        con.add(panel2, BorderLayout.SOUTH);
        con.add(panel3, BorderLayout.CENTER);
        con.add(panel4, BorderLayout.EAST);
        con.add(panel5, BorderLayout.WEST);
        //add labels to each panel
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(button);
        panel3.add(label3);
        panel4.add(label4);
        panel5.add(label5);
        //add the action listener 
        button.addActionListener(this);
    }
     @Override
     public void actionPerformed(ActionEvent e) 
     {
         //use of the hashset to avoid the number repetition 
        HashSet<Integer> hs = new HashSet<>();
        Random r = new Random();//initialize a random number
        int num = r.nextInt(5) + 1;
        //use of the while loop to initialize another number upon repetition 
        while(hs.contains(num))
          num = r.nextInt(5) + 1; 

        hs.add(num);//add number to the hash set 
        switch(num)
        {
            //assign color based on the number selected
            case 1:
                panel1.setBackground(Color.RED);
                break;
            case 2:
                panel2.setBackground(Color.BLUE);
                break;
            case 3:
                panel3.setBackground(Color.PINK);
                break;
            case 4:
                panel4.setBackground(Color.MAGENTA);
                break;
            case 5:
                panel5.setBackground(Color.ORANGE);
                break;
        }
    }
    public static void main(String[] args) 
    {
        //instantiate the color frame class 
        JColorFrame frame = new JColorFrame();
        //set the height and the width 
        final int WIDTH = 350;
        final int HEIGHT = 300;
        frame.setSize(WIDTH, HEIGHT);
        //make the frame visible 
        frame.setVisible(true);
    }

}
