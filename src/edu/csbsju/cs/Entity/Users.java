package src.edu.csbsju.cs.Entity;

public class Users {

	public String firstName, lastName, userName, password, type, status;
	
	public Users(String first, String last, String userNames, String passwords, String types, String statuss) {
		this.firstName = first;
		this.lastName = last;
		this.userName = userNames;
		this.password = passwords;
		this.type = types;
		this.status = statuss;
			
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getUsername() {
		return this.userName;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public String setStatus(String status)
	{
		this.status = status;
		return this.status;
	}
	
	public String print()
	{
		String s = getFirstName() + " " + getLastName() + " " + getUsername() + " " +getPassword() + " " +getType() + " " +getStatus();
		return s;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
}
