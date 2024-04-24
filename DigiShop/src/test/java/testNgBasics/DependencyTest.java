package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyTest {

	
	@Test	
	public void register() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
//		driver.get("fg");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	
    @Test(dependsOnMethods="register")	
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
    

    @Test(dependsOnMethods="login")
    public void addtoCart() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	System.out.println("Add to cart");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.quit();
   }

    

    @Test(dependsOnMethods="addtoCart")
    public void Payment() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	System.out.println("Payment");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.quit();
   }



}
