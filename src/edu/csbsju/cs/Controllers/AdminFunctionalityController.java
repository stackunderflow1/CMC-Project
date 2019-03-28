/**
 * 
 */
package edu.csbsju.cs.Controllers;
import java.util.ArrayList;

import edu.csbsju.cs.Entity.*;

/**
 * @author aandrews002
 *
 */
public class AdminFunctionalityController {

	/**
	 * 
	 */
	public AdminFunctionalityController() {
		// TODO Auto-generated constructor stub
	}

	public static int addUser(Users newUser)
	{
		
	
	int x = DataBaseController2.addUser(newUser);
	return x;
	}
	
	public static int deleteUser(Users user)
	{
	
	int x = DataBaseController2.deleteUser(user);
	return x;
	}
	
	public static int editUser(Users user)
	{
	
	int x = DataBaseController2.editUser(user);
	return x;
	}
	
	public static int addUniversity(University uni)
	{
		int x = DataBaseController2.addUniversity(uni);
		return x;
	}
	
	public static ArrayList<Users> getAllUsers()
	{
		ArrayList<Users> stuList = DataBaseController2.getAllUsers();
		return stuList;
		
	}
	
	public static Users getUser(String userName)
	{
		ArrayList<Users> stuList = DataBaseController2.getAllUsers();
		Users user = new Users("", "", "", "", "", "");
		for(int i = 0; i< stuList.size(); i++)
		{
			if(stuList.get(i).getUsername().equals(userName))
			{
				user = stuList.get(i);
			}
		}
		return user;
	}
	
	public static int deleteSchool(University uni)
	{
		int x = DataBaseController2.deleteSchool(uni);
		return x;
	}
	
	public static int editSchool(University uni0, University uni1)
	{
		int x = DataBaseController2.editSchool(uni0, uni1);
		return x;
	}
	
	public static int deactivateUser(Users user)
	{
		if(user.getStatus().equals("Y"))
		{
			user.setStatus("N");
		}
		else
		{
			user.setStatus("Y");
		}
		int x = DataBaseController2.editUser(user);
		return x;
	}
	
	public static String getUser(Users user)
	{
		String s = user.print();
		return s;
		
	}
}
