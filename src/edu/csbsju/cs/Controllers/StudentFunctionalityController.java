package edu.csbsju.cs.Controllers;
import edu.csbsju.cs.Entity.*;
import edu.csbsju.cs.Controllers.*;
import java.util.ArrayList;
import java.util.Scanner;
import dblibrary.project.csci230.UniversityDBLibrary;

/** 
 * StudentIntertactionController does the student interactions
 * 
 * @author StackUnderflow
 * @version March 20, 2019
 */

public class StudentFunctionalityController {
	//creates a new user of type student
  Users stud1;
  //creates a new DB Library
 // UniversityDBLibrary univDBlib = new UniversityDBLibrary("stackund", "csci230");
  //creates a new DB Controller
 DataBaseController2 dbc = new DataBaseController2();
  
  public static String logIn(String userName, String password) {
	//  String result =
  }
  
  
  /** 
   * Edits the user info of the student account

   * @param f the first name of the student
   * @param l the last name of the student
   * @param p the password of the student
   */
  
  public int editUser(Users u) 
  {
      
      
      if (dbc.editUser(stud1) == -1)
      {
        System.out.println("The changes have been made.");
      	return -1;
      }
      else 
      {
        System.out.println("There was an error editing this user");
      	return 0;
      }
      
    }
  

  /**
   * Student view a save list of universities the student has saved.
   * 
   * @return an ArrayList of saved schools
   */
  public static ArrayList<SavedSchools> getSavedSchools(Users u){
    
		return getSavedSchools(u);
    }

  /**
   * This allows the user to save the school.
   * 
   * @param uName username of the student
   * @param school the name of the school
   * 
   * @returns a 0 if saved school, -1 if not
   * 
   */

  public int saveSchool(String uName,String school)
  {
   int resuslt =  dbc.saveSchool(uName,school); 
   return resuslt;
  }
      
  /**
   * Allows the student to remove a school that they have saved.
   * 
   * @param SavedSchools school saved by the user
   * 
   * @return 0 if the school was remove, -1 otherwise
   */
  public int removeUniversity(SavedSchools school){
	return removeUniversity(school);
}
}
