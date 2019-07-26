package data;

public class User extends Client{
	private int userId;
	private String email;
	private String username;
	private String password;

	

	public User(String deptID, String deptName, int id, String firstName, String lastName, int phoneNumber, int userId, String email, String username, String password) {
		super(deptID, deptName, id, firstName, lastName, phoneNumber);
		this.userId = id;
		this.email =  email;
		this.username = username;
		this.password = password;
	}


	public int getUserId() {
		return userId;
	}


	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	
	

}
