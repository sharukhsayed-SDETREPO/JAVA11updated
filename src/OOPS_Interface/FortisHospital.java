package OOPS_Interface;

public class FortisHospital  extends CDC implements UKHospital, USHospital,IndianHospital,WHO{
  ///if methods are duplicate (having same signature it will add only once ,if signature is different across interface then it will add all the instances)
	//if any static methods are there in interface it wont add ---IndianHospital --Hemotherapy
	//FortisHospital can have its own methods
	@Override
	public void ENTservices() {
	System.out.println("FN---ENT services");
		
	}

	@Override
	public void Emergency_911() {
	System.out.println("FH----Emergency 911");
		
	}

	@Override
	public void Phsiotherapy() {
		// TODO Auto-generated method stub
		System.out.println("FH-----Phsiotherapy");
		
	}

	@Override
	public void derma() {
		// TODO Auto-generated method stub
		System.out.println("FH---derma without i/P");
	}

	@Override
	public void Obsterican() {
		// TODO Auto-generated method stub
		System.out.println("FH---OBSterican");
		
	}

	@Override
	public void Chemo() {
		// TODO Auto-generated method stub
		System.out.println("FH----Chemo");
		
	}

	@Override
	public void pediatrisican() {
	System.out.println("FH------pediatrician");
		
	}

	@Override
	public void derma(String name) {
		System.out.println("FH----derma with i/P");
		
	}

	@Override
	public void Neurology() {
		System.out.println("FH----Neurology");
		
	}

	@Override
	public void Physician() {
		// TODO Auto-generated method stub
		System.out.println("FH-----Physician");
		
	}
	
	
	public void FortisHos() {
		System.out.println("This is a individual method");
	}
//Mthod from WHO extended inUKHospital and overriden here
	@Override
	public void COVID19Test() {
		System.out.println("FH-----COVID19Test");
		
	}
	
	
	public void villing() {
System.out.println("This can be Inherited+ Overriden as well");
	}
//	
	
	
 
	//We cannot create a object of interface/abstract class
	//We cannot create a constructor of interrrface
	//We can create a constructor of abstract class
	//It is called using a child class object that extends the parent abstract class
	//If the child class has its own constructor then it will first call parent class constructor then its own constructor

	

}
