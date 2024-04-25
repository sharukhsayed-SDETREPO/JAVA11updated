package JavaSessions;

import java.util.ArrayList;

public class CompanyTest {

	public static void main(String[] args) {
	
		
		Company obj=new Company();
		
		String Companyname= obj.getCompanyName();
		System.out.println(Companyname);
		
		System.out.println("!!!!!!!!!!!!!!!!");
		double shprc=obj.getSharePrice();
		System.out.println(shprc);
		System.out.println("!!!!!!!!!!!!!!!!");
		
		
		ArrayList<String> deptl=obj.getDeptlist();
		System.out.println(deptl.size());
		System.out.println(deptl);
		
		for(String name:deptl) {
			System.out.println(name);
		}
		
		System.out.println(deptl.toString());
		
		System.out.println("!!!!!!!!!!!!!!!!");
		
		String[] bom=obj.getBoardMembersName();
		
		System.out.println(bom.length);
		
		ArrayList<Object>ComInfo=obj.getCompanyInfo();
		System.out.println(ComInfo);
		System.out.println("!!!!!!!!!!!!!!!!");
		
		
		int numEM=obj.getNumberofEmployees("TCS");
		System.out.println(numEM);
		System.out.println("!!!!!!!!!!!!!!!!");
		
		ArrayList<String> cofon=obj.getCofounders("Apple");
		System.out.println(cofon);
	}

}
