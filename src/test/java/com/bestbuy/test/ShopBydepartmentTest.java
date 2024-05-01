package com.bestbuy.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bestbuy.base.BestBuyBase;
import com.bestbuy.objects.CountryPage;
import com.bestbuy.objects.HomePage;

public class ShopBydepartmentTest extends BestBuyBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC010_shopByDepartment";
		testDescription = "Validating if a product could be added to cart by selecting the Shop by department in the menu options";
		testAuthor = "Vaishali";
	}
	
	@Test()
	public void TC010_shopByDepartment() throws IOException {
		CountryPage countryPage = new CountryPage();
		countryPage.selectCountry();
		HomePage homepage = new HomePage();
		homepage.shopByDepartment();
		Assert.assertEquals(homepage.addedtocart(), "Added to cart");
		takeScreenshot("TC010_shopByDepartment");
	}

}
