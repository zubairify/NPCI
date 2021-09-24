
public class AssertDemo3 {

	public static void main(String[] args) {
		
		int empno = (int)(Math.random() * 99999);
		
		assert empno <= 99999 && empno >= 10000 : "Invalid employee no: " + empno;
		
		System.out.println("Emp No: " + empno);
	}
}
