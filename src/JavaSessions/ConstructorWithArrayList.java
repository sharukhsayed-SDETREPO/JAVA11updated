 package JavaSessions;

import java.util.ArrayList;

public class ConstructorWithArrayList {
     
	
	String browswerName;
	int version;
	ArrayList<String> plugins;
	
	
	
	
	
	public ConstructorWithArrayList(String browswerName,int  version,ArrayList<String> plugins) {
		this. plugins=plugins;
		this.browswerName=browswerName;
		this.version=version;
	}
	public static void main(String[] args) {
	   
		
		ArrayList<String> plugins2=new ArrayList<String> ();
		
		plugins2.add("UFT ONE");
		plugins2.add("Chropath");
		plugins2.add("SelectorsHub");
		
		
		
		ConstructorWithArrayList C1=new ConstructorWithArrayList("Chrome",8123,plugins2);
		
		
		
		System.out.println(C1.browswerName + C1.version);
		System.out.println(C1.plugins.get(0));

	}

}
