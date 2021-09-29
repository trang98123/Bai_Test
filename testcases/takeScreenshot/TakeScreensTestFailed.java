package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commons.Basepage;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestListener.class)
public class TakeScreensTestFailed {
WebDriver driver;
	Select select;
	String projectPath = System.getProperty("user.dir") +"/screenshotImg/";
	String firstName, lastName, day, month, year, emailAddress, companyName, password;
	@BeforeClass
	public void beforeClass() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/");
		
		firstName = "Automation";
		lastName = "FC";
		day = "17";
		month = "May";
		year = "1998";
		emailAddress = "hoangtrang"+getRamdomNumber()+"@mailinator.com";
		companyName = "SmartOSC";
		password = "123456";
	}
@Test
	public void TC_01_Register() {
		
		driver.findElement(By.className("ico-register")).click();

		driver.findElement(By.id("gender-male")).click();

		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);

		select = new Select(driver.findElement(By.name("DateOfBirthDay")));
		select.selectByVisibleText(day);
		select = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		select.selectByVisibleText(month);
		select = new Select(driver.findElement(By.name("DateOfBirthYear")));
		select.selectByVisibleText(year);

		;
		driver.findElement(By.id("Email")).sendKeys(emailAddress);
		driver.findElement(By.id("Company")).sendKeys(companyName);
         if(!driver.findElement(By.id("Newsletter")).isSelected())
         {
        	 driver.findElement(By.id("Newsletter")).click();
         }
		

		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);

		driver.findElement(By.id("register-button")).click();
		
		Assert.assertEquals(driver.findElement(By.className("result")).getText(), "Your registration. completed");
		
		driver.findElement(By.className("ico-logout")).click();
		//takeScreenshot(projectPath + "/register.png");
	}

@Test
public void TC_02_Login()
{
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys(emailAddress);
	driver.findElement(By.id("Password")).sendKeys(password);
	
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	Assert.assertTrue(driver.findElement(By.className("ico-logout")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.className("ico-account")).isDisplayed());
	//takeScreenshot(projectPath + "/login.png");
}

@Test
public void TC_03_My_Account()
{
	driver.findElement(By.className("ico-account")).click();
	Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(),"My account - Customer info" );
	Assert.assertTrue(driver.findElement(By.id("gender-male")).isSelected());
	Assert.assertEquals(driver.findElement(By.id("FirstName")).getAttribute("value"),firstName );
	Assert.assertEquals(driver.findElement(By.id("LastName")).getAttribute("value"),lastName );
	
	select = new Select(driver.findElement(By.name("DateOfBirthDay")));
	Assert.assertEquals(select.getFirstSelectedOption().getText(), day);
	select = new Select(driver.findElement(By.name("DateOfBirthMonth")));
	Assert.assertEquals(select.getFirstSelectedOption().getText(), month);
	select = new Select(driver.findElement(By.name("DateOfBirthYear")));
	Assert.assertEquals(select.getFirstSelectedOption().getText(), year);
	
	Assert.assertEquals(driver.findElement(By.id("Email")).getAttribute("value"),emailAddress );
	Assert.assertEquals(driver.findElement(By.id("Company")).getAttribute("value"),companyName );
	
	Assert.assertTrue(driver.findElement(By.id("Newsletter")).isSelected());
	//takeScreenshot(projectPath + "/MyAccountPage.png");
	//driver.findElement(By.id("save-info-button")).click();
}

@AfterClass
public void afterClass()
{
	driver.quit();
}
	public int getRamdomNumber()
	{
		Random rand=new Random();
		return rand.nextInt(9999);
	}
    public WebDriver getWebDriver()
    {
    	return this.driver;
    }
	public void takeScreenshot(String fileWithPath) 
	{
		// Convert web driver object to TakeScreenshot
		TakesScreenshot srcShot= ((TakesScreenshot)driver);
		//Cal getScreenShotAs method to create image file
		File SrcFile= srcShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile= new File(fileWithPath);
		//Copy file at destination
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
