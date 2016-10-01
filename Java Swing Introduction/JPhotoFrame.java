/*Author    Peter Eugene Mbanda
*Date       11/30/2015
*Purpose    Password Application 
*Compilation    javac JPasswordA.java
*Execution      java JpasswordA
*/
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JPhotoFrame extends JFrame implements ItemListener
{
    //class level variables 
    final int BASE_PRICE = 40;
    final int MORE_SUBJECTS = 75;
    final int PET_SUBJECT = 95;
    final int DIFF_LOCATION = 90;
    int total = 0;
    //create jcheck boxex and labels 
    JLabel header = new JLabel("Paula's Portrait ");
    JCheckBox oneSubj = new JCheckBox("One Subjcet");
    JCheckBox multipleSubjs = new JCheckBox("Multiple Subjcet");
    JCheckBox studio = new JCheckBox("Studio");
    JCheckBox differentLocation = new JCheckBox("Different Location");
    JCheckBox pet = new JCheckBox("Pet");
    JLabel finalLabel = new JLabel("");
    //get the current container 
    Container con = getContentPane();
    
    public JPhotoFrame()
    {
        //set layout
        con.setLayout(new FlowLayout());
        con.add(header);
        header.setFont(new Font("Monaco", Font.BOLD + Font.ITALIC, 28));
        //add checkboxes to container 
        con.add(oneSubj);
        con.add(multipleSubjs);
        con.add(studio);
        con.add(differentLocation);
        con.add(pet);
        //add item  listener to listen to the events
        oneSubj.addItemListener(this);
        multipleSubjs.addItemListener(this);
        differentLocation.addItemListener(this);
        studio.addItemListener(this);
        pet.addItemListener(this);
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
        
        if( obj.equals(multipleSubjs))
        {
            //event change when park object is selected 
            if( numS == ItemEvent.SELECTED)
                total += MORE_SUBJECTS;
            else if ( numS == ItemEvent.DESELECTED)
                total -= MORE_SUBJECTS;
        }
        if( obj.equals(pet))
        {
            //event change when park object is selected 
            if( numS == ItemEvent.SELECTED)
                total += PET_SUBJECT;
            else if ( numS == ItemEvent.DESELECTED)
                total -= PET_SUBJECT;
        }
         if( obj.equals(differentLocation))
        {
            //event change when park object is selected 
            if( numS == ItemEvent.SELECTED)
                total += DIFF_LOCATION;
            else if ( numS == ItemEvent.DESELECTED)
                total -= DIFF_LOCATION;
        }
         //display the total prize and add to the jframe 
        finalLabel.setText("Total is $" + ( total + BASE_PRICE));
        finalLabel.setFont(new Font("Monaco",Font.BOLD, 18));
        finalLabel.setForeground(Color.red);
        con.add(finalLabel);
    }
    public static void main(String[] args) 
    {
        //length and width of the frame 
        final int WIDTH = 270;
        final int HEIGHT = 200;
        JPhotoFrame photo = new JPhotoFrame();
        photo.setDefaultCloseOperation(EXIT_ON_CLOSE);
        photo.setSize(WIDTH, HEIGHT);
        //make the frame visible 
        photo.setVisible(true);
    }
}
