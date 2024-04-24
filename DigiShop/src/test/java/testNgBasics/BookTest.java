package testNgBasics;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class BookTest {
	

//public static void main(String[] args)  {
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		//Click on BOOKS link
//		driver.findElement(By.linkText("BOOKS")).click();
//		
//		String actualTitle = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
//		String expectedTitle ="Books";
//		
//		//HardAssert
//		Assert.assertEquals(actualTitle, expectedTitle);
//		
//		SoftAssert soft=new Soft
//				
				@Test
				public void book_001() {
					//Launch browser
					WebDriver driver=new ChromeDriver();
					
					//Maximize the browser
					driver.manage().window().maximize();
					
					//Navigate to URl
					driver.get("https://demowebshop.tricentis.com/");
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
					//Click on BOOKS link
					driver.findElement(By.linkText("BOOKS")).click();
					
					String actualTitle = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
					String expectedTitle="Books";
					
					//HardAssert
					Assert.assertEquals(actualTitle, expectedTitle);					
//					SoftAssert soft=new SoftAssert();
//					soft.assertEquals(actualTitle, expectedTitle,"Books page is not displayed");
//					
//					
					driver.quit();
			Reporter.log("Test case completed",true);
//					
//					soft.assertAll();
				}
			
		
		
		
		
		
}
	


