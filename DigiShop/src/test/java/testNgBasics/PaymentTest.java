package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test(priority=1)	
	public void Register() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	
    @Test(priority=2)	
	public void Login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
    

    @Test(priority=3)
    public void AddtoCart() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	System.out.println("Add to cart");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.quit();
    }


    @Test(priority=4)
    public void Payment() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	System.out.println("Payment");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.quit();
    }


}
