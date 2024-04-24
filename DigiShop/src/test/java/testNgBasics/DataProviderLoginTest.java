package testNgBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLoginTest {
	@DataProvider(parallel = true, name = "data")
	public String[][] registerData() {
		
		String[][] data=new String[2][2];
	
	
	data[0][0]="yogashankar@gmail.com";
	data[0][1]="Yoga@123";
	
	data[1][0]="ranihankar@gmail.com";
	data[1][1]="Rani@123";
	
	return data;
	}

	@Test(dataProvider= "data")
	public void register_001(String email, String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on Login link
		driver.findElement(By.linkText("Log in")).click();
				
		//Click on Email textbox
		driver.findElement(By.id("Email")).sendKeys(email);
				
		//Enter password textbox
		driver.findElement(By.id("Password")).sendKeys(password);
				
		//Enter login button
		driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		
		driver.quit();
				
				
		
	}
}



