/*packages
*/
package edu.csbsju.cs.Controllers;

/* imports
*/
import edu.csbsju.cs.Entity.*;
import java.util.ArrayList;

import javax.naming.NameNotFoundException;

/**
 * This class is the StudentInteractioncontroller that allows a student to
 * interact with the database.
 * 
 * @StackUnderflow
 * @author DeAndre Bethell, Nathan Drees, Anton Andrews, Ryan Graham, Noah
 *         Lefebvre
 * @version March 2019
 */

public class StudentFunctionalityController {
	// creates a new user of type student
	Users stud1;
	// creates a new DB Library
	// UniversityDBLibrary univDBlib = new UniversityDBLibrary("stackund",
	// "csci230");
	// creates a new DB Controller
	DataBaseController dbc = new DataBaseController();
	LogOnController loc = new LogOnController();
	UniversityController uc = new UniversityController();


	
	/**
	* Searches for a university in the database
	*@param 
	*@returns the university the user searched for in the database
	*/
  public void searchUniversity(String name, String state, String location, String control, String numStudents, String females, String SATV, String SATM, String expenses, String financialAid, String numApplicants, String admitted, String enrolled, String academicScale, String socialScale, String qOLScale)
  { 
   uc.searchAllSchools(name, state, location, control, numStudents, females,  SATV, SATM, expenses, financialAid, numApplicants, admitted, enrolled, academicScale, socialScale, qOLScale);
  }
	/**
	 * Edits the user info of the student account
	 * 
	 * @param f
	 *            the first name of the student
	 * @param l
	 *            the last name of the student
	 * @param p
	 *            the password of the student
	 */

	/*public void editUser(Users u) {
		dbc.editUser(u);

		if (dbc.editUser(u) == -1) {
			System.out.println("The changes have been made.");
			return -1;
		} else {
			System.out.println("There was an error editing this user");
			return 0;
		}

	}*/

	/**
	 * Student view a save list of universities the student has saved.
	 * 
	 * @return an ArrayList of saved schools
	 */
	public ArrayList<SavedSchools> getSavedSchools(Users u) {

		return dbc.getSavedSchools(u);
	}

	/**
	 * This allows the user to save the school.
	 * 
	 * @param uName
	 *            username of the student
	 * @param school
	 *            the name of the school
	 * 
	 * @returns a 0 if saved school, -1 if not
	 * 
	 */

	public void saveSchool(University uni, Users uName) {
		
		ArrayList<SavedSchools> list = dbc.getSavedSchools(uName);
		if(list.size() == 0)
		{
			dbc.saveSchool(uName, uni);
		}
		
		boolean isThere = false;
		for(SavedSchools sc: list)
		{
			if(uni.getName().equals(sc.getName()))
			{
				isThere = true;
			}
		}
		if(isThere == false)
		{
			dbc.saveSchool(uName, uni);
		}
		else
		{
			throw new IllegalArgumentException();
		}
				
			
	}

	/**
	 * Allows the student to remove a school that they have saved.
	 * 
	 * @param SavedSchools
	 *            school saved by the user
	 * 
	 * @return 0 if the school was remove, -1 otherwise
	 */
	public void removeSavedSchool(Users name, String school) {
		 dbc.removeSavedSchool(name, school);
	}
	
	public void viewRecommendedUniversities(String n) 
	  {
	    uc.topRecommended(n);
	  }
	
	// views a school's individual details
	public University viewSchoolDetails(String universityName) throws NameNotFoundException {
		
		return dbc.viewSchoolDetails(universityName);
		
	}
	
	
	
	
	/*
	 * public double acceptanceProbability(double SATV, double SATM, University
	 * university) {
	 * 
	 * University
	 * 
	 * return 0.0;
	 */
}
