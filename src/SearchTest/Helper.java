package SearchTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

	public static WebDriver before(WebDriver driver){
	System.setProperty("webdriver.chromedriver.driver","C:\\ChromeDriver\\chromedriver.exe");
	return driver = new ChromeDriver();
	}
	
	public static void after(WebDriver driver){
		driver.quit();
	}
}
