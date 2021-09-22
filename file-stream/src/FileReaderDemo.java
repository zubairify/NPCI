import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) {
		String path = "/Volumes/KB/Demo/song.txt";
		BufferedReader reader = null;
		
		try {
			FileReader fr = new FileReader(path);
			reader = new BufferedReader(fr);
			String line = null;
			while(true) {
				line = reader.readLine();
				if(line == null)
					break;
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
