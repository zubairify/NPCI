import java.util.Scanner;

public class MenuDemo {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int option = 0;
		
		while(true) {
			System.out.println("1-Add");
			System.out.println("2-Update");
			System.out.println("3-Delete");
			System.out.println("4-List");
			System.out.println("5-Exit");
			System.out.print("Select: ");
			option = console.nextInt();
			
			switch(option) {
			case 1 : System.out.println("Add Selected!"); break;
			case 2 : System.out.println("Update Selected!"); break;
			case 3 : System.out.println("Delete Selected!"); break;
			case 4 : System.out.println("List Selected!"); break;
			case 5 : System.exit(0);
			default : System.out.println("Invalid Option!");
			}
		}
	}
}
