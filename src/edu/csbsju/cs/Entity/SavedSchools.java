/**
*packages
*/
package edu.csbsju.cs.Entity;
/**
* Saved schools entity class
*@author DeAndre Bethell, Ryan Graham, Noah Lefebvre, Anton Andrews, Nathan Drees
*@version March 2019
*/
public class SavedSchools {
	/**
	*instance variables
	*/
	private String username, School, timeStamp;
	/**
	*constructor method
	*/
	public SavedSchools(String userName, String uni, String time) {
		this.username = userName;
		this.School = uni;
		this.timeStamp = time;
	}
	
	/**
	* gets the user name of the user in the school
	*@param
	*@returns the user name of the user/ this.userName
	*/
	public String getUsername() {
		return this.username;
	}
	/**
	* gets the school
	*@param
	*@returns the school/ this.School
	*/
	public String getSchool() {
		return this.School;
	}
	/**
	* gets the time Stamp of the school
	*@param
	*@returns the time Stamp of the school / this.timeStamp
	*/
	public String getTimeStamp() {
		return this.timeStamp;
	}
	/**
	* prints all the information on the saved schools
	*@param
	*@returns all the information on the saved schools
	*/
	public String print() {
		return this.username + " " + this.School + " " + this.timeStamp;
	}
}
