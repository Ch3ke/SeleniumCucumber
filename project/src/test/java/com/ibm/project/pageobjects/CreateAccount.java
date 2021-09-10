package com.ibm.project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount extends Base{

	public WebDriver driver;
	WebDriverWait wait;

	public CreateAccount(WebDriver driver) {
		this.driver = driver;
	}

	private By mrRadio = By.id("id_gender1");
	private By mrsRadio = By.id("id_gender1");
	private By firstName = By.id("customer_firstname");
	private By lastName = By.id("customer_lastname");
	private By email = By.id("email");
	private By password = By.id("passwd");
	private By dateYear = By.xpath("//select[@id='years']");
	private By dateMonth = By.cssSelector("#months");
	private By dateDay = By.id("days");
	private By addrsfirstName = By.id("firstname");
	private By addrslastName = By.id("lastname");
	private By addrsCompany = By.id("company");
	private By addrsAddres = By.id("address1");
	private By addrsAddresL = By.id("address2");
	private By addrsCity = By.id("city");
	private By addrsState = By.id("id_state");
	private By addrsZipCd = By.id("postcode");
	private By addrsCountry = By.id("id_country");
	private By addrsAddInf = By.id("other");
	private By addrsHomePh = By.id("phone");
	private By addrsMobile = By.id("phone_mobile");
	private By addrsAlias = By.id("address_alias");
	private By btnRegister = By.id("submitAccount");
	private By titleCreateAcc = By.xpath("//h1[contains(text(),'Create an account')]");

	
	public WebElement getMrRadio() {
		
		return driver.findElement(mrRadio);
	}

	public WebElement getMrsRadio() {
		
		return driver.findElement(mrsRadio);
	}

	public WebElement getLastName() {
		
		return driver.findElement(lastName);
	}

	public WebElement getFirstName() {
		
		return driver.findElement(firstName);
	}

	public WebElement getEmail() {
		
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		
		return driver.findElement(password);
	}

	@SuppressWarnings("deprecation")
	public WebElement getDateYear() {
		wait = new WebDriverWait(driver, 5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(dateYear));
		return driver.findElement(dateYear);
	}

	@SuppressWarnings("deprecation")
	public WebElement getDateMonth() {
		wait = new WebDriverWait(driver, 5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(dateMonth));
		return driver.findElement(dateMonth);
	}

	@SuppressWarnings("deprecation")
	public WebElement getDateDay() {
		wait = new WebDriverWait(driver, 5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(dateDay));
		return driver.findElement(dateDay);
	}

	public WebElement getAddrsfirstName() {
		
		return driver.findElement(addrsfirstName);
	}

	public WebElement getAddrslastName() {
		
		return driver.findElement(addrslastName);
	}

	public WebElement getAddrsCompany() {
		
		return driver.findElement(addrsCompany);
	}


	public WebElement getAddrsAddres() {
		
		return driver.findElement(addrsAddres);
	}

	public WebElement getAddrsAddresL() {
		
		return driver.findElement(addrsAddresL);
	}

	public WebElement getAddrsHomePh() {
		
		return driver.findElement(addrsHomePh);
	}

	public WebElement getAddrsCity() {
		
		return driver.findElement(addrsCity);
	}

	public WebElement getAddrsState() {
		
		return driver.findElement(addrsState);
	}

	public WebElement getAddrsZipCd() {
		
		return driver.findElement(addrsZipCd);
	}

	public WebElement getAddrsCountry() {
		
		return driver.findElement(addrsCountry);
	}

	public WebElement getAddrsAddInf() {
		
		return driver.findElement(addrsAddInf);
	}

	public WebElement getAddrsMobile() {
		
		return driver.findElement(addrsMobile);
	}

	public WebElement getAddrsAlias() {
		
		return driver.findElement(addrsAlias);
	}

	public WebElement getBtnRegister() {
		
		return driver.findElement(btnRegister);
	}
	
	@SuppressWarnings("deprecation")
	public WebElement getTitleCreateAnAccount() {
		wait = new WebDriverWait(driver, 5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(titleCreateAcc));
		return driver.findElement(titleCreateAcc);
	}
}
