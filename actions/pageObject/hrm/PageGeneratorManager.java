package pageObject.hrm;

import org.openqa.selenium.WebDriver;

import commons.Basepage;

public class PageGeneratorManager extends Basepage{
//	private static LoginPO loginPage;
//	private static EmployeeListPO employeePage;
	private PageGeneratorManager() {	
	}
public static LoginPO getLoginPage(WebDriver driver)
{
	return new LoginPO(driver);
}
public static EmployeeListPO getEmployeeListPage(WebDriver driver)
{
	return new EmployeeListPO(driver);
}
public static AddEmployeePO getEmployeePage(WebDriver driver)
{
	return new AddEmployeePO(driver);
}
public static DashboadPO getDashboadPage(WebDriver driver)
{
	return new DashboadPO(driver);
}
public static PersonalDatailPO getPesonalDetailPage(WebDriver driver)
{
	return new PersonalDatailPO(driver);
}
}
