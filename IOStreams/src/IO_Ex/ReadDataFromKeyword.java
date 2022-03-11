package IO_Ex;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadDataFromKeyword {

	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("C:\\Users\\ABHISHEK\\Desktop\\html\\h/hello.txt");
		PrintWriter printwriter = new PrintWriter(writer);
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);

		String line = in.readLine();

		while (!line.equals("katam")) {

			printwriter.print(line);
			line = in.readLine();
		}
		printwriter.close();
		isReader.close();
System.out.println("hogya");
	}

}
