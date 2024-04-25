package JavaSessions;

public class Students {
String name;
int rollNumber;
int marks;
char gender;



		public String getStudentName() {
			return name;
		}

		public  void setStudentName(String nameFROMMETHOD) {
		name=nameFROMMETHOD;	
			
		}


	public static void main(String[] args) {
	
		Students obj=new Students();
		obj.setStudentName("Sharukh");// this will change the value of class variable
		String classname=obj.getStudentName();
		System.out.println(classname);
		
		
		//this changed the value of class variable via a method and this keyword
		/* we can change it through boj name as well as show below */
		obj.name="Sayed";
		System.out.println(obj.getStudentName());
	}

}
