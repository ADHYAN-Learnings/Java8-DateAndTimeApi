package dateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDateAndTimeTest {
	public static void main(String[] args) {
		
		LocalDate oldDate = LocalDate.of(1990, 05, 25);
		LocalDate todayDate = LocalDate.now();
		
		 Period age = Period.between(oldDate, todayDate);
		 
		 String gap = age.getYears()+":"+age.getMonths()+":"+age.getDays();
		 
	}
}
