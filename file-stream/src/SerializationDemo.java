import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		Person p = new Person("Polo", 21);
		ObjectOutputStream ostream = null;
		ObjectInputStream istream = null;
		String path = "/Volumes/KB/Demo/pers.dat";
		
		try {
			// Writing object to file: serialization
			ostream = new ObjectOutputStream(new FileOutputStream(path));
			ostream.writeObject(p);
			System.out.println("Person serialized...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ostream != null)
					ostream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			// Reading object from file: Deserialization
			istream = new ObjectInputStream(new FileInputStream(path));
			Object obj = istream.readObject();
			System.out.println(obj);
		} catch (ClassNotFoundException | IOException e) {
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
