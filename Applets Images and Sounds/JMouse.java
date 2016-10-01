/*Author    Peter Eugene Mbanda
*Date       11/30/2015
*Purpose    mouse events applet 
*Compilation    javac  JMouse.java
*Execution      java  JMouse
*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JMouse extends JApplet implements MouseListener
{
    //class level variable
    JPanel panel = new JPanel(new FlowLayout());
    JLabel enterExitLabel = new JLabel("");
    JLabel onClickLabel = new JLabel();
    String message = " ";
    String onClick = " ";
    //obtain the content pane 
    Container con = getContentPane();
    
    public void init()
    {
        //set the layout 
        con.setLayout(new BorderLayout());
        con.add(panel, BorderLayout.CENTER);
        panel.setBackground(Color.red);
        panel.add("Main Panel", enterExitLabel);
        addMouseListener(this);//add mouse listener to the applet
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        //obtain value of x and y on the screen
        onClick = " Mouse clicked here " + e.getX() +" " + e.getY();
        //assign to the label
        onClickLabel.setText(onClick);
        panel.add( " " , onClickLabel);
        onClickLabel.setLocation(e.getX(), e.getY());
        con.invalidate();
        con.validate();
    }

    @Override
    public void mousePressed(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) 
    { 
        //assign message to label 
        message = "You entered applet";
        enterExitLabel.setText(message);
    }

    @Override
    public void mouseExited(MouseEvent e) 
    { 
        //assign message to label 
        message = "You exited applet";
        enterExitLabel.setText(message);
    }
}
