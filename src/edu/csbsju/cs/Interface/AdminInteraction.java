/**
 * packages
 */
package edu.csbsju.cs.Interface;
/**
 * imports
 */
import java.util.ArrayList;
import edu.csbsju.cs.Entity.*;
import edu.csbsju.cs.Controllers.*;

/**
* Admin Interaction Class
*@author DeAndre Bethell, Ryan Graham, Noah Lefebvre, Anton Andrews, Nathan Drees
*@version March 2019
*/
public class AdminInteraction {

	/**
	 * Constructor
	 */
	public AdminInteraction() {
		// TODO Auto-generated constructor stub
	}
<<<<<<< HEAD
	
	public static int addUser(String firstName, String lastName, String userName, String password, String type, String status)
=======
	/**
	* Adds a new user to the database
	*@param String, firstName, lastName, userName, password, type
	*@returns the new user that was added to the database
	*/
	public static int addUser(String firstName, String lastName, String userName, String password, String type)
>>>>>>> d2d92422d0415c5f2a9034da3b27186350d03a49
	{
		Users newUser = new Users(firstName, lastName, userName, password, type, status);
	return AdminFunctionalityController.addUser(newUser);
	}
	
	/**
	* Deletes a user out of the database
	*@param Users user
	*@returns the user that was deleted from the database
	*/
	public static int deleteUser(Users user)
	{
	return AdminFunctionalityController.deleteUser(user);
	}
	/**
	* Edits a user inside of the database
	*@param Users user
	*@returns the updated user
	*/
	public static int editUser(Users user)
	{
	
	return AdminFunctionalityController.editUser(user);
	}
	/**
	* Adds a new university to the database
	*@param String name, state, locaiton, control, numStudents
	*double females, SATV,SATM,expenses, financialAid, addmitted, enrolled
	*int numApplicants, academicScale, socialScale,q0lScale
	*ArrayList<String> emphasess
	*@returns the new university that was added to the database
	*/
	public static int addUniversity(String name, String state, String location, String control, int numStudents, 
			 double females, double SATV, double SATM, double expenses, double financialAid, 
			 int numApplicants, double admitted, double enrolled, int academicScale, int socialScale, 
			 int qOLScale, ArrayList<String> emphasess)
	{
		University uni = new University( name,  state, location,  control,  numStudents, 
				  females,  SATV,  SATM,  expenses,  financialAid, 
				  numApplicants,  admitted, enrolled, academicScale, socialScale, 
				  qOLScale, emphasess);
		return AdminFunctionalityController.addUniversity(uni);
	}
<<<<<<< HEAD
	
	public static ArrayList<Users> getAllUsers()
=======
	/**
	* gets all the users in the database
	*@param
	*@returns all the users in the database
	*/
	public static void getAllUsers()
>>>>>>> d2d92422d0415c5f2a9034da3b27186350d03a49
	{
		return AdminFunctionalityController.getAllUsers();
		
	}
	/**
	*Deletes a school from the database
	*@param University uni
	*@returns University list without the school that was deleted
	*/
	public static int deleteSchool(University uni)
	{
		return AdminFunctionalityController.deleteSchool(uni);
	}
	/**
	* Edits a university in the database
	*@param University uni0, uni1
	*@returns the updated school list with the edited school
	*/
	public static int editSchool(University uni0, University uni1)
	{
		return AdminFunctionalityController.editSchool(uni0, uni1);
	}
	/**
	* Deactivates a user
	*@param Users user
	*@returns the list of users without the deactivated user
	*/
	public static int deactivateUser(Users user)
	{
		return AdminFunctionalityController.editUser(user);
	}
	/**
	* Gets a user inside of the database
	*@param Users user
	*@returns the user in the database
	*/
	public static String getUser(Users user)
	{
		return user.print();
		
	}

}
