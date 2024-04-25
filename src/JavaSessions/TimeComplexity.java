package JavaSessions;

public class TimeComplexity {

	
	public static void main(String [] args) {
	
	int i=0; //O(1)// meanining this will be executed once
	
	
	
	
	for (int l=0;l<3;l++) {
		System.out.println(l);
  
		// 1+3+3+3
		//1+n+n+n=1+3n ====>ignore all the constants --->n===>O(n)--liner equation
		
		
		
for (int o=0;o<=3;o++) {
			
			for (int p=0;p<=3;p++) {
				System.out.print(o+""+p+" ");
			}
			
			
			System.out.println();
			
		}


//(1+3n)(1+3n)====1+3n+3n+9n^2====1+6n+9n^2=====>n+n^2====>O(n^2)---This is for a quadratic equation




//Similar for 3 for loops it will result it===>O(n^3)

		
	
	
	}
}
}