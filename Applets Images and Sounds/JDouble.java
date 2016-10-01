import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*Author    Peter Eugene Mbanda
*Date       11/30/2015
*Purpose    Date and time applet 
*Compilation    javac  JDouble.java
*Execution      java  JDouble
*/
public class JDouble extends JApplet implements ActionListener,MouseListener
{
    //class level variables 
    JButton button = new JButton("Press");
    Container con = getContentPane();//get container 
    JLabel prompt = new JLabel("Enter an integer ");
    JTextField userEntry = new JTextField(10);
    JButton doubleMe = new JButton("Double me");
    
    public void init()
    {
        //add components to the applet canvas
        con.add(button);
        //add action listener to the button 
        button.addActionListener(this);
        //use the flow layout to separate the components 
        con.setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //add the label text field and the button on canvas
        con.add(prompt);
        con.add(userEntry);
        con.add(doubleMe);
        //add a mouse listener to listen to the events
        doubleMe.addMouseListener(this);
        con.validate();//refresh the canvas 
    }
    //mouse listener 
    @Override
    public void mouseClicked(MouseEvent e) 
    {
        //obtain the text from the text field 
        String numString = userEntry.getText();
        //convert the text to an integer 
        int num = Integer.parseInt(numString);
        int doubleDigit = num * 2;//double the integer 
        String doubleDigitString = Integer.toString(doubleDigit);//convert back to string 
        userEntry.setText(doubleDigitString);//set the text on the text field area after doubling
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
