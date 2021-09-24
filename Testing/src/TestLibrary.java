import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestLibrary {
	
	private static Member mbr;
	private static Book bk;
	
	@BeforeAll
	public static void setup() {
		mbr = new Member("Polo");
		bk  = new Book("The Alchemist");
	}
	
	@Test
	@Order(1)
	public void testIssueBook() throws LibraryException {
		bk.issueBook(mbr);
	}
	
	@Test
	@Order(2)
	public void testReissueBook() throws LibraryException {
		assertThrows(LibraryException.class, () -> bk.issueBook(mbr));
	}
	
	@Test
//	@Ignore
	@Order(3)
	public void testReturnBook() throws LibraryException {
		bk.returnBook(mbr);
	}
	
	@Test
	@Order(4)
	public void testRereturnBook() {
		assertThrows(LibraryException.class, () -> bk.returnBook(mbr));
	}
	
}
