import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

	public static void main(String[] args) {
		
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		
		LocalTime t2 = LocalTime.of(14, 25);
		System.out.println(t2);
		
		LocalTime t3 = LocalTime.parse("09:45");
		System.out.println(t3);
		
		System.out.println(t2.getHour());
		System.out.println(t3.plus(2, ChronoUnit.HOURS));
		System.out.println(LocalTime.MAX);
	}
}
