package pageObjects.user.nopCommerce;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
//	private static HomePageObject homePage;
//	private static LoginPageObject loginPage;
//	private static RegisterPageObject registerPage;
//	private static MyAccountPageObject myAccountPage;
//	private static SearchPageObject searchPage;
//	private static OrderPageObject orderPage;

	private PageGeneratorManager() {

	}

	public static HomePageObject getHomePage(WebDriver driver) {
//		if (homePage == null) {
//			homePage = new HomePageObject(driver);
//		}
		return new HomePageObject(driver);
	}

	public static LoginPageObject getLoginpage(WebDriver driver) {
//		if (loginPage == null) {
//			loginPage = new LoginPageObject(driver);
//		}
		return new LoginPageObject(driver);
	}

	public static RegisterPageObject getRegister(WebDriver driver) {
//		if (registerPage == null) {
//			registerPage = new RegisterPageObject(driver);
//		}
		return new RegisterPageObject(driver);
	}
	
	public static OrderPageObject getOrderpage(WebDriver driver)
	{
//		if(orderPage==null)
//		{
//			orderPage=new OrderPageObject(driver);
//		}
		return new OrderPageObject(driver);
	}
	
	public static MyAccountPageObject getMyAccontPage(WebDriver driver)
	{
//		if(myAccountPage==null)
//		{
//			myAccountPage=new MyAccountPageObject(driver);
//		}
		return new MyAccountPageObject(driver);
	}
	public static SearchPageObject getSearchPage(WebDriver driver)
	{
//		if(searchPage==null)
//		{
//			searchPage= new SearchPageObject(driver);
//		}
		return new SearchPageObject(driver);
	}
}
