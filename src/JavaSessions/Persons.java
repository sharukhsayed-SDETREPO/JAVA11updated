package JavaSessions;

public class Persons {

	String name;
	int phoneNumber;
	static  int  age;
	 static final char gender='M';
	
	//creating constructors
//	public Persons() {
//		System.out.println("Thids is a first constructors");
//	}
//	public Persons(int h) {
//		System.out.println("This is a second constructors with one i?p");
//	}
	
	
	public   Persons(String name2,int age,int phoneNumber) {
		this.name=name2;
		this.age=age;
		this.phoneNumber=phoneNumber;
		//this.gender=gender;//will not  work due to final keyword
	}
	
	
	public Persons(String name,int age) {
		this.name=name;
		this.age=age;

	 }
	
	
	
	public static void main(String[] args) {
		//call const create the object
		Persons P1= new Persons("Sharukh",25,7584);//n will not be reflected since final is defined
		Persons P2= new Persons("Sohel",23);
		
		System.out.println(P1.age + " " + P1.phoneNumber+ " "+ P1.age+ "" +P1.gender);
		System.out.println(P2.age + " " + P2.phoneNumber+ " "+ P2.age);
	

	}

}
