/*Author:       Peter Eugene Mbanda
 *Date:         10/26/2015
 *Purpose:      Vacation Rentals 
 *compilation   javac JVacationRental.java
 *execution     java JVacationRental
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JVacationRental extends JFrame implements ItemListener
{   
    //create the class level variables 
        int total = 0;
        final int WIDTH = 270;
        final int HEIGHT = 200;
        final int PARK_PRICE = 600;
        final int POOL_PRICE = 750;
        final int LAKE_PRICE = 825;
        
        //initialize the checkboxes and labels 
        JCheckBox park = new JCheckBox("Parkside");
        JCheckBox pool = new JCheckBox("Poolside");
        JCheckBox lake = new JCheckBox("Lakeside");
        JCheckBox oneBed = new JCheckBox("One Bed");
        JCheckBox twoBed = new JCheckBox("Two Bed");
        JCheckBox threeBed = new JCheckBox("Three Bed");
        JLabel roomLabel = new JLabel("Select number of rooms ");
        JCheckBox yes = new JCheckBox("Yes");
        JCheckBox no = new JCheckBox("No");
        JLabel mealLabel = new JLabel("Include Meals");
        JLabel finalLabel = new JLabel("");
        
        @SuppressWarnings("LeakingThisInConstructor")
    public JVacationRental()
    {
        super("Vacation Rentals");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        
        //add items to the jframe 
        add(park);
        add(pool);
        add(lake);
        add(roomLabel);
        roomLabel.setFont(new Font("Monaco",Font.BOLD, 18));
        add(oneBed);
        add(twoBed);
        add(threeBed);
        add(mealLabel);
        add(yes);
        add(no);
        
        //add item listeners to listen to events performed on the check boxes 
        park.addItemListener(this);
        pool.addItemListener(this);
        lake.addItemListener(this);
        yes.addItemListener(this);
        oneBed.addItemListener(this);
        twoBed.addItemListener(this);
        threeBed.addItemListener(this);
      
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
        
        if( obj.equals(park))
        {
            //event change when park object is selected 
            if( numS == ItemEvent.SELECTED)
                total += PARK_PRICE;
            else if ( numS == ItemEvent.DESELECTED)
                total -= PARK_PRICE;
        }
        else if( obj.equals(pool))
        {
            //event change when pool object is selected 
            if( numS == ItemEvent.SELECTED)
                total += POOL_PRICE;
            else if ( numS == ItemEvent.DESELECTED)
                total -= POOL_PRICE;
        }
        else if( obj.equals(lake))
        {
            //event change when lake object is selected 
            if( numS == ItemEvent.SELECTED)
                total += LAKE_PRICE;
            else if ( numS == ItemEvent.DESELECTED)
                total -= LAKE_PRICE;
        }
        else if (obj.equals(yes))
        {
            //event change when yes object is selected 
            if( numS == ItemEvent.SELECTED)
                total += 200;
            else if( numS == ItemEvent.DESELECTED)
                total -= 200;
        }
        else if (obj.equals(twoBed))
        {
            //event change when two bedroom object is selected 
            if( numS == ItemEvent.SELECTED)
                total += 75;
            else if( numS == ItemEvent.DESELECTED)
                total -= 75;
        }
        else if (obj.equals(threeBed))
        {
            //event change when three bedroom object is selected 
            if( numS == ItemEvent.SELECTED)
                total += ( 75 * 2 );
            else if( numS == ItemEvent.DESELECTED)
                total -= ( 75 * 2 );
        }
        
        //display the total prize and add to the jframe 
        finalLabel.setText("Total is $" + total);
        finalLabel.setFont(new Font("Monaco",Font.BOLD, 18));
        finalLabel.setForeground(Color.red);
        add(finalLabel);
    }
   
    public static void main(String[] args) 
    {
        //main method to instantiate the class vacation 
        JVacationRental vac = new JVacationRental();
        vac.setVisible(true);
    }
    
}
