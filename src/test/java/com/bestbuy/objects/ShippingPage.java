package com.bestbuy.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.bestbuy.base.BestBuyBase;

public class ShippingPage extends BestBuyBase {

	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='address-input']")
	private WebElement address;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement city;

	@FindBy(xpath = "//select[@id='state']")
	private WebElement state;

	@FindBy(xpath = "//input[@id='postalCode']")
	private WebElement zipcode;

	@FindBy(xpath = "//input[@id='user.emailAddress']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='user.phone']")
	private WebElement phone;

	@FindBy(xpath = "//section[@class='contact-information']")
	private WebElement contactInfoSection;

	@FindBy(xpath = "//button[contains(.,'Continue to Payment Information')]")
	private WebElement continuetopayment;

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement cardNumber;

	@FindBy(xpath = "//img[@alt='Mastercard']")
	private WebElement cardselection;

	@FindBy(xpath = "//button[@data-track='Place your Order - Contact Card']")
	private WebElement placeOrder;

	@FindBy(xpath = "//p[contains(text(),'Please enter a valid card number.')]")
	private WebElement verifycard;

	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}

	public void shippingDetails() {

		scroll();
		scroll();
		email.sendKeys("liamop03@gmail.com");
		phone.sendKeys("9007865223");
		scrollToElement(continuetopayment);
		continuetopayment.click();
		// cardselection.click();
		visibilityOfElement(cardNumber);
		cardNumber.sendKeys("4000 0023 4567 8921");

		firstName.sendKeys("rian");
		lastName.sendKeys("liam");
		address.sendKeys("D14 Unit 15696");
		city.sendKeys("APO");
		Select stateValue = new Select(state);
		stateValue.selectByValue("AP");
		zipcode.sendKeys("96275");
		scrollToElement(placeOrder);

		placeOrder.click();

	}

	private void visibilityOfElement(WebElement cardNumber2) {
		// TODO Auto-generated method stub

	}

	public String cardinfo() {
		return verifycard.getText();
	}
}
