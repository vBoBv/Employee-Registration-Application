package data;

public class Department {

	protected String deptID;
	protected String deptName;
	
	public Department(String deptID, String deptName) {
		this.deptID = deptID;
		this.deptName = deptName;
	}

	public String getDeptID() {
		return deptID;
	}

	public String getDeptName() {
		return deptName;
	}
	
}
