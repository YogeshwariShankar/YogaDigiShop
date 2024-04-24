package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BasePage {
	
	public ShoppingCartPage(WebDriver driver) {
		 super(driver);
	}	
	

	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement pageTitle;
	
	@FindBy(id = "termsofservice")
	private WebElement termsOfServiceCheckbox;
	
	@FindBy(id = "checkout")
    private WebElement checkoutButton;

	public WebElement getPageTitle() {
		return pageTitle;
	}

	public WebElement getTermsOfServiceCheckbox() {
		return termsOfServiceCheckbox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	
}
