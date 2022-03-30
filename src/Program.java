import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		WriteFileDemo w = new WriteFileDemo();
		ReadFileDemo r = new ReadFileDemo();
		
		try {
			
			w.WriteToFile("Testfile.txt", "Files in Java might be tricky, but it is fun enough!");
		
			r.ReadFromFile("TestFile.txt");			
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
