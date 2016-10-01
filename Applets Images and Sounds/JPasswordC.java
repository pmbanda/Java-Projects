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
*Compilation    javac JPasswordC.java
*Execution      java JpasswordC
*/
public class JPasswordC extends JApplet implements ActionListener
{
    //Class level variables
    //create the labels and the text field
    JLabel prompt = new JLabel("Enter a password ");
    JTextField passEntry = new JTextField(10);
    Container con = getContentPane();//obtain the current container 
    JLabel display = new JLabel("");
    JLabel finalDisplay = new JLabel();
    
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
        int number_of_comparisons = 5;
        String []valid_passwords = {"Rosebud","Reddrum","Jason","Surrender","Dorothy"};
        
        String entry = passEntry.getText();//obtain text from the text area 
        //if text matches display the messages on the if statement 
        //else the message on the else statement
        for (int i = 0; i < number_of_comparisons; i++) 
        {
            int num = entry.compareTo(valid_passwords[i]);
            
            if ( num > 0 )
                //this string greater then the argument;
                display.setText(display.getText() + entry + " is greater than " + valid_passwords[i] + " -- ");
            else if ( num < 0 )
                //this string less than argument ;
                display.setText(display.getText() + entry + " is less than " + valid_passwords[i] + " -- ");
            else
                //string equals to the argument;
                display.setText(display.getText() + entry + " is equal to " + valid_passwords[i] + " -- ");
           
        }
        if ( number_of_comparisons == 5)
            passEntry.setEnabled(false);
    }
    
    
}


