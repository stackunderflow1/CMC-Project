


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
	//Creates a User
	public Users(String first, String last, String userNames, String passwords, String types, String statuss) {
		this.firstName = first;
		this.lastName = last;
		this.userName = userNames;
		this.password = passwords;
		this.type = types;
		this.status = statuss;
			
	}
	//Logs in 
	public Users(String userNames, String passwords) { 
   		this.userName = userNames;
   		this.password = passwords;
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
	* sets the first name of the user
	*@param
	*/
	public void setFirstname(String firstName){
    		this.firstName = firstName;
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
  	 * Sets the last name of user
   	* 
   	* @param lastName of user
   	*/
  	public void setLastname(String lastName){
   		this.lastName = lastName;
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
   	* Sets the type of the user
   	* 
  	* @param type the type of the account
   	*/
  	public void setType(String type) {
    		this.type = type;
	}
	/**
	* gets the status of the user
	*@param
	*@returns the status of the user/ this.status
	*/
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
  	 * Sets the status of the user
   	* 
  	 * @param status the status of the account
  	 */
 	public void setStatus1(String status){
    		this.status = status;
	}
}
