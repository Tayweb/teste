package DatecomCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class dataCalendar {

	public static void main(String[] args)throws ParseException {
		
		Scanner sc= new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d= Date.from(Instant.parse("2021-06-25T15:42:07z"));
		
		System.out.println(sdf.format(d));

		Calendar cal =Calendar.getInstance();
		cal.setTime(d);
		/*cal.add(Calendar.HOUR_OF_DAY, 4);
		d=cal.getTime();
		*/
		int minutes = cal.get(Calendar.MINUTE);
		
		System.out.println("Minutos: " + minutes);
	}

}
