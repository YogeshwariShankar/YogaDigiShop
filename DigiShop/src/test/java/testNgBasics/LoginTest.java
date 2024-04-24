package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	
	public void Login_001() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Login_001");
		driver.manage().window().maximize();
		driver.quit();
	}
	
	@Test
	public void Login_002() {
		WebDriver driver =new ChromeDriver();
		System.out.println("Login_002");
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		driver.quit();
	}
	

}
