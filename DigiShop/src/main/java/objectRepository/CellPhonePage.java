package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseClass1;

public class CellPhonePage extends BasePage{
	
	public CellPhonePage(WebDriver driver) {
		 super(driver);
	}	
	

	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement pageTitle;
	
	@FindBy (id  = "products-orderby")
	private WebElement sortByDropdown;

	
	public WebElement getPageTitle() {
		return pageTitle;
	}

	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}

}
