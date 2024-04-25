package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		//1.Coolections.synchronizedlist()
	List<String> namelist=Collections.synchronizedList(new ArrayList<String>());
	namelist.add("Java");
	namelist.add("Ruby");
	namelist.add("Python");
	namelist.add("COBOL");
	namelist.add("Peearl");
	
	
	//for add ,and remove we do not need explicit synchronization
	//for traversing the array or fetching the values form the array we need explicit synchronization
	
	
	synchronized (namelist) {
		Iterator<String> it=namelist.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}                                                                                                                                                                                                                                                                                                                                                                                                                                            
	
	//2.CopyOnWriteArraylist
	CopyOnWriteArrayList<String> namelis2=new CopyOnWriteArrayList<String> (Arrays.asList("val1","val2","val234"));
	
	//here we do not need any synchronization at all 
	
	namelis2.stream().forEach(q->System.out.println(q));
	

	}

}
