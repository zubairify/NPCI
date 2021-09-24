import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStreamDemo {
	
	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		
		Integer[] ar = {2,5,7,6,9,3,2,4};
		List<Integer> numbers = Arrays.asList(ar);
		
//		numbers.forEach(System.out::println);
//		numbers.forEach(FirstStreamDemo::print);
		
//		Stream<Integer> str1 = numbers.stream();
//		str1.forEach(System.out::println);	// Terminal task is performed
//		
//		str1.forEach(System.out::println);	// stream is already closed
		
//		numbers.stream().forEach(System.out::println);
		
		// distinct() is intermediate operation, it doesn't close the stream
//		numbers.stream().distinct().forEach(System.out::println);
		
//		System.out.println(numbers.stream().distinct().count());
		
		Stream<Integer> str2 = numbers.stream().filter(n -> n>=5);
//		str2.forEach(System.out::println);
		
//		numbers.stream().limit(4).forEach(FirstStreamDemo::print);
		
//		numbers.stream().distinct().sorted().forEach(FirstStreamDemo::print);
//		
//		System.out.println(numbers.stream().reduce(0, (a,b) -> a+b));
//		System.out.println(numbers.stream().distinct().reduce(0, Integer::sum));
//		
//		System.out.println(IntStream.range(1, 99).count());
//		System.out.println(IntStream.range(1, 99).sum());
//		System.out.println(IntStream.range(1, 99).skip(5).count());
//		
//		System.out.println(IntStream.of(2,5,4,6,8,3).count());
		
		IntSummaryStatistics statics = IntStream.of(2,5,4,6,8,3).summaryStatistics();
		System.out.println(statics);
	}
}
