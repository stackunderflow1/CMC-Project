/*
*packages
*/
package edu.csbsju.cs.Controllers;

/*
*imports
*/
import edu.csbsju.cs.Entity.*;
import java.io.*;
import java.util.*;

/**
 * This class is the LogOn controller that allows a user to access the database.
 * 
 * @StackUnderflow
 * @author DeAndre Bethell, Nathan Drees, Anton Andrews, Ryan Graham, Noah
 *         Lefebvre
 * @version March 2019
 */
public class LogOnController {
	/**
	 * private instance variables
	 */
	private Users user;
	private DataBaseController dbc;
	private ArrayList<Users> allU;
	private boolean isSLoggedOn = false;
	private boolean isALoggedOn = false;
	/*
	 * LogOn Constructor
	 */
	public LogOnController() {
		this.dbc = new DataBaseController();
		this.allU = new ArrayList<Users>();
	}

	/**
	 * Enables the user to log into the database
	 * 
	 * @param String
	 *            username, password
	 * @returns the result of the logOn by stating whether a user or admin is loggin
	 *          onto the database. If neither it returns a fail message or a
	 *          deactivated user
	 */
	public String logOn(String username, String password) {
		// NEED NEW ONE
		allU = dbc.getAllUsers();
		for (int i = 0; i < allU.size(); i++) {
			if (username.equals(allU.get(i).getUsername())) {
				
				if (password.equals(allU.get(i).getPassword())) {
					if (allU.get(i).getStatus() == 'Y') {
						System.out.println(allU.get(i).getStatus());
						this.isLoggedOn = true;
						if (allU.get(i).getType() == ('u')) {
							System.out.println(allU.get(i).getType());
							 result = "Logged in as Student User: " + username;
						} else if (allU.get(i).getType()==('a')) {
							 result = "Logged in as Admin User: " + username;
						}
					} else if (allU.get(i).getStatus()==('N')) {
						result = "Account is deactivated";
					}
				}
				else
				{
					result = "Invalid Password";
				}
			}
		}
		return result;
	}

	/**
	 * Allows the user to logout of the database
	 * 
	 * @param String
	 *            username, password
	 * @returns successfully logged out or fail if the user fails to log out
	 */
	public void logOut() {
		this.isLoggedOn = false;
}
	public boolean isLoggedOn()
	{
		return isLoggedOn;
	}
	
	public void setLoggedOn()
	{
		if(isLoggedOn == false)
		{
			isLoggedOn = true;
		}
		else if(isLoggedOn == true)
		{
			isLoggedOn = false;
		}
	}
}
