package edu.csbsju.cs.Entity;

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
}
