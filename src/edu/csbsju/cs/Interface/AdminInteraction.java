/**
 * 
 */
package edu.csbsju.cs.Interface;

import java.util.ArrayList;
import edu.csbsju.cs.Entity.*;
import edu.csbsju.cs.Controllers.*;

/**
 * @author aandrews002
 *
 */
public class AdminInteraction {

	/**
	 * 
	 */
	public AdminInteraction() {
		// TODO Auto-generated constructor stub
	}
	
	public static int addUser(String firstName, String lastName, String userName, String password, String type, String status)
	{
		Users newUser = new Users(firstName, lastName, userName, password, type, status);
	return AdminFunctionalityController.addUser(newUser);
	}
	
	
	public static int deleteUser(Users user)
	{
	return AdminFunctionalityController.deleteUser(user);
	}
	
	public static int editUser(Users user)
	{
	
	return AdminFunctionalityController.editUser(user);
	}
	
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
	
	public static ArrayList<Users> getAllUsers()
	{
		return AdminFunctionalityController.getAllUsers();
		
	}
	
	public static int deleteSchool(University uni)
	{
		return AdminFunctionalityController.deleteSchool(uni);
	}
	
	public static int editSchool(University uni0, University uni1)
	{
		return AdminFunctionalityController.editSchool(uni0, uni1);
	}
	
	public static int deactivateUser(Users user)
	{
		return AdminFunctionalityController.editUser(user);
	}
	
	public static String getUser(Users user)
	{
		return user.print();
		
	}

}
