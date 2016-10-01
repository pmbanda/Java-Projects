/*Author        Peter Eugene Mbanda
*Date           12/8/2015
*Purpose        mouse frame change color and shapes 
*Compilation    javac JMouseFrame.java
*Execution      java JMouseFrame
*/
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class JMouseFrame  extends JFrame implements MouseListener
{
    static Graphics g;
    //set the class level variables 
    private int x, y, height, width;
    //set the label
    private JLabel label = new JLabel("Do something with the mouse");
    String msg = " ";
    //get the content pane 
    Container con = getContentPane();
    //create the paint method and override when user clicks mouse
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.magenta);
        g.fillOval( x, y , width, height );
        //repaint();
    }
    public JMouseFrame()
    {
        setTitle("Mouse actions");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //set layout 
        setLayout(new FlowLayout());
        //add the listener
        con.addMouseListener(this);
        con.add(label);
        setResizable(false);
    }
    
    public void mouseClicked(MouseEvent e) 
    {
        int whichButton = e.getButton();//get the button clicked 
        //get the x and the y axis points 
     
        x = e.getX();
        y = e.getY();
        
        if (whichButton == MouseEvent.BUTTON1)
        {
            width = 150;
            height = 150;
            repaint();
        }
        if (whichButton == MouseEvent.BUTTON3)
        {
            width = 60;
            height = 60;
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    } 
    @Override
    public void mouseReleased(MouseEvent e) {
       
    }
    @Override
    public void mouseEntered(MouseEvent e) 
    {
       //add message display to alert the user when the frame has been entered 
       msg = "You entered the frame";
       label.setText(msg);
       //set the fore color and the background color
       label.setForeground(Color.black);
       con.setBackground(Color.yellow);
       validate();
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
       //add message display to alert the user when the frame has been exited 
       msg = "You exited the frame";
       label.setText(msg);
       //set the fore color and the background color
       label.setForeground(Color.white);
       con.setBackground(Color.black);
       validate();
    }
   
    
    public static void main(String[] args) 
    {
        //create an instance of the class 
        JMouseFrame mFrame = new JMouseFrame();
        final int WIDTH = 1000;
        final int HEIGHT = 1000;
        //set the width and height
        mFrame.setSize(WIDTH, HEIGHT);
        //make visible
        mFrame.setVisible(true);
    }
    
}
