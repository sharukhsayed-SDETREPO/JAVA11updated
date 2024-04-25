package JavaSessions;

public class Employee {

	
	//Define Class level variable
	String name;
	int age;
	double salary;
	boolean isCitizen;
	char grade;
	
	public static void main(String[] args) {
		//Local variable
		
		int g=10;
		//To acess class variables define a object
		Employee obj=new Employee();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.isCitizen);
		System.out.println(obj.grade);
		//All the default values will be printed

	}

}
