package FinallyConcept;

public class FinallyCase {

	
	
	
	public static int getMarks(String name) {
		if(name.equals("Tom")) {
			try {
			 int k=9/0;
			}
			catch(ArithmeticException e) {
				return -20;
			}
			finally {
				System.out.println("You cannot get away from me");
				return -100;
			}
		}
		
		else if (name.equals("Marry")) {
			
			return 100;
		}
		
		else {
			
			return -1;
		}
		//return -60;
		
		
	}
	public static void main(String[] args) {
		System.out.println(getMarks("Tom"));

	}

}
