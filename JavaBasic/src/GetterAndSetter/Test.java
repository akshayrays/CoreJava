package GetterAndSetter;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		 String s = "11/12/13";
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		 Date d = sdf.parse(s);
		 

		
//		Person p1 = new Person();
		p1.setName("Akshay");
		p1.setAddress("indore");
		p1.setAge(21);
		p1.setDob(d);
		
		
		Account a1 = new Account();
		a1.setNumber(2);
		a1.setAccountType("Saving Account");
		a1.setBalance(100.0);
		
		Automoblie am = new Automoblie();
		am.setColor("Red");
		am.setSpeed(120);
		am.setMake("m");
		am.setGears(5);
		
		
		
		
		System.out.println(p1.getName());
		System.out.println(p1.getAddress());
		System.out.println(p1.getAge());
		System.out.println(p1.getDob());
		
		System.out.println(a1.getNumber());
		System.out.println(a1.getAccountType());
		System.out.println(a1.getBalance());
		
		System.out.println(am.getColor());
		System.out.println(am.getSpeed());
		System.out.println(am.getMake());
		System.out.println(am.getGears());
		
	}

}
