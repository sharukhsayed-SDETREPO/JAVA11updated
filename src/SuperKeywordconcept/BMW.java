package SuperKeywordconcept;

public class BMW extends Car {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	
	
	public BMW() {
		super();  //Signature points the type of constructor caller,Super should always be the first keyword
		System.out.println("BMW constructor with no i/p");
	}
	
	public BMW(int i) {
		super(i);  //Signature points the type of constructor caller,Super should always be the first keyword
		System.out.println("BMW constructor with 1 i/p" + i );
	}
	public BMW(int i,int j) {
		super(i,j);  //Signature points the type of constructor caller,Super should always be the first keyword
		System.out.println("BMW constructor with 2 i/p" + (i+j));
	}
	
	
	
   int max_speed =100;  //Variables cannot  be overriden
	
   
   @Override
	public void start() {
		System.out.println("BMW--start method");
                                                  }
 //to access parent class members without using parent object we can use super keyword
   public void drive() {
		System.out.println("Calling car max speed"+ super.max_speed);//varibale
		super.start();//parent method
	}
}
