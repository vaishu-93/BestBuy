package com.bestbuy.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.bestbuy.base.BestBuyBase;
import com.bestbuy.objects.CountryPage;
import com.bestbuy.objects.HomePage;
import com.bestbuy.objects.LoginPage;
import com.bestbuy.objects.ShippingPage;
import com.bestbuy.objects.SignUpPage;
import com.bestbuy.utils.Utils;

public class ProductAddtoCartTest extends BestBuyBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC004_addToCart";
		testDescription = "Validating if a product could be added to cart";
		testAuthor = "Vaishali";
	}
	
	@Test()
	public void TC004_addToCart() throws IOException {
		CountryPage countryPage = new CountryPage();
		countryPage.selectCountry();
		HomePage homepage = new HomePage();
		homepage.searchProduct("iphone");
		Assert.assertEquals(homepage.addedtocart(), "Added to cart");
		takeScreenshot("TC004_addToCart");
	}

}
