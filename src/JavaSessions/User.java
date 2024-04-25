package JavaSessions;

public class User {

	
	
	//data members 
	//1.Class variables
	//2.Class methods
	
	String name;
	int age;
	long phoneNumber;
	String email;
	String address;
    boolean isCitizen;
	
    //User defined methods
    public void getName() {
    	System.out.println("get Name method");
    }
    
    public static void main (String args[]) {
    	
    	int l=10; //this wont be given to any of the objects as this is a local variable
    	User user1=new User(); //to acess data members we create a class object with new keyword where RHS is object and LHS is object refresnce variable
    	
    	user1.name="Sharukh";
    	user1.age= 29;
    	user1.phoneNumber=7854126;
    	user1.email="rest@tes.com";
    	user1.address="Qatyar";
    	user1.isCitizen=true;
    	user1.getName();
    	User user2=new User();
    	user2.name="Sharukh2";
    	user2.age= 32;
    	user2.phoneNumber=7852342341l;
    	user2.email="rest@tes2234.com";
    	user2.address="Jeddah";
    	user2.isCitizen=false;
    	user2.getName();
        User user3=new User();
    	user3.name="Sharukh3";
    	user3.age= 18;
    	user3.getName();
    	System.out.println(user1.name+ " \n" + user1.age + "\n"+ user1.email +"\n"+user1.address +"\n"+user1.phoneNumber +"\n" +user1.isCitizen);
    	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	System.out.println(user2.name+ " \n" + user2.age + "\n"+ user2.email +"\n"+user2.address +"\n"+user2.phoneNumber +"\n");
    	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	System.out.println(user3.name+ " \n" + user3.age + "\n"+ user3.email +"\n"+user3.address +"\n"+user3.phoneNumber +"\n"); //for unassigned refrences it will return the default values
    	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
