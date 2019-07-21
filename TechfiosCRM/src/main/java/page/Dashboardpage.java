package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboardpage extends BasePage{
	
	WebDriver driver;
	//Every page must have a constructor to invite the driver
		//1.Element Library
		//2.Methods to interact with the Elements
	
	public Dashboardpage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH,using = "//h2[contains(text(), 'Dashboard ')]")
	WebElement PageTitle;
	@FindBy(how = How.LINK_TEXT, using = "Add Deposit") 
	WebElement AddDepositButton;
	
	//methods
	public void waitforPage()
	{
		waitforElement(PageTitle,driver);
	}
	public void clickOnAddDepositButton() 
	{
		AddDepositButton.click();
		}
		
	
}
	

