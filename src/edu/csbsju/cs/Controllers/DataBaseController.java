/**
 * 
 */
package edu.csbsju.cs.Controllers;

import dblibrary.project.csci230.*;

import java.io.*;
import java.util.*;

/**
 * @author ndrees001
 *
 */
public class DataBaseController {

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
	 * 
	 */
	public DataBaseController() {
		// TODO Auto-generated constructor stub
		String [][] newSc = getSchoolDetails();
	}
	
	public static void main(String[] args) {
		DataBaseController dbc = new DataBaseController();
		
	}

	public static String[][] getSchoolDetails() {
		// TODO Auto-generated method stub
		
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
		String[][] allSchools = dbld.getUnivDBlib().university_getUniversities();
		/**int a = 0;
		int i = 0;
		while (i<allSchools.length) {
			while(a<16) {
				System.out.print(allSchools[i][a] + " ");
				a++;
			}
			System.out.print("\n");
			i++;
			a = 0;
		}
		*/
		return allSchools;
	}
	public static String[][] getUsers() {
		
		DBLibraryDriver dbld = new DBLibraryDriver("stackund", "csci230");
		String[][] allUsers = dbld.getUnivDBlib().user_getUsers();
		return allUsers;
		/**t a = 0;
		int i = 0;
		while (i<allUsers.length) {
			while(a<10) {
				System.out.print(allUsers[i][a] + " ");
				a++;
			}
			System.out.print("\n");
			i++;
			a = 0;
		}
		*/
	}

/**public int dist(String v, String v1) {
	String[][] schools = DataBaseController.getSchoolDetails();
	int num;
	int [] sums = null;
	int [] min = null;
	double x;
	if(schools[0][0].equals(v)) {
		for(int i =1; i<schools.length+1;i++)
		{
			if(schools[0][1].equals(schools[i][1]))
			{
				num = 0;
			}
			else
			{
				num = 1;
			}
			x = Integer.parseInt(schools[0][4]) - Integer.parseInt(schools[i][4]);
			sums[i] = x + num;
		}
}
 for(int j = 0; j<sums.length;j++) {
  if(sums[j] < sums[j+1]) {
   
  }
 }
}

*/	
}
