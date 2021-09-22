import java.io.File;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) {
		String path = "/Volumes/KB/Demo";
		File file = new File(path);

		if (file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getPath());
			System.out.println(file.getParent());

			if (file.isFile()) {
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
				System.out.println(file.isHidden());
				System.out.println(file.length());
				System.out.println(new Date(file.lastModified()));
			} else {
				System.out.println("Content of directory");
				File[] content = file.listFiles();
				for (File f : content) {
					System.out.println(f.isFile() ? "File: " + f.getPath():"Directory: " + f.getPath());
				}
			}
		} else {
			System.out.println("File doesn't exist");
		}
	}
}
