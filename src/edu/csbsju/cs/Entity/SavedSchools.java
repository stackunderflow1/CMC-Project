package edu.csbsju.cs.Entity;

public class SavedSchools {
	
	private String username, School, timeStamp;

	public SavedSchools(String userName, String uni, String time) {
		this.username = userName;
		this.School = uni;
		this.timeStamp = time;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getSchool() {
		return this.School;
	}
	
	public String getTimeStamp() {
		return this.timeStamp;
	}
	
	public String print() {
		return this.username + " " + this.School + " " + this.timeStamp;
	}
}
