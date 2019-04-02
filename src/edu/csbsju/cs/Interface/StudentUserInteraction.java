/*packages
*/
package edu.csbsju.cs.Interface;
/*imports
*/
import edu.csbsju.cs.Controllers.*;
import edu.csbsju.cs.Entity.*;
import java.util.*;

/**
* StudentInteraction Class
*@author DeAndre Bethell, Ryan Graham, Noah Lefebvre, Anton Andrews, Nathan Drees
*@version March 2019
*/

public class StudentUserInteraction {

/**
	* Displays a university in the database
	*@param 
	*@returns the a university in the database
	*/
	private StudentFunctionalityController sfc = new StudentFunctionalityController();
  public University viewUniversity(University uni)
  {
    return StudentFunctionalityController.getSchoolDetails(uni);
  }
  /**
	* Displays all the saved schools that the user saved in the database
	*@param 
	*@returns the saved schools in the database
	*/
  public ArrayList<SavedSchools> viewAllSavedUniversitys(Users u) 
  { 
    return StudentFunctionalityController.getSavedSchools(u);
  }
  /**
	* Displays the acceptance probability rate of the student 
	*@param 
	*@returns the user's acceptance probability rate
	*/
  public String acceptanceProbability() 
  {
    return 
  }
  /**
	* Displays all recommended universities to the user
	*@param 
	*@returns the recommended universities to the user
	*/
  public Page viewRecommendedUniversitys(String n) 
  {
    UniversityController.topRecommended(n);
  }
  /**
	* Saves a university to the database
	*@param String uName, school
	*@returns the saved university in the database
	*/
  public void saveUniversity(String uName, String school) 
  { 
    sfc.saveSchool(uName,school);
  }
  /**
	* Searches for a university in the database
	*@param 
	*@returns the university the user searched for in the database
	*/
  public void searchUniversity(String name, String state, String location, String control, String numStudents, String females, String SATV, String SATM, String expenses, String financialAid, String numApplicants, String admitted, String enrolled, String academicScale, String socialScale, String qOLScale)
  { 
    UniversityController.searchAllSchools(name, state, location, control, numStudents, females,  SATV, SATM, expenses, financialAid, numApplicants, admitted, enrolled, academicScale, socialScale, qOLScale);
  }
  /**
	*Deletes a saved school from the database
	*@param University school
	*@returns University list without the school that was deleted
	*/
  public int removeSavedUniversity(SavedSchools school)
  {
    return sfc.removeUniversity(school);
  }
  
 
  
}
