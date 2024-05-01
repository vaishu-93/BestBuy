package com.bestbuy.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.bestbuy.base.BestBuyBase;
import com.bestbuy.objects.CountryPage;
import com.bestbuy.objects.HomePage;

public class ShopByBrandTest extends BestBuyBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC007_shopByBrand";
		testDescription = "Validating if a product could be added to cart by selecting a particular brand from Menu option.";
		testAuthor = "Vaishali";
	}
	
	@Test()
	public void TC007_shopByBrand() throws IOException {
		CountryPage countryPage = new CountryPage();
		countryPage.selectCountry();
		HomePage homepage = new HomePage();
		homepage.shopByBrand();
		Assert.assertEquals(homepage.addedtocart(), "Added to cart");
		takeScreenshot("TC007_shopByBrand");
		if(homepage.addedtocart().contains("Added to cart")){
			test.log(Status.PASS, "Shop By Brand test passed");
		}
		else
			test.log(Status.FAIL, "Shop By Brand test failed");
	}
}
