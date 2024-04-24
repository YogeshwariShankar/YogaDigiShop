package testScripts;

import org.openqa.selenium.By;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import genericLibrary.BaseClass1;
import objectRepository.BookPage;
import objectRepository.HomePage;


@Listeners(listenerUtility.ListenerImple.class)

public class BookTest extends BaseClass1 {

	@Test
	public void book_001() {
		
	//Click on Books link
	driver.findElement(By.linkText("COMPUTER")).click();	
	test.log(LogStatus.INFO,"To click on Books", "clicked on Books link");
		
	String actualPageTitle=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
	
	try {
		//Verify the Books page is displayed
		Assert.assertEquals(actualPageTitle, "books", "Books page is not displayed");
		test.log(LogStatus.PASS, "Book page is displayed");
		
	}
	catch (AssertionError e) {
             test.log(LogStatus.FAIL,"Books page not displayed", test.addScreenCapture(getWebPageScreenshot(driver)));	
	}
	
	Reporter.log("test case completed",true);
	}
	
	@Test
	public void book_002() {
	//Click on Books link
	driver.findElement(By.linkText("BOOKS")).click();
	test.log(LogStatus.INFO, "Clicked on Books link");
		
	boolean actualResult=driver.findElement(By.id("products-orderby")).isDisplayed();
		
	//Verify the Books page is displayed
	Assert.assertEquals(actualResult, true, "Sort by dropdown is not displayed");
	test.log(LogStatus.PASS, "Sort by dropdown is displayed");	
	Reporter.log("test case completed",true);
	}
	
	@Test
	public void book_003() throws InterruptedException {
		
		HomePage homePage=new HomePage(driver);
		BookPage bookPage=new BookPage(driver);
		
		//Click on book link
		homePage.getBooksLink().click();
		
		selectOptionsByIndex(bookPage.getSortByDropdown(), 1);
		
		selectOptionsByVisibletext(bookPage.getDisplayDropdown(), "12");
		
		selectOptionsByVisibletext(bookPage.getViewAsDropdown(), "List");
		Thread.sleep(2000);
		
	}
	
	@Test
 	public void book_004() {
		//Switch to Flipkart window
		switchToWindowByTitle(driver, "flipkart");
		
		//Close Flipkart window
		driver.close();
		
		//Switch to Amazon window
		switchToWindowByUrl(driver, "amazon.com");
		
		//Maximize Amazon window
		driver.manage().window().maximize();
		driver.close();
	}
	
	}

