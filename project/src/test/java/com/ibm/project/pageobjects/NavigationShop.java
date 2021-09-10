package com.ibm.project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationShop extends Base{

	public WebDriver driver;
	WebDriverWait wait;

	public NavigationShop(WebDriver driver) {
		this.driver = driver;
	}
	

	private By searchItem = By.id("search_query_top");
	private By searchBtn = By.xpath("//button[@name='submit_search']");
	private By addToCart = By.cssSelector("a[title='Add to cart'] span");
	private By proceedTo = By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]");
	private By procToCheck = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]");
	private By procToChckAll = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]");
	private By procToChckCa = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]");
	private By chckAgree = By.xpath("//input[@id='cgv']");
	private By payment = By.partialLinkText("Pay by bank wi");
	private By confirmation = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]");
	
	
	public WebElement getSearchBtn() {
		return driver.findElement(searchBtn);
	}
	
	public WebElement getPayment() {
		return driver.findElement(payment);
	}
	
	
	@SuppressWarnings("deprecation")
	public WebElement getProceedTo() {
		wait = new WebDriverWait(driver, 5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(proceedTo));
		return driver.findElement(proceedTo);
	}
	
	@SuppressWarnings("deprecation")
	public WebElement getAddToCart() {
		wait = new WebDriverWait(driver, 5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart));
		return driver.findElement(addToCart);
	}
	
	@SuppressWarnings("deprecation")
	public WebElement getSearchItem() {
		wait = new WebDriverWait(driver, 5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchItem));
		return driver.findElement(searchItem);
	}
	@SuppressWarnings("deprecation")
	public WebElement getProcToCheck() {
		wait = new WebDriverWait(driver, 9000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(procToCheck));
		return driver.findElement(procToCheck);
	}
	
	@SuppressWarnings("deprecation")
	public WebElement getProcToChckAll() {
		wait = new WebDriverWait(driver, 5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(procToChckAll));
		return driver.findElement(procToChckAll);
	}
	
	@SuppressWarnings("deprecation")
	public WebElement getChckAgree() {
		wait = new WebDriverWait(driver, 5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(chckAgree));
		return driver.findElement(chckAgree);
	}
	@SuppressWarnings("deprecation")
	public WebElement getProcToChckCa() {
		wait = new WebDriverWait(driver, 5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(procToChckCa));
		return driver.findElement(procToChckCa);
	}
	
	@SuppressWarnings("deprecation")
	public WebElement getConfirmation() {
		wait = new WebDriverWait(driver, 5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(confirmation));
		return driver.findElement(confirmation);
	}
}
