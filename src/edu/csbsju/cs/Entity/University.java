package edu.csbsju.cs.Entity;

import java.util.*;

/**
 * 
 */
/**package DatabaseLibrary
/**
 * @author aandrews002
 *
 */
public class University {
private String name, state, location, control;
private int numStudents, numApplicants, academicScale, socialScale, qOLScale;
private double enrolled, SATV, SATM, expenses, financialAid,  admitted, females;
private ArrayList<String> emphases;

	/**
	 * 
	 */
	public University(String name, String state, String location, String control, int numStudents, 
			 double females, double SATV, double SATM, double expenses, double financialAid, 
			 int numApplicants, double admitted, double enrolled, int academicScale, int socialScale, 
			 int qOLScale, ArrayList<String> emphasess) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.state = state;
		this.location = location;
		this.control = control;
		this.numStudents = numStudents;
		this.females = females;
		this.SATV = SATV;
		this.SATM = SATM;
		this.expenses = expenses;
		this.financialAid = financialAid;
		this.numApplicants = numApplicants;
		this.admitted = admitted;
		this.enrolled = enrolled;
		this.academicScale = academicScale;
		this.socialScale = socialScale;
		this.qOLScale = qOLScale;
		this.emphases = emphasess;
	}
	
	/*while i < 
		University u = universites.get(i)
		if param == u.getname
		u.getname();*/
	

	/**
	 * @return the state
	 */
	public String getName() {
		return this.name;
	}
	
	public String getState() {
		return this.state;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return this.location;
	}



	/**
	 * @return the control
	 */
	public String getControl() {
		return this.control;
	}



	/**
	 * @return the numStudents
	 */
	public int getNumStudents() {
		return this.numStudents;
	}



	/**
	 * @return the numApplicants
	 */
	public int getNumApplicants() {
		return this.numApplicants;
	}



	/**
	 * @return the academicScale
	 */
	public int getAcademicScale() {
		return this.academicScale;
	}



	/**
	 * @return the socialScale
	 */
	public int getSocialScale() {
		return this.socialScale;
	}



	/**
	 * @return the qOLScale
	 */
	public int getqOLScale() {
		return this.qOLScale;
	}



	/**
	 * @return the enrolled
	 */
	public double getEnrolled() {
		return this.enrolled;
	}



	/**
	 * @return the sATV
	 */
	public double getSATV() {
		return this.SATV;
	}



	/**
	 * @return the sATM
	 */
	public double getSATM() {
		return this.SATM;
	}

	/**
	 * @return the expenses
	 */
	public double getExpenses() {
		return this.expenses;
	}

	/**
	 * @return the financialAid
	 */
	public double getFinancialAid() {
		return this.financialAid;
	}

	/**
	 * @return the admitted
	 */
	public double getAdmitted() {
		return this.admitted;
	}



	/**
	 * @return the females
	 */
	public double getFemales() {
		return this.females;
	}

	public ArrayList<String> getEmphases(){
		return this.emphases;
	}
	
	public String print()
	{
		String s = this.name + " " + this.state + " " + this.location + " " + 
	this.control + " " + Integer.toString(this.numStudents) + " " + Double.toString(this.females) + 
	" " + Double.toString(this.SATV) + " " + Double.toString(this.SATM) + " " + Double.toString(this.expenses) + 
	" " + Double.toString(this.financialAid) + " " + Integer.toString(this.numApplicants) + " " + 
	Double.toString(this.admitted) + " " + Double.toString(this.enrolled) + " " + Integer.toString(this.academicScale) + 
	" " + Integer.toString(this.socialScale) + " " + Integer.toString(this.qOLScale);
		return s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
