package com.bestbuy.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.base.BestBuyBase;

public class CountryPage extends BestBuyBase {

	public CountryPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='us-link']")
	public static WebElement country;

	public void selectCountry() {
		wait(country);
		country.click();
	}

}
