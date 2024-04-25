package JavaSessions;

public class LoginTest {

	public static void main(String[] args) {
		//we can call all the methods based on the diff parameter types
		LoginTest lp=new LoginTest();
		login();
		lp.login(8645);
		lp.login(78949687466849684l);
		lp.login("Facebook");
		lp.login("ABC", "123");
        lp.login("ABC", "AFSDFsdf", "emailaddress@com");
	}

	
	public static void login() {
		
	}
	
	public void login(int otp) {
		
	}
	
	public void login(String username ,String password) {
		
	}
	
	public void login(String username,String password,String emailaddress) {
		
	}
	
	
	public void login(long phonennumber) {
		
	}
	
	public void login(String socialmediaaccount) {
		
	}
}
