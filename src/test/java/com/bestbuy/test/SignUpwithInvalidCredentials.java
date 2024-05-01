package com.bestbuy.test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bestbuy.base.BestBuyBase;
import com.bestbuy.objects.CountryPage;
import com.bestbuy.objects.SignUpPage;

public class SignUpwithInvalidCredentials extends BestBuyBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC011_signUpInvalid";
		testDescription = "Validating the BestBuy signup page with invalid credentials";
		testAuthor = "Vaishali";
	}

	@Test
	public void TC011_signUpInvalid() throws IOException, InterruptedException {
		CountryPage countryPage = new CountryPage();
		countryPage.selectCountry();
		SignUpPage signUpPage = new SignUpPage();
		signUpPage.signUpInvalid();
		assert (signUpPage.signInerrortext().contains("Please enter your last name."));
		takeScreenshot("TC011_signUpInvalid");
		if(signUpPage.signInerrortext().contains("Please enter your last name.")) {
			test.pass("SignUp with invalid credentials test passed");
		}
		else
			test.fail("SignUp with invalid credentials test failed");
	}
}
