package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;

public class LoginPageApplication {

	
	@Test
	
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Documents\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		RediffLoginPage rl = new RediffLoginPage(driver);
		
		rl.Username().sendKeys("Jyoti");
		rl.Password().sendKeys("Password");
		rl.SignIn().click();
		rl.Home().click();
		
		RediffHomePage rh = new RediffHomePage(driver);
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
		
		
		

	}
	
	
	
	
	
}
