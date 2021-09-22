import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		String path = "/Volumes/KB/Demo/demo.txt";
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter(path, true));
			writer.write("We got a little world of out own");
			writer.newLine();
			writer.write("I let you in where no one else goes");
			writer.newLine();
			System.out.println("Writing completed..");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
