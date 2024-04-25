package Finalize;

public class Persons {
int age;


public void finalize() {
	System.out.println("This wont be deleted");
}
	public static void main(String[] args) {
		
Persons P1 = new Persons();
P1 =null; 

//P1.age =20;
//System.out.println(P1.age);//this wont return anything
new Persons();
new Persons(); 
//to many objects without refrences

System.gc(); //finalize will be called 3 time 
	}

}
