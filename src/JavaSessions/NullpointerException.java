package JavaSessions;

public class NullpointerException {
   public static  String EmplName;
    int age;
    
    
    
    
    
    
	public NullpointerException(String emplName, int age) {
		EmplName = emplName;
		this.age = age;
	}






	public static void main(String[] args) {
	
		NullpointerException N1=null;
	//
		
		//System.out.println(N1.age);//This will give null pointer exception
//		no output will come FTER NULL POINNTER EXCEPTION
		
		NullpointerException N12 = new NullpointerException("Srh",2);
		System.out.println(N12.EmplName);
		

	}

}
