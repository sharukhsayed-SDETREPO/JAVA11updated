package SuperKeywordconcept;

public class Car {
	
	public Car() {
		System.out.println("Car constructor with no i/p");
	}
	
	public Car(int i) {
		System.out.println("Car constructor with 1 i/p" +i );
	}
	
	public Car(int i ,int j) {
		System.out.println("Car constructor with 2 i/p" + (i+j));
	}
	
	int max_speed =500;
	
	public void start() {
		System.out.println("Car--start method");
	}
	
	
	
	

}
