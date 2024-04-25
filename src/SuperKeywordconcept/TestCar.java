package SuperKeywordconcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b= new BMW();
		System.out.println(b.max_speed); //this will print bmw variable
		
		b.start(); //overriden method
		b.drive();//Parent class method + variable
		
		
		
		BMW b2= new BMW(10);
		BMW b3= new BMW(10,12);

		
		Car c1=new Car(15,10);
		c1.start();
	}

}
