package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(name = "email")

	WebElement email;

	@FindBy(name = "password")

	WebElement password;

//	@FindBy(xpath = "//div[@class='content']//h4")
//
//	WebElement signAsTitle;

	@FindBy(xpath = "//input[@name='submit']")

	WebElement login;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// set User name
	private void setEmail(String email) {

		this.email.sendKeys(email);
	}

	// set password

	private void setPassword(String strPassword) {

		password.sendKeys(strPassword);

	}

	// login click method

	public void clickLogin() {

		login.click();

	}

	// Return login page title

//	public String getSignAsTitle() {
//
//		return signAsTitle.getText();
//
//	}

	/**
	 * 
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strUserName
	 * 
	 * @param strPasword
	 * 
	 * @return
	 * 
	 */

	public void loginToApp(String strEmail, String strPasword) {

		// Fill user name

		this.setEmail(strEmail);

		// Fill password

		this.setPassword(strPasword);

		// Click Login button

		this.clickLogin();

	}
}
