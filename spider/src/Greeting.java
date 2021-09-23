
@FunctionalInterface
public interface Greeting {
	
	String sayHello();
	
	default String sayBye() {
		System.out.println(sayHello());
		return "Goodbye SAM";
	}
	
	static void greet() {
		System.out.println("Bonjour le Monde!");
	}
}
