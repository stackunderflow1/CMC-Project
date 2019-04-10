package edu.csbsju.cs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import edu.csbsju.cs.Controllers.DataBaseController;
import edu.csbsju.cs.Entity.*;
import java.util.*;
import java.io.*;

public class DataBaseControllerTests {
	DataBaseController dbc = new DataBaseController();
	ArrayList<University> unis = dbc.getAllSchoolDetails();
	ArrayList<String> emp = new ArrayList<String>();
	University u = new University("i2", "i", "i", "i", 1, 1.1, 1.2, 1.3, 1.4, 1.5, 2, 2.1, 2.2, 3, 4, 5, emp);
	
	@Before
	public void setUp() throws Exception {
		dbc.deleteSchool(u);
		}

	@Test
	public void testGetAllSchoolsDetails() {
		ArrayList<University> expNonResult = null;
		ArrayList<University> result = dbc.getAllSchoolDetails();
		assertNotEquals("ArrayList " + expNonResult,expNonResult, result);
		
	}
	
	@Test
	public void testGetAllUsers() {
		ArrayList<Users> expNonResult = null;
		ArrayList<Users> result = dbc.getAllUsers();
		assertNotEquals("ArrayList " + expNonResult,expNonResult, result);
		
	}
	
	@Test
	public void testAddUniversity1() {
		boolean expResult = false;
		boolean result = dbc.addUniversity(this.unis.get(10));
		assertEquals("ArrayList " + expResult,expResult, result);
	}
	
	@Test
	public void testAddUniversity2() {
		boolean expResult = true;
		boolean result = dbc.addUniversity(this.u);
		dbc.deleteSchool(u);
		assertEquals("ArrayList " + expResult,expResult, result);
	}
}
