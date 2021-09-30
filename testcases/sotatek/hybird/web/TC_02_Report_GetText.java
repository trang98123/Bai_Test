package sotatek.hybird.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.Web.HomePageObject;
import pageObject.Web.PageGeneratorManager;
import pageObject.Web.SearchPageObject;

public class TC_02_Report_GetText extends BaseTest{
		WebDriver driver;

		@Parameters({ "browser" })
		@BeforeClass
		public void beforeClass(String browserName) {
			log.info("Pre-Condition: Open browser" + browserName);
			driver = getBrowerDriver(browserName);
			driver.manage().window().maximize();
		}

		@Test
		public void TC_01() {
			log.info("Step 01: Open browser");
			homePageObject = PageGeneratorManager.getHomePageObject(driver);
			driver.get("https://www.bestbuy.ca/en-ca/");
			log.info("TC_02_Open_Browser_BestBuy_SearchIPHONE11 - SStep 02: Input Value To Search Textbox");
			homePageObject.enterToSearchBuyTextbox("iPhone 11");
			log.info("TC_02_Open_Browser_BestBuy_SearchIPHONE11 - Step 03: Click To Search Button");
			searchPageObject = homePageObject.clickToSearchBuyButton();
			searchPageObject.sleepInSecond(3);
			//searchPageObject.isProductBestPrice();
			//searchPageObject.isSortWeb();
			String name_textbox = "//div[@class='productItemName_3IZ3c']";
			String price_textbox = "//div[@class='price_FHDfG medium_za6t1 ']";

			String text = driver.findElement(By.xpath(name_textbox)).getText();
			System.out.println(text);

			String price = driver.findElement(By.xpath(price_textbox)).getText();
			System.out.println(price);
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			List<WebElement> lists = driver.findElements(By.xpath("//div[@class='productItemName_3IZ3c']"));
			List<WebElement> list = driver.findElements(By.xpath("//div[@class='price_FHDfG medium_za6t1 ']"));
			for (int i = 0; i < lists.size(); i++) {
				System.out.println(lists.get(i).getText());

				for (int j = 0; j < list.size(); j++) {
					System.out.println(list.get(j).getText());
					System.out.println(actualTitle+lists.get(i).getText() +" "+ list.get(j).getText());
				}

			}
		}

		
		HomePageObject homePageObject;
		SearchPageObject searchPageObject;

	}

