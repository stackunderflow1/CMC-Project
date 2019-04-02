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
 * @StackUnderflow
 * @author DeAndre Bethell, Nathan Drees, Anton Andrews, Ryan Graham, Noah Lefebvre
 * @version March 2019
 */
public class LogOnController 
{
/** private instance variables
*/
private Users user;
 private static ArrayList<Users> allU = new ArrayList<Users>();

/*LogOn Constructor
*/
public LogOnController()
{
	this.user = user;
}
/** 
*Enables the user to log into the database
*@param String username, password
*@returns the result of the logOn by stating whether a user or admin is loggin onto the database. If neither it returns a fail message or a deactivated user
*/
public static String logOn(String username, String password)
{
	allU = DataBaseController2.getAllUsers();
	String result = "fail";
	for (int i = 0; i < allU.size(); i++){
		if (username.equals(allU.get(i).getUsername())) {
			if (password.equals(allU.get(i).getPassword())){
				if(allU.get(i).getStatus().equals("Y")) {
					if (allU.get(i).getType().equals("u")) {
					result = "User";
					}
					else if (allU.get(i).getType().equals("a")) {
						result = "Admin";
					}
				}
				else if (allU.get(i).getStatus().equals("Y")) {
					result = "deactivated";
				}
			}
			
		}
	
	}
	return result;
}

/** 
* Allows the user to logout of the database
*@param String username, password
@returns successfully logged out or fail if the user fails to log out
*/
public String logout(String username, String password)
{
	allU = DataBaseController2.getAllUsers();
	String result = "fail";
	for (int i = 0; i < allU.size(); i++){
		if (username.equals(allU.get(i).getUsername())) {
			if (password.equals(allU.get(i).getPassword())){
				if(allU.get(i).getStatus().equals("Y")) {
					if (allU.get(i).getType().equals("u")){
						result = "Successfully logged out as user";
				}
					else if( (allU.get(i).getType().equals("a")))
					{
						result = "Sucessfully logged out as admin";
					}
					else
					{
						result = "fail";
					}
			}
			
		}
	
	}
}
	return result;
}
}
