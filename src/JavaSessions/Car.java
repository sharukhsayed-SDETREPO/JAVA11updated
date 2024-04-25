package JavaSessions;

//i//mport com.sun.java_cup.internal.runtime.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;
import java.util.Scanner;
public class Car {
	
	
	String name; 
	String colour;
	int price;
	String Model;
	static int wheels=4;
	static final int Doors=4;
	public static void main(String [] args) {
//		Car C1=new Car();
//		Car C2=new Car();
//		Car C3=new Car();
//		
//		C1.name="Audi";
//		C1.colour="red";
//		C1.price=500;
//		C1.Model="Q7";
//		
//		C2.name="Jaguar";
//		C2.colour="red";
//		C2.price=90;
//		C2.Model="F pace";
//		
//		
//		
//		C3.name="JEEP";
//		C3.colour="Army";
//		C3.price=78;
//		C3.Model="Compass";
//		wheels=5;           
//		//Car.Doors=5;  //not possible when final is used
//		System.out.println(C1.name + C1.colour + C1.price +C1.Model +C1.wheels+Doors);
//		System.out.println(C2.name + C2.colour + C2.price +C2.Model + Car.wheels);
//		System.out.println(C3.name + C3.colour + C3.price +C3.Model + Car.wheels);
		
		//int array [] =new int [5];
		//System.out.println(array);
//		//
		
		//float a=35/0;
		
		//System.out.println(a);
		 Scanner scanner = new Scanner(System.in) ;
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        int num = 1;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }
		
		
		
		
	}


