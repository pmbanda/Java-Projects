/*
Author:     Peter Eugene Mbanda
Date:       11/12/2015
Purpose:    Moving Frame

Compilation:javac JMovingFrame.java
Execution:  java JMovingFrame
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JMovingFrame extends JFrame implements ActionListener
{
    //create the panels 
    private JPanel panel1 = new JPanel(new FlowLayout());
    private JPanel panel2 = new JPanel(new FlowLayout());
    private JPanel panel3 = new JPanel(new FlowLayout());
    //button creation
    private JButton button1 = new JButton("Click HERE");
    private Font myFont = new Font("Monaco", Font.BOLD + Font.ITALIC, 14);
    //label creation
    private JLabel label = new JLabel("Magic Label on middle panel");
    private JLabel labelPan1 = new JLabel("North");
    private JLabel labelPan2 = new JLabel("South");
    private JLabel labelPan3 = new JLabel("Centre");
    private static final int WIDTH = 400;
    private static final int HEIGHT = 200;
    private Container con = getContentPane();
    public JMovingFrame()
    {
        //title of frame 
        super("Moving Label");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        //layout set
        setLayout(new BorderLayout());//use border layout
        con.add(panel1,BorderLayout.NORTH);
        con.add(panel2,BorderLayout.SOUTH);
        con.add(panel3,BorderLayout.CENTER);
        //add the panels and button plus the label
        panel3.add(button1);
        label.setFont(myFont);
        label.setForeground(Color.red);
        panel3.add(label);
        panel1.add(labelPan1);
        panel2.add(labelPan2);
        //action listener implementation to listen to events
        button1.addActionListener(this);
    }
    public static void main(String[] args) 
    {
        JMovingFrame frame = new JMovingFrame();
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //move the label to the north pannel
            label.setText(" Magic Label on North panel !!TA-DA!!");
            panel1.add(label);
            con.add(panel1);
            con.invalidate();
            con.validate(); 
            button1.setEnabled(false);
    }
}
