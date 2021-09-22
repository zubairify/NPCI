import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		System.out.println("Enter Name: ");
		Scanner console = new Scanner(System.in);
		String name = console.nextLine();
		System.out.println("Name: " + name);
		
		System.out.println("Enter Age: " );
		int age = console.nextInt();
		System.out.println("Age: " + age);
	}
}
