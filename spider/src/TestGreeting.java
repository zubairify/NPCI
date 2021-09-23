
public class TestGreeting {

	public static void main(String[] args) {
		
		Greeting g1 = () -> "Hello SAM";
		
//		System.out.println(g1.sayHello());
		System.out.println(g1.sayBye());
		
		Greeting g2 = () -> {
			String msg = "Hola SAM";
			return msg;
		};
		
//		System.out.println(g2.sayHello());
		System.out.println(g2.sayBye());
		
		Greeting.greet();
		
	}
}
