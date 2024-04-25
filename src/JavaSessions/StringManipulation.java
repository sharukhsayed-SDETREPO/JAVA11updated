package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		String str=" Hello Everyone this is your dailydose of Internet Everyone and this will be the 3rd isntance for Everyone ";
		
		System.out.println(str.length());
		System.out.println(str.charAt(42));
		System.out.println(str.indexOf("Everyone"));//1st instance
		
		
		System.out.println(str.indexOf("o"));
		
		

		System.out.println(str.indexOf("Everyone", str.indexOf("Everyone")+1));//2nd isntance
		
		
		System.out.println(str.indexOf("Everyone", str.indexOf("Everyone", ((str.indexOf("Everyone")+1)))+1));
		int c=str.indexOf("Everyone", str.indexOf("Everyone")+1);
		
		System.out.println(str.indexOf("Everyone", c+1));//3rd instance
		
		//to check if some substring exist in parent string
		
		
		if(str.indexOf("Internet")>0) {
			System.out.println("Internet is present");
			
			//if not present it will return -1
		}
		
		
		System.out.println(str.trim());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.replace("Everyone","Noone" ));
		System.out.println(str.replace(" ","" ));
		
		System.out.println(str.contains("dailydose"));
		String str2=" Hello Everyone this is your dailydose of Internet Everyone and this will be the 3rd isntance for Everyone ";
		
		
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str2));
		
		
		
		
		//to get a substring 
		System.out.println(str2.substring(4));
		
		String message= "This is your OTP 786456465";
		System.out.println(message.substring(message.indexOf("OTP")+3, message.trim().length()));                   
		
		
		String lang="JAva-Pyhton-Ruby-C#";
		String [] lang2=lang.split("-");
		
		//trying to convers
		ArrayList<String> dyn=new ArrayList<>(Arrays.asList(lang2));
		
		System.out.println(dyn.toString());
		
		String abc [] =new String[dyn.size()];
		 
		dyn.toArray(abc);
		//conervsion completed
		
		
		
		
		
		
		//trying to print after splitting
		for(int i=0;i<lang2.length;i++) {
			System.out.println(lang2[i]);
		}
		
		
		
		String h1="XXAnushaXXReddyXXSowmya";
		
		String h2 []=h1.split("XX");
		System.out.println(h2[0]);// This will be blank
		
		
		String empinfo="Kan:Black:40:IBM:USA"; 
		String empname=empinfo.split(":")[0];
		
		
		
		String empcoolour=empinfo.split(":")[1];
		String empage=empinfo.split(":")[2];
		String empcompany=empinfo.split(":")[3];
		String empcountry=empinfo.split(":")[4];
		
		 
	}

}
