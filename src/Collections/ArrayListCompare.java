package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
	
		
		//1.Sort and equals (each value and position should be same)
		ArrayList<Integer> ar1=new ArrayList<Integer>(Arrays.asList(1,2,7,8,9,4,5,15));
		ArrayList<Integer> ar2=new ArrayList<Integer>(Arrays.asList(2,6,3,44,66,88,99,100));
		ArrayList<Integer> ar3=new ArrayList<Integer>(Arrays.asList(2,6,3,44,66,88,99,100));
		Collections.sort(ar1);
		Collections.sort(ar2);
		Collections.sort(ar3);
		System.out.println(ar1);
		System.out.println(ar2);
		System.out.println(ar3);
		System.out.println("----------------------");
		//System.out.println(ar3);
		
		System.out.println(ar2.equals(ar3));//true
		//2.finding out mutullay exclusive values from 2 lists (missing elements)
		ArrayList<String> val1=new ArrayList<String>(Arrays.asList("Java","Pert","PHP","COBOL"));
		ArrayList<String> val2=new ArrayList<String>(Arrays.asList("Java","nolang","Python","COBOL"));
		val1.removeAll(val2);
		System.out.println(val1);
		//3.finding out the common elements
		ArrayList<String> val3=new ArrayList<String>(Arrays.asList("COBOL","Pert","PHP","Java"));
		ArrayList<String> val4=new ArrayList<String>(Arrays.asList("Java","nolang","Python","COBOL"));
		val3.retainAll(val4);
		System.out.println(val3);
		
	}

}
