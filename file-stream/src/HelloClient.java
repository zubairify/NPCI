import java.io.InputStream;
import java.net.Socket;

public class HelloClient {
	public static void main(String[] args) throws Exception {
		Socket client = new Socket("localhost", 12345);
		byte[] bar = new byte[50];
		
		InputStream istream = client.getInputStream();
		istream.read(bar);
		String msg = new String(bar).trim();
		
		System.out.println("Server: " + msg);
	}
}
