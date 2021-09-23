import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(2020, 05, 01);
		System.out.println(d2);
		
		LocalDate d3 = LocalDate.parse("2018-06-14");
		System.out.println(d3);
		
		System.out.println(d1.plusDays(5));
		System.out.println(d2.plusDays(10));
		
		System.out.println(d3.minus(3, ChronoUnit.MONTHS));
		System.out.println(d2.getDayOfWeek());
		System.out.println(d2.isLeapYear());
		
		// Calculate age based on birthdate
		
	}
}
