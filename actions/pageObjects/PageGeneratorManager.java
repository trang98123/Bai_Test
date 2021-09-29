package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
public static LoginPageObject getLoginpage(WebDriver driver)
{
	return new LoginPageObject(driver);
}
public static MyAccountPageObject getmyDashboard(WebDriver driver)
{
	return new MyAccountPageObject(driver);
}
}
