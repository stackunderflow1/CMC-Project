package src.edu.csbsju.cs.Controllers;
import src.edu.csbsju.cs.Entity.*;
import java.util.ArrayList;

public class searchSchools {
	
	public static ArrayList<University> searchAllSchools(String name, String state, String location, String control, String numStudents, String females, String SATV, String SATM, String expenses, String financialAid, String numApplicants, String admitted, String enrolled, String academicScale, String socialScale, String qOLScale) throws NumberFormatException
	{
		
		
		ArrayList<University> schools = DataBaseController2.getAllSchoolDetails();
		ArrayList<University> schools2 = (ArrayList<University>) schools.clone();

		for(int i =0; i<schools.size(); i++)
		{
			if(!name.equals(null) && !name.equals("-1") && !name.equals("")) {
			if(schools.get(i).getName().toLowerCase().indexOf(name.toLowerCase())< 0)
					{
				schools2.remove(schools.get(i));
					}
			}
			if(!state.equals(null) && !state.equals("-1") && !state.equals("")) {
			if(schools.get(i).getState().toLowerCase().indexOf(state.toLowerCase())<0 )
			{
				schools2.remove(schools.get(i));
			}
			}
			if(!location.equals(null) && !location.equals("-1") && !location.equals("")) {
			if(schools.get(i).getLocation().toLowerCase().indexOf(location.toLowerCase())< 0 )
			{
				schools2.remove(schools.get(i));
			}
			}
			if(!control.equals(null) && !control.equals("-1") && !control.equals("")) {
			if(schools.get(i).getControl().toLowerCase().indexOf(control.toLowerCase())<0 )
			{
				schools2.remove(schools.get(i));
			}
			}
			if(!numStudents.equals(null) && !numStudents.equals("-1") && !numStudents.equals("")) {
			if(!(-1 < schools.get(i).getNumStudents() && schools.get(i).getNumStudents() <= (Integer.parseInt(numStudents))))
			{
				schools2.remove(schools.get(i));
			}}
			if(!females.equals(null) && !females.equals("-1") && !females.equals("")) {
			if(!(-1.0 < schools.get(i).getFemales() && schools.get(i).getFemales() <= (Double.parseDouble(females))))
			{
				schools2.remove(schools.get(i));
			}}
			
			if(!SATV.equals(null) && !SATV.equals("-1") && !SATV.equals("")) {
				if(!(-1.0 < schools.get(i).getSATV() && schools.get(i).getSATV() <= (Double.parseDouble(SATV))))
			{
					schools2.remove(schools.get(i));
			}
			}
			if(SATM != (null) && !SATM.equals("-1") && !SATM.equals("")) {
			if(!(-1.0 < schools.get(i).getSATM() && schools.get(i).getSATM() <= (Double.parseDouble(SATM))))
			{
				schools2.remove(schools.get(i));
			}}
			if(!expenses.equals(null) && !expenses.equals("-1") && !expenses.equals("")) {
			if(!(-1.0 < schools.get(i).getExpenses() && schools.get(i).getExpenses() <= (Double.parseDouble(expenses))))
			{
				schools2.remove(schools.get(i));
			}}
			if(!financialAid.equals(null) && !financialAid.equals("-1") && !financialAid.equals("")) {
			if(!(-1.0 < schools.get(i).getFinancialAid() && schools.get(i).getFinancialAid() <= (Double.parseDouble(financialAid))))
			{
				schools2.remove(schools.get(i));
			}}
			if(!numApplicants.equals(null) && !numApplicants.equals("-1") && !numApplicants.equals("")) {
			if(!(-1 < schools.get(i).getNumApplicants() && schools.get(i).getNumApplicants() <= (Integer.parseInt(numApplicants))))
			{
				schools2.remove(schools.get(i));
			}}
			if(!admitted.equals(null) && !admitted.equals("-1") && !admitted.equals("")) {
			if(!(-1.0 < schools.get(i).getAdmitted() && schools.get(i).getAdmitted() <= (Double.parseDouble(admitted))))
			{
				schools2.remove(schools.get(i));
			}}
			if(!enrolled.equals(null) && !enrolled.equals("-1")&& !enrolled.equals("")) {
			if(!(-1.0 < schools.get(i).getEnrolled() && schools.get(i).getEnrolled() <= (Double.parseDouble(enrolled))))
			{
				schools2.remove(schools.get(i));
			}}
			if(!academicScale.equals(null)&& !academicScale.equals("-1") && !academicScale.equals("")) {
			if(!(-1 < schools.get(i).getAcademicScale() && schools.get(i).getAcademicScale() <= (Integer.parseInt(academicScale))))
			{
				schools2.remove(schools.get(i));
			}}
			if(!socialScale.equals(null) && !socialScale.equals("-1") && !socialScale.equals("")) {
			if(!(-1 < schools.get(i).getSocialScale() && schools.get(i).getSocialScale() <= (Integer.parseInt(socialScale))))
			{
				schools2.remove(schools.get(i));
			}}
			if(!qOLScale.equals(null) && !qOLScale.equals("-1") && !qOLScale.equals("")) {
			if(!(-1 < schools.get(i).getqOLScale() && schools.get(i).getqOLScale() <= (Integer.parseInt(qOLScale))))
			{
				schools2.remove(schools.get(i));
			}}
				
					}
		return schools2;
		}
		
		
	public static void main(String[] args)
	{
<<<<<<< HEAD
	ArrayList<University> neww = searchAllSchools("a", "t", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1","-1", "-1", "-1", "-1");
=======
	ArrayList<University> neww = searchAllSchools("", "", "", "", "", "", "", "", "", "", "", "","", "", "", "");
>>>>>>> 2d8d3b1db98685ea8a89f636ad93846d95b99ae5
	for(int i = 0; i< neww.size(); i++) {
		System.out.println(neww.get(i).getName());
	}
	}
}
