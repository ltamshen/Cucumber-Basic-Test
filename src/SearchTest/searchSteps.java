package SearchTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SearchPage;
import pages.SearchResultsPage;

public class searchSteps {

	 WebDriver driver;
	 SearchPage searchPage;
	 SearchResultsPage searchResultsPage;
	
	@Before
	public void before(){
		driver = Helper.before(driver);
	}
	@After
	public void after(){

		Helper.after(driver);
	}
	
	@Given("I am on the Google search page")
	public void goToGoogleSearchPage(){
		searchPage = new SearchPage(driver);
	    searchPage.navigateTo("https://www.google.com");

	}
	@When("^I enter \"(.*)\"$")
	public void enterSearchTerm(String searchTerm){
		 searchResultsPage = searchPage.enterSearchTerm(searchTerm);
	}
	
	@Then("^I see at least one result$")
	public void atLeastOneResult(){
		Assert.assertTrue(searchResultsPage.returnNumberOfResults() > 0);
	}
}
