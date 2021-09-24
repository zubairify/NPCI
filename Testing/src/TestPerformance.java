import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TestPerformance {

	@Test
	@Timeout(unit = TimeUnit.MILLISECONDS, value = 100)
	public void testTimeout() throws InterruptedException {
		Thread.sleep(10);
	}
	
	@Test
	public void testAssertTimeout() {
		assertTimeout(Duration.ofMillis(100), () -> Thread.sleep(99));
	}
}
