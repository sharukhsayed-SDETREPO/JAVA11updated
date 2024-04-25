package JavaSessions;

public class MainMethodOverloading {

	public static void main(String args[]) {
        System.out.println("one mainmethod");
        main(args);
         main("2",1);
        
	}
	
	
	
	public static void main(String i,int k) {
		System.out.println(i+k);
		
		;
	}
public static void main(String i,int k ,double g) {
		main("3", 1);
	}
}
