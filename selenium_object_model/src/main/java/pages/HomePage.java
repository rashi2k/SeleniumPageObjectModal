package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(xpath = "//div[@class='content']//h4")

	WebElement homePageUserName;

	public HomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

	// Get the User name from Home Page

	public String getHomePageDashboardUserName() {

		return homePageUserName.getText();

	}

}