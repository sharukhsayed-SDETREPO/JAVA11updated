package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		
		ProductPage PG=new ProductPage();
		
		PG.HeaderPage();//Override method
		PG.TitlePage();//Overriden method
		PG.ProductDetails();//Overriden method which is not bastratc
		PG.footer(); //Inherited method
		PG.plugin();
	               	Page.plugin();
	 
		//top casting 
  		Page PG2=new ProductPage();
		PG2.HeaderPage();//Override method
		PG2.TitlePage();//Override method
		PG2.ProductDetails();//not possible due to refrence type check
		PG2.footer();//non overriden parent method
		
		Page PG3=new HomePage();
		PG3.HeaderPage();//Override method
		PG3.TitlePage();//Override method
		//PG3.UserDetails();;//not possible due to refrence type check
		PG3.footer();
		
		//down casting not possible since we cannot create object of interface/abstract class
		
		
	}

}
