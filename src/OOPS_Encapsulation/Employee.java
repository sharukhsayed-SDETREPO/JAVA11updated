package OOPS_Encapsulation;

public class Employee {

	
	
	private String EmployeeName;
	private int EmployeeAge;
	private long EmployeePhoneNum;
	private double EmployeeISCitizen;
	private char EMPcode;
	
	
	public String getEmployeeName() {
		return  EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.EmployeeName = employeeName;
	}
	public int getEmployeeAge() {
		return EmployeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		EmployeeAge = employeeAge;
	}
	public long getEmployeePhoneNum() {
		return EmployeePhoneNum;
	}
	public void setEmployeePhoneNum(long employeePhoneNum) {
		EmployeePhoneNum = employeePhoneNum;
	}
	public double getEmployeeISCitizen() {
		return EmployeeISCitizen;
	}
	public void setEmployeeISCitizen(double employeeISCitizen) {
		EmployeeISCitizen = employeeISCitizen;
	}
	public char getEMPcode() {
		return EMPcode;
	}
	public void setEMPcode(char eMPcode) {
		EMPcode = eMPcode;
	}
	
	

	
}
