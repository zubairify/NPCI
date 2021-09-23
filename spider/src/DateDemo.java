import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date dt = new Date();
		System.out.println(dt);
		
		System.out.println(System.currentTimeMillis());
		System.out.println(dt.getTime());
	}
}
