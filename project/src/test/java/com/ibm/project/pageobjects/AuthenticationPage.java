package com.ibm.project.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage {

	public WebDriver driver;
	private static Logger log = LogManager.getLogger(AuthenticationPage.class.getName());
	WebDriverWait wait;

	public AuthenticationPage(WebDriver driver) {
		this.driver = driver;
	}

	private By emailCreate = By.id("email_create");
	private By emailSignIn = By.id("email");
	private By passwordSignIn = By.id("passwd");
	private By btnSignIn = By.id("SubmitLogin");
	private By btnCreateAcc = By.id("SubmitCreate");
	private By authenticationTitle = By.xpath("//h1[normalize-space()='Authentication']");
	private By errorAuthFailed = By.xpath("//li[contains(text(),'Authentication failed.')]");

	
	public WebElement getEmailCreate() {
		log.info("Locate Email Create object from AuthenticationPage");
		return driver.findElement(emailCreate);
	}

	
	public WebElement getEmailSignIn() {
		log.info("Locate Email SignIn object from AuthenticationPage");
		return driver.findElement(emailSignIn);
	}

	public WebElement getPasswordSignIn() {
		log.info("Locate Password SignIn object from AuthenticationPage");
		return driver.findElement(passwordSignIn);
	}

	public WebElement getBtnSignIn() {
		log.info("Locate Commit SignIn Button from AuthenticationPage");
		return driver.findElement(btnSignIn);
	}

	public WebElement getBtnCreateAcc() {
		log.info("Locate Commit Create Button from AuthenticationPage");
		return driver.findElement(btnCreateAcc);
	}

	@SuppressWarnings("deprecation")
	public WebElement getAuthenticationTitle() {
		log.info("Identifying Title from AuthenticationTitle");
		wait = new WebDriverWait(driver, 4000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(authenticationTitle));
		return driver.findElement(authenticationTitle);
	}


	public WebElement getErrorAuthFailed() {
		log.info("Identifying Error Message from Authentication Failed.");
		return driver.findElement(errorAuthFailed);
	}
}
