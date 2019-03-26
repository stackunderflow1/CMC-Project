package src.edu.csbsju.cs.Controllers;
import src.edu.csbsju.cs.Entity.*;
import java.util.ArrayList;

public class viewUsers {

	public void viewAllUsers()
	{
		ArrayList<Users> allUsers = DataBaseController2.getAllUsers();
		//int a = 0;
		int i = 0;
		while (i<allUsers.size()) {
			//while(a<6) {
				System.out.print(allUsers.get(i) + " ");
				//a++;
			//}
			System.out.print("\n");
			i++;
			//a = 0;
		}
	}
		
	}

