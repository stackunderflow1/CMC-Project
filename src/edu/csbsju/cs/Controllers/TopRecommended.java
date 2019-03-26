package src.edu.csbsju.cs.Controllers;
import src.edu.csbsju.cs.Entity.*;
import java.util.*;


/**package DatabaseLibrary;
/**
 * @author aandrews002
 *
 */
public class TopRecommended {

	private static ArrayList<University> schools = DataBaseController2.getAllSchoolDetails();;
	/**
	 * 
	 */
	public static void topRecommended(String n) {
		// TODO Auto-generated constructor stub
		University u = null;
		for(int i = 0; i<schools.size(); i++)
		{
			if(schools.get(i).getName().equals(n))
			{
				 u = schools.get(i);
			}
		}
		
		
		double [] distances = new double[schools.size()];
		String [] sc = new String[schools.size()];
		double d = 0;
		int i = 0;
		
		for(University univ : schools)
		{
			d = dist(u, univ);
			distances[i] = d;
			sc[i] = univ.getName();
			i++;
		}
		topRecommendedSort(distances, sc);
			}
			
	
	// This method calculates the distance between two schools by comparing the values of each parameter
	public static double dist(University u1, University u2) {
		//variables to be compared
		String u1Control,u1State, u1Location;
		int u1NumStudents;
		String u2Control,u2State, u2Location;
		int u2NumStudents;
		
		//Each comparison return a number. Therefore, these are the variables to hold those numbers
		double controlNumber,totalNumStudents, stateNumber, locationNumber, totalFemales, totalSATV, totalSATM, totalExpenses;
		double totalFinAid, totalNumApplicants, totalAdmitted, totalEnrolled, totalAcademicScale, totalSocialScale, totalQOLScale;
		
		//Assigning value to the variables
		u1Control = u1.getControl();
		u1State = u1.getState();
		u1NumStudents = u1.getNumStudents();
		u2Control = u2.getControl();
		u2State = u2.getState();
		u2NumStudents = u2.getNumStudents();
		u1Location = u1.getLocation();
		u2Location = u2.getLocation();
		
		
		
		if (u1Control.equals(u2Control)) {
			//control match
			controlNumber = 0.0;
		} else {
			controlNumber = 1.0;
		}
		if (u1Location.equals(u2Location)) {
			//control match
			locationNumber = 0.0;
		} else {
			locationNumber = 1.0;
		}
		if (u1State.equals(u2State)) {
			//states match
			stateNumber = 0.0;
		}else {
			stateNumber = 1.0;
		}
		
		totalFemales = Math.abs((u1.getFemales() - u2.getFemales())/ 99.0);
		totalSATV = Math.abs((u1.getSATV() - u2.getSATV()) /500.0);
		totalNumStudents = Math.abs((u1NumStudents - u2NumStudents)/ 30000.0);
		totalSATM = Math.abs((u1.getSATM() - u2.getSATM())/ 530.0);
		totalExpenses = Math.abs((u1.getExpenses()-u2.getExpenses())/52477.0);
		totalFinAid = Math.abs((u1.getFinancialAid()-u2.getFinancialAid())/95.0);
		totalNumApplicants = Math.abs((u1.getNumApplicants()-u2.getNumApplicants())/13000.0);
		totalAdmitted = Math.abs((u1.getAdmitted()-u2.getAdmitted())/95.0);
		totalEnrolled = Math.abs((u1.getEnrolled()-u2.getEnrolled())/90.0);
		totalAcademicScale = Math.abs((u1.getAcademicScale()-u2.getAcademicScale())/4.0);
		totalSocialScale = Math.abs((u1.getSocialScale()-u2.getSocialScale())/4.0);
		totalQOLScale = Math.abs((u1.getqOLScale()-u2.getqOLScale())/4.0);
		
		double d = (controlNumber + stateNumber + totalNumStudents + locationNumber + totalFemales + totalSATV + totalSATM + totalExpenses + totalFinAid + totalNumApplicants + totalAdmitted + totalEnrolled + totalAcademicScale + totalSocialScale + totalQOLScale);
		
		return d;
}
	
	public static void topRecommendedSort(double a1[], String a2[])
	{
		int n = a1.length;
		for (int i = 0; i< n-1; i++)
		{
			for (int j=0; j<n-i-1; j++)
			{
				if(a1[j] > a1[j+1]) {
					double temp = a1[j];
					a1[j] = a1[j+1];
					a1[j+1] = temp;
					
					String temp2 = a2[j];
					a2[j] = a2[j+1];
					a2[j+1] = temp2;
				}
			}
		}
		System.out.println("Top Recommended: \n" + a2[1] + "\n" + a2[2] + "\n" +a2[3] + "\n" + a2[4] + "\n" + a2[5]);
		System.out.println("\n\nwith distances of: \n" + a2[1] + ": " + a1[1] + "\n" + a2[2] + ": " + a1[2] + "\n" +a2[3] + ": " +a1[3] + "\n" + a2[4] + ": " + a1[4] + "\n" + a2[5] + ": " + a1[5]);
	}

		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		topRecommended("MASSACHUSETTS INSTITUTE OF TECHNOLOGY");
	}

}
