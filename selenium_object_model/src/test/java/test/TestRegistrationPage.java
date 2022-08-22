package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.TestData;

public class TestRegistrationPage {

	WebDriver driver;
	RegisterPage registerPage;
	LoginPage loginPage;
	private HomePage homePage;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}

	/**
	 * 
	 * https://demo.guru99.com/insurance/v1/index.php
	 * 
	 * Verify Register page title as guru99 bank
	 * 
	 * Login to application
	 * 
	 * Verify the home page using Dash board message
	 * @throws InterruptedException 
	 * 
	 */

	@Test(priority = 0)
	public void test_Registeration() throws InterruptedException {

		// Register to the APP

		registerPage = new RegisterPage(driver);
		registerPage.register(TestData.title, TestData.fistName, TestData.LastName, TestData.phone, TestData.birthYear,
				TestData.birthMonth, TestData.birthDate, TestData.licencetype, TestData.licencePeriod,
				TestData.occupation, TestData.street, TestData.city, TestData.country, TestData.postalCode,
				TestData.email, TestData.password, TestData.password);

		Thread.sleep(3000);

		// Login to the APP
		loginPage = new LoginPage(driver);
		loginPage.loginToApp(TestData.email, TestData.password);
		Thread.sleep(2000);

		homePage = new HomePage(driver);
		// Verify the home page sign as title
		Assert.assertTrue(homePage.getHomePageDashboardUserName().contains(TestData.email));
	}

}
