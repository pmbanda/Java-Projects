/*
Author:     Peter Eugene Mbanda
Date:       11/12/2015
Purpose:    mail application

Compilation:javac JEmail.java
Execution:  java JEmail
*/
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JEmail extends JFrame implements ActionListener
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
    //get the container for components 
    Container con = getContentPane();
    
    public JEmail()
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
        //add action listener to the button
        send.addActionListener(this);
    }
      @Override
    public void actionPerformed(ActionEvent e) 
    {
        //add a confirmation message to shoe message sent on button click
        confirmation.setText("Message has been sent !! ");
        con.add(confirmation);
        send.setEnabled(false);
        con.validate();
      
    }
    public static void main(String[] args) 
    {
        //create a mail object 
       JEmail myMail = new JEmail();
       myMail.setVisible(true);
       myMail.setSize( 800,270);
       myMail.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

  
  
    
}
