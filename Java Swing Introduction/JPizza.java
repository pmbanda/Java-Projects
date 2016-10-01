/*Author:       Peter Eugene Mbanda
 *Date:         10/26/2015
 *Purpose:      Pizza price
 *compilation   javac JPizza.java
 *execution     java JPizza
 */

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
        
public class JPizza extends JFrame implements ItemListener
{
    //declare the class variables 
    int total = 0;
    final int WIDTH = 500;
    final int HEIGHT = 100;
    String[] selection = {"Small","Medium","Large","Extra large"};
    //initialize the checkboxes and label for final prize display 
    JCheckBox onion = new JCheckBox("Onion");
    JCheckBox mushrooms = new JCheckBox("Mushroom");
    JCheckBox cheese = new JCheckBox("Cheeese");
    JCheckBox smallPizza = new JCheckBox("Small");
    JCheckBox mediumPizza = new JCheckBox("Medium");
    JCheckBox largePizza = new JCheckBox("Large");
    JCheckBox extraLargePizza = new JCheckBox("Extra large");
    JLabel lblPizza = new JLabel("");
    //declare the constant prixes for the pizza 
    final int SMALL_PRICE = 7;
    final int MEDIUM_PRICE = 9;
    final int LARGE_PRICE = 11;
    final int EXTRA_LARGE_PRICE = 14;
        
        
    @SuppressWarnings("LeakingThisInConstructor")
    public JPizza()
    {
        super("Pizzeria");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        //assign the checkboxes to the frame 
        add(smallPizza);
        add(mediumPizza);
        add(largePizza);
        add(extraLargePizza);
        add(onion);
        add(mushrooms);
        add(cheese);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//clolses pane on exit 
        //ass item listeners to anticipate for the click events
        smallPizza.addItemListener(this);
        mediumPizza.addItemListener(this);
        largePizza.addItemListener(this);
        extraLargePizza.addItemListener(this);
        onion.addItemListener(this);
        mushrooms.addItemListener(this);
        cheese.addItemListener(this);
        
    }
    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        Object obj = e.getSource();//determine the object selected 
        int numS = e.getStateChange();
        
        /*determine the type of object selected 
        *then determine if the objest is selected or deselected 
        *and add the value to the total or subtract from the total 
        */
        if( obj.equals(smallPizza))
        {
            if( numS == ItemEvent.SELECTED)
                total += SMALL_PRICE;
              else if ( numS == ItemEvent.DESELECTED)
                total -= SMALL_PRICE;
        }
        else if( obj.equals(mediumPizza))
        {
            if( numS == ItemEvent.SELECTED)
                total += MEDIUM_PRICE;
              else if ( numS == ItemEvent.DESELECTED)
                total -= MEDIUM_PRICE;
        }
        else if( obj.equals(largePizza))
        {
            if( numS == ItemEvent.SELECTED)
                total += LARGE_PRICE;
              else if ( numS == ItemEvent.DESELECTED)
                total -= LARGE_PRICE;
        }
        else if( obj.equals(extraLargePizza))
        {
            if( numS == ItemEvent.SELECTED)
                total += EXTRA_LARGE_PRICE;
              else if ( numS == ItemEvent.DESELECTED)
                total -= EXTRA_LARGE_PRICE;
        }
        else if ( obj.equals(onion))
        {
              if( numS == ItemEvent.SELECTED)
                total += 1;
              else if ( numS == ItemEvent.DESELECTED)
                total -= 1;
        }
        else if ( obj.equals(mushrooms))
        {
            if( numS == ItemEvent.SELECTED)
                total += 1;
            else if ( numS == ItemEvent.DESELECTED)
                total -= 1;
        }
        else
            if( numS == ItemEvent.SELECTED)
                total += 0;
            else if ( numS == ItemEvent.DESELECTED)
                total -= 0;
        //display the total prize and add to the jframe 
        lblPizza.setText("Total Prize $" + total);
        lblPizza.setFont(new Font("Monaco",Font.BOLD, 14));
        add(lblPizza);
    }
    
    public static void main(String[] args)
    {   
        //main method to instantiate the class pizza 
        JPizza myPizza = new JPizza();
        myPizza.setVisible(true);
        
    }
}
