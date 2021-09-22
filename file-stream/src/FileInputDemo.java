import java.io.FileInputStream;
import java.io.IOException;

public class FileInputDemo {
	public static void main(String[] args) {
		String path = "/Volumes/KB/Demo/temp.txt";
		FileInputStream istream = null;
		int c = 0;
		
		try {
			istream = new FileInputStream(path);
			byte[] bar = new byte[istream.available()];
			istream.read(bar);
			String s = new String(bar);
			System.out.println(s);
			
//			while(true) {
//				c = istream.read();
//				if(c == -1)	// end of file
//					break;
//				System.out.print((char)c);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(istream != null)
					istream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
