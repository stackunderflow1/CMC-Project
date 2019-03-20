package edu.csbsju.cs.Controllers;

import java.io.*;
import dblibrary.project.csci230.UniversityDBLibrary;
import edu.csbsju.cs.Entity.SavedSchools;
import edu.csbsju.cs.Entity.University;
import edu.csbsju.cs.Entity.Users;

import java.util.*;

public class DataBaseController2 {

private UniversityDBLibrary univDBlib;



	public void DBLibraryDriver(String username, String password){
		univDBlib = new UniversityDBLibrary(username,password);
	}
  
	public UniversityDBLibrary getUnivDBlib(){
		return univDBlib;
	}
  
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
 * @return 
 * 
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
	
	public static int deleteUser(Users u) {
		int success = 0;
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
		int deleteU = dbld.getUnivDBlib().user_deleteUser(u.getUsername());
		if (deleteU == -1) {
			success = deleteU;
		}
		
		return success;
	}
	
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
	
	public static ArrayList<SavedSchools> getSavedSchools(Users u){
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
		String [][] allSavedSchools = dbld.getUnivDBlib().user_getUsernamesWithSavedSchools();
		ArrayList<SavedSchools> savedSchools = new ArrayList<SavedSchools>();
		
		for (int i = 0; i < allSavedSchools.length; i++) {
			if (allSavedSchools[i][0].equals(u.getUsername())) {
				SavedSchools school = new SavedSchools(allSavedSchools[i][0], allSavedSchools[i][1], allSavedSchools[i][2]);
				savedSchools.add(school);
			}
		}
		return savedSchools;
	}
	
	public static int removeSavedSchool(SavedSchools school) {
		int success = 0;
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");	
		int remove = dbld.getUnivDBlib().user_removeSchool(school.getUsername(), school.getSchool());
		if (remove == -1) {
			success = remove;
		}
		return success;
	}
	
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