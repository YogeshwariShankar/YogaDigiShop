package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseClass1;
import objectRepository.CellPhonePage;
import objectRepository.CheckoutPage;
import objectRepository.ElectronicsPage;
import objectRepository.HomePage;
import objectRepository.JewelryPage;
import objectRepository.ShoppingCartPage;
import objectRepository.ThankyouPage;

public class JewelleryOrderTest extends BaseClass1 {
	
	@Test
	public void jewelry_diamondchainorder_001() {
		
		HomePage homepage=new HomePage(driver);
		JewelryPage jewelryPage=new JewelryPage(driver);
		ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
		CheckoutPage checkOutPage=new CheckoutPage(driver);
		ThankyouPage thankyouPage= new ThankyouPage(driver);
		
		homepage.getJewelryLink().click();
		
		//Verify jewelry page displayed
		Assert.assertEquals(jewelryPage.getPageTitle().getText(), "Jewelry page is not displayed");
				
		jewelryPage.getAddHearttocartButton().click();
		
		homepage.getShoppingCartLink().click();
		
		//Verify shoppingcart page displayed
		Assert.assertEquals(shoppingCartPage.getPageTitle().getText(), "ShoppingCart page is not displayed");
				
		shoppingCartPage.getTermsOfServiceCheckbox().click();
		shoppingCartPage.getCheckoutButton().click();
		
		
		//Verify Checkoutpage displayed
		Assert.assertEquals(checkOutPage.getPageTitle().getText(), "Checkout page is not displayed");
				
		
		checkOutPage.getCountrydropdown().click();
		
		try {
			Assert.assertEquals(jewelryPage.getPageTitle().getText(), "Jewelry");
			getWebPageScreenshot(driver);
			}
			
			catch (AssertionError e) {
				getWebPageScreenshot(driver);
			}
			
//			scrollIntoElementView(driver, jewelryPage.getBlackAndWhiteDiamondHeart(), true);
		//	
//			//Take Heart screenshot
//			getWebElementScreenshot(jewelryPage.getBlackAndWhiteDiamondHeart());
			
			//take add to cart screenshot
			getWebElementScreenshot(jewelryPage.getAddHearttocartButton());
			
			//Click on Shopping cart link
			homepage.getShoppingCartLink().click();
			
			//Take screenshot of Shopping cart page
			getWebPageScreenshot(driver);
			

		
		
	

}
}