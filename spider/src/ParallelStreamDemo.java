import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		List<Integer> numbers = IntStream.range(1, 1000).boxed().collect(Collectors.toList());
		
		long start = System.currentTimeMillis();
		numbers.stream().forEach(i -> process(i));
		long stop = System.currentTimeMillis();
		System.out.println("Stream: " + (stop-start));
		
		start = System.currentTimeMillis();
		numbers.parallelStream().forEach(i -> process(i));
		stop = System.currentTimeMillis();
		System.out.println("Parallel Stream: " + (stop-start));
	}

	private static void process(int num) {
		try {
			Thread.sleep(1);
		} catch(Exception e) {}
	}
}
