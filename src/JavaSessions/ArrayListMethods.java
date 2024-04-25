package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		
		ArrayList <String> students=new ArrayList<String>();
		
		students.add("Tom");
		students.add("Harry");
		students.add("Peter");
		students.add("Alison");
		//to print all the contents without for looop
		System.out.println(students);
		//To sort anyy array
		java.util.Collections.sort(students);
		System.out.println(students);
		
		//to convert a arraylist into a static array:- use toArray
		
		String ar[]=new String[students.size()];
		students.toArray(ar); //converted
		
		for(int h=0;h<ar.length;h++) {
			System.out.println(ar[h]);
		}
		
		//	//to convert a arraylist into a String:- use toString
		System.out.println(students.toString());
		 
		//to convert static arrays to ArrayList:- use asList
		String country[]= new String[3];
		country[1]="India";
				country[2]="America";
				country[0]="USA";
				
		ArrayList<String> region=new ArrayList<String>(Arrays.asList(country));
		System.out.println(region);
				

	}

}
