package OOPS_Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
 
		
		
		Employee E1= new Employee();
	
		System.out.println(E1.getEmployeeAge()); //This will return default value
		
		E1.setEmployeeAge(25);
		System.out.println(E1.getEmployeeAge());//25
		
		
		E1.setEMPcode('Q');
		System.out.println(E1.getEMPcode());//Q
		
		
		
		


	}

}
