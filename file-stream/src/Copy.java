import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		try {
			inFile = new FileInputStream("ms.exe");//21 MB approx
			outFile = new FileOutputStream("newms.exe");
			int ch = 0;
			long ms1 = System.currentTimeMillis();
			while(true) {
				ch = inFile.read();
				if(ch == -1) break;
				outFile.write(ch);
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File copied successfully in "+(ms2-ms1)+" ms");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				inFile.close();
				outFile.close();
			} catch(Exception e) { }
		}
	}
}
