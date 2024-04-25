package OOP_Abstract;

public class HomePage extends Page{

	public HomePage() {
		
		System.out.println("Home page constructor");
	}
	@Override
	public void HeaderPage() {
		
		System.out.println("Header-Home page--overriden method----HomePage");
	}

	@Override
	public void TitlePage() {
		System.out.println("Title-Home page--overriden method----HomePage");
		
	}
	
	
	public void UserDetails() {
		System.out.println("USer details---non overriden method---Home Page");
	}

}
