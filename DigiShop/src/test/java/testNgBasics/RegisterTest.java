package testNgBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTest {
	
	@DataProvider(parallel = true, name = "data")
	public String[][] registerData() {
		
		String[][] data=new String[5][5];
	
	
	data[0][0]="Yoga";
	data[0][1]="Shankar";
	data[0][2]="yogashankar@gmail.com";
	data[0][3]="Yoga@123";
	data[0][4]="Yoga@123";
	
	data[1][0]="Rani";
	data[1][1]="Shankar";
	data[1][2]="ranihankar@gmail.com";
	data[1][3]="Rani@123";
	data[1][4]="Rani@123";
	
	data[2][0]="Madan";
	data[2][1]="Suriya";
	data[2][2]="madansuriya@gmail.com";
	data[2][3]="Madan@123";
	data[2][4]="Madan@123";
	
	data[3][0]="Shankar";
	data[3][1]="Rangaswamy";
	data[3][2]="shankar@gmail.com";
	data[3][3]="Shankar@123";
	data[3][4]="Shankar@123";
	
	data[4][0]="Manjula";
	data[4][1]="Palaniswamy";
	data[4][2]="manjula@gmail.com";
	data[4][3]="Manjula@123";
	data[4][4]="Manjula@123";
	
	return data;
	}
	
	
	@Test(dataProvider= "data")
	public void register_001(String firstName, String lastName, String email, String password, String confirmPassword) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on Register link
		driver.findElement(By.linkText("Register")).click();
		
		//Click on male radio button
		driver.findElement(By.id("gender-female")).click();
		
		//Enter first name
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		
		//Enter Last name
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		
		//Enter the email
		driver.findElement(By.id("Email")).sendKeys(email);
		
		//Enter password
		driver.findElement(By.id("Password")).sendKeys(password);
		
		//Enter the confirm password
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		
		//Enter the Register button
        driver.findElement(By.id("register-button")).click();
		
		//Close the browser
		driver.quit();
	}

}
