package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		
		System.out.println("This will be printed before exception");
		System.out.println("This will be printed before exception");
		System.out.println("This will be printed before exception");
		
		try { 
			System.out.println("This will also be printed");
				int i=9/0;
				System.out.println("This won't be printed since we are encountering exception at above line");
		}
		//We can write the type of exception also Or general Exception (super class of all exception)
		//We can also write parent/super class of Exception -->Throwable
		//We  can write Error (another child of throwable but it won't catch our exception
		catch(ArithmeticException u){
			System.out.println("Exception found ++"+ u);
			u.printStackTrace();//Print the Exception with the line at which it encountered
			System.out.println(u.getMessage());///Only print the exception
			System.out.println("Code to handle the exception");
			
		}
		
		System.out.println("This will also be printed after exception");

	}

}
