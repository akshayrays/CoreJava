package IO_Ex;

import java.io.File;

public class Test {

	public static void main(String[] args) {

		File Fw = new File("C:\\Users\\ABHISHEK\\Desktop\\html\\h");
		
		String [] list = Fw.list();
		
		for (int i = 0; i < list.length; i++) {
		System.out.println((i+1) + " : " + list [i]);
			
		}
	}

}
