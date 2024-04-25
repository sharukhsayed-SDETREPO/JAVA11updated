package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatevalues {

	public static void main(String[] args) {
		
  //1.using linkedHashset
    ArrayList<String> dupvalues=new ArrayList<String>(Arrays.asList("val1","val2","val3","val1","val2","val3"));
    LinkedHashSet<String> lnk=new LinkedHashSet<String>(dupvalues);
		
		
		System.out.println(lnk);
		
		
		System.out.println("----------------------------");
		//store it again in a  
		ArrayList<String> unqval=new ArrayList<String>(lnk);
		
		
		
		//2.using streams
		ArrayList<String> dupvalues2=new ArrayList<String>(Arrays.asList("val1","val2","val3","val1","val2","val3"));
	List<String> ary=	dupvalues2.stream().distinct().collect(Collectors.toList());
	System.out.println(ary);
	
	
	
	///3.using retainall mthod
	
	ArrayList<String> dupvalues3=new ArrayList<String>(Arrays.asList("val1","val2","val3","val1","val2","val3"));
	dupvalues3.retainAll(Collections.singleton("val3"));
	System.out.println(dupvalues3);
	}

}
