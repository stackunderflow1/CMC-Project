/**
 * packages
 */

package edu.csbsju.cs.Controllers;
import java.util.ArrayList;

import edu.csbsju.cs.Entity.*;


/**
 * This class is the Admin Functionality controller that allows an admin to access the database.
 * @StackUnderflow
 * @author DeAndre Bethell, Nathan Drees, Anton Andrews, Ryan Graham, Noah Lefebvre
 * @version March 2019
 */
public class AdminFunctionalityController {

	private DataBaseController dbc;
	/**
	 * Constructor 
	 */
	public AdminFunctionalityController() {
		this.dbc  = new DataBaseController();
	}

	/*
	* Allows the admin to add a user to the database
	*@param String firstname, lastName, userName, password, type
	*@return the new user in the database; x
	*/
	public void addUser(Users newUser)
	{
	dbc.addUser(newUser);

	}
	/*
	* Allows the admin to delete a user from the database
	*@param User users
	*@return the user that was deleted from the database; x
	*/
	public void deleteUser(Users user)
	{
	dbc.deleteUser(user);
	}
	/*
	* Allows the admin to edit a user in the database
	*@param Users user
	*@return the updated user in the database; x
	*/
	public void editUser(Users user)
	{
	 dbc.editUser(user);
	}

	/*
	* Allows the admin to add an university to the database
	*@param String name, state, location, control
	*Int numStudents, numApplicants, academicScale, socialScale, qOLScale
	*double females, SATV, SATM, expenses, financialAid, admitted, enrolled
	*ArrayList<String> emphasess
	*
	*@return the new university in the database; x
	*/
	public void addUniversity(University uni)
	{
		dbc.addUniversity(uni);
		
	}
	/*
	* Allows the admin to get all the users in the database
	*@param 
	*@return all the users in the database
	*/
	public ArrayList<Users> getAllUsers()
	{
		ArrayList<Users> stuList = dbc.getAllUsers();
		return stuList;
		
	}
	/*
	* Allows the admin to get the users in the database
	*@param String userName 
	*@return a user in the database
	*/
	public Users getUser(String userName)
	{
		ArrayList<Users> stuList = dbc.getAllUsers();
		Users user = new Users("", "", "", "", ' ', ' ');
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
	public void deleteSchool(University uni)
	{
		dbc.deleteSchool(uni);
	}
	/*
	* Allows the admin to edit an university in the database
	*@param University uni0, uni1
	*@return the  university edited in the database; x
	*/
	public void editSchool(University uni)
	{
		 dbc.editSchool(uni);
	}
	/*
	* Allows the admin to deactivate a university in the database
	*@param Users user
	*@return the  university deactivated in the database; x
	*/
	public void deactivateUser(Users user)
	{
		if(user.getStatus()==('Y'))
		{
			user.setStatus('N');
		}
		else
		{
			user.setStatus('Y');
		}
		dbc.editUser(user);
	}
	/*
	* Allows the admin to print user information in the database
	*@param Users user 
	*@return a user in the database
	*/
	public String getUser(Users user)
	{
		String s = user.print();
		return s;
		
	}
}
