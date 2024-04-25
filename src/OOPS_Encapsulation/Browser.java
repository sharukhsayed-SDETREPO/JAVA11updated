package OOPS_Encapsulation;

public class Browser {

	
	
	
	
	
	public void launchBrowser() {
		System.out.println("launching browser.................");
		
		CheckbrwoserVersion();
		System.out.println("Browser is launched");
	}
	
	
	private void CheckbrwoserVersion() {
		System.out.println("Checking browser version");
		CheckOSCompatibility();
		System.out.println("Browser version verified");}
	
	
	
	private void CheckOSCompatibility() {
		System.out.println("Checking OS compatibility");
		CheckCPUMemory();
		System.out.println("OS is compatible");
	}
	
	private void CheckCPUMemory() {
		System.out.println("Checking CPUMEmory");
		CheckbrowserUPdates();
		System.out.println("CPU has sufficient memory");
	}
	
	private void CheckbrowserUPdates() {
		System.out.println("Checking for browser updates");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
