package IO_Ex;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) throws IOException {

		/*
		 * String source = "C:\\IOStreams\\src\\IO_Ex\\t.jpg"; String target =
		 * "C:\\IOStreams\\src\\IO_Ex\\a.jpg";
		 */

		FileInputStream reader = new FileInputStream(
				"C:\\Users\\ABHISHEK\\eclipse-workspace\\Demo\\src\\img\\237465.jpg");
		FileOutputStream writer = new FileOutputStream("C:\\Users\\ABHISHEK\\eclipse-workspace\\Demo\\src\\img\\a.jpg");

		int ch = reader.read();
		while (ch != -1) {
			writer.write(ch);
			ch = reader.read();

		}
		writer.close();
		reader.close();
		System.out.println("copy ho gaya img");

	}

}
