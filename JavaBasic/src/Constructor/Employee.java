package Constructor;

public class Employee {

	private String name;
	private int id;
	private String Address; // dircct koi aur use nai kar skta

	public Employee(String a, int b, String c) {

		name = a;
		id = b;
		Address = c;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return Address;
	}

}
