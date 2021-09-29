package pageObject.hrm;

import org.openqa.selenium.WebDriver;

import commons.Basepage;

public class LoginPO extends Basepage {
    WebDriver driver;

public LoginPO(WebDriver driver) {
	this.driver = driver;
}

public DashboadPO loginToSystem(String userName, String password) {
	// TODO Auto-generated method stub
	return null;
}
}
