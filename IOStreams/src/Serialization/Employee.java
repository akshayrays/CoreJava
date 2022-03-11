package Serialization;

import java.io.Serializable;

public class Employee<Address> implements Serializable {
	private int id;
	private String firstName;
	private String lastName;
	private Address add;
	private transient String tempValue;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
