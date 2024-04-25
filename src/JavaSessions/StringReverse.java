package JavaSessions;

public class StringReverse {

	
	
	public static String reverse(String rev) {
		int len=rev.length();
		String newrev="";
		for (int i=len-1;i>=0;i--) {
			newrev=newrev+rev.charAt(i);
		}
		
		return newrev;
		
	}
	
	
	public static String StrRevChar(String rev) {
		char []  newstr=rev.toCharArray();
String newop="";
		for (int j=newstr.length-1;j>=0;j--) {
			
			newop=newop+newstr[j];
		}
		return newop;
	
	}
	public static void main(String[] args) {
		System.out.println(reverse("Reverse USing for loop method "));
		System.out.println(StrRevChar("Reverse USing for xzczc method "));
//using character
		
		String chr="Reverse using char";
		char []  newstr=chr.toCharArray();
		
		for (char t : newstr) {
			System.out.println(t);
		}
		
		
		//using string  bulder
		
		String sb="This is String buiklder";
		
		StringBuilder sb1=new StringBuilder(sb);
		System.out.println(sb1.reverse());
		
	}

}
