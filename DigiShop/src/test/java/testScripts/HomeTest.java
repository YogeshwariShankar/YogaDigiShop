package testScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.BaseClass1;
import genericLibrary.ExcelUtility;
import objectRepository.HomePage;

public class HomeTest extends BaseClass1 {

	@Test	
	public void home_001() {
		HomePage homePage=new HomePage(driver);
		
		//This can used when public is used
//		//Enter the product name
//		homePage.SearchField().sendKeys("laptop");
//				
//	    //click to searchbutton
//		homePage.SearchButton().click();
//				
		
		
		//Enter the product name
		homePage.getSearchField().sendKeys("laptop");
		
		//click to searchbutton
		homePage.getSearchButton().click();
		
	}
		@Test
		public void home_002() throws InterruptedException {
			HomePage homePage=new HomePage(driver);
			
			scrollToElement(homePage.getLapTopImage());
			Thread.sleep(5000);
			
		}
		
		
		@Test
		public void home_003() throws InterruptedException {
			HomePage homePage=new HomePage(driver);
			
			scrollFromOrigin(homePage.getLapTopImage(),0,300);
			Thread.sleep(5000);
			
			scrollFromOrigin(homePage.getLapTopImage(),0,-500);
			Thread.sleep(5000);
			
		}
		
		@Test(dataProvider = "pdata")
		public void home_004(String product) throws InterruptedException {
			HomePage homePage= new HomePage(driver);
			
			//Search the product
			homePage.getSearchField().sendKeys(product);
			Thread.sleep(2000);
			
			//Click on search button
			homePage.getSearchButton().click();
						
		}
		
		@DataProvider(name="pdata")
		public String[][] productdata(){
			return ExcelUtility.readRowData("Products");
		}
		
				
	}

