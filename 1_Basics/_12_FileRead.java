
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _12_FileRead {

	// there are 3 popular ways to read from a file in Java:

	// 1. BufferedReader + FileReader : best for reading text files line by line
	// - bufferedreader - middleman between file and program, it reads text from a
	// character-input stream
	// - fileReader - reads characters from a file
	// - it has methods like readLine(), read(), close()

	// 2. FileInputStream : best for reading binary files like images or audio files

	// 3. RandomAccessFile : best for reading and writing files at specific
	// positions of a large file

	public static void main(String[] args) {
		// Example for BufferedReader + FileReader
		// bufferedReader takes a reader object as a parameter, which can be a
		// FileReader, InputStreamReader, or any other Reader object

		String filePath = "D:\\Learn\\Java\\1_Basics\\Files\\output.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file: " + e.getMessage());
		}
		System.out.println("File reading completed.");
	}
}