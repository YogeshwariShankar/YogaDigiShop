package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseClass1;
import objectRepository.CellPhonePage;
import objectRepository.ElectronicsPage;
import objectRepository.HomePage;

public class ElectronicsTest extends BaseClass1 {
	
	@Test
	public void electronics_cellPhone_001() {
		
		HomePage homepage=new HomePage(driver);
		ElectronicsPage electronicsPage=new ElectronicsPage(driver);
		CellPhonePage cellPhonePage=new CellPhonePage(driver);
		
		//Click on Electronic link
		homepage.getElectronicLink().click();
		
		//Verify electronics page displayed
		Assert.assertEquals(electronicsPage.getPageTitle().getText(), "Electronic page is not displayed");
		
		//Click on cell phone link
		electronicsPage.getCellPhoneLink().click();
		
		
		//verify cellphone is displayed
		Assert.assertEquals(cellPhonePage.getPageTitle().getText(), "Cellphone Page is not displayed");
	
	   // sort the options by Name A to Z
		Select select = new Select(cellPhonePage.getSortByDropdown());
	    select.selectByIndex(1);
	    
	    //sort the options by name Z to A
	    select.selectByIndex(2);
	    
	    //or When we refresh we will get error to avoid this we try above
	  //Sort the options by Name A to Z
//		WebElement dropdown=driver.findElement(By.id("products-orderby"));
//		Select select=new Select(dropdown);
//		
//		select.selectByIndex(1);
//		Thread.sleep(2000);
//		dropdown=driver.findElement(By.id("products-orderby"));
//		select=new Select(dropdown);
//		//Sort the options by name Z to A
//		select.selectByIndex(2);
		
	}
	

}
