package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount = 100,threadPoolSize = 100)
    public void test1() throws InterruptedException  {
	WebDriver driver=new ChromeDriver();	
	System.out.println("Test case 1");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.quit();
	
	
   }
}
