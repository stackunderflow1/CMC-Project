<<<<<<< HEAD
package src.edu.csbsju.cs.Controllers;


import java.io.*;
import dblibrary.project.csci230.UniversityDBLibrary;
import src.edu.csbsju.cs.Entity.SavedSchools;
import src.edu.csbsju.cs.Entity.University;
import src.edu.csbsju.cs.Entity.Users;

=======
/* packages
*/
package edu.csbsju.cs.Controllers;
/* imports
*/
import java.io.*;
import dblibrary.project.csci230.UniversityDBLibrary;
import edu.csbsju.cs.Entity.SavedSchools;
import edu.csbsju.cs.Entity.University;
import edu.csbsju.cs.Entity.Users;
>>>>>>> 2d8d3b1db98685ea8a89f636ad93846d95b99ae5
import java.util.*;
/**
 * This class is the Database controller that allows a user to access the database.
 * @StackUnderflow
 * @author DeAndre Bethell, Nathan Drees, Anton Andrews, Ryan Graham, Noah Lefebvre
 * @version March 2019
 */
public class DataBaseController2 {
/** private instance variables
*/
private UniversityDBLibrary univDBlib;


	/** @param String username, String password
	*@return 
	*/
	public void DBLibraryDriver(String username, String password){
		univDBlib = new UniversityDBLibrary(username,password);
	}
  	/*@param
	*@returns UniversityDBLibrary univDBlib
	*/
	public UniversityDBLibrary getUnivDBlib(){
		return univDBlib;
	}
  	/** 
  	*displays the information inside of the table
	*
	*@param String [][]table, PrintWriter pw, Int topx
	*
	*@returns
	*/
	public void display(String[][] table, PrintWriter pw, int topx) {
	    
	    if(table!=null){
	      if (topx == -1 || topx > table.length)
	        topx = table.length;      
	      for (int row = 0; row < topx; row++) {         
	        for (int col = 0; col < table[0].length; col++) {
	          pw.print(table[row][col] + ",");
	        }
	        pw.println();
	      }     
	    }
	    else{
	      pw.println("Nothing to display");
	    }
	  }

