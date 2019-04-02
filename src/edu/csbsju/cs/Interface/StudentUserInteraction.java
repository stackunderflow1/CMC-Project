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
  public University viewUniversity(University uni)
  {
    return StudentFunctionalityController.getSchools(uni);
  }
  /**
	* Displays all the saved schools that the user saved in the database
	*@param 
	*@returns the saved schools in the database
	*/
  public Page viewAllSavedUniversitys(Users u) 
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
    return UniversityController.topRecommended(n)
  }
  /**
	* Saves a university to the database
	*@param String uName, school
	*@returns the saved university in the database
	*/
  public void saveUniversity(String uName, school) 
  { 
    return StudentFunctionalityController.saveSchool(uName,school);
  }
  /**
	* Searches for a university in the database
	*@param 
	*@returns the university the user searched for in the database
	*/
  public void searchUniversity(String name, String state, String location, String control, String numStudents, String females, String SATV, String SATM, String expenses, String financialAid, String numApplicants, String admitted, String enrolled, String academicScale, String socialScale, String qOLScale)
  { 
    return UniversityController.searchAllSchools(String name, String state, String location, String control, String numStudents, String females, String SATV, String SATM, String expenses, String financialAid, String numApplicants, String admitted, String enrolled, String academicScale, String socialScale, String qOLScale)
  }
  /**
	*Deletes a saved school from the database
	*@param University school
	*@returns University list without the school that was deleted
	*/
  public void removeSavedUniversity(SavedSchools school)
  {
    return StudentFunctionalityController.removeUniversity(school);
  }
  
 
  
}
