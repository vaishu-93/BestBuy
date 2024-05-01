package com.bestbuy.test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bestbuy.base.BestBuyBase;
import com.bestbuy.objects.CountryPage;
import com.bestbuy.objects.SignUpPage;

public class SignUpPageTest extends BestBuyBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC001_signUp";
		testDescription = "Validating the BestBuy signup page with valid credentials";
		testAuthor = "Vaishali";
	}
	
	@Test(priority = 1)
	public void TC001_signUp() throws IOException, InterruptedException {
		CountryPage countryPage = new CountryPage();
		countryPage.selectCountry();
		SignUpPage signUpPage = new SignUpPage();
		signUpPage.signUp();
		assert (signUpPage.signInText().contains("Hi"));
		takeScreenshot("TC001_signUp");
		if(signUpPage.signInText().contains("Hi")) {
			test.pass("SignUp with valid details passed");
		}
		else
			test.fail("SignUp with valid details failed");
	}
}
