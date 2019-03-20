package edu.csbsju.cs.Controllers;
import edu.csbsju.cs.Entity.*;
import java.util.ArrayList;


public class listOfUniversities1
{
	public static void main(String[] args) {	
		ArrayList<University> allSchools = DataBaseController2.getAllSchoolDetails();
		int i = 0;
		while(i < allSchools.size()) {
			//int a = 0;
			//while(a < 16) {
				System.out.print(allSchools.get(i) + " ");
				//a++;
			//}
			System.out.print("\n");
			i++;
			//a = 0;
		}
	}
}
