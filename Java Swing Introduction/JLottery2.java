/*Author    Peter Eugene Mbanda
*Date       11/30/2015
*Purpose    Password Application 
*Compilation    javac Lottery2.java
*Execution      java Lottery2
*/
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLottery2 extends JFrame implements ItemListener
{
    int count = 0;
    Random r = new Random();//random number instance
    //assign random numbers between 1 and 30 for the winning number in an array containing six elements 
    int winningNumber[] = {r.nextInt(30),r.nextInt(30),r.nextInt(30),r.nextInt(30),r.nextInt(30),r.nextInt(30)};
    //create labels and check boxes
    JCheckBox cb1= new JCheckBox("Generate num1 ");
    JLabel label1= new JLabel("");
    JCheckBox cb2 = new JCheckBox("Generate num2 ");
    JLabel label2= new JLabel("");
    JCheckBox cb3 = new JCheckBox("Generate num3 ");
    JLabel label3= new JLabel("");
    JCheckBox cb4 = new JCheckBox("Generate num4 ");
    JLabel label4= new JLabel("");
    JCheckBox cb5 = new JCheckBox("Generate num5 ");
    JLabel label5= new JLabel("");
    JCheckBox cb6 = new JCheckBox("Generate num6 ");
    JLabel label6= new JLabel("");
    JLabel lotteryNum = new JLabel("Lottery Numbers Generated ");
    //obtain the container 
    Container con = getContentPane();
    JLabel money = new JLabel("");
    //array list to store the values 
    ArrayList<String> al = new ArrayList<String>();
    public JLottery2()
    {
        //set flow layout on canvas
        super("Lottery Game");
        con.setLayout(new FlowLayout());
        con.add( cb1 );
        con.add( cb2 );
        con.add( cb3 );
        con.add( cb4 );
        con.add( cb5 );
        con.add( cb6 );
        //add itemlistener to the check boxes
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        cb5.addItemListener(this);
        cb6.addItemListener(this);
        con.add(lotteryNum);
        lotteryNum.setFont(new Font("Monaco",Font.BOLD, 18));
        //ass the labels 
        con.add(label1);
        con.add(label2);
        con.add(label3);
        con.add(label4);
        con.add(label5);
        con.add(label6);
        con.add(money);
    }
    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        //obtain the object causing the action
        Object source = e.getSource();
        int select = e.getStateChange();
        
        /*if the box is checked genarate a random number and assign
        *it to the label else assign the number 0 
        */
        if (source == cb1 )
        {
            String numString1;
            int num = 0;
            if( select == ItemEvent.SELECTED)
            {
                num = r.nextInt(31);
                numString1 = Integer.toString(num);
                label1.setText(numString1);
                label1.setForeground(Color.red);
            }
            else  if( select == ItemEvent.DESELECTED)
            {
                num = 0;
                numString1 = Integer.toString(num);
                label1.setText(numString1);
                label1.setForeground(Color.red);
            }
            //add the integer to the arraylist 
            al.add(Integer.toString(num));
        }
        /*if the box is checked genarate a random number and assign
        *it to the label else assign the number 0 
        */
        if (source == cb2 )
        {
            String numString1;
            int num = 0;
            if( select == ItemEvent.SELECTED)
            {
                num = r.nextInt(31);
                String numString2 = Integer.toString(num);
                label2.setText(numString2);
                label2.setForeground(Color.red);
            }
            else  if( select == ItemEvent.DESELECTED)
            {
                num = 0;
                String numString2 = Integer.toString(num);
                label2.setText(numString2);
                label2.setForeground(Color.red);
            }
            //add the integer to the arraylist 
            al.add(Integer.toString(num));
        }
        /*if the box is checked genarate a random number and assign
        *it to the label else assign the number 0 
        */
        if (source == cb3 )
        {
            String numString1;
            int num = 0;
            if( select == ItemEvent.SELECTED)
            {
                num = r.nextInt(31);
                String numString3 = Integer.toString(num);
                label3.setText(numString3);
                label3.setForeground(Color.red);
            }
            else  if( select == ItemEvent.DESELECTED)
            {
                num = 0;
                String numString3 = Integer.toString(num);
                label3.setText(numString3);
                label3.setForeground(Color.red);
            }
            //add the integer to the arraylist 
            al.add(Integer.toString(num));
        }
        /*if the box is checked genarate a random number and assign
        *it to the label else assign the number 0 
        */
        if (source == cb4 )
        {
            String numString1;
            int num = 0;
            if( select == ItemEvent.SELECTED)
            {
                num = r.nextInt(31);
                String numString4 = Integer.toString(num);
                label4.setText(numString4);
                label4.setForeground(Color.red);
            }
            else  if( select == ItemEvent.DESELECTED)
            {
                num = 0;
                String numString4 = Integer.toString(num);
                label4.setText(numString4);
                label4.setForeground(Color.red);
            }
            //add the integer to the arraylist 
            al.add(Integer.toString(num));
        }
        /*if the box is checked genarate a random number and assign
        *it to the label else assign the number 0 
        */
        if (source == cb5 )
        {
            String numString1;
            int num = 0;
            if( select == ItemEvent.SELECTED)
            {
                num = r.nextInt(31);
                String numString5 = Integer.toString(num);
                label5.setText(numString5);
                label5.setForeground(Color.red);
            }
            else  if( select == ItemEvent.DESELECTED)
            {
                num = 0;
                String numString5 = Integer.toString(num);
                label5.setText(numString5);
                label5.setForeground(Color.red);
            }
            //add the integer to the arraylist 
            al.add(Integer.toString(num));
        }
        /*if the box is checked genarate a random number and assign
        *it to the label else assign the number 0 
        */
        if (source == cb6 )
        {
            String numString1;
            int num = 0;
            if( select == ItemEvent.SELECTED)
            {
                num = r.nextInt(31);
                String numString6 = Integer.toString(num);
                label6.setText(numString6);
                label6.setForeground(Color.red);
            }
            else  if( select == ItemEvent.DESELECTED)
            {
                num = 0;
                String numString6 = Integer.toString(num);
                label6.setText(numString6);
                label6.setForeground(Color.red);
            }
            //add the integer to the arraylist 
            al.add(Integer.toString(num));
        }
        int matches = checkWinner(al);//method to check if the numbers match
        //if a match is found based on the count assign the 
        //einning amount based on the count found
        switch(matches)
        {
            case 0:
            case 1:
            case 2:
                money.setText("Amount won $" + 0);
                con.add(money);
                break;
            case 3:
                money.setText("Amount won $" + 100);
                con.add(money);
                break;
            case 4:
                money.setText("Amount won $" + 10000);
                con.add(money);
                break;
            case 5:  
                money.setText("Amount won $" + 50000);
                con.add(money);
                break;
            case 6:  
                money.setText("Amount won $" + 1000000);
                con.add(money);
                break;   
        }
    }
    public int checkWinner(ArrayList<String> list)
    {
        //check if the winning number is contained in the array 
        //of the random lottery numbers genetated
        int totalCount = 0;
        for( int i = 0; i < winningNumber.length ; ++i)
        {
             if( list.contains(Integer.toString(winningNumber[i])))
                     ++count;//increment the count if the number is found
        }
        totalCount = count;
        return totalCount;//return the value to the calling method 
    }
    public static void main(String[] args) 
    {
        //assign the width and the height to the object
        final int WIDTH = 800;
        final int HEIGHT = 200;
        //make the class instance 
        JLottery2 game = new JLottery2();
        game.setSize(WIDTH, HEIGHT);
        //create a defalt close to close the frame
        game.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //make the frame visible
        game.setVisible(true);
    }
}
