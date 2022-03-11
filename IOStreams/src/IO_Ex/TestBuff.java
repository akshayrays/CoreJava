package IO_Ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class TestBuff {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("C://Users//ABHISHEK//Desktop//html//h/hello.txt");
		BufferedReader bw = new BufferedReader(reader);

		String line = bw.readLine();
		
		while (line !=null) {
			System.out.println(line);
			line=bw.readLine();
			
		}
		reader.close();
	}

}
