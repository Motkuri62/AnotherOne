package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By username = By.id("ContentPlaceHolder1_txtUsername");
	private By password = By.id("ContentPlaceHolder1_txtPassword");
	private By login    = By.cssSelector("input[type='submit']");
	
	public WebElement getusername()
	{
		return driver.findElement(username);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getlogin()
	{
		return driver.findElement(login);
	}
}
