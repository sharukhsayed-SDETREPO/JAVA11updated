package FinallyConcept;

public class UserClass {

	
	public static void test() {
		
		System.out.println("Start");
		try {
			int h=9/0; 
			System.out.println("After excetion");
		}
		
		  catch (ArithmeticException k) { // System.out.println("/ zero exception");
		  k.printStackTrace();
		  
		 }
//		 		
		finally {
			System.out.println("this is finally it cannot be stopped");
			System.out.println("It will be printed with or without the exception");
			System.out.println("It will be printed if exception type is wrong");
			System.out.println("The execution will be stopped ony at the end of this method ,if any exception (without catch) is there it wont continue further in main method");
		}
		
	}
	public static void main(String[] args) {
		 test();
System.out.println("Byes");
	}

}
