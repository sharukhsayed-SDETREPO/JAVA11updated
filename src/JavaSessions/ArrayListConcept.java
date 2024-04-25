package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
  
		
		//ArrayList is  a default class in Java
		//Collection(Interface)----List(Interface)-----]09(Class)
		//it is not homogenous ie it can store all types of data
		 ///.size is total number of values for dynamic array,since the size is not defined ,and .length is number of elements i for static array 
		
		
		
		
		ArrayList ar=new ArrayList();
        System.out.println(ar.size()); //this will print 0 
        
        
        ar.add(100);
        ar.add(200);
        ar.add(300);
        System.out.println(ar.size());//this will give 3
        
     
        
        
        
        System.out.println(ar.get(0));//100
        System.out.println(ar.get(1));
        System.out.println(ar.get(2));
//        System.out.println(ar.get(3));//IndexOutofBoundException because size is 2
//        System.out.println(ar.get(-1));//IndexOutofBoundException because size is 2
//        
        
        
       ar.add("It can store all datay types");
        System.out.println(ar.get(3));
        
        ar.remove(2);//this will remove 300 and shift all the contents fill the empty position
        System.out.println(ar.get(2));//This willl print the string
        
     
        //To make it non homogenous--restrict it to one data type (also called generics in Java)
        ArrayList<Integer> marks= new ArrayList<Integer>();
        marks.add(100);
        ArrayList<Double> marks2= new ArrayList<Double>();
        marks2.add(2.65456);
        marks2.add(1.00);
        
        
        System.out.println("***************************************");

        for (int o: marks) {
        	System.out.println(o);
        }
        System.out.println("***************************************");
        for (double h:marks2 ) {
        	System.out.println(h);
        }
        
        
        
        ArrayList<String> family= new ArrayList<String>();
        family.add("Name1");
        family.add("Name2");
        family.add("Name3");
        family.add(null);
        family.add(null);
        
        for(int i =0;i<family.size();i++) {
        	System.out.println(family.get(i));
        }
        System.out.println("***************************************");
        //for each loop for ArrayList
        for(String s :family) {
        	System.out.println(s);
        }
        
	}

}
