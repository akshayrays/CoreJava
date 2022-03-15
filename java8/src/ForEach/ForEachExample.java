package ForEach;

import java.util.ArrayList;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list  = new ArrayList<String>();
		
		list.add("Akshay 305");
		
		list.forEach(lit->System.out.println(list));
		
		for (String s : list) {
			System.out.println(list);
		}
		
		
	}

}
