package JavaSessions;

import java.util.ArrayList;

public class Company {
	
	
	public static String getCompanyName() {
		return "IBM";
	}
	
	public double getSharePrice() {
		
		return 34.564;
	}

	
	public ArrayList<String>  getDeptlist() {
		ArrayList<String> deoptList= new ArrayList<String>();
		deoptList.add("Admin");
		deoptList.add("IT");
		deoptList.add("HR");
		deoptList.add("Sales");
		deoptList.add("Accounting");
		deoptList.add("Admin");
		return deoptList;
	}
	public String [] getBoardMembersName() {
		String [] name= new String[2];
		name[0]="ELON";
		name[1]="Jeff";
		return name;
	}
	
	
	//for dynamic type of values
	public ArrayList<Object> getCompanyInfo() {
		ArrayList<Object> info= new ArrayList<Object>();
		info.add("Cognizant Technology solutions");
		info.add(100);
		info.add("CRAFT");
		info.add(true);
		info.add('A');
		info.add(56954.32525);
           return info;
		
	}
	
	//Create a function where when you pass the company name it will return the number of employees
	public int getNumberofEmployees(String name) {
		int employeecount=0;
		if(name.equals("IBM")) {
			employeecount= 1000;
			
		}
		else if (name.equals("Valuelabs")) {
			employeecount=600;
			
		}
		else if (name.equals("TCS")) {
			employeecount =54000;
			
		}
		else {
			System.out.println(name + "is a incoorect company name/company not found");
		}
		return employeecount;
	}
	
	
	//create a method where you pass the name of the company and it returns the list of co-founders
	public ArrayList<String> getCofounders(String comName) {
		ArrayList<String> cofo=new ArrayList<String>();
		
		if (comName.equals("Microsoft")) {
			cofo.add("Nadella");
			cofo.add("bill gates");
		}
		else if(comName.equals("Apple")) {
			cofo.add("Steve Wozniak");
			cofo.add("Steve jobbs");
			
		}
		else if(comName.equals("myntra")) {
			
			cofo.add("Bansal");
		}
		else {
			System.out.println(comName + "is a incoorect company name/company not found");
		}
		return cofo;
	}
	
	
}
