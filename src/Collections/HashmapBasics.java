package Collections;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;



public class HashmapBasics {

	public static void main(String[] args) {
	//no order -no indexing for maps
	//store data in key value pair
	//can store n number of null values but only one null key
	//hasmap is not thread safe--ie it is usynchronized
		
		
		HashMap<String ,String> hmap=new HashMap<String,String>();
		hmap.put("India", "Delhi");
		hmap.put("Sri Lankha","Colombo");
		hmap.put("Australia", "Sydney");
		hmap.put(null,"Mumbai");
		hmap.put(null, "KolkaTA");
		hmap.put("USA", null);
		hmap.put("UK", null);
		System.out.println(hmap.get(null));//latest value ie Kolkata
		System.out.println(hmap.get("Australia"));
		
		System.out.println("----------------------");
		////Iterating through hashmap
		//1.iterating using keys 
		
		Iterator<String> ith=hmap.keySet().iterator();
		
		while(ith.hasNext()) {
			String key=ith.next();
			String value=hmap.get(key);
			System.out.println("your key is " + key + " your value is " + value);
		}
		
		//2 Iterating through the set of key value pair
		
		Iterator<Entry<String ,String>> ent=hmap.entrySet().iterator();
		
		while(ent.hasNext()) {
			Entry<String ,String> ent2=ent.next();
			System.out.println("Your key is " + ent2.getKey() +" your value is" + ent2.getValue());
		}
		
		
		//3.Iterator using lambda
		hmap.forEach((k,v)-> System.out.println("keys is " + k +"your value is" + v ));
	}

}
