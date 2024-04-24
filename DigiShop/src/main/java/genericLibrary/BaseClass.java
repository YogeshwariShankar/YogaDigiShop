package genericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	@Test
	public void test1() {
		Reporter.log("Test1", true);
	}
	
//	@Test
//	public void test2() {
//		Reporter.log("Test2", true);
//	}
//	
//	@Test
//	public void test3() {
//		Reporter.log("Test3", true);
//	}
//	
	@BeforeSuite
	public void bs() {
		Reporter.log("Before suite", true);
	}
	
	@AfterSuite
	public void as() {
		Reporter.log("After suite", true);
	}
	
	@BeforeTest
	public void bt() {
		Reporter.log("Before Test", true);
	}
	
	@AfterTest
	public void at() {
		Reporter.log("After Test", true);
	}
	
	@BeforeClass
	public void bc() {
		Reporter.log("Before class", true);
	}
	
	@AfterClass
	public void ac() {
		Reporter.log("After class", true);
	}
	
	@BeforeMethod
	public void bm() {
		Reporter.log("Before Method", true);
	}
	
	@AfterMethod
	public void am() {
		Reporter.log("After Method", true);
	}
	
	

}
