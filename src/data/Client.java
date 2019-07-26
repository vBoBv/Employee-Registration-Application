package data;

public class Client extends Department{
	
	private int id;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	
	public Client(String deptID, String deptName, int id, String firstName, String lastName, int phoneNumber) {
		super(deptID, deptName);
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

}
