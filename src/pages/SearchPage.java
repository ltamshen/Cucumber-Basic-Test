package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

	protected WebDriver driver;
	
	public SearchPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SearchPage navigateTo(String string) {
		driver.get(string);
		return new SearchPage(driver);
		
	}
	public SearchResultsPage enterSearchTerm(String searchTerm){
		WebElement searchBox = driver.findElement(By.id("lst-ib"));
		searchBox.sendKeys(searchTerm);
		searchBox.sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("resultStats")));
		return new SearchResultsPage(driver);
	}
}
