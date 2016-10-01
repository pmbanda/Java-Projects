/*
Author:     Peter Eugene Mbanda
Date:       11/12/2015
Purpose:    mail application

Compilation:javac JEmail2.java
Execution:  java JEmail2
*/
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JEmail2 extends JFrame implements ActionListener
{      
    //class level variables 
    JTextArea ta = new JTextArea( 10 , 60);
    //labels, button and text field instances 
    JLabel companylogo = new JLabel("We Buy Company");
    JLabel to = new JLabel("To: ");
    JLabel subject = new JLabel("Subject: ");
    JLabel confirmation = new JLabel(" ");
    JLabel message = new JLabel("Message:");
    JTextField toTextField = new JTextField(15);
    JTextField subjectTextField = new JTextField(15);
    JButton send = new JButton("Send");
    JButton clear = new JButton("Clear");
    //get the container for components 
    Container con = getContentPane();
    
    public JEmail2()
    {
        setLayout(new FlowLayout());//set layout 
        con.add(companylogo);
        companylogo.setFont(new Font("Monaco", Font.BOLD,18));
        //add labels, button and area to container 
        con.add(to);
        con.add(toTextField);
        con.add(subject);
        con.add(subjectTextField);
        con.add(message);
        con.add(ta);
        con.add(send);
        con.add(clear);
        //add action listener to the button
        send.addActionListener(this);
        clear.addActionListener(this);
    }
    
    public static void main(String[] args) 
    {
        //create a mail object 
       JEmail2 myMail = new JEmail2();
       myMail.setVisible(true);
       myMail.setSize( 800,270);
       myMail.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object source = e.getSource();
        if( source == send )
        {
            //add a confirmation message to shoe message sent on button click
            confirmation.setText("Message has been sent !! ");
            con.add(confirmation);
            send.setEnabled(false);
            con.validate();
            
        }
        if ( source == clear )
        {
            toTextField.setText(null);
            subjectTextField.setText(null);
            ta.setText(null);
            con.validate();
        }
    }
  
    
}
