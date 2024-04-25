package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
      //1 to 10;
		//loops
		//1.While
		
		int o=0;
		while(o<=99) {
			System.out.println(o);
			o++;
		}
		
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
		int p=20;
		while (p>=1) {
			
			System.out.println(p);
			
			p--;
			break;
		}
		
		System.out.println("!!!!!!!!!!!!!!!!!");
		 
		///infinite loop
//		while(true) {
//			System.out.println("Welcome to My restaurant");
//		}
		//Unreachable code
//		while (false) {
//			System.out.println("This is not a dead code but unreachble code");
//			
//		}
//		
//		
//		boolean flag=true;
//		while(flag) {
//			System.out.println("This may not be a unreachable code since there is a varibale in while ");
//		}
				
				
		//2.for loop
		
		//print 1 to 10--in even numbers
		for(int t=0; t<=10; t=t+2) {
			System.out.println(t+" ");
			
			
		}
		
		//odd numbers
		for(int m=1;m<=20;m=m+2) {
			System.out.print(m+" ");
		}
		System.out.println("--------------------------------");
		for(int q=0;q<=10;q++) {
			System.out.println(q);
			if(q%2==0) {
				System.out.println("Even number wit modulus example");
				//break; // break for loop 
			}
		}
		System.out.println("000000000000000000000000000000000000000000000");
		//interview question
//		for(;;) {
//			System.out.println("this will print infinite loop");
//		}

		
		
	//3.do while
		int c=20;
		do {
			if(c%2==0) { 
			System.out.println(c);}
			
			c++;
		}
		while(c<=100);
	}
	
	
	
	

}
