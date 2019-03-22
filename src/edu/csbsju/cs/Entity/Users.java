/**
*packages
*/
package edu.csbsju.cs.Entity;
/**
 * User Entity that stores all the information pertaining to a user.
 * 
 * @author DeAndre Bethell, Nathan Drees, Ryan Graham, Noah Lefebvre, Anton Andrews
 * @version March 2019
 */
public class Users {
	/**
	*instance variables
	*/
	public String firstName, lastName, userName, password, type, status;
	
	public Users(String first, String last, String userNames, String passwords, String types, String statuss) {
		this.firstName = first;
		this.lastName = last;
		this.userName = userNames;
		this.password = passwords;
		this.type = types;
		this.status = statuss;
			
	}
	/**
	* gets the first name of the user
	*@param
	*@returns the first name of the user/ this.firstName
	*/
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	* gets the last name of the user
	*@param
	*@returns the last name of the user/ this.lastName
	*/
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	* gets the user name of the user
	*@param
	*@returns the user name of the user/ this.userName
	*/
	public String getUsername() {
		return this.userName;
	}
	
	/**
	* gets the password of the user
	*@param
	*@returns the password of the user/ this.password
	*/
	public String getPassword() {
		return this.password;
	}
	
	/**
	* gets the type of the user
	*@param
	*@returns the type of the user/ this.type
	*/
	public String getType() {
		return this.type;
	}
	
	/**
	* gets the status of the user
	*@param
	*@returns the status of the user/ this.status
	*/
	public String getStatus() {
		return this.status;
	}
}
