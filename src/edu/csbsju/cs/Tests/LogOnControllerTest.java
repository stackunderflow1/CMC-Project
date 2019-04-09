package edu.csbsju.cs.Tests;

import edu.csbsju.cs.Controllers.*;

public class LogOnControllerTest {
	static LogOnController lnc = new LogOnController();
	
	public static void main(String[]args) {
		
		
		System.out.println("Should throw 'Deactive User");
		System.out.println("Username: luser" + "\n" + "Password: user");
		//lnc.logOn("luser", "user");
		System.out.println("Should throw 'Invalid Password'");
		System.out.println("Username: juser" + "\n" + "Password: failure");
		//lnc.logOn("juser", "failure");
		System.out.println("Should throw 'Invalid Username'");
		System.out.println("Username: failure" + "\n" + "Password: user");
		//lnc.logOn("failure", "user");
		System.out.println("Username: juser" + "\n" + "Password: user");
		lnc.logOn("juser", "user");
		System.out.println("Logged in as user");
		System.out.println("Username: nadmin" + "\n" + "Password: admin");
		lnc.logOn("nadmin", "admin");
		System.out.println("Logged in as admin");
		
		
		
	}

}
