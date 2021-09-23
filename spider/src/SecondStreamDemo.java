import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SecondStreamDemo {

	public static void main(String[] args) {
		
//		String[] fruits = {"Cherry", "Mango", "Grapes", "Papaya", "Apple", "Banana", "Kiwi", "Fig"};
//		List<String> basket = Arrays.asList(fruits);
		
		List<String> basket = Arrays.asList("Cherry", "Mango", "Grapes", "Papaya", "Apple", "Banana", "Kiwi", "Fig");
//		basket.forEach(System.out::println);
		
//		basket.stream().sorted().forEach(System.out::println);
		
//		basket.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
		
		basket.stream().filter(s -> s.contains("a")).forEach(System.out::println);
		
		System.out.println(basket.stream().filter(s -> s.contains("p")).count());
		
		Stream.of("Jim", "Anna", "Bret", "Sean").sorted().forEach(System.out::println);
	}
}
