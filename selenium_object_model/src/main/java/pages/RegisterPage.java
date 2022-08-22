package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	WebDriver driver;

	@FindBy(name = "title")
	WebElement titleSelect;

	@FindBy(name = "firstname")
	WebElement firstname;

	@FindBy(name = "lastname")
	WebElement lastName;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(name = "year")
	WebElement year;

	@FindBy(name = "month")
	WebElement month;

	@FindBy(name = "date")
	WebElement date;

	@FindBy(id = "licencetype_f")
	WebElement licencetypeFull;

	@FindBy(id = "licencetype_t")
	WebElement licencetypeProvisional;

	@FindBy(name = "licenceperiod")
	WebElement licencePeriodSelect;

	@FindBy(name = "occupation")
	WebElement occupationSelect;

	@FindBy(name = "street")
	WebElement street;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "county")
	WebElement country;

	@FindBy(name = "post_code")
	WebElement postalCode;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "c_password")
	WebElement confirmPassword;

	@FindBy(name = "submit")
	WebElement buttonCreate;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	private void setTitle(String title) {
		System.out.println(title);
		Select drpTitle= new Select(titleSelect);
		drpTitle.selectByVisibleText(title);
	}

	private void setFirstname(String firstname) {
		this.firstname.sendKeys(firstname);
	}

	private void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	private void setPhone(String phone) {
		this.phone.sendKeys(phone);
	}

	private void setYear(String year) {
		this.year.sendKeys(year);
	}

	private void setMonth(String month) {
		this.month.sendKeys(month);
	}

	private void setDate(String date) {
		this.date.sendKeys(date);
	}

	private void setLicencetype(String licencetype) {
		if (this.licencetypeFull.getText().equals(licencetype)) {
			this.licencetypeFull.click();
		} else {
			this.licencetypeProvisional.click();
		}

	}

	private void setLicencePeriod(String licencePeriod) {
		System.out.println(licencePeriod);
		Select drpLicencePeriodOccupation= new Select(licencePeriodSelect);
		drpLicencePeriodOccupation.selectByVisibleText(licencePeriod);

	}

	private void setOccupation(String occupation) {
		System.out.println(occupation);
		Select drpOccupation= new Select(occupationSelect);
		drpOccupation.selectByVisibleText(occupation);
	}

	private void setStreet(String street) {
		this.street.sendKeys(street);
	}

	private void setCity(String city) {
		this.city.sendKeys(city);
	}

	private void setCountry(String country) {
		this.country.sendKeys(country);
	}

	private void setPostalCode(String postalCode ) {
		this.postalCode.sendKeys(postalCode);
	}

	private void setEmail(String email) {
		this.email.sendKeys(email);
	}

	private void setPassword(String passowrd) {
		this.password.sendKeys(passowrd);
	}

	private void setConfirmPassword(String confirmPassword) {
		this.confirmPassword.sendKeys(confirmPassword);
	}

	private void clickCreate() {
		buttonCreate.click();

	}

	// this is the function expose to the test
	public void register(String title, String firstName, String LastName, String phone, String birthYear,
			String birthMonth, String birthDate, String licencetype, String licencePeriod, String occupation,
			String street, String city, String country, String postalCode, String email, String password, String confirmPassword) {

		// Fill register data
		setTitle(title);
		setFirstname(firstName);
		setLastName(LastName);
		setPhone(phone);
		setYear(birthYear);
		setMonth(birthMonth);
		setDate(birthDate);
		setLicencetype(licencetype);
		setLicencePeriod(licencePeriod);
		setOccupation(occupation);
		setStreet(street);
		setCity(city);
		setCountry(country);
		setPostalCode(postalCode);
		setEmail(email);
		setPassword(password);
		setConfirmPassword(confirmPassword);

		// click on the create button
		this.clickCreate();

	}

}
