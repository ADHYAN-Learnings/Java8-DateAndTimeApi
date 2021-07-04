package dateAndTime;

import java.time.*;

public class DateAndTimeTest {
	public static void main(String[] args) {
		
	  LocalDateTime  todayDateTime = LocalDateTime.now();
	  
	   int day      = todayDateTime.getDayOfMonth();
	   int month    = todayDateTime.getMonthValue();
	   int year     = todayDateTime.getYear();
	   
	   int hour     = todayDateTime.getHour();
	   int minute   = todayDateTime.getMinute();
	   int second   = todayDateTime.getSecond();
	   int nano     = todayDateTime.getNano();
	   
	   String dateAndTime = day+"/"+month+"/"+year+" Time "+hour+":"+minute+":"+second+":"+nano;
	   
	   System.out.println(dateAndTime);
	  
	}
}
