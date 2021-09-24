import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStream {

	public static void main(String[] args) {
		List<Flight> flights = new ArrayList<>();
		
		try {
			Stream<String> lines = Files.lines(Paths.get("src/flights.txt"));
			
			flights = lines.map(l -> {
				String[] a = l.split(",");
				return new Flight(Integer.parseInt(a[0]), a[1], a[2], a[3]);
			}).collect(Collectors.toList());
		} catch(Exception e) {}
		
//		flights.add(new Flight(121, "Indigo", "Mumbai", "Goa"));
//		flights.add(new Flight(319, "Jet", "Chennai", "Hyderabad"));
//		flights.add(new Flight(842, "Jet", "Kochi", "Kolkata"));
//		flights.add(new Flight(920, "Indigo", "Pune", "Delhi"));
		
		flights.forEach(System.out::println);
		
//		System.out.println(flights.stream().filter(f -> 842 == f.getCode()).findFirst().get());
		
		// Print all flights of specific carrier
//		flights.stream().filter(f -> f.getCarrier().equals("Jet")).forEach(System.out::println);
		// Print flights by their route
		
	}
}
