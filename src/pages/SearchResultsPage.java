package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

	private WebDriver driver;
	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public int returnNumberOfResults(){
		WebElement resultStats = driver.findElement(By.id("resultStats"));
		String[] resultsText = resultStats.getText().split(" ");
		String numberOfResults = resultsText[1].replace(",", "");
		return Integer.parseInt(numberOfResults);
	}
}
