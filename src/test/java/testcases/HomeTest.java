package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;

public class HomeTest extends BaseClass{
	
	@Test
	public void TestLogin() {

		LoginPage lp = new LoginPage(driver);
		lp.Login("standard_user","secret_sauce" );
		System.out.println("Login successful");
	}
}
