package OOO_Inheritance;

public class BMW  extends Car {

	
	
	//Method overriding  same method name/signature but different body
	
	
	@Override  //to check if a method is overridden properly
	public int stop() {
		System.out.println("BMW--stop method");
		return 30;
	}
	
	
	//@Override // cannot write since this is child method and not present in parent class
	public void autoPark(){
		System.out.println("BMW---This is autopark method");
	}
	
	@Override
	public void Engine() {
		System.out.println("BMW ------Engine method");
	}
	
	
}
