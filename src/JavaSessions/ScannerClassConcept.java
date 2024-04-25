package JavaSessions;

import java.util.Scanner;

public class ScannerClassConcept {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		String name =sc.nextLine(); 
		char sex=sc.next().charAt(0);
        int age =sc.nextInt();   
        long phonenumber = sc.nextLong();
        double salary =sc.nextDouble();
        System.out.println("Name :" +name );
        System.out.println("sex :" +sex );
        System.out.println("age :" +age );
        System.out.println("phonenumber :" +phonenumber );
        System.out.println("salary :" +salary );
        
	}

}
