package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Dashboardpage;
import page.Loginpage;
import util.BrowserFactory;

public class LoginTest {
	@Test
	public void login()
	{
		String un = "techfiosdemo@gmail.com";
		String pwd = "abc123";
		WebDriver driver =BrowserFactory.startBrowser("http://techfios.com/test/billing/?ng=admin/");
		
		//page give me something
		Loginpage obj =PageFactory.initElements(driver,Loginpage.class);
		obj.lo(un,pwd);
		Dashboardpage ob12= PageFactory.initElements(driver,Dashboardpage.class);
		ob12.waitforPage();
		driver.close();
		
		driver.quit();
		
	}

}
