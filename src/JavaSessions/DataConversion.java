package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {
	
		//String to integer
		String o="200";
		System.out.println(Integer.parseInt(o)+200);
		
		String g= "12.343";
		System.out.println(Double.parseDouble(g)+200+1.2);
		
//		
//		String k="200G";
//		System.out.println(Integer.parseInt(k)+1);//This will throw number format exception
//		
		
		//int to String
		
		int q=450;
		System.out.println(String.valueOf(q)+" This will the value");
		
		

	}

}
