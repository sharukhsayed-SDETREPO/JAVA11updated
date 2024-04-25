package JavaSessions;

public class PaymentMethod {

	public static void main(String[] args) {
		PaymentMethod pp= new PaymentMethod();
		pp.Payment("1234", "1234");
  Payment("ujhsdfhui7845", "123", 007); ///static methods
	}
	
	
	public void Payment(String cardNumber,String password) {
		System.out.println(cardNumber + " and "+ password );
	}
	
	
	public void Payment(String UPIid,long phoneNumber, int OTP) {
		
	}
	
	
	public static  void Payment(String cardNumber,String password,int OTP) {
		
	}
	
	public void Payment(String PaypalID,String password,String emailaddress) {
		
	}

}
