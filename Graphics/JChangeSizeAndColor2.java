import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
/*Author        Peter Eugene Mbanda
*Date           12/8/2015
*Purpose        color frame 
*Compilation    javac JChangeSizeAndColor2.java
*Execution      java JChangeSizeAndColor2
*/
class JChangeSizeAndColor2 extends JFrame implements ActionListener 
{
    //set the class level variables 
    JLabel phrase = new JLabel(" ");
    JLabel newPhrase = new JLabel(" ");
    JButton button = new JButton("Click");
    JPanel panel = new JPanel();
    Container con = getContentPane();//get the content pane

    Font font = new Font("Bopee", Font.BOLD, 20);//assign font 
    int count = 0;//count to control the number  of clicks 

    public JChangeSizeAndColor2() 
    {
        super("Size and Color");
        //add panel and title to the container 
        //set the layout
        panel.setLayout(new GridLayout(0, 2));
        panel.add(phrase);
        panel.add(newPhrase);

        con.setLayout(new GridLayout(3, 1));
        //add the button and panels plus the action listener to listen to the events 
        con.add(button);
        con.add(panel);
       
        button.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent e) 
    {
         count++;//increment the counter on button click
        if (e.getSource() == button)
        {
            if (count %2 == 0) 
            {
                //on even clicks 
                phrase.setText("I love Java Lang!");
                newPhrase.setText(" ");
                phrase.setForeground(Color.magenta);
                return;
            }   
        
            else if (count %2 == 1) 
            {
                //on odd clicks 
                phrase.setText("");
                newPhrase.setText("C++, Python,C Luv u Too");
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
        JChangeSizeAndColor2 frame = new JChangeSizeAndColor2();
        frame.setSize(WIDTH, HEIGHT);
        //make the frame visible 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}