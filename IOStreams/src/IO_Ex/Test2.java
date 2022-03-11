package IO_Ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("C://Users//ABHISHEK//Desktop//html//h/hello.txt");
		int ch = reader.read();
		//char chr = 0 ;
		
		while (ch!=-1) {
			char chr=(char)ch;
			System.out.print(chr);
			ch=reader.read();
			
		}
		
		
	}

}
