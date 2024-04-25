package OOO_Inheritance;

public class TestUSer {

	public static void main(String[] args) {
	 BMW B1= new BMW();
	 B1.stop();// this will call the BMW method //Overriden BMW method from Car
	 B1.start();//inherited from car
	 B1.refule(); //inherited
	 B1.autoPark();//individual 
	 B1.Engine();// this will call the BMW method //Overriden BMW method from vehicle
	 B1.Seat();//inherited+inherited
	 
	 //Parent class
	 
	 Car C1= new Car();
	 C1.stop(); //individual
	 C1.start();//Individual
	 C1.refule();//Individual
	 C1.Engine();//Inherited
	 // C1.autoPark// Not possible since parent cannot inherit child properties
	 
	 
	 
	 ///PArent ref variable refereing to child object-top casting
	 System.out.println("111111111111111111111111111111111111111111111111111111");
	 Car C2= new BMW();
	 C2.stop();// this will call the BMW method //Overriden BMW method from Car
	 C2.start();//car method
	 C2.refule();//Car method 
	 C2.Engine();// //;// this will call the BMW method //Overriden BMW method from vehicle grandparent if not overriden it will call the individual method of Vehicle class
 	 C2.Seat();//inherted method from vehicle
	 //C2.autopark()//not possible reference type check
	 
	 System.out.println("ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
	 Vehicle V1=new BMW();
	 	 V1.Engine();//;// this will call the BMW method //Overriden BMW method from vehicle if not overriden it will call the individual method of Vehicle class
	 	 V1.Seat();
	 //for all the methods it will apply the reference type check
	 
	 //down casting --with ading additional caste will trhow classcast exception
	 
	// BMW b3=(BMW) new Car();//Class Cast exception
	 
	 

	}

}