	/**
   	* Allows the user to get all the school details from the database
   	* 
   	* @param 
   	* 
   	* @return newSchoolList /an entity with the information of the university
 	*/
	public static ArrayList<University> getAllSchoolDetails() {
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
		String [][] allSchools = dbld.getUnivDBlib().university_getUniversities();
		String [][] schoolEmp = dbld.getUnivDBlib().university_getNamesWithEmphases();
		ArrayList<University> newSchoolList = new ArrayList<University>();
		
		int i = 0;
		while (i<allSchools.length) {
			int a = 0;
			ArrayList<String> emp = new ArrayList<String>();
			while (a < schoolEmp.length) {
				if (schoolEmp[a][0].equals(allSchools[i][0])) {
					emp.add(schoolEmp[a][1]);
					a++;
				}
				else {
					a++;
				}
			}
			University school = new University(allSchools[i][0], allSchools[i][1], 
					allSchools[i][2], allSchools[i][3], Integer.parseInt(allSchools[i][4]), 
					Double.parseDouble(allSchools[i][5]), Double.parseDouble(allSchools[i][6]), 
					Double.parseDouble(allSchools[i][7]), Double.parseDouble(allSchools[i][8]), 
					Double.parseDouble(allSchools[i][9]), Integer.parseInt(allSchools[i][10]), 
					Double.parseDouble(allSchools[i][11]), Double.parseDouble(allSchools[i][12]), 
					Integer.parseInt(allSchools[i][13]), Integer.parseInt(allSchools[i][14]), 
					Integer.parseInt(allSchools[i][15]), emp);
			
			newSchoolList.add(school);
			i++;
			
		}
	
	return newSchoolList;
}
	/**
   	* Allows the user to get all the users in the database
   	* 
   	* @param 
   	* 
   	* @return newUserList / an entity with the information on the users
 	*/
	public static ArrayList<Users> getAllUsers() {
	
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
		String[][] allUsers = dbld.getUnivDBlib().user_getUsers();
		ArrayList<Users> newUserList = new ArrayList<Users>();
	
		int i = 0;
		while (i<allUsers.length) {
			Users user = new Users(allUsers[i][0], allUsers[i][1], allUsers[i][2], 
					allUsers[i][3], allUsers[i][4], allUsers[i][5]);
		
			newUserList.add(user);
			i++;
		}
		return newUserList;
	}
	/**
	* Allows the users to add a university to the database
	*@param University uni/ university to be added in the database
	*@returns schoolAdded
	*
	*/
	public static int addUniversity(University uni) {
		int schoolAdded = 0;
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
	
		int addU = dbld.getUnivDBlib().university_addUniversity(uni.getName(), uni.getState(), uni.getLocation(),
				uni.getControl(), uni.getNumStudents(), uni.getFemales(), uni.getSATV(), uni.getSATM(), uni.getExpenses(),
				uni.getFinancialAid(), uni.getNumApplicants(), uni.getAdmitted(), uni.getEnrolled(), uni.getAcademicScale(),
				uni.getSocialScale(), uni.getqOLScale());
	
		ArrayList<String> uniE = uni.getEmphases();
		int i = 0;
		while (i < uniE.size()) {
			int addE = dbld.getUnivDBlib().university_addUniversityEmphasis(uni.getName(), uniE.get(i));
				if (addE == -1) {
				schoolAdded = addE;
			}
			i++;
		}
		if (addU == -1) {
			schoolAdded = addU;
		}

		return schoolAdded;
	}
	/**
	* Allows the users to add a user to the database
	*@param Users use/ user to be added in the database
	*@returns addSuccess
	*
	*/
	public static int addUser(Users use) {
		int addSuccess = 0;
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
		char type = use.getType().charAt(0);
		int addU = dbld.getUnivDBlib().user_addUser(use.getFirstName(), use.getLastName(), use.getUsername(),
				use.getPassword(), type);
		if (addU == -1) {
			addSuccess = addU;
		}
		return addSuccess;
	}
	/**
	* Allows the users to delete a university from the database
	*@param University uni/ school to be deleted in the database
	*@returns success
	*
	*/
	public static int deleteSchool(University uni) {
		int success = 0;
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
		int delete = dbld.getUnivDBlib().university_deleteUniversity(uni.getName());
		
		ArrayList<String> uniE = uni.getEmphases();
		int i = 0;
		while (i < uniE.size()) {
			int deleteE = dbld.getUnivDBlib().university_removeUniversityEmphasis(uni.getName(), uniE.get(i));
				if (deleteE == -1) {
				success = deleteE;
			}
			i++;
		}
		if (delete == -1) {
			success = delete;
		}
		return success;
	}
	/**
	* Allows the users to edit a university in the database
	*@param University uni0, University uni to be edited in the database
	*@returns success
	*
	*/
	public static int editSchool(University uniO, University uni) {
		int success = 0;
		
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
	
		int editU = dbld.getUnivDBlib().university_editUniversity(uni.getName(), uni.getState(), uni.getLocation(),
				uni.getControl(), uni.getNumStudents(), uni.getFemales(), uni.getSATV(), uni.getSATM(), uni.getExpenses(),
				uni.getFinancialAid(), uni.getNumApplicants(), uni.getAdmitted(), uni.getEnrolled(), uni.getAcademicScale(),
				uni.getSocialScale(), uni.getqOLScale());

		if (editU == -1) {
			success = editU;
		}
		ArrayList<String> uniE = uniO.getEmphases();
		int i = 0;
		while (i < uniE.size()) {
			int deleteE = dbld.getUnivDBlib().university_removeUniversityEmphasis(uni.getName(), uniE.get(i));
				if (deleteE == -1) {
				success = deleteE;
			}
			i++;
		}
		
		ArrayList<String> uniR = uni.getEmphases();
		int a = 0;
		while (a < uniR.size()) {
			int addE = dbld.getUnivDBlib().university_addUniversityEmphasis(uni.getName(), uniE.get(a));
				if (addE == -1) {
				success = addE;
			}
			a++;
		}
		
		return success;
	}
	/**
	* Allows the users to delete a user from the database
	*@param Users u/ user that is to be deleted in the database
	*@returns success
	*
	*/
	public static int deleteUser(Users u) {
		int success = 0;
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
		int deleteU = dbld.getUnivDBlib().user_deleteUser(u.getUsername());
		if (deleteU == -1) {
			success = deleteU;
		}
		
		return success;
	}
	/**
	* Allows the users to edit a user in the database
	*@param Users u/ user to be edited in the database
	*@returns success
	*
	*/
	public static int editUser(Users u) {
		int success = 0;
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
		char type = u.getType().charAt(0);
		char status = u.getStatus().charAt(0);
		int deleteU = dbld.getUnivDBlib().user_editUser(u.getUsername(), u.getFirstName(), u.getLastName(),
				u.getPassword(), type, status);
		if (deleteU == -1) {
			success = deleteU;
		}
		
		return success;
	}
	/**
	* Allows the users to get saved schools in the database
	*@param Users u
	*@returns savedSchools
	*
	*/
	public static ArrayList<SavedSchools> getSavedSchools(Users u){
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
		String [][] allSavedSchools = dbld.getUnivDBlib().user_getUsernamesWithSavedSchools();
		ArrayList<SavedSchools> savedSchools = new ArrayList<SavedSchools>();
		
		for (int i = 0; i < allSavedSchools.length; i++) {//a University entity with the information of the university
			if (allSavedSchools[i][0].equals(u.getUsername())) {
				SavedSchools school = new SavedSchools(allSavedSchools[i][0], allSavedSchools[i][1], allSavedSchools[i][2]);
				savedSchools.add(school);
			}
		}
		return savedSchools;
	}
	/**
	* Allows the users to remove saved schools from the database
	*@param SavedSchools school
	*@returns success
	*
	*/
	public static int removeSavedSchool(SavedSchools school) {
		int success = 0;
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");	
		int remove = dbld.getUnivDBlib().user_removeSchool(school.getUsername(), school.getSchool());
		if (remove == -1) {
			success = remove;
		}
		return success;
	}
	/**
	* Allows the users to save schools in the database
	*@param String uName, String school
	*@returns success
	*
	*/
	public static int saveSchool(String uName, String school) {
		int success = 0;
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");	
		int add = dbld.getUnivDBlib().user_saveSchool(uName, school);
		if (add == -1) {
			success = add;
		}
		return success;
	}
}
