package edu.csbsju.cs.Drivers;


import edu.csbsju.cs.Controllers.*;
import edu.csbsju.cs.Entity.*;
import edu.csbsju.cs.Interface.*;
import java.io.*;
import java.util.*;

public class CMCDriver {
	
	public static void main(String[]args) {
		System.out.println("Beginning Test...");
		
		AdminInteraction ai = new AdminInteraction();
		DataBaseController dbc = new DataBaseController();
		StudentUserInteraction sui = new StudentUserInteraction();
		UniversityController uc = new UniversityController();
		LogOnController loc = new LogOnController();
		boolean isLoggedOn =loc.isLoggedOn();
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("MATH");
		emp.add("COMPUTER-SCIENCE");
		University univ = new University("ANATOL", "MINNESOTA", "SUBURBAN", "PRIVATE", 9000, 56.0, 530.0, 500.0, 35000.0, 15000.0, 3000, 81.0, 75.0, 3, 3, 3, emp);
		
		
		System.out.println("********** LOG ON **********");
		System.out.println("**LogOn with valid info**");
		String logIn = loc.logOn("juser", "user");		
		System.out.println(logIn);
		
		
		
		
		
		
		
		
		
		
		
		
		/**Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String uName = sc.nextLine();
		System.out.println("Enter Password: ");
		String password = sc.nextLine();
		String logIn = LogOnController.logOn(uName, password);
		System.out.println(logIn);
		if (logIn.equals("logged in as User")){
			System.out.println("Type 'search' to search for a school. Type 'view' to view saved schools");
			String option = sc.nextLine();
			if (option.equals("search")) {
				System.out.println("Enter School name");
				String school = sc.nextLine();
				System.out.println("Enter state");
				String state = sc.nextLine();
				System.out.println("Enter location");
				String location = sc.nextLine();
				System.out.println("Enter controll");
				String controll = sc.nextLine();
				System.out.println("Enter number of Students");
				String numStudents = sc.nextLine();
				System.out.println("Enter percentage of females");
				String females = sc.nextLine();
				System.out.println("Enter SAT Verbal Score");
				String SATV = sc.nextLine();
				System.out.println("Enter SAT Math Score");
				String SATM = sc.nextLine();
				System.out.println("Enter Exspenes");
				String expenses = sc.nextLine();
				System.out.println("Enter Finacial Aid");
				String financial = sc.nextLine();
				System.out.println("Enter Numenbr of Applications");
				String numApp = sc.nextLine();
				System.out.println("Enter percentage of Admitted Students");
				String admitted = sc.nextLine();
				System.out.println("Enter enrolled Students");
				String enrolled = sc.nextLine();
				System.out.println("Enter Academic Scale between 1 and 5");
				String aScale = sc.nextLine();
				System.out.println("Enter Social Scale between1 and 5");
				String sScale = sc.nextLine();
				System.out.println("Enter Quality of Life Scale between 1 and 5");
				String qOLScale = sc.nextLine();
				ArrayList <String> searchR = searchSchools.searchAllSchools(school, state, location, controll, numStudents, 
						females, SATV, SATM, expenses, financial, numApp, admitted, enrolled, aScale, sScale, qOLScale);
				for (int i = 0; i < searchR.size(); i++) {
					System.out.println(searchR.get(i));
				}
				System.out.println("Enter the Name of the School you would like to view");
				String UName = sc.nextLine();
				UName = UName.toUpperCase();
				ArrayList<University> allSchools = DataBaseController2.getAllSchoolDetails();
				for (int i = 0; i < allSchools.size(); i++) {
					if (UName.equals(allSchools.get(i).getName())) {
						System.out.println(allSchools.get(i).print());
					}
				}
				System.out.println("If you want to save School type 'save'");
				String save = sc.nextLine();
				if (save.equals("save")) {
					int result = DataBaseController2.saveSchool(uName, UName);
					if (result == 0) {
						System.out.println("School Saved!!");
					}
					else if (result == -1) {
						System.out.println("School Not Saved!!");
					}
				}
				System.out.println("If you want to view saved schools type 'saved'");
				String saved = sc.nextLine();
				ArrayList<Users> us = DataBaseController2.getAllUsers();
				Users u = null;
				for (int i = 0; i< us.size(); i++){
					if(us.get(i).getUsername().equals(uName)) {
						u = us.get(i);
			}
				}
				if (saved.equals("saved")) {
					ArrayList<SavedSchools> savedSchools = DataBaseController2.getSavedSchools(u);
					for (int i = 0; i < savedSchools.size(); i++) {
						System.out.println(savedSchools.get(i).print());
					}
				}
								
			}
			
		}
		*/
	}
	
}
