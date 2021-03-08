package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Dashboard;
import PageObjects.LoginPage;

public class portal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qatestserver.medpharmservices.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//creating object for Loginpage class
		LoginPage lp = new LoginPage(driver);
		lp.getusername().sendKeys("zarfac1");
		lp.getpassword().sendKeys("Test@123");
		lp.getlogin().click();
		//giving explicit wait for dropdown locator
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='dropdown']/a/span")));
		//creating object for Dashboard class
		
		Dashboard d = new Dashboard(driver);
		d.getdropdown().click();
		Thread.sleep(3000);
		d.getlogout().click();
		System.out.println("This is testing ");
	
	}

	
}
