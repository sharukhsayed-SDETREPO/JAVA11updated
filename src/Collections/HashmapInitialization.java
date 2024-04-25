package Collections;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashmapInitialization {

	
	public static Map<String ,Integer> map3;
	static {
		map3=new HashMap<String,Integer>();
		map3.put("A", 1);
		map3.put("B", 2);
		map3.put("C", 3);
		
	}
	
	public static void main(String[] args) {
     
		
		
		//1.Using Hashmap Class
		
		HashMap<String,String> map1 =new HashMap<>();
		Map<String, String> map2=new HashMap<String,String>();
		
		//2. Using static block
		System.out.println(HashmapInitialization.map3.get("A"));
		
		
		//3.immutableMap with only one single entry
		Map<String,Integer> map4Map= Collections.singletonMap("test", 123);
		System.out.println(map4Map.get("test"));
		//map3.put("test2", 123124);UnsupportedOperationException
		
		
		//4.jdk 8--creating a 2D array of strings using Streams and collecting in the form of map
		
		Map<String,String> map5 =Stream.of(new String [] [] {
			{"Tom","Hanks"},
			{"Bruce","Less"},
		}).collect(Collectors.toMap(data ->data[0], data->data[1]));
		
		
		//5.Using Simple Entry: mutable map :
		Map<String,String> map6=Stream.of(
				new AbstractMap.SimpleEntry<>("Naveen","Java"),
				new AbstractMap.SimpleEntry<>("Tom","Python")
		).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue ));
		
		
		
		//6.Using Simple Entry: immmutable map :
		Map<String,String> map7=Stream.of(
				new AbstractMap.SimpleImmutableEntry<>("Naveen","Java"),
				new AbstractMap.SimpleImmutableEntry<>("Tom","Python")
		).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue ));
		
		
	
		
		
	
		

	}

}
