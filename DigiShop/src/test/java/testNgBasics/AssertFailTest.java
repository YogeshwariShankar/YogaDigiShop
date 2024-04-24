package testNgBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertFailTest {
	
	@Test
	public void logo_() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement cellPhoneLink=driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/cell-phones']"));
		
		//Hard Assert
		Assert.assertEquals(cellPhoneLink.isDisplayed(), false, "Cellphone is not displayed");		
	
	//	Assert.assertFalse(cellPhoneLink.isDisplayed());
		
		SoftAssert soft =new SoftAssert();
		soft.assertFalse(cellPhoneLink.isDisplayed());
		
		Reporter.log("Test case compleleted", true);
		
		driver.quit();
		
		soft.assertAll();
	}

}
