//package com.nopcommerce.userDemo;
//
//import java.lang.reflect.Method;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import commons.BaseTest;
//import pageObjects.user.nopcommerceDemo.HomePO;
//import pageObjects.user.nopcommerceDemo.LoginPO;
//import pageObjects.user.nopcommerceDemo.PageGeneratorManager;
//import reportConfig.ExtentTestManager;
//public class Level_02_Register_Login extends BaseTest {
//	WebDriver driver;
//	String select;
//	String emailAddress, password, date, month, year;
//	
//	@Parameters({ "browser", "url" })
//	@BeforeClass
//	public void beforeClass(String browserName, String appUrl) {
//		log.info("Pre-condition: Open browser '" + browserName + "' and navigate to '" + appUrl + "'");
//		driver = getBrowerDriver(browserName, appUrl);
//		log.info("Pre-Condition: Click to login link");
//		homePage= PageGeneratorManager.getHomePage(driver);
//		loginPage= homePage.clickToLoginLink(driver,"Log in");
//	}
//
//	@Test
//	public void TC_01_Login_Empty_Data(Method method)
//	{   ExtentTestManager.startTest(method.getName(), "User_01_Register");
//		log.info("TC_01_Login_Empty_Data - Step 01:Click To Login Button ");
//		loginPage.clickToLoginButon();
//		
//		log.info("TC_01_Login_Empty_Data - Step 02: Verify Error Message ");
//
//		verifyTrue(loginPage.isDisplayErrorMessage("Please enter your email"));
//		ExtentTestManager.endTest();
//	}
//	
//	@Test
//	public void TC_02_Login_Invalid_Email(Method method)
//	{
//		log.info("TC_02_Login_Invalid_Email - Step 01: Enter To Email Textbox Invalid");
//		loginPage.enterToEmailTextbox("123");
//		
//		
//		log.info("TC_02_Login_Invalid_Email - Step 02:Click To Login Button ");
//		loginPage.clickToLoginButon();
//		
//		log.info("TC_02_Login_Invalid_Email - Step 03: Verify Error Message ");
//		verifyTrue(loginPage.isDisplayErrorMessage("Wrong email"));
//		ExtentTestManager.endTest();
//	}
//	
//	@Test
//	public void TC_03_Login_Email_Chua_Dang_ki(Method method)
//	{
//		log.info("TC_03_Login_Email_Chua_Dang_ki - Step 01: Enter To Email Textbox");
//		loginPage.enterToEmailTextbox("kool123123@gmail.com");
//		log.info("TC_03_Login_Email_Chua_Dang_ki - Step 02: Enter To Password Textbox");
//		loginPage.enterToPasswordTextbox("123456");
//		log.info("TC_03_Login_Email_Chua_Dang_ki - Step 03: Click To Login Button");
//		loginPage.clickToLoginButon();
//		log.info("TC_03_Login_Email_Chua_Dang_ki - Step 04: Verify Error Message");
//		verifyTrue(loginPage.isDisplayErrorMessageInvalid1("Login was unsuccessful. Please correct the errors and try again.d"));
//		
//		verifyTrue(loginPage.isDisplayErrorMessageInvalid2("No customer account found"));
//		ExtentTestManager.endTest();
//	}
//	
//	
//	@Test
//	public void TC_04_Login_Email_Chua_Dang_Ki_Password_Khong_Nhap(Method method)
//	{
//		log.info("TC_04_Login_Email_Chua_Dang_Ki_Pssword_Khong_Hop_Le - Step 01: Enter To Email Textbox");
//		loginPage.enterToEmailTextbox("kool102@gmail.com");
////		log.info("TC_04_Login_Email_Chua_Dang_ki_Password_Khong_Hop_Le - Step 02: Enter To Password Textbox");
////		loginPage.enterToPasswordTextbox("123");
//		log.info("TC_04_Login_Email_Chua_Dang_ki_Password_Khong_Hop_Le - Step 03: Click To Login Button");
//		loginPage.clickToLoginButon();
//		log.info("TC_04_Login_Email_Chua_Dang_ki_Password_Khong_Hop_Le - Step 03: Verify Error Message");
//		verifyTrue(loginPage.isDisplayErrorMessageInvalid1("Login was unsuccessful. Please correct the errors and try again.d"));
//	
//		verifyTrue(loginPage.isDisplayErrorMessageInvalid2("The credentials provided are incorrect"));
//		ExtentTestManager.endTest();
//	}
//	
//	@Test
//	public void TC_05_Login_Email_Da_Dang_ki_Password_Sai(Method method)
//	{
//		log.info("TC_05_Login_Email_Da_Dang_ki_Password_Sai - Step 01: Enter To Email Textbox");
//		loginPage.enterToEmailTextbox("kool102@gmail.com");
//		log.info("TC_05_Login_Email_Da_Dang_ki_Password_Sai - Step 01: Enter To Password Textbox");
//		loginPage.enterToPasswordTextbox("123");
//		log.info("TC_05_Login_Email_Da_Dang_ki_Password_Sai - Step 01: Click To Login Button");
//		loginPage.clickToLoginButon();
//		log.info("TC_05_Login_Email_Da_Dang_ki_Password_Sai - Step 01: Verify Error Message");
//		verifyTrue(loginPage.isDisplayErrorMessageInvalid1("Login was unsuccessful. Please correct the errors and try again.d"));
//		
//		verifyTrue(loginPage.isDisplayErrorMessageInvalid2("The credentials provided are incorrect"));
//		ExtentTestManager.endTest();
//	}
//	
//	@Test
//	public void TC_06_Login_Email_Da_Dang_Ki_Passwork_Dung(Method method)
//	{    
//        log.info("TC_06_Login_Email_Da_Dang_Ki_Passwork_Dung - Step 01: Enter To Email Textbox");
//        loginPage.enterToEmailTextbox("kool102@gmail.com");
//		log.info("TC_06_Login_Email_Da_Dang_Ki_Passwork_Dung - Step 01: Enter To Password Textbox");
//		loginPage.enterToPasswordTextbox("123456");
//		log.info("TC_06_Login_Email_Da_Dang_Ki_Passwork_Dung - Step 01: Click To Login Button");
//		loginPage.clickToLoginButon();
//		log.info("TC_06_Login_Email_Da_Dang_Ki_Passwork_Dung - Step 01: Verify Error Message");
//		ExtentTestManager.endTest();
//	}
//	
//	
//	
//	HomePO homePage;
//	LoginPO loginPage;
//	
//	@AfterClass
//	public void afterClass()
//	{
//		log.info("Post-Condition: Close browser");
//		driver.quit();
//	}
//}
