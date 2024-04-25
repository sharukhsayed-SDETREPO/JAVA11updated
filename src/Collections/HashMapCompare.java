package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {

		
		
		HashMap<Integer,String> hmap1=new HashMap<Integer,String>();
		hmap1.put(1, "A");
		hmap1.put(2,"B");
		hmap1.put(3, "C");
		hmap1.put(4,"D");

		
		HashMap<Integer,String> hmap2=new HashMap<Integer,String>();
		hmap2.put(1, "A");
		hmap2.put(2,"B");
		hmap2.put(3, "C");
		hmap2.put(4,"D");
		
		HashMap<Integer,String> hmap3=new HashMap<Integer,String>();
		hmap3.put(1, "A");
		hmap3.put(2,"B");
		hmap3.put(3, "C");
		hmap3.put(4,"D");
		hmap3.put(5,"E");
		
		//1.compare on the basisi of whole key-value
		System.out.println(hmap1.equals(hmap2));//true
		System.out.println(hmap1.equals(hmap3));//false since 3 has one addtional element
		
		//2.comparing only keys 
		System.out.println(hmap1.keySet().equals(hmap2.keySet()));///true
		System.out.println(hmap1.keySet().equals(hmap3.keySet()));//false since 5 , if last element was 4 then true
		
		//3.findout the extra keys 
		HashSet<Integer> hset=new HashSet<Integer>(hmap1.keySet());
		hset.addAll(hmap3.keySet());
		hset.removeAll(hmap1.keySet());
		System.out.println(hset); ///will retrun the addional 5 
	
		//////compare map by values
		
		
		
		HashMap<Integer,String> hmap4=new HashMap<Integer,String>();
		hmap4.put(1, "A");
		hmap4.put(2,"B");
		hmap4.put(3, "C");
		hmap4.put(4,"D");
		

		
		
		HashMap<Integer,String> hmap5=new HashMap<Integer,String>();
		hmap5.put(1, "A");
		hmap5.put(2,"B");
		hmap5.put(3, "C");
		hmap5.put(4,"D");
		
		HashMap<Integer,String> hmap6=new HashMap<Integer,String>();
		hmap6.put(1, "A");
		hmap6.put(2,"B");
		hmap6.put(3, "C");
		hmap6.put(4,"C");
		hmap6.put(5,"D");
		
		
		//1.duplicates are  allowed : Array List
		System.out.println(new ArrayList<>(hmap4.values()).equals(new ArrayList<>(hmap5.values())));//true
		System.out.println(new ArrayList<>(hmap4.values()).equals(new ArrayList<>(hmap6.values())));//false 
		
		
		//2.duplicates are not allowed : Hashset
		System.out.println(new HashSet<>(hmap4.values()).equals(new HashSet<>(hmap5.values())));//true
		System.out.println(new HashSet<>(hmap4.values()).equals(new HashSet<>(hmap6.values())));//true 
		
		
		
		
		
	}

}
