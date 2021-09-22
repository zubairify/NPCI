import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		System.out.println("Waiting for client...");
		Socket socket = server.accept();
		
		OutputStream ostream = socket.getOutputStream();
		String msg = "Hello there, welcome to Java.";
		ostream.write(msg.getBytes());
		System.out.println("Writing completed...");
	}
}
