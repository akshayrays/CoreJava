package IO_Ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Copy {

	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("C://Users//ABHISHEK//Desktop//html//h/hello.txt");
		FileWriter writer = new FileWriter("C:\\Users\\ABHISHEK\\Desktop\\html\\h\\hellooo.txt");

		int ch = reader.read();
		while (ch!=-1) {
			writer.write(ch);
			ch=reader.read();
			
			
		}
		writer.close();
		reader.close();
		System.out.println("copy ho gaya hai");
	}

}
