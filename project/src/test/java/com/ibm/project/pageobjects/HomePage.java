package com.ibm.project.pageobjects;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage extends Base{

	public WebDriver driver;
	private static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	WebDriverWait  wait;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	private By signIn = By.xpath("//a[contains(text(),'Sign in')]");
	@SuppressWarnings("deprecation")
	public WebElement getSignIn() {
		log.info("Locating Sing In object ..");
		wait = new WebDriverWait(driver, 4000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(signIn));
		return driver.findElement(signIn);
	}
	
	private By searchFld = By.id("search_query_top");
	
	@SuppressWarnings("deprecation")
	public WebElement getSearchFld() {
		log.info("Identifying Search Field..");
		wait = new WebDriverWait(driver, 4000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchFld));
		return driver.findElement(searchFld);
	}
	
	public static void main(String[] args) {
		WebDriver driver = Base.driver;
		driver = openBrowserWith("http://google.com");
		HomePage h = new HomePage(driver);
		h.getSignIn().click();
	}
	
}