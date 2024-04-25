package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> ar1=new ArrayList<String>(Arrays.asList("Java","Ruby","C#","Python","JS","Java"));
		ar1.add("Java");
		ar1.add("Ruby");
		ar1.add("C#");
		ar1.add("Pyhton");
		ar1.add("JS");
		
		
		System.out.println(ar1);
		
		ArrayList<String> ar2 =new ArrayList<String>();
		
		ar2.add("COBOL");
		ar2.add("Typescript");
	//to add or merge 2 arraylist using index
		ar1.addAll(1, ar2);
		
		System.out.println(ar1);
		////to clear a array list
		//ar1.clear();
		
		//to clone a arrayList 
		ArrayList<String> newclone=(ArrayList<String>)ar1.clone();
		System.out.println(newclone);
		
		
		//to validate its contents
		
		System.out.println(ar1.contains("Java"));
		System.out.println(ar1.indexOf("Java"));
		System.out.println(ar1.lastIndexOf("Java"));
		
		
		////to remove a particular element
		ar1.remove("Java");
		System.out.println(ar1);
	
		//remove if condition (Good for finding even odd values from a giver array list
		ArrayList<Integer> ar3=new ArrayList<Integer>(Arrays.asList(4,6,5,1,2,3,7,3,5,9));
		ar3.removeIf(ele->ele%2==0);
		System.out.println(ar3);
		
		
		///retain all method  (Good for finding number of duplicates)
		ArrayList<String> ar4=new ArrayList<String>(Arrays.asList("Person1","Person1","Person1","Person2","Person4","Person7"));
		ar4.retainAll(Collections.singleton("Person1"));
		System.out.println(ar4.lastIndexOf("Person1")+1);
		
		
		///to create a sublist of a another list
		ArrayList<String> ar6=new ArrayList<String>(Arrays.asList("Person1","Person1","Person1","Person2","Person4","Person7"));
		ArrayList<String> ar7=new ArrayList<String>(ar6.subList(2, 5));
		System.out.println(ar7);
		
		//convert into a arryay
		ArrayList<String> ar8=new ArrayList<String>(Arrays.asList("Person1","Person1","Person1","Person2","Person4","Person7"));
		Object[] ob=ar8.toArray();
		System.out.println(Arrays.toString(ob));
		
		for(Object p:ob) {
			System.out.println(p);
		}
		
		
	}

}
