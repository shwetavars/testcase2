package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	static WebDriver driver;
	
	
	public static void waitforElement(WebElement we, WebDriver driver2)
	{
		WebDriverWait wait = new WebDriverWait(driver2,5);
		wait.until(ExpectedConditions.visibilityOf(we));
		
	}
}
