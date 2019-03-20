package edu.csbsju.cs.Controllers;
import edu.csbsju.cs.Entity.*;
import java.util.ArrayList;

public class searchSchools {
	
	public static ArrayList<String> searchAllSchools(String name, String state, String location, String control, String numStudents, String females, String SATV, String SATM, String expenses, String financialAid, String numApplicants, String admitted, String enrolled, String academicScale, String socialScale, String qOLScale)
	{
		/*String state;
		int numStudents;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter State:");
		
		state = sc.nextLine();
		state.toLowerCase();
		System.out.println("Enter minimum number of students");
		numStudents = sc.nextInt();*/
	
		
		ArrayList<University> schools = DataBaseController2.getAllSchoolDetails();
		String[][] list = new String[schools.size()][2];
		ArrayList<String> info = new ArrayList<String>();

		int num = 0;
		int passed = 0;
		if(name != null && !name.equals(""))
		{
			passed++;
		}
		if(state != null && !state.equals(""))
		{
			passed++;
		}
		if(location != null && !location.equals(""))
		{
			passed++;
		}
		if(control != null && !control.equals(""))
		{
			passed++;
		}
		if(numStudents != null && !numStudents.equals(""))
		{
			passed++;
		}
		if(females != null && !females.equals(""))
		{
			passed++;
		}
		if(SATV != null && !SATV.equals(""))
		{
			passed++;
		}
		if(SATM != null && !SATM.equals(""))
		{
			passed++;
		}
		if(expenses != null && !expenses.equals(""))
		{
			passed++;
		}
		if(financialAid != null && !financialAid.equals(""))
		{
			passed++;
		}
		if(numApplicants != null && !numApplicants.equals(""))
		{
			passed++;
		}
		if(admitted != null && !admitted.equals(""))
		{
			passed++;
		}
		if(enrolled != null && !enrolled.equals(""))
		{
			passed++;
		}
		if(academicScale != null && !academicScale.equals(""))
		{
			passed++;
		}
		if(socialScale != null && !socialScale.equals(""))
		{
			passed++;
		}
		if(qOLScale != null && !qOLScale.equals(""))
		{
			passed++;
		}
		
		for(int i =0; i<schools.size(); i++)
		{
			if(schools.get(i).getName().contains(name) && !name.equals("") && !name.equals(null))
			{
				num++;
			}
			if(schools.get(i).getState().equals(state) && !state.equals("") && !state.equals(null))
			{
				num++;
			}
			if(schools.get(i).getLocation().equals(location) && !location.equals("") && !location.equals(null))
			{
				num++;
			}
			if(schools.get(i).getControl().equals(control) && !control.equals("") && !control.equals(null))
			{
				num++;
			}
			if(Integer.toString(schools.get(i).getNumStudents()).equals(numStudents) && !numStudents.equals("") && !numStudents.equals(null))
			{
				num++;
			}
			if(Double.toString(schools.get(i).getFemales()).equals(females) && !females.equals("") && !females.equals(null))
			{
				num++;
			}
			if(Double.toString(schools.get(i).getSATV()).equals(SATV) && !SATV.equals("") && !SATV.equals(null))
			{
				num++;
			}
			if(Double.toString(schools.get(i).getSATM()).equals(SATM) && !SATM.equals("") && !SATM.equals(null))
			{
				num++;
			}
			if(Double.toString(schools.get(i).getExpenses()).equals(expenses) && !expenses.equals("") && !expenses.equals(null))
			{
				num++;
			}
			if(Double.toString(schools.get(i).getFinancialAid()).equals(financialAid) && !financialAid.equals("") && !financialAid.equals(null))
			{
				num++;
			}
			if(Integer.toString(schools.get(i).getNumApplicants()).equals(numApplicants) && !numApplicants.equals("") && !numApplicants.equals(null))
			{
				num++;
			}
			if(Double.toString(schools.get(i).getAdmitted()).equals(admitted) && !admitted.equals("") && !admitted.equals(null))
			{
				num++;
			}
			if(Double.toString(schools.get(i).getEnrolled()).equals(enrolled) && !enrolled.equals("") && !enrolled.equals(null))
			{
				num++;
			}
			if(Integer.toString(schools.get(i).getAcademicScale()).equals(academicScale) && !academicScale.equals("") && !academicScale.equals(null))
			{
				num++;
			}
			if(Integer.toString(schools.get(i).getSocialScale()).equals(socialScale) && !socialScale.equals("") && !socialScale.equals(null))
			{
				num++;
			}
			if(Integer.toString(schools.get(i).getqOLScale()).equals(qOLScale) && !qOLScale.equals("") && !qOLScale.equals(null))
			{
				num++;
			}
			
		
		list[i][0] = schools.get(i).getName();
		list[i][1] = Integer.toString(num);
		}
		for(int i = 0; i<list.length; i++)
		{
			if(list[i][1].equals(Integer.toString(passed)))
			{
				info.add(list[i][0]);
			}
		}
		
		
	/*	while(i<schools.size()) {
			University u1 = schools.get(i);
			if (u1.getState().toLowerCase().equals(state) && numStudents <= u1.getNumStudents()) {
					list.add(u1);
			}
			i++;
		}*/
		//sc.close();
		return info;
	}
}
