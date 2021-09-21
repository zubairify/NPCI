import com.npci.emp.Employee;
import com.npci.emp.Executive;
import com.npci.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		Manager mgr = new Manager("Mili", 5000, 2000);
		Executive exec = new Executive("Leo", 4000, 1200);
		
		Employee emp = mgr;
		emp.payslip();
		
		showSalary(mgr);
		showSalary(exec);
	}

	private static void showSalary(Employee emp) {
		if(emp instanceof Manager)
			System.out.println("Manager Salary: " + emp.getSalary());
		else
			System.out.println("Executive Salary: " + emp.getSalary());
	}
	
//	private static void showSalary(Executive exec) {
//		System.out.println("Executive Salary: " + exec.getSalary());
//	}
//
//	private static void showSalary(Manager mgr) {
//		System.out.println("Manager Salary: " + mgr.getSalary());
//	}
}
