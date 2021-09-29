//package com.nopcommerce.userDemo;
//
//import java.util.Random;
//import java.lang.reflect.Method;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import commons.BaseTest;
//import pageObjects.user.nopcommerceDemo.HomePO;
//import pageObjects.user.nopcommerceDemo.LoginPO;
//import pageObjects.user.nopcommerceDemo.PageGeneratorManager;
//import pageObjects.user.nopcommerceDemo.RegisterPO;
//import reportConfig.ExtentTestManager;
//
//public class Level_01_Register_Sigin extends BaseTest {
//	WebDriver driver;
//	String firstName, lastName, email, companyName, password, confirmPassword, day, month, year;
//	Select select;
//
//	@Parameters({ "browser", "url" })
//	@BeforeClass
//	public void beforeClass(String browserName, String appUrl) {
//		log.info("Pre - Condition: Open browser" + browserName + "and navigate to" + appUrl + "'");
//		driver = getBrowerDriver(browserName, appUrl);
//		homePage = PageGeneratorManager.getHomePage(driver);
//		log.info("Pre-Condition: Click to RegisterLink");
//		registerPage = homePage.clickToRegiterLink(driver, "Register");
//		firstName = "trang";
//		lastName = "hoang";
//		email = randomEmail(email);
//		companyName = "smartosc";
//		password = "123456";
//		confirmPassword = "123456";
//		day= "17";
//		month="November";
//		year="1998";
//
//	}
//
//	@Test
//	public void TC_01_Sigin_Empty_Data(Method method ) {
//	//	ExtentTestManager.startTest(method.getName(), "User_01_Register");
//		
//		log.info("TC_01_Sigin_Empty_Data - Step 01: Click To REGISTER Button");
//		registerPage.clickToRegisterButton();
//
//		log.info("TC_01_Sigin_Empty_Data - Step 02: Verify Error First Name Message ");
//		verifyTrue(registerPage.isDisplayErrorMessage("FirstName-error", "First name is required."));
//
//		log.info("TC_01_Sigin_Empty_Data - Step 03: Verify Error Last Name Message ");
//		verifyTrue(registerPage.isDisplayErrorMessage("LastName-error", "Last name is required."));
//
//		log.info("TC_01_Sigin_Empty_Data - Step 04: Verify Error Email Message ");
//		verifyTrue(registerPage.isDisplayErrorMessage("Email-error", "Email is required."));
//
//		log.info("TC_01_Sigin_Empty_Data - Step 05: Verify Error Password Message ");
//		verifyTrue(registerPage.isDisplayErrorMessage("Password-error", "Password is required."));
//
//		log.info("TC_01_Sigin_Empty_Data - Step 06: Verify Error Confirm Password Message ");
//		verifyTrue(registerPage.isDisplayErrorMessage("ConfirmPassword-error", "Password is required."));
//	//	ExtentTestManager.endTest();
//	}
//
//	@Test
//	public void TC_02_Sigin_Invalid_Email(Method method) { 
//	//	ExtentTestManager.startTest(method.getName(), "User_01_Register");
//		log.info("TC_02_Sigin_Invalid_Email - Step 01:Click To Gender Male Radio Button ");
//		registerPage.clickToGenderMaleRadioButton("gender-male");
//
//		log.info("TC_02_Sigin_Invalid_Email - Step 02:Enter To First Name Textbox ");
//		registerPage.enterToTextboxByID("FirstName", firstName );
//
//		log.info("TC_02_Sigin_Invalid_Email - Step 03:Enter To Last Name Textbox ");
//		registerPage.enterToTextboxByID("LastName", lastName);
//
//		log.info("TC_02_Sigin_Invalid_Email - Step 05:Enter To Company name Textbox ");
//		registerPage.enterToTextboxByID("Company", companyName);
//		
//		log.info("TC_02_Sigin_Invalid_Email - Step 05:Enter To Company name Textbox ");
//		registerPage.enterToTextboxByID("Email", "123");
//
//		log.info("TC_02_Sigin_Invalid_Email - Step 06:Enter To Password Textbox ");
//		registerPage.enterToTextboxByID("Password",password);
//
//		log.info("TC_02_Sigin_Invalid_Email - Step 07:Enter To Comfirm Password Textbox ");
//		registerPage.enterToTextboxByID("ConfirmPassword", password);
//
//		log.info("TC_02_Sigin_Invalid_Email - Step 08:Select item in date dropdown ");
//		registerPage.selectDropdownByName("DateOfBirthDay", day);
//
//		log.info("TC_02_Sigin_Invalid_Email - Step 09:Select item in month dropdow");
//		registerPage.selectDropdownByName("DateOfBirthMonth", month);
//
//		log.info("TC_02_Sigin_Invalid_Email - Step 10:Select item in year dropdown ");
//		registerPage.selectDropdownByName("DateOfBirthYear", year);
//
//		log.info("TC_02_Sigin_Invalid - Step 11: Click To REGISTER Button");
//		registerPage.clickToRegisterButton();
//
//		log.info("TC_02_Sigin_Invalid_Email - Step 12:Verify Error Message");
//		verifyTrue(registerPage.isDisplayErrorMessage("Email-error", "Wrong email"));
//	//	ExtentTestManager.endTest();
//	}
//
//	@Test
//	public void TC_03_Sigin_Empty_Da_Ton_Tai() {
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 01:Click To Gender Male Radio Button ");
//		registerPage.clickToGenderMaleRadioButton("gender-male");
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 02:Enter To First Name Textbox ");
//		registerPage.enterToTextboxByID("FirstName", firstName );
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 03:Enter To Last Name Textbox ");
//		registerPage.enterToTextboxByID("LastName", lastName);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 05:Enter To Company name Textbox ");
//		registerPage.enterToTextboxByID("Company", companyName);
//		
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 05:Enter To Company name Textbox ");
//		registerPage.enterToTextboxByID("Email", "hool@gmail.com");
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 06:Enter To Password Textbox ");
//		registerPage.enterToTextboxByID("Password",password);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 07:Enter To Comfirm Password Textbox ");
//		registerPage.enterToTextboxByID("ConfirmPassword", password);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 08:Select item in date dropdown ");
//		registerPage.selectDropdownByName("DateOfBirthDay", day);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 09:Select item in month dropdow");
//		registerPage.selectDropdownByName("DateOfBirthMonth", month);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 10:Select item in year dropdown ");
//		registerPage.selectDropdownByName("DateOfBirthYear", year);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 11: Click To REGISTER Button");
//		registerPage.clickToRegisterButton();
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 12:Verify Error Message Specified");
//		verifyTrue(registerPage.isDisplayErrorMessageSpecified("The specified email already exists", "The specified email already exists"));
//        
//        
//        
//	}
//
//	@Test
//	public void TC_04_Sigin_Password_3_Ki_Tu() {
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 01:Click To Gender Male Radio Button ");
//		registerPage.clickToGenderMaleRadioButton("gender-male");
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 02:Enter To First Name Textbox ");
//		registerPage.enterToTextboxByID("FirstName", firstName );
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 03:Enter To Last Name Textbox ");
//		registerPage.enterToTextboxByID("LastName", lastName);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 05:Enter To Company name Textbox ");
//		registerPage.enterToTextboxByID("Company", companyName);
//		
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 05:Enter To Company name Textbox ");
//		registerPage.enterToTextboxByID("Email", "kool200@smartosc.com");
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 06:Enter To Password Textbox ");
//		registerPage.enterToTextboxByID("Password","123");
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 07:Enter To Comfirm Password Textbox ");
//		registerPage.enterToTextboxByID("ConfirmPassword", password);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 08:Select item in date dropdown ");
//		registerPage.selectDropdownByName("DateOfBirthDay", day);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 09:Select item in month dropdow");
//		registerPage.selectDropdownByName("DateOfBirthMonth", month);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 10:Select item in year dropdown ");
//		registerPage.selectDropdownByName("DateOfBirthYear", year);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 11: Click To REGISTER Button");
//		registerPage.clickToRegisterButton();
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 12:Verify Error Message Specified");
//		verifyTrue(registerPage.isDisplayErrorMessage("Password-error", "Password must meet the following rules: "));
//        
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 12:Verify Error Message Specified");
//		verifyTrue(registerPage.isDisplayErrorMessageSpecified("must have at least 6 characters", "must have at least 6 characters"));
//	}
//
//	@Test
//	public void TC_05_Sigin_Confirm_Password_Khong_Khop_Password() {
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 01:Click To Gender Male Radio Button ");
//		registerPage.clickToGenderMaleRadioButton("gender-male");
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 02:Enter To First Name Textbox ");
//		registerPage.enterToTextboxByID("FirstName", firstName );
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 03:Enter To Last Name Textbox ");
//		registerPage.enterToTextboxByID("LastName", lastName);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 05:Enter To Company name Textbox ");
//		registerPage.enterToTextboxByID("Company", companyName);
//		
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 05:Enter To Company name Textbox ");
//		registerPage.enterToTextboxByID("Email", "kool200@smartosc.com");
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 06:Enter To Password Textbox ");
//		registerPage.enterToTextboxByID("Password","123456");
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 07:Enter To Comfirm Password Textbox ");
//		registerPage.enterToTextboxByID("ConfirmPassword", "123");
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 08:Select item in date dropdown ");
//		registerPage.selectDropdownByName("DateOfBirthDay", day);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 09:Select item in month dropdow");
//		registerPage.selectDropdownByName("DateOfBirthMonth", month);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 10:Select item in year dropdown ");
//		registerPage.selectDropdownByName("DateOfBirthYear", year);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 11: Click To REGISTER Button");
//		registerPage.clickToRegisterButton();
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 12:Verify Error Message Specified");
//		verifyTrue(registerPage.isDisplayErrorMessage("ConfirmPassword-error", "The password and confirmation password do not match."));
//        
//		
//	}
//
//	@Test
//	public void TC_06_Sigin_Thong_Tin_Hop_Le() {
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 01:Click To Gender Male Radio Button ");
//		registerPage.clickToGenderMaleRadioButton("gender-male");
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 02:Enter To First Name Textbox ");
//		registerPage.enterToTextboxByID("FirstName", firstName );
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 03:Enter To Last Name Textbox ");
//		registerPage.enterToTextboxByID("LastName", lastName);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 05:Enter To Company name Textbox ");
//		registerPage.enterToTextboxByID("Company", companyName);
//		
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 05:Enter To Company name Textbox ");
//		registerPage.enterToTextboxByID("Email", email);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 06:Enter To Password Textbox ");
//		registerPage.enterToTextboxByID("Password",password);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 07:Enter To Comfirm Password Textbox ");
//		registerPage.enterToTextboxByID("ConfirmPassword", password);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 08:Select item in date dropdown ");
//		registerPage.selectDropdownByName("DateOfBirthDay", day);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 09:Select item in month dropdow");
//		registerPage.selectDropdownByName("DateOfBirthMonth", month);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 10:Select item in year dropdown ");
//		registerPage.selectDropdownByName("DateOfBirthYear", year);
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 11: Click To REGISTER Button");
//		registerPage.clickToRegisterButton();
//
//		log.info("TC_03_Sigin_Empty_Da_Ton_Tai - Step 12:Verify Error Message Specified");
//		verifyTrue(registerPage.isDisplayRegisterMessage("Your registration completed"));
//        
//	}
//
//	HomePO homePage;
//	LoginPO loginPage;
//	RegisterPO registerPage;
//
//	@AfterClass
//	public void afterClass() {
//		log.info("Post-Condition: Close browser");
//		driver.quit();
//	}
// public String randomEmail(String email)
// {   Random ran =new Random();
//	return email= "trang" + ran.nextInt(9999)+ "@gmail.com";
// }
//}
