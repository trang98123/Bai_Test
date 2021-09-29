package pageObjects.user.nopcommerceDemo;

import org.openqa.selenium.WebDriver;

import commons.Basepage;

public class PageGeneratorManager extends Basepage{
public static 	HomePO homePage;
public static	LoginPO loginPage;
public static RegisterPO registerPage;
public static MyAccountPO myAccountPage;
public static LogoutPO logoutPage;
private PageGeneratorManager() {
	
}
public static HomePO getHomePage(WebDriver driver)
{
	if(homePage==null)
	{
		homePage= new HomePO(driver);
	}
	return homePage;
}

public static LoginPO getLogin(WebDriver driver)
{
	if(loginPage==null)
	{
		loginPage= new LoginPO(driver);
	}
	return loginPage;
}

public static RegisterPO getRegisterPage(WebDriver driver)
{
	if(registerPage==null)
	{
		registerPage= new RegisterPO(driver);
	}
	return registerPage;
}
public static MyAccountPO getMyAccountPage(WebDriver driver)
{
	if(myAccountPage==null)
	{
		myAccountPage=new MyAccountPO(driver);
	}
	return myAccountPage;
}
public static LogoutPO getLogoutPage(WebDriver driver)
{
	if(logoutPage==null)
	{
		logoutPage= new LogoutPO(driver);
	}
	return logoutPage;
}
}
