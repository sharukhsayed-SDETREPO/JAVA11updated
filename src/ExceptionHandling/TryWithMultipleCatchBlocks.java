package ExceptionHandling;

public class TryWithMultipleCatchBlocks {
public String name ;
	public static void main(String[] args) {
		System.out.println("Before Exception....");
		TryWithMultipleCatchBlocks ong=null;
		
		try {
			//int o=9/0;
			
			System.out.println(ong.name);//This will throw null pointer exception only if the above line does'nt throw any exception
			
			System.out.println("This may never be printed");
		}
		catch(ArithmeticException uy) {
			System.out.println("handle arihtmetic except"+uy.getMessage());
			System.out.println("Arth handled");
		}
		catch(NullPointerException a) {
			System.out.println("handle Null pointer "+ a.getMessage());
			System.out.println("Null handled ");
		}
		//based on the exception only one catch will be executed
		System.out.println("All excepton handled");
	}

}
