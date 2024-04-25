package JavaSessions;

public class FunctionsinJava {

	public static void main(String []args) {
		FunctionsinJava obj=new FunctionsinJava();
		
		obj.test(); //will execute the first method
		
	String n1=	obj.getName();//will execute the second method and wll retunr the striing name 
	System.out.println(n1);
	
	//or
	System.out.println(obj.getName());
	
	int sum=obj.getTotal();//this will execute the 3rd method and will return the total 
	System.out.println(sum);
	//or
	System.out.println(obj.getTotal());
	
	
	System.out.println(obj.additionMethod(10, 20)); //this will execute 4th method and will return the addition of two input values 
	
	
	System.out.println(obj.isUSCitizen("Sharukh")); //this will checkc the condition and will return the return type if the condition is satisfied else it will return the default last return type
	
	System.out.println(obj.isSaudiCitizen("NAveen"));
	System.out.println(obj.getStudentMArks("Peter"));
	}
	
	//Three types of methods
	
	/*
	 * 1.Simple No return type ,does not accept input parameters,does not reutrn
	 * anything return type is void
	 */
				public void test() {
					System.out.println("get test method....pure void");
				}
				
				
				/*
				 * 2.No input parameters but return type is always there ie it return something
				 */
				
				
				public String getName() {
					System.out.println("get name method ...with return type string");
					String name = "Sharukh";
							return name;
				}
				
				public int getTotal() {
					System.out.println("get total method.....with return type int");
					int a=100,b=200,total=a+b;
					return total;
				}
				
				/* 3.Some input and some op or return */
				public int additionMethod(int a,int b) {
					System.out.println("addition method");
					int z=a+b;
					return z;
				}
				
				public boolean isUSCitizen(String name) {
					if (name.equals(("Sharukh"))){
						
						return true;
						
					}
					else if(name.equals("Tom")) {
						return false;
					}
					return true;
				}
				
				//same code with better return type
				public boolean isSaudiCitizen(String name) {
					boolean flag=false;
					
					if (name.equalsIgnoreCase("Sharukh")) {
						flag=true;
					}
					else if (name.equalsIgnoreCase("Peter")) {
						flag=false;
					}
					return flag;
				}
				
				
				public int getStudentMArks(String name) {
					int marks=-1;
					if(name.equals("Tome")) {
						marks= 100;
						
					}
					else if(name.equals("Peter")) {
						marks=23;
						
						
					}
					return marks;
				}
				
				
}
