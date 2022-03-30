import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileDemo {

	public void ReadFromFile(String filepath) throws FileNotFoundException {

		File file = new File(filepath);
		Scanner reader = new Scanner(file);
		while (reader.hasNextLine()) {
			String data = reader.nextLine();
			System.out.println(data);
		}
		reader.close();
	}
}
