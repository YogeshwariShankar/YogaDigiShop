package testScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass1;
import genericLibrary.ExcelUtility;
import objectRepository.HomePage;
import objectRepository.RegisterPage;

public class RegisterTest extends BaseClass1 {

	@Test(dataProvider = "data")
	public void register_001(String firstName, String lastName,String email,String password,String cpwd) {
		HomePage homePage=new HomePage(driver);
		RegisterPage registerPage=new RegisterPage(driver);
		
		//Click On Log out link
		homePage.getLogoutLink().click();
		test.log(LogStatus.INFO, "Clicked on Logout link");
		
		//Click on Register link
		homePage.getRegisterLink().click();
		test.log(LogStatus.INFO, "Clicked on Register link");
		
		//Enter Firstname
		registerPage.getFirstNameTF().sendKeys(firstName);
		test.log(LogStatus.INFO, "First name entered : "+firstName );
		
		//Enter lastname
		registerPage.getLastNameTF().sendKeys(lastName);
		test.log(LogStatus.INFO, "Last name entered : "+lastName);
		
		//Enter email
		registerPage.getEmailTF().sendKeys(email);
		
		test.log(LogStatus.INFO, "Email entered : "+email);
		
		//Enter password
		registerPage.getPasswordTF().sendKeys(password);
		test.log(LogStatus.INFO, "password entered : "+password);
		//ENter confirm password
		registerPage.getConfirmPasswordTF().sendKeys(cpwd);
		test.log(LogStatus.INFO, "Confirm password entered : "+cpwd);
		
		test.log(LogStatus.PASS, "Test case completed");
	}
	
	
	@DataProvider
	public String[][] data(){
		return ExcelUtility.readRowData("Register");
	}

}
