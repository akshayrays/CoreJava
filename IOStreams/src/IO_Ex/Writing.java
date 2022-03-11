package IO_Ex;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Writing {

	public static void main(String[] args) throws Exception {

		FileWriter Writer = new FileWriter("C://Users//ABHISHEK//Desktop//html//h/hello.txt", true);
		PrintWriter pw = new PrintWriter(Writer);

		pw.println("akshay");

		pw.close();
		Writer.close();

		System.out.println("intersert");

	}

}
