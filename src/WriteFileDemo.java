import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {

	public void WriteToFile(String filepath, String text) throws IOException {
		
		File file = new File(filepath);		
		FileWriter myWriter = new FileWriter(file);
		myWriter.write(text);
		myWriter.close();
		System.out.println("Successfully wrote to the file.");
	}
	
	
}
