import java.io.FileWriter;
import java.io.IOException;

public class _11_FileWrite {

	// there are many ways to write to a file in Java, most popular are:
	
	// 1. FileWriter - good for small or medium size files, not efficient for large
	// files
	// - it writes characters to the file, not bytes
	// - it can overwrite existing content or append to it
	// - it is not buffered, so it writes directly to the file
	// - example: FileWriter writer = new FileWriter("file.txt", true); // true for
	// append mode

	// 2. BufferedWriter - better for larger files, it buffers the output
	// - it uses a buffer to store characters before writing them to the file
	// - it is more efficient than FileWriter for large files
	// - example: BufferedWriter writer = new BufferedWriter(new
	// FileWriter("file.txt", true));
	// - it has methods like write(), newLine(), flush(), close()
	// - it can also be used with try-with-resources for automatic resource
	// management
	// - example: try (BufferedWriter writer = new BufferedWriter(new
	// FileWriter("file.txt", true))) { ... }

	// 3. PrintWriter - better for structed data, like reports or logs
	// - it provides methods like print(), println(), printf() for formatted output
	// - it can write strings, characters, numbers, and objects
	// - it can also be used with try-with-resources for automatic resource
	// management
	// - example: try (PrintWriter writer = new PrintWriter(new
	// FileWriter("file.txt", true))) { ... }
	// - it can also be used to write to other output streams like sockets or
	// console

	// 4. FileOutputStream - best for binary files like images or audio files
	// - it writes bytes to the file, not characters
	// - it is not buffered, so it writes directly to the file
	// - it can overwrite existing content or append to it
	// - example: FileOutputStream fos = new FileOutputStream("file.txt", true); //
	// true for append mode
	// - it has methods like write(), flush(), close()
	// - it can also be used with try-with-resources for automatic resource
	// management
	// - example: try (FileOutputStream fos = new FileOutputStream("file.txt",
	// true)) { ... }

	public static void main(String[] args) {

		// Example for FileWriter
		
		// parameters:
		// 1. file name - the name of the file to write to, can be absolute or relative path
		// 2. append mode - if true, it will append to the file, if false, it will overwrite the file, default is false
		// 3. charset - the character encoding to use, default is UTF-8
		// 4. buffer size - the size of the buffer to use, default is 8192 bytes
		// 5. file permissions - the permissions to set for the file, default is read and write
		// 6. file attributes - additional attributes to set for the file, default is none

		try (FileWriter writer = new FileWriter("output.txt")) {
			writer.write("Hello, World!\n");
			writer.write("This is a test file.\n");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file: " + e.getMessage());
		}
		System.out.println("File written successfully.");

		// Absolute path example
		// Note: Use double backslashes (\\) in the path for Windows or single forward		
		String absolutePath = "D:\\Learn\\Java\\1_Basics\\Files\\output.txt";

		try (FileWriter writer = new FileWriter(absolutePath, true)) { // true for append mode
			writer.write("Appending more text to the file.\n");
			writer.write("This is another line.\n");
		} catch (IOException e) {
		}
		// Note: Always close the FileWriter to release system resources
		// This is done automatically with try-with-resources
	}
}
