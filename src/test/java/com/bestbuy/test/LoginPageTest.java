package com.bestbuy.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bestbuy.objects.CountryPage;
import com.bestbuy.objects.LoginPage;

public class LoginPageTest extends LoginPage {

	@Test
	public void TC002_accountLogin() throws Exception {
		CountryPage countryPage = new CountryPage();
		countryPage.selectCountry();
		LoginPage loginpage = new LoginPage();
		loginpage.login();
		Assert.assertEquals(loginpage.signinText(), "Hi Rian");
		takeScreenshot("TC002_accountLogin");
	}
}
