package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage extends BasePage{

	public JewelryPage(WebDriver driver) {
		 super(driver);
	}	
	
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement pageTitle;
	
	@FindBy(xpath = "//a[.='Black & White Diamond Heart']/../..//input")
	private WebElement getAddHeartToCartButton;

	@FindBy (xpath= "//a[.='Black & White Diamond Heart']/../../../..")
	private WebElement getBlackAndWhiteDiamondHeart;
	
	public WebElement getAddHearttocartButton() {
		return getAddHeartToCartButton;
	}

	public WebElement getBlackAndWhiteDiamondHeart() {
		return getBlackAndWhiteDiamondHeart;
	}

	public WebElement getPageTitle() {
		return pageTitle;
	}

	
}
