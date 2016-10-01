import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;

/*Author    Peter Eugene Mbanda
*Date       11/30/2015
*Purpose    Date and time applet 
*Compilation    javac JDateAndTime.java
*Execution      java JDateAndTime
*/
public class JDateAndTime extends JApplet implements ActionListener
{
    //class level variables 
    JButton button = new JButton("Press");
    JTextField userEntry = new JTextField(25);
    Container con = getContentPane();//container
    FlowLayout fl = new FlowLayout();
    
    public void init()
    {
        //add components to the container
        con.setLayout(fl);
        con.add(button);
        con.add(userEntry);
        //add action listener to the button
        button.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //date instance 
        Date myDate = new Date();
        String dateString = myDate.toString();
        //display the date to the text field 
        userEntry.setText("Today is " + dateString);
    } 
    
}
