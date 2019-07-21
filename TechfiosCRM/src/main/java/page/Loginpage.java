package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	WebDriver driver;//global var
	
	//Every page must have a constructor to invite the driver
	//1.Element Library
	//2.Methods to interact with the Elements
	
	
	public void Loginpage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	//Element Library
	@FindBy(how =How.ID, using = "username")
	WebElement UN;
	@FindBy(how =How.ID, using ="password")
	WebElement PWD;
	@FindBy(how=How.NAME, using = "login")
	WebElement LOGIN;
	
	
	//Methods to interact with the Element
	public void lo(String username, String password)
	{
		UN.sendKeys(username);
		PWD.sendKeys(password);
		LOGIN.click();
	
	}
	

}
