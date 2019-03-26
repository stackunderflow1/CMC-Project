/**
 * 
 */
package src.edu.csbsju.cs.Controllers;
import java.util.ArrayList;

import src.edu.csbsju.cs.Entity.*;

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

	public static int addUser(String firstName, String lastName, String userName, String password, String type)
	{
		
	Users newUser = new Users(firstName, lastName, userName, password, type, "Y");
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
	
	public static int addUniversity(String name, String state, String location, String control, int numStudents, 
			 double females, double SATV, double SATM, double expenses, double financialAid, 
			 int numApplicants, double admitted, double enrolled, int academicScale, int socialScale, 
			 int qOLScale, ArrayList<String> emphasess)
	{
		University uni = new University( name,  state, location,  control,  numStudents, 
				  females,  SATV,  SATM,  expenses,  financialAid, 
				  numApplicants,  admitted, enrolled, academicScale, socialScale, 
				  qOLScale, emphasess);
		int x = DataBaseController2.addUniversity(uni);
		return x;
	}
	
	public static ArrayList<Users> getAllUsers()
	{
		ArrayList<Users> stuList = DataBaseController2.getAllUsers();
		return stuList;
		
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
