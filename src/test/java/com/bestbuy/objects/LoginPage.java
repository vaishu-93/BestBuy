package com.bestbuy.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.base.BestBuyBase;

public class LoginPage extends BestBuyBase {

	@FindBy(xpath = "//span[contains(text(),'Account')]")
	private WebElement account;

	@FindBy(xpath = "//div//following::a[@href='/identity/global/signin']")
	private WebElement signInButton;

	@FindBy(xpath = "//a[@class='sign-in-btn']")
	private WebElement signIn;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement signinEmail;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement signinPassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signinSubmit;

	@FindBy(xpath = "//span[contains(text(),'Hi, Rian')]")
	private WebElement signinText;

	@FindBy(xpath = "//p[contains(text(),'Please enter your password.')]")
	private WebElement signinerrorText;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String signinText() {

		return signinText.getText();
	}

	public String signinerrorText() {

		return signinerrorText.getText();
	}
	
	public void login() throws Exception {
		wait(account);
		account.click();
		wait(signInButton);
		signInButton.click();
		signinEmail.sendKeys(readProperty("email"));
		signinPassword.sendKeys(readProperty("password"));
		signinSubmit.click();
		wait(signinText);
	}
	
	public void loginInvalid() throws Exception {
		wait(account);
		account.click();
		wait(signInButton);
		signInButton.click();
		signinEmail.sendKeys(readProperty("email"));
		signinSubmit.click();
		wait(signinerrorText);
	}
}