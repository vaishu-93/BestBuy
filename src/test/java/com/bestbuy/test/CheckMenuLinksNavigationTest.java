package com.bestbuy.test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.bestbuy.base.BestBuyBase;
import com.bestbuy.objects.CountryPage;
import com.bestbuy.objects.HomePage;

public class CheckMenuLinksNavigationTest extends BestBuyBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC004_menuLinksNavigation";
		testDescription = "Checking the menus links on the Best buy homepage";
		testAuthor = "Vaishali";
	}
	
	@Test()
	public void TC004_menuLinksNavigation() throws IOException {
		CountryPage countryPage = new CountryPage();
		countryPage.selectCountry();
		HomePage homepage = new HomePage();
		homepage.menuLinksNavigation();
		takeScreenshot("TC004_menuLinksNavigation");
		if(driver.getTitle().contains("My Best Buy Memberships"))
		{
			test.log(Status.PASS, "Menu Links Naviagtion on Homepage test passed");
		}
		else
			test.log(Status.FAIL, "Menu Links Navigation on Homepage test failed");
	}
}
