package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.ibm.project.pageobjects.AuthenticationPage;
import com.ibm.project.pageobjects.Base;
import com.ibm.project.pageobjects.CreateAccount;
import com.ibm.project.pageobjects.HomePage;
import com.ibm.project.pageobjects.NavigationShop;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinition extends Base{
	
	Properties file = getPropertiesFile();
	
	@Given("Initialized the browser on {string} site")
	public void initialized_the_browser_on_site(String urlSite) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Runnig initialized..");
		driver = openBrowserWith(urlSite);
		}
	
	@And("^User select sign in$")
    public void user_select_sign_in(){
    	HomePage hp = new HomePage(driver);
 		hp.getSignIn().click();
    }
	
	@And ("User enter its credentials {string} and {string}")
	public void user_enter_credentials(String user, String password) {
		AuthenticationPage ap = new AuthenticationPage(driver);
		Assert.assertEquals(file.getProperty("titleAuthe"), ap.getAuthenticationTitle().getText());
		ap.getEmailSignIn().sendKeys(user);
		ap.getPasswordSignIn().sendKeys(password);
		ap.getBtnSignIn().click();
	}
	
	@Then ("^User enter email address$")
	public void user_enter_email_address() {
		AuthenticationPage ap = new AuthenticationPage(driver);
		Assert.assertEquals(file.getProperty("titleAuthe"),ap.getAuthenticationTitle().getText().trim());
		ap.getEmailCreate().sendKeys(file.getProperty("emailN")+random()+file.getProperty("emailA"));
	}
    @When("^User select Create New Account$")
    public void user_select_create_new_account()  {
        AuthenticationPage ap = new AuthenticationPage(driver);
        ap.getBtnCreateAcc().click();
        CreateAccount cr = new CreateAccount(driver);
        Assert.assertEquals(file.getProperty("titleCreate"), cr.getTitleCreateAnAccount().getText().trim());
        
    }

    @And ("^Fill out all required fields$")
    public void fill_out_all_required_fields() {
    	CreateAccount cr = new CreateAccount(driver);
    	if(Integer.parseInt(random()) > 50)
    		cr.getMrRadio().click();
    	else
    		cr.getMrsRadio().click();
    
    	cr.getFirstName().sendKeys(file.getProperty("firstname"));
    	cr.getLastName().sendKeys(file.getProperty("lastname"));
    	cr.getPassword().sendKeys(file.getProperty("password"));
		/*
		 * Select drop; drop = new Select(cr.getDateDay());
		 * drop.selectByValue(file.getProperty("dateDay")); drop = new
		 * Select(cr.getDateMonth()); drop.selectByValue(file.getProperty("dateMonth"));
		 * drop = new Select(cr.getDateYear());
		 * drop.selectByValue(file.getProperty("dateYear"));
		 */
    	cr.getAddrsCompany().sendKeys(file.getProperty("company"));
    	cr.getAddrsAddres().sendKeys(file.getProperty("addres1"));
    	cr.getAddrsCity().sendKeys(file.getProperty("city"));
    	Select drop = new Select(cr.getAddrsState());
    	drop.selectByIndex(7);
    	cr.getAddrsZipCd().sendKeys(file.getProperty("zip"));
    	cr.getAddrsAddInf().sendKeys(file.getProperty("additional"));
    	cr.getAddrsMobile().sendKeys(file.getProperty("mobile"));
    	//cr.getAddrsAlias().sendKeys(file.getProperty("alias"));
    	
    		
    }
    
    @Then ("^create the account and add items$")
    public void create_account_and_add_items() {
    	CreateAccount cr = new CreateAccount(driver);
    	NavigationShop nv = new NavigationShop(driver);
    	cr.getBtnRegister().click();
    	nv.getSearchItem().sendKeys(file.getProperty("item"));
    	nv.getSearchBtn().click();
    	nv.getAddToCart().click();
    	nv.getProcToCheck().click();
    	nv.getProcToChckAll().click();
    	nv.getChckAgree().click();
    	nv.getProcToChckCa().click();
    	nv.getPayment().click();
    	nv.getConfirmation().click();
    	
    }
    
    @Then("^close browser$")
    public void close_browser()  {
    	
        driver.close();
    }

    @And("^User click on to get into$")
    public void user_click_on_to_get_into() {
    	AuthenticationPage ap = new AuthenticationPage(driver);
    	ap.getBtnSignIn().click();
    }
    
    @Then("^Validate user was not logged in$")
    public void validate_user_was_not_logged_in() {
    	AuthenticationPage ap = new AuthenticationPage(driver);
    	Assert.assertEquals(file.getProperty("titleError"), ap.getErrorAuthFailed().getText().trim());
    	driver.close();
    	
    }
    
    private Properties getPropertiesFile() {
    	prop = new Properties();
		FileInputStream fis = null;
    	try {

			fis = new FileInputStream(System.getProperty("user.dir") + "\\resources\\global.properties");
		} catch (FileNotFoundException e) {
			System.out.println();
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	return prop;
    }
    
    private String random() {
    	int num = (int) (Math.random() * 100);
    	if(num < 10)
    		num += 10;
    	return num +"";
    }
    
    public static void main(String[] args) {
		StepDefinition s = new StepDefinition();
		System.out.println(s.random());
	}
    /*
    
    @Then("^User enter email address$")
    public void user_enter_email_create_address() {
    	String title = au.getAuthenticationTitle().getText().trim();
    	assertEquals(title, "AUTHENTICATION");
    	au.getEmailCreate().sendKeys("ezequiel.gg@gmail.com");
    	au.getBtnCreateAcc().click();
    	
    }

    @And("^I validate new account fields are available$")
    public void i_validate_new_account_fields_are_available()  {
       String title = cr.getTitleCreateAnAccount().getText().trim();
       assertEquals(title,"CREATE AN ACCOUNT");
    }

    @And("^User fill out all required fields to create account$")
    public void user_fill_out_all_required_fields_to_create_account()  {
        
    }

    @And("^I validate new account was created$")
    public void i_validate_new_account_was_created()  {
        
    }
    


    @Given("^User Log in Site$")
    public void user_log_in_site() {
        
    }

    @When("^User add it to shopping cart$")
    public void user_add_it_to_shopping_cart() {
        
    }

    @Then("^Validate item was bougth successfully$")
    public void validate_item_was_bougth_successfully() {
        
    }

    @And("^User looks for a \"([^\"]*)\"$")
    public void user_looks_for_a_(String strArg1) {
        
    }

    @And("^User buy it$")
    public void user_buy_it() {
        
    }
*/

}
	

