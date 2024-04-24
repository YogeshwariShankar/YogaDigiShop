package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisableScripts {
	
	@Test
    public void test1()  {
	System.out.println("Test case 1");
   }


	@Test
    public void test2()  {
	System.out.println("Test case 2");
   }
	

	@Test(enabled=false)
    public void test3()  {
	System.out.println("Test case 3");
   }
}
