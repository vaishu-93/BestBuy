package com.bestbuy.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bestbuy.base.BestBuyBase;
import com.bestbuy.objects.CountryPage;
import com.bestbuy.objects.HomePage;
import com.bestbuy.objects.ShippingPage;

public class ProductCheckoutTest extends BestBuyBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC008_productCheckout";
		testDescription = "Validating if a product could be added to cart and checkout the product for placing an order";
		testAuthor = "Vaishali";
	}
	
	@Test()
	public void TC008_productCheckout() throws IOException, InterruptedException {
		CountryPage countryPage = new CountryPage();
		countryPage.selectCountry();
		HomePage homepage = new HomePage();
		homepage.productCheckout();
		ShippingPage shippage = new ShippingPage();
		shippage.shippingDetails();
		Assert.assertEquals(shippage.cardinfo(), "Please enter a valid card number.");
		takeScreenshot("TC008_productCheckout");
	}
}
