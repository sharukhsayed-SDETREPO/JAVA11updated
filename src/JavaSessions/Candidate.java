package JavaSessions;


public class Candidate {
 public String name ;
 public int age;
 private    int salary;
 
 public Candidate(String name, int age, int salaryb) {
	
		this.name = name;
		this.age = age;
		this.salary = salaryb;
	}
 
 
	public static void main(String[] args) {
	
		Candidate C1=new Candidate ("Amar", 25, 30000);
		Candidate C2=new Candidate ("Akbar",30,40000);
		Candidate C3=new Candidate ("Anthony",45,10000);
		
		System.out.println(C1.name + " " +C1.age + " "+ C1.salary);
		
		System.out.println(C2.name + " " +C2.age + " "+ C2.salary);
		
		System.out.println(C3.name + " " +C3.age + " "+ C3.salary);
		
//		Amar 25 30000
//		Akbar 30 40000
//		Anthony 45 10000
		
		
		
		
		C1=C2;
        System.out.println(C1.name + " " +C1.age + " "+ C1.salary);
		
		System.out.println(C2.name + " " +C2.age + " "+ C2.salary);
		
		System.out.println(C3.name + " " +C3.age + " "+ C3.salary);
		
//		Akbar 30 40000
//		Akbar 30 40000 b
//		Anthony 45 10000
		
		C2=C3;
		    System.out.println(C1.name + " " +C1.age + " "+ C1.salary);
			
			System.out.println(C2.name + " " +C2.age + " "+ C2.salary);
			
			System.out.println(C3.name + " " +C3.age + " "+ C3.salary);
			
//			Akbar 30 40000
//			Anthony 45 10000
//			Anthony 45 10000
			
			
			  C3=C1; 
			  System.out.println(C1.name + " " +C1.age + " "+ C1.salary); 
			  System.out.println(C2.name + " " +C2.age + " "+ C2.salary); 
			  System.out.println(C3.name + " " +C3.age + " "+ C3.salary);
//			  Akbar 30 40000
//			  Anthony 45 10000
//			  Akbar 30 40000

			 
	}




	

}
