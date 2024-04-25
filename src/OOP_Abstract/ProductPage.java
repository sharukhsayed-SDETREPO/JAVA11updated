package OOP_Abstract;

public class ProductPage extends Page{

	 public ProductPage() {
		System.out.println("Product page constructor");
	}
	@Override
	void HeaderPage() {
		System.out.println("Header Product page--overriden method----Product Page");
		
	}

	@Override
	void TitlePage() {
		System.out.println("Header Title page--overriden method----Product Page");
		
	}
	@Override
	public void ProductDetails() {
		System.out.println(" overriden methods");
	}
	 
	public static void plugin() {
		System.out.println("this is a static method individual to Product page");
	}

}
