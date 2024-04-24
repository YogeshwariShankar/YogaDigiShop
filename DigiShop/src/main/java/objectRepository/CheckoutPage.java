package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {
	public CheckoutPage(WebDriver driver) {
		 super(driver); 
	}	
	
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement pageTitle;
	
	@FindBy(name = "BillingNewAddress.CountryId")
	private WebElement countrydropdown;
	
	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTextfield;
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address1TextField;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement zipcodeTextField;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement phonenoTextField;
	
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement billingaddresContinueButton;
	
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement shippingaddressContinueButton;
	
	@FindBy(id = "shippingoption_1")
	private WebElement nextDayAirRadiobutton;
	
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingmethodContinueButton;
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentmethodContinueButton;
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentinfoContinueButton;
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmButton;

	public WebElement getCountrydropdown() {
		return countrydropdown;
	}

	public WebElement getPageTitle() {
		return pageTitle;
	}

	public WebElement getCityTextfield() {
		return cityTextfield;
	}

	public WebElement getAddress1TextField() {
		return address1TextField;
	}

	public WebElement getZipcodeTextField() {
		return zipcodeTextField;
	}

	public WebElement getPhonenoTextField() {
		return phonenoTextField;
	}

	public WebElement getBillingaddresContinueButton() {
		return billingaddresContinueButton;
	}

	public WebElement getShippingaddressContinueButton() {
		return shippingaddressContinueButton;
	}

	public WebElement getNextDayAirRadiobutton() {
		return nextDayAirRadiobutton;
	}

	public WebElement getShippingmethodContinueButton() {
		return shippingmethodContinueButton;
	}

	public WebElement getPaymentmethodContinueButton() {
		return paymentmethodContinueButton;
	}

	public WebElement getPaymentinfoContinueButton() {
		return paymentinfoContinueButton;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}
	
	
	

}
