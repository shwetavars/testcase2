package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddDepositpage extends BasePage {
	WebDriver driver;

	public AddDepositpage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library 7 total
	@FindBy(how = How.XPATH, using = "//select[@id='account']")
	WebElement AcccountDropDown;
	@FindBy(how = How.ID, using = "description")
	WebElement DescriptionField;
	@FindBy(how = How.ID, using = "amount")
	WebElement AmountField;
	@FindBy(how = How.ID, using = "submit")
	WebElement SubmitButton;
	@FindBy(how = How.XPATH, using = "//button[@data-dismiss='alert']")
	WebElement DepositSuccessMsg;
	@FindBy(how = How.XPATH, using = "//h5[text() ='Add Deposit']")
	WebElement AddDepositPanelHeading;

	// wait page
	public void waitforPage() {
		waitforElement(AddDepositPanelHeading, driver);

	}

	// Methods to interact with the elements
	public void fillInTheAddDepositForm(String description, String amount) {
		AcccountDropDown.click();
		DescriptionField.sendKeys(description);
		AmountField.sendKeys(amount);
		SubmitButton.click();
	}

	public void waitForSuccessMsg() {
		waitforElement(DepositSuccessMsg, driver);
	}

	public void selectFromDropDownForAccount(String string) {
		Select select = new Select(AcccountDropDown);
		select.selectByVisibleText(string);

	}

}
