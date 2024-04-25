package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		ThrowsKeyword obj=new ThrowsKeyword();
		try {obj.getValue();
		
		}
		//below catch blow will handle the exception for the excption in getNumber (works with/witout throws not sure why
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("After all methods");

	} 
	
	
	public void getValue() throws ArithmeticException{
		System.out.println("Get value method");
		getName();
	}
	public void getName() throws ArithmeticException{
		System.out.println("Get value Name");
		getNumber();
	}
	//no try catch block for methods it can only be written where the method is called
	public void getNumber() throws ArithmeticException{
		System.out.println("Get value getNumber");
		int u=3/0;
		System.out.println("This wont be printed");
	}
}
