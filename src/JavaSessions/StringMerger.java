package JavaSessions;

public class StringMerger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Hello World";
		String b="Java";
		int c=100;
		int d=200;
		float e=12.3333f;
		float f=2.33654f;
		
		System.out.println(a+b);//Hello world Java
		System.out.println(a+b+c+d+e+f);//Hello world java10020012.33332.33654
		System.out.println(c+d+a+b);//300HellowWorld
	}

}
