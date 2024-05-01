package com.bestbuy.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.bestbuy.base.BestBuyBase;
import com.bestbuy.objects.CountryPage;
import com.bestbuy.objects.LoginPage;

public class LoginInvalidTest extends BestBuyBase{

	@BeforeTest
	public void testDetails() {
		testName = "TC010_accountLoginwithInvalidCredentials";
		testDescription = "Validating the login page of Best buy with invalid credentials";
		testAuthor = "Vaishali";
	}
	
	@Test
	public void TC010_accountLoginwithInvalidCredentials() throws Exception {
		CountryPage countryPage = new CountryPage();
		countryPage.selectCountry();
		LoginPage loginpage = new LoginPage();
		loginpage.loginInvalid();
		Assert.assertEquals(loginpage.signinerrorText(), "Please enter your password.");
		takeScreenshot("TC010_accountLoginwithInvalidCredentials");
		if(loginpage.signinerrorText().contains("Please enter your password.")) {
			test.log(Status.PASS, "Account login with invalid credentials test passed");
		}
		else
			test.log(Status.FAIL,  "Account login with invalid credentials test failed");
	}
}
