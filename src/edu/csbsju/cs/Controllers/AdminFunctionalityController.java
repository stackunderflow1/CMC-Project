/**
 * packages
 */
<<<<<<< HEAD
package edu.csbsju.cs.Controllers;
import java.util.ArrayList;

import edu.csbsju.cs.Entity.*;
=======
package src.edu.csbsju.cs.Controllers;
/*
*imports
*/
import java.util.ArrayList;
import src.edu.csbsju.cs.Entity.*;
>>>>>>> d2d92422d0415c5f2a9034da3b27186350d03a49

/**
 * This class is the Admin Functionality controller that allows an admin to access the database.
 * @StackUnderflow
 * @author DeAndre Bethell, Nathan Drees, Anton Andrews, Ryan Graham, Noah Lefebvre
 * @version March 2019
 */
public class AdminFunctionalityController {

	/**
	 * Constructor 
	 */
	public AdminFunctionalityController() {
		// TODO Auto-generated constructor stub
	}
<<<<<<< HEAD

	public static int addUser(Users newUser)
=======
	/*
	* Allows the admin to add a user to the database
	*@param String firstname, lastName, userName, password, type
	*@return the new user in the database; x
	*/
	public static int addUser(String firstName, String lastName, String userName, String password, String type)
>>>>>>> d2d92422d0415c5f2a9034da3b27186350d03a49
	{
		
	
	int x = DataBaseController2.addUser(newUser);
	return x;
	}
	/*
	* Allows the admin to delete a user from the database
	*@param User users
	*@return the user that was deleted from the database; x
	*/
	public static int deleteUser(Users user)
	{
	
	int x = DataBaseController2.deleteUser(user);
	return x;
	}
	/*
	* Allows the admin to edit a user in the database
	*@param Users user
	*@return the updated user in the database; x
	*/
	public static int editUser(Users user)
	{
	
	int x = DataBaseController2.editUser(user);
	return x;
	}
<<<<<<< HEAD
	
	public static int addUniversity(University uni)
=======
	/*
	* Allows the admin to add an university to the database
	*@param String name, state, location, control
	*Int numStudents, numApplicants, academicScale, socialScale, qOLScale
	*double females, SATV, SATM, expenses, financialAid, admitted, enrolled
	*ArrayList<String> emphasess
	*
	*@return the new university in the database; x
	*/
	public static int addUniversity(String name, String state, String location, String control, int numStudents, 
			 double females, double SATV, double SATM, double expenses, double financialAid, 
			 int numApplicants, double admitted, double enrolled, int academicScale, int socialScale, 
			 int qOLScale, ArrayList<String> emphasess)
>>>>>>> d2d92422d0415c5f2a9034da3b27186350d03a49
	{
		int x = DataBaseController2.addUniversity(uni);
		return x;
	}
	/*
	* Allows the admin to get all the users in the database
	*@param 
	*@return all the users in the database
	*/
	public static ArrayList<Users> getAllUsers()
	{
		ArrayList<Users> stuList = DataBaseController2.getAllUsers();
		return stuList;
		
	}
	/*
	* Allows the admin to get the users in the database
	*@param String userName 
	*@return a user in the database
	*/
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
	/*
	* Allows the admin to delete an university from the database
	*@param University uni
	*@return the  university deleted from the database; x
	*/
	public static int deleteSchool(University uni)
	{
<<<<<<< HEAD
		int x = DataBaseController2.deleteSchool(uni);
=======
		int x = return DataBaseController2.deleteSchool(uni);
>>>>>>> d2d92422d0415c5f2a9034da3b27186350d03a49
		return x;
	}
	/*
	* Allows the admin to edit an university in the database
	*@param University uni0, uni1
	*@return the  university edited in the database; x
	*/
	public static int editSchool(University uni0, University uni1)
	{
		int x = DataBaseController2.editSchool(uni0, uni1);
		return x;
	}
	/*
	* Allows the admin to deactivate a university in the database
	*@param Users user
	*@return the  university deactivated in the database; x
	*/
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
	/*
	* Allows the admin to print user information in the database
	*@param Users user 
	*@return a user in the database
	*/
	public static String getUser(Users user)
	{
		String s = user.print();
		return s;
		
	}
}
