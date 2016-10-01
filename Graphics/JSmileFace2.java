import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

/*Author    	Peter Eugene Mbanda
*Date       	12/8/2015
*Purpose    	Draw a frowning face
*Compilation    javac JSmileFace2.java
*Execution      java JSmileFace2
*/

public class JSmileFace2 extends JPanel
{
	//paint method with graphics parameter 

	public void paint(Graphics g)
	{
		super.paint(g);

		//face filled with yellow color
		g.setColor(Color.yellow);
		g.fillOval( 100, 100, 200, 200);

		//eyes filled with black color maintain the y axis but increment x axis 
		g.setColor(Color.black);
		g.fillOval( 145, 155, 30, 30);
		g.fillOval( 220, 155, 30, 30);

		//mouth filled with black color
		g.fillOval( 140, 200, 120, 60);

		//repaint the black mouth with a yellow color
		g.setColor(Color.yellow);
		g.fillOval( 140, 210, 120, 30);
		g.fillOval( 140, 220, 120, 40);

	}
	public static void main(String[] args) 
	{
		final int WIDTH = 400;
		final int HEIGHT = 400;
		//use class instance to create a panel
		JSmileFace2 panel = new JSmileFace2();
		//instantiate the jframe
		JFrame myFrame = new JFrame();

		//window close operation , ass panel to the frame and set size
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(panel);
		myFrame.setSize( WIDTH, HEIGHT);
		myFrame.setVisible(true);
	}
}