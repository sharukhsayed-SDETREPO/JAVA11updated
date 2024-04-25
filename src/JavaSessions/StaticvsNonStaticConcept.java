package JavaSessions;


public class StaticvsNonStaticConcept {

	String name;
	static String address="srk";
	int age;                                                                         
	static int phone;    
	                                                                       
	
	
	public void getName(){
		System.out.println("getnamemethod");
		System.out.println(name + age +address+phone);
	}
	
	public static void getName2() {
		System.out.println(address);
		System.out.println("this is a static method");
	}
	
	public static void main(String[] args) {
		//two ways of calling a staic member
		
		
		//1.Directly
		getName2();
		phone=25;
		address="Room A1";
		
		
				System.out.println(phone + address);
		
				
		//2. Using class name
				
		StaticvsNonStaticConcept.getName2();		
        System.out.println(StaticvsNonStaticConcept.address);
        System.out.println(StaticvsNonStaticConcept.phone);
        
        
        //3. Using object aslo which is not required 
        StaticvsNonStaticConcept obj = new StaticvsNonStaticConcept();
        obj.getName2();
        obj.getName();
        System.out.println(obj.name);        System.out.println(obj.age);
        System.out.println(address);
        System.out.println(obj.phone);
	}

}
