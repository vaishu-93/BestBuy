package com.bestbuy.test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bestbuy.base.BestBuyBase;
import com.bestbuy.objects.CountryPage;
import com.bestbuy.objects.HomePage;

public class CheckBottomLinksNavigation extends BestBuyBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC006_bottomMenuLinksNavigation";
		testDescription = "Checking the bottom links on the homepage of Best buy website";
		testAuthor = "Vaishali";
	}
	
	@Test
	public void TC006_bottomMenuLinksNavigation() throws IOException {
		CountryPage countryPage = new CountryPage();
		countryPage.selectCountry();
		HomePage homepage = new HomePage();
		homepage.checkBottomLinks();
		takeScreenshot("TC006_bottomMenuLinksNavigation");
	}
}
