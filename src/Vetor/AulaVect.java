package Vetor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class AulaVect {

	public static void main(String[] args) throws ParseException{
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//sdf3.setTimezone(TimeZone.getTimeZone("GMT"));
		
		
		Date x1 = new Date();
		
		Date y1 = sdf1.parse("25/06/2021");
		Date y2 = sdf2.parse("25/06/2021 15:09:15");
		Date y3 =Date.from(Instant.parse("2021-06-25T15:42:07z"));
		
		
		
		System.out.println("x1: " +sdf1.format(x1));
		System.out.println("x1: " +sdf2.format(x1));
		System.out.println("y2: " +sdf2.format(y2));
		System.out.println("y3: " +sdf2.format(y3));
		
	}

}
