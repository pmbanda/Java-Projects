import java.awt.Graphics;
import javax.swing.JFrame;
/*Author        Peter Eugene Mbanda
*Date           12/8/2015
*Purpose        Draw nested boxes
*Compilation    javac JNestedBoxes.java
*Execution      java JNestedBoxes
*/
public class JNestedBoxes extends JFrame
{
    public void paint(Graphics g)
    {
        //paint method with graphics constructor
        super.paint(g);
        int rings = 8;//total number of rings
        //start point of the x and y axis
        int x = 300;
        int y = 260;
        //initialize the height and width
        int width = 40;
        int height = 40;
        
        for (int i = 0; i < rings; i++) 
        {
            g.drawRect(x, y, width, height);//draw the shape
            //dectement the x and the y axis 
            x -= 20;
            y -= 20;
            //increase the height and the width by 40
            width += 40;
            height += 40;
            validate();
        }
    }
    
    public static void main(String[] args) 
    {
        final int WIDTH = 600;
        final int HEIGHT = 600;
        //create a class instance 
        JNestedBoxes myFrame = new JNestedBoxes();
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //assign width and height to the frame 
        myFrame.setSize(WIDTH, HEIGHT);
        myFrame.setVisible(true);
    }
    
}