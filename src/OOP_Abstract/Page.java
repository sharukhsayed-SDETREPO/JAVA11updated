package OOP_Abstract;

public abstract class Page {

	public Page () {
		System.out.println("Page class constructor");
	}
	abstract void HeaderPage();
	 
	abstract void TitlePage();
	
	public final void footer() {
		System.out.println("Page--Non abstrac footer");
	}
	
	public static void plugin() {
		System.out.println("this is a static method");
	}
	int g=100;
	
	
	public void ProductDetails() {
		System.out.println("Pagethis is a static method");
		
	}
	
	//We cannot create a object of interface/abstract class
	//We cannot create a constructor of interrrface
	//We can create a constructor of abstract class
	//It is called using a child class object that extends the parent abstract class
	//If the child class has its own constructor then it will first call parent class constructor then its own constructor
}
