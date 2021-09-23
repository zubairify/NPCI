import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		
		String name = "";
		String namePattern = "[A-Z][a-z]{3,}";
		do {
			System.out.print("Enter Name: ");
			name = console.next();
		} while (!name.matches(namePattern));

		System.out.print("Enter Mobile: ");
		String mobile = console.next();

		System.out.print("Enter Age: ");
		int age = console.nextInt();

	}
}
