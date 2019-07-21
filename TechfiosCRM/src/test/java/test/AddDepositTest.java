package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddDepositpage;
import page.Dashboardpage;
import page.Loginpage;
import util.BrowserFactory;

public class AddDepositTest {
	@Test
	public void validateDeposits() {
		// Starts the browser and saves the driver in the test class
		WebDriver driver = BrowserFactory.startBrowser("http://techfios.com/test/billing/?ng=admin/");
		// Take you to the site
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		// Calling LoginPage Class or Activate
		Loginpage loginPage = PageFactory.initElements(driver, Loginpage.class);
		// calling the method inside LoginPage
		loginPage.lo("techfiosdemo@gmail.com", "abc123");
		// Activate the DashboardPage
		Dashboardpage dashboardPage = PageFactory.initElements(driver, Dashboardpage.class);
		// call methods inside Dashboard Page
		dashboardPage.waitforPage();

		dashboardPage.clickOnAddDepositButton();

		AddDepositpage addDepositPage = PageFactory.initElements(driver, AddDepositpage.class);
		addDepositPage.waitforPage();
		addDepositPage.selectFromDropDownForAccount("AutoAccount");
		
		String description = "Lunch Money";
		addDepositPage.fillInTheAddDepositForm(description, "50");
		
		driver.close();
		driver.quit();
	}
}
