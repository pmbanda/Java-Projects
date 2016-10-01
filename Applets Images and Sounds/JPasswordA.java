import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*Author    Peter Eugene Mbanda
*Date       11/30/2015
*Purpose    Password Application 
*Compilation    javac JPasswordA.java
*Execution      java JpasswordA
*/
public class JPasswordA extends JApplet implements ActionListener
{
    //Class level variables
    //create the labels and the text field
    JLabel prompt = new JLabel("Enter a password ");
    JTextField passEntry = new JTextField(10);
    Container con = getContentPane();//obtain the current container 
    JLabel display = new JLabel("");
    
    public void init()
    {
       //add the components to the container object 
       //add the labels and the text field 
       con.setLayout(new FlowLayout());
       con.add(prompt);
       con.add(passEntry);
       passEntry.addActionListener(this);//add the action listener to listen to the events 
       con.add(display);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String entry = passEntry.getText();//obtain text from the text area 
        //if text matches display the messages on the if statement 
        //else the message on the else statement
        if ( entry.equals("Rosebud"))
            display.setText("Access granted ");
        else
            display.setText("Access denied ");
    }
    
    
}
