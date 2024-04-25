package OOO_Inheritance;

public class Car extends Vehicle{
	
	public void start() {
		System.out.println("Car--start method");
	}
	
	public int  stop() {
		System.out.println("Car--stop method");
		
		return 20;
	}
	
	public void refule() {
		System.out.println("Car--refuels method");
	}
}
