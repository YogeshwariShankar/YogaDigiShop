package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankyouPage extends BasePage {
	
	public ThankyouPage(WebDriver driver) {
		 super(driver);
		 
	}	
	

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement thankyouContinueButton;


	public WebElement getThankyouContinueButton() {
		return thankyouContinueButton;
	}
	
}
