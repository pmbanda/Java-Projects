

/*
*Author:		Peter Eugene Mbanda
*Date:			4/23/2015
*/
import javax.swing.*;

public class StudentIDArray
{	
	public static void main(String[] args) 
	{
		/*
		 * Declare the variables 
		 */
		int totalArrayItems = 10;
		String userInputString;
		int userInput;
		int x;
		boolean check = false;
		String name = " ";
		double grade = 0.0 ;
		
		//Create three parallel arrays for ID name and grade point average for 10 students 
		int []studentIDs = { 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009  };
		String []firstNames =  { "Peter", "Paul", "Mary", "Rachael", "Sandara", "Violet", "Amber", "John", "Sebastian", "Timothy" };
		double []gradeAverages = { 98.50, 68.65, 90.00, 88.00, 66.28, 100.00, 76.46, 54.88, 58.62, 82.56 };

		userInputString = JOptionPane.showInputDialog(null,"Enter the Student ID to determine name and grade? ");//user prompt
		userInput = Integer.parseInt(userInputString);//string entry 

		for ( x = 0 ; x < totalArrayItems  ; ++x  ) 
		{
			if ( userInput == studentIDs[x] )
			{
				check = true;
				JOptionPane.showMessageDialog(null,firstNames[x] + " has grade " + gradeAverages[x] );
				name = firstNames[x];
				grade = gradeAverages[x];  
				x = totalArrayItems;
			}
			
		}

		if ( check )//display the user details if the boolean value is true 
		{
			JOptionPane.showMessageDialog(null, name + " has Grade " + grade );
			System.exit(0);
		}
		else//display the error message if the boolean value is false 
		{
			JOptionPane.showMessageDialog(null,"Error " + userInput + 
				" is an invalid ID \n------------\nID\'s available are between \n1000 upto 1009 inclusive\n------------" ," ERROR MESSAGE "
				, JOptionPane.ERROR_MESSAGE );
				x = totalArrayItems;
		}
		
	}
}