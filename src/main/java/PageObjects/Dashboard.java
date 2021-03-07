package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	
	WebDriver driver;
	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}

	private By dropdown = By.xpath("//li[@class='dropdown']/a/span");
	private By logout   = By.xpath("//ul[@class='dropdown-menu']/li/a");
	
	public WebElement getdropdown()
	{
		return driver.findElement(dropdown);
	}
	
	public WebElement getlogout()
	{
		return driver.findElement(logout);
	}
}
