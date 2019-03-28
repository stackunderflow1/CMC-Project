package edu.csbsju.cs.Controllers;
import edu.csbsju.cs.Entity.*;
import java.io.*;
import java.util.*;

public class LogOnController 
{
private Users user;
 private static ArrayList<Users> allU = new ArrayList<Users>();

public LogOnController()
{
	this.user = user;
}
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

public  void logout()
{

}
}
