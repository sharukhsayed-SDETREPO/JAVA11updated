package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		Map<String,String>  map1=new HashMap<String ,String>();
		map1.put("A", "S");
		
		
		//create synchronized hashmap
		Map<String,String> syncmap=Collections.synchronizedMap(map1);
		
		
		//concurrenthasp map : it does not throw any ConcurrentModification Exception
		
		
		ConcurrentHashMap<String, String> cmp=new ConcurrentHashMap<>();
		cmp.put("A", "S");

	}

}
