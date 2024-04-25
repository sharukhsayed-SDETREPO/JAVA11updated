package OOPS_Interface;

public interface IndianHospital {

	int adminfee=10;
	//this method cannot be Overridden
	//static with boay allowed in interface after jdk 1.8
	public static void Hemotherapty() {
		System.out.println("Not sure why this requires boduy");
	}
	
	
	public void Neurology();
	
	public void Physician();
	//this can be overrride or inherited via child class object
	default void villing() {
		System.out.println("Indian hospital with billing");
	}
	
	
}
