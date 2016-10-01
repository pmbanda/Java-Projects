package chapterD;
//Author:	Petet Eugene Mbanda
//Date:		2/11/2015
//purpose:	compute the length of time between now and end year

import java.util.*;//import the whole util package 

public class YearEnd 
{
	public static void main(String[] args) 
	{
		//declare the method variables 
		long todayTimeMillis;
		Long endYearTimeMillis;
		long differenceMillis;
		long totalSeconds;
		int currentSeconds;
		final int DAY_SECONDS = ( 24 * 60 * 60 ) ;//declare variable for number of seconds in a day 
		int calcDuration;


		/*
		*Create method todays date and 
		*also initialize end of year date 
		*/
		GregorianCalendar calendar = new GregorianCalendar();
		GregorianCalendar calendar1 = new GregorianCalendar( 2015 , 11 , 31 );

		todayTimeMillis = calendar.getTimeInMillis();//get time in milliseconds for todays date 
		endYearTimeMillis = calendar1.getTimeInMillis();//get time in milliseconds for end years date  

		differenceMillis = endYearTimeMillis - todayTimeMillis ; //get difference between the two times

		totalSeconds = differenceMillis;//get the total number of seconds 
		currentSeconds = (int)(totalSeconds / 1000.00 );//get the current second

		calcDuration = (int)( currentSeconds / DAY_SECONDS ) ; //obtain the number of days 
		/*
		*Determine if the remainder is greater than five or inclusive 
		*if so add one to the variable else do not add
		*/
		if ( (currentSeconds % DAY_SECONDS) >= 5 )
		{
			calcDuration += 1;
		}
		else
		{
			calcDuration += 0;
		}
		//display the results on console
		System.out.println();
		System.out.println("Number of days between today and end year is " + calcDuration );

	}
}