package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
	//conditional operators is used to write decision making statements
	//<,>,<=,>=,==,!=-----> if else
		
		int a=20;// this is a assignment operator
		int b=75;
		System.out.println(b>a);//always boolean condition
		
		if (b>a) {
			System.out.println("b is a greater number");
		}
		
		else {
			System.out.println("a is a greater number");
		}
		
		
		////for multiple conditions use else if 
		
		int num= 0;
		if(num>0) {
			System.out.println("num is a positive integer");
		}
		else if (num ==0) {                        //it wont check anyother conditions once this is satisfied
			System.out.println("num is 0");
		}
		
		else {
			System.out.println("num is a -ve number");
		}
		
		
		String browsername="fdgdf" ;
		
		if (browsername.equals("Opera")){
			System.out.println("launch opera");
		}
		else if (browsername.equals("firefox")) {
			System.out.println("launch firefox");
		}
		
		else if (browsername.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else {
			System.out.println("Invalid browser name" + browsername);
		}

		
		
		
		//compound condition with inefficient code 
		
		int number =9;
		if (number==25) {
			System.out.println("number is equal to 25");
			if (number>10) {
				System.out.println("number is greater than 10");
			}
			if (number>5) {
				System.out.println("number is greater than 5");
			}
			else {
				System.out.println("number is greater than both 5 and 10");
			}
			}
		else
		{System.out.println("outside loop else is considered if the condition fails");}
		
		
		//compound condition with efficient code 
		//wap to find the greates of all 3 numbers
		int x,y,z; 
		x=117325;y=2265;z=6545;
		if(x>y && x>z) {
			System.out.println("X is the greatest of all 3");
		}
		else if (z>y) {
			System.out.println("Z is the greatest of all 3");
		}
		else {System.out.println("Y is the greatest of all 3 ");
		}
		///&& is called the short circuit operator
		
		
		//Switch case example
		int c=220;
		
		//switch cases do not allow boolean value(conditions)
		switch (c) {
		case 10:
			System.out.println("c is 10");
			break;
		case 20:
			System.out.println("C is 20");
			break;
		case 30:
			System.out.println("C is 30");
			break;
		case 40:
			System.out.println("C is 40");
			break;

		default:
			System.out.println("invalid case");
			break;
		}
		
		
		String browsername2="gnhg";
				switch (browsername2) {
				case "chrome":
					System.out.println("launch chrome");
					break;
				case "opera":
					System.out.println("launch opera");
					break;
					
				case "Firefox":
					System.out.println("launch firefox");
					break;
				default:
					System.out.println("Invalid browser" + browsername2);
					break;
				}
		
		
		///dead code example
		if(true) {
			System.out.println("this will always print thise");
			}
		else {System.out.println("This code will never print");} //statement/s for conditions /expressions are somewhat valid  
		
		

		
		

			
			
		
		
		
		
	}

}
