package page;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class switchsdf {
	public static void main(String[]args)
	{
	
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		//WebDriverWait wait = new WebDriverWait(driver,10);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		driver.findElement(By.name("New Message Window")).click();
		Set  hane = driver.getWindowHandles();
		for(String hane1:driver.getWindowHandles())
		{
			driver.switchTo().window(hane1);
		}
		
		}
	}
		
	}


