package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage_PF {

	WebDriver driver;
	//driver.findElement(By.xpath(" "))
	
	public RediffLoginPage_PF(WebDriver driver) 
	{
	this.driver = driver;
	}
	
	
	By username = By.id("login1");	
	By password = By.id("password");
	By signIn  = By.cssSelector("input[name='proceed']");
	By home = By.cssSelector("a[href='https://www.rediff.com']");
	
	

	public WebElement Username()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement SignIn()
	{
		return driver.findElement(signIn);
	}
	
	public WebElement Home()
	{
		return driver.findElement(home);
	}
	
	
	
	
	
	
	
}
