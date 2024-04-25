package OOPS_Interface;

public class TestHospital {
	
	
public static void main (String args[]) {
	
	
	
	   FortisHospital FS= new FortisHospital();
	   FS.Chemo();//Overriden child method 
	   FS.derma();//Overriden child method 
	   FS.derma("RESR");// Overriden child method 
	   FS.Emergency_911();//Overriden child method 
	   FS.ENTservices();//Overriden child method 
	   FS.FortisHos();//Individual method
	   FS.pediatrisican();//Overriden child method 
	   FS.Phsiotherapy();//Overriden child method 
	   FS.Physician();//Overriden child method 
	   FS.Obsterican();//Overriden child method 
	   FS.Neurology();//Overriden child method  
	   FS.villing();//Inherited parent method
	   FS.Vaccine();//Inherrirted from CDC
	   FS.COVID19Test();
	   
	   System.out.println(IndianHospital.adminfee);//inetrface variables are static +final by nature
	   //FS.Hemotherapty();//not posssible
	   IndianHospital.Hemotherapty();//static method with body
	   FS.villing();//Default mehods can be access without overidding them
	   //we cannot create a object of interface 
	   //UKHospital uk =new UKHospital() ;
		
	   //top casting is possible but we can only call overridden methods from the implemented parent interface,rest all methods will be blocked by type checck
	   
	   
	   
	   IndianHospital IK =new FortisHospital();
	   
	   IK.Neurology();
	   IK.Physician();
	   IK.villing();
	   
	  
	  
	   //top casting is possible but we can only call overridden methods from the one implemented parent interface,rest all methods will be blocked by reference type checck

	UKHospital uk= new FortisHospital();
	uk.derma();
	uk.Emergency_911();
	uk.ENTservices();
	uk.Phsiotherapy();
	uk.COVID19Test();//Inherited+overriden method
	

	//We cannot create a object of interface/abstract class
	//We cannot create a constructor of interrrface
	//We can create a constructor of abstract class
	//It is called using a child class object that extends the parent abstract class
	//If the child class has its own constructor then it will first call parent class constructor then its own constructor


}

}
