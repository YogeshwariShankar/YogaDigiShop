package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		 super(driver);
	}	
		
	// this also can be used 
//	@FindBy(css = "img[alt='Tricentis Demo Web Shop']")
//	public WebElement logo;
	
	@FindBy(css = "img[alt='Tricentis Demo Web Shop']")
	private WebElement logo;
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchField;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(linkText = "ELECTRONICS")
	private WebElement electronicLink;
	
	@FindBy(linkText = "JEWELRY")
	private WebElement jewelryLink;
		
	@FindBy(xpath = "//span[.='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(linkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(xpath = "//img[@alt='Picture of 14.1-inch Laptop']")
	private WebElement LapTopImage;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}


	public WebElement getLapTopImage() {
		return LapTopImage;
	}


	public WebElement getBooksLink() {
		return booksLink;
	}



	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	
	
	public WebElement getJewelryLink() {
		return jewelryLink;
	}


	public WebElement getElectronicLink() {
		return electronicLink;
	}
	

	//we have to give access only with the help of getter
	//rightclick-source-generate getter and setter
	public WebElement getLogo() {
		return logo;
	}


	public WebElement getRegisterLink() {
		return registerLink;
	}


	public WebElement getLoginLink() {
		return loginLink;
	}


	public WebElement getSearchField() {
		return searchField;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}
		
}
