package edu.csbsju.cs.Tests;

import edu.csbsju.cs.Controllers.*;

public class LogOnControllerTest {
	
	public static void main(String[]args) {
		String test1 = LogOnController.logOn("juser", "user");
		System.out.println("Checking User Login");
		System.out.println("Username: juser" + "\n" + "Password: user");
		System.out.println("Expected result: 'User'");
		System.out.println("Actual Result: '" + test1 + "'" + "\n");
		
		String test2 = LogOnController.logOn("luser", "user");
		System.out.println("Checking Deactivated Login");
		System.out.println("Username: luser" + "\n" + "Password: user");
		System.out.println("Expected result: 'deactivated'");
		System.out.println("Actual Result: '" + test2 + "'" + "\n");
		
		String test3 = LogOnController.logOn("nadmin", "admin");
		System.out.println("Checking Admin Login");
		System.out.println("Username: nadmin" + "\n" + "Password: admin");
		System.out.println("Expected result: 'Admin'");
		System.out.println("Actual Result: '" + test3 + "'" + "\n");
		
		String test4 = LogOnController.logOn("failure", "failure");
		System.out.println("Checking Failed Login");
		System.out.println("Username: failure" + "\n" + "Password: failure");
		System.out.println("Expected result: 'fail'");
		System.out.println("Actual Result: '" + test4 + "'" + "\n");
		
		String test5 = LogOnController.logOut("juser", "user");
		System.out.println("Checking User Logout");
		System.out.println("Username: juser" + "\n" + "Password: user");
		System.out.println("Expected result: 'Successfully logged out as user'");
		System.out.println("Actual Result: '" + test5 + "'" + "\n");
		
		String test6 = LogOnController.logOut("nadmin", "admin");
		System.out.println("Checking Admin Logout");
		System.out.println("Username: nadmin" + "\n" + "Password: admin");
		System.out.println("Expected result: 'Sucessfully logged out as admin'");
		System.out.println("Actual Result: '" + test6 + "'" + "\n");
		
		String test7 = LogOnController.logOut("failure", "failure");
		System.out.println("Checking Failed Logout");
		System.out.println("Username: failure" + "\n" + "Password: failure");
		System.out.println("Expected result: 'fail'");
		System.out.println("Actual Result: '" + test7 + "'" + "\n");
	}

}
