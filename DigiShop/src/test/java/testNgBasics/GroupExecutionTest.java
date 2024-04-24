package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecutionTest {
	
	
	@Test(groups= {"Smoke", "FT"})	
	public void register() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("Smoke FT Register");
		driver.get("fg");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	
    @Test(groups="FT")//(dependsOnMethods="register")	
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("FT Login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
    

    @Test(groups="ST")//(dependsOnMethods="login")
    public void addtoCart() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Reporter.log("ST Add to cart",true);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.quit();
   }
    

    @Test(groups={"Smoke","RT","IT"})//(dependsOnMethods="addtoCart")
    public void Payment() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	System.out.println("Smoke RT IT Payment");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.quit();
   }

    @Test(priority=1,groups="Smoke")	
	public void Register() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("Smoke Register");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	
    @Test(priority=2,groups="FT")	
	public void Login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("FT Login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
    

    @Test(priority=3,groups={"RT","ST"})
    public void AddtoCart() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	System.out.println("RT ST Add to cart");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.quit();
    }


    @Test(priority=4,groups= {"RT", "FT","Smoke"})
    public void Payment1() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	System.out.println("FT FT Smoke Payment");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.quit();
    }
    
    @Test(groups="IT")//(invocationCount = 100,threadPoolSize = 100)
    public void test1() throws InterruptedException  {
	WebDriver driver=new ChromeDriver();	
	System.out.println("IT Test case 1");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.quit();
    }
	
	@Test(groups = {"IT", "FT"})
			
    public void test4()  {
	System.out.println("IT FTTest case 1");
   }


	@Test(groups= {"IT","FT", "Smoke"})
    public void test2()  {
	System.out.println("IT FT Smoke Test case 2");
   }
	

	@Test(groups = {"IT", "Smoke"})//(enabled=false)
    public void test3()  {
	System.out.println("IT Smoke Test case 3");
   }






}


