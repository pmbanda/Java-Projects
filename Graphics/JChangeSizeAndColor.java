import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
/*Author        Peter Eugene Mbanda
*Date           12/8/2015
*Purpose        color frame 
*Compilation    javac JChangeSizeAndColor.java
*Execution      java JChangeSizeAndColor
*/
class JChangeSizeAndColor extends JFrame implements ActionListener 
{
      //set the class level variables 
    JLabel phrase = new JLabel(" ");
    JLabel newPhrase = new JLabel(" ");
    JButton button = new JButton("Click");
    JPanel panel = new JPanel();
    Container con = getContentPane();//get the content pane

    Font font = new Font("Bopee", Font.BOLD, 20);
    int count = 0;//count to control the number  of clicks 


    public JChangeSizeAndColor() 
    {
        super("Size and Color");
        //add panel and title to the container 
        //set the layout
        panel.setLayout(new GridLayout(0, 2));
        panel.add(phrase);
        panel.add(newPhrase);
        //add the button and panels plus the action listener to listen to the events 
        con.setLayout(new GridLayout(3, 1));
        con.add(button);
        con.add(panel);
       
        button.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent e) 
    {
        count++;
        if (e.getSource() == button)
        {
            if (count == 1) 
            {
                //on the first button click
                phrase.setText("I love Java Lang!");
                newPhrase.setText(" ");
                phrase.setForeground(Color.magenta);
                return;
            }   
        
            else if (count == 2) 
            {
                //on second button click
                phrase.setForeground(Color.gray);
                phrase.setText("I love Java Lang!");
                phrase.setForeground(Color.blue);
                phrase.setFont(font);
                panel.add(phrase);

            }
            else if (count == 3) 
            {
                //on third button click
                newPhrase.setText("I love Java Lang!");
                newPhrase.setForeground(Color.red);
                newPhrase.setFont(font);

            }
        }
       
    }

    public static void main(String args[]) 
    {
         //set the width and the height on the frame 
        final int WIDTH = 600;
        final int HEIGHT = 300;
        //instantiate the class 
        JChangeSizeAndColor frame = new JChangeSizeAndColor();
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        //make the frame visible 
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}