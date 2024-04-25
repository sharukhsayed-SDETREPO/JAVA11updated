package OOPS_Encapsulation;

public class Company {
	
	public String companyName;
	public String companyAddress;
	public long NumberOfEmployees;
	private String salaryInFo;
	
	
	
	
	public void getCompanyName() {
		System.out.println("This is a company name");
	}

	public void getEmpInfo() {
		//private methods/variables can be access in the same class by other methods or main methods
		System.out.println(salaryInFo);
		getSalaryInfo();
	
	}
	
	private void getSalaryInfo() {
		System.out.println("This is a private method for salary info  ");
		salaryInFo="This is a SalaryInFo";
	System.out.println(salaryInFo);
	}
	public static void main(String[] args) {
		
      Company C1=new Company();
      
      
      C1.companyName="SRK"; 
      C1.companyAddress="MECCA";
      C1.NumberOfEmployees=23782;
      C1.salaryInFo="This is a HR opolicy";
      System.out.println(C1.salaryInFo);
      C1.getCompanyName();
      C1.getEmpInfo();
  
      C1.getSalaryInfo();
    
      //asdasd will be  printed for policy
      Company C2=new Company();
	C2.salaryInFo="This is a HR opolicy";
	  System.out.println(C2.salaryInFo);}

}
