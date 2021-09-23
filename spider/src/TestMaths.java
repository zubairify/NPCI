import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestMaths {
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		
//		Maths m = (x) -> x>=0;
//		
//		System.out.println(m.isPositive(10));
//		System.out.println(m.isPositive(-4));
		
		Maths m1 = (s) -> System.out.println(s);
		m1.print("Hello");
		
		Maths m2 = System.out::println;	// Method reference
		m2.print("Bonjour");
		
		Consumer<String> c1 = TestMaths::print;
		c1.accept("Hola");
		
		Supplier<String> s1 = () -> "Namaste";
		System.out.println(s1.get());
		
		Predicate<Integer> p1 = (x) -> x>=0;
		System.out.println(p1.test(9));
		
		Predicate<Integer> p2 = (x) -> x%2==0;
		System.out.println(p2.test(7));
		
		Function<Integer, Integer> f1 = (x) -> x*x;
		System.out.println(f1.apply(10));
	}
}
