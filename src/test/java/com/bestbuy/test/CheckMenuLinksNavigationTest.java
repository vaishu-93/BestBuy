package com.bestbuy.test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bestbuy.base.BestBuyBase;
import com.bestbuy.objects.CountryPage;
import com.bestbuy.objects.HomePage;

public class CheckMenuLinksNavigationTest extends BestBuyBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC005_menuLinksNavigation";
		testDescription = "Checking the menus links on the Best buy homepage";
		testAuthor = "Vaishali";
	}
	
	@Test()
	public void TC005_menuLinksNavigation() throws IOException {
		CountryPage countryPage = new CountryPage();
		countryPage.selectCountry();
		HomePage homepage = new HomePage();
		homepage.menuLinksNavigation();
		takeScreenshot("TC005_menuLinksNavigation");
	}
}
