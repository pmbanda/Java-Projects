package chapterH;

/*Author:		Peter Eugene Mbanda
 *Date:			4/22/2015
 *Purpose:		Determine college courses 
 */
import java.util.*;
public class InputGrades
{
	public static void main(String[] args)
	{
		//Declare variables 
		Scanner input = new Scanner(System.in);
	 	final int NUM_STUDENTS = 10;
	 	final int COURSE_DATA = 5;
		Student [] pupil = new Student[NUM_STUDENTS];//create the student array
		CollegeCourse [] cc = new CollegeCourse[COURSE_DATA];//create the college course array
		
		int studentID, creditHours;
		String courseID;
		String letterGrade;

		System.out.println();//empty space 
		//user title description 
		System.out.println("Enter Grades For 10 Students Each Partaking 5 Courses ");
		System.out.println();
		
		for ( int x = 0 ; x < NUM_STUDENTS ; ++x ) 
		{
			System.out.print("Enter the student ID for student " + ( x + 1 ) + " >> ");//user prompt
			studentID = input.nextInt();
			pupil[x] = new Student();//initialize the constructor for class
			pupil[x].setStudentID(studentID);//assign value to the student ID array
			input.nextLine();
			System.out.println();

			for ( int y = 0 ; y < COURSE_DATA ; ++y ) //loop 5 times to enter the course details 
			{
				System.out.print("Enter Course ID e.g CIS 210 for course " + ( y + 1) + " >> ");//user prompt
				courseID = input.nextLine();
				cc[y] = new CollegeCourse();//initialize the constructor for class
				cc[y].setCourseID(courseID);//assign value to the array

				System.out.print("Enter the credit hours >> ");//user prompt
				creditHours = input.nextInt();
				cc[y] = new CollegeCourse();//initialize the constructor for class
				cc[y].setCreditHours(creditHours);//assign value to the array
				input.nextLine();

				System.out.print("Enter the grade obtained only A,B,C,D or F >> ");
				letterGrade = input.next();
				input.nextLine();
				cc[y] = new CollegeCourse();//initialize the constructor for class
				cc[y].setLetterGrade(letterGrade);//assign value to the array
				
				System.out.println();
			}
			System.out.println("-----------------------------------------------");
			
			input.close();
		}
	}
}