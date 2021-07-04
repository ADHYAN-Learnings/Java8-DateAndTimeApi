package dateAndTime;

import java.time.*;

public class ZoneIdDateAndTimeTest {
	public static void main(String[] args) {
		    
		ZoneId zoneId =  ZoneId.of("Asia/Singapore");
		ZonedDateTime   singaporeZone =  ZonedDateTime.now(zoneId);
		
		System.out.println(" singaporeZone  : "+singaporeZone);
	}
}
