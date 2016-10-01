import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*Author    Peter Eugene Mbanda
*Date       11/30/2015
*Purpose    Body Mass Index applet 
*Compilation    javac  JBMICalculator.java
*Execution      java  JBMICalculator
*/
public class JBMICalculator extends JApplet implements ActionListener
{
    //class level variables label text fields and button
    JLabel heightLabel = new JLabel("Enter height in inches ");
    JLabel weightLabel = new JLabel("Enter weight in pounds ");
    JTextField heightTextF = new JTextField(10);
    JTextField weightTextF = new JTextField(10);
    JButton bmi = new JButton("BMI");
    JLabel result = new JLabel("");
    Container con = getContentPane();
    
    public void init()
    {
        //add the label button and text field area to the canvas
        con.setLayout(new FlowLayout());
        con.add(heightLabel);
        con.add(heightTextF);
        con.add(weightLabel);
        con.add(weightTextF);
        con.add(bmi);
        //add action listeners to the text field area 
        //heightTextF.addActionListener(this);
        //weightTextF.addActionListener(this);
        bmi.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //obtsin the values from the text field area 
        String heightString = heightTextF.getText();
        //convert height string to integer
        int height = Integer.parseInt(heightString);
        //convert weight string to integer
        String weightString = weightTextF.getText();
        double weight = Double.parseDouble(weightString);
       
        //calculate body mass index by dividing the weight over the square of height 
        double bodyMassIndex =  ( ( weight  / Math.pow( height , 2 ) ) * 703.00 )  ;
        bodyMassIndex = ( bodyMassIndex * 100 ) / 100.00 ;
        result.setText("BMI is " + bodyMassIndex );//set the text on the result label
        //add to the canvas
        con.add(result);
        con.validate();
    }
    
}
