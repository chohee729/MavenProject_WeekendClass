package learningtestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumCode {
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void setUp() {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get("http:tutorialsninja.com/demo");
	}

	@Test(priority = 1)
	public void loginWithValidCredentials() throws Exception {
	driver.findElement(By.linkText("My Account")).click();
	
	driver.findElement(By.linkText("Login")).click();
	
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	
	driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
	
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}


	@Test(priority = 2, dependsOnMethods = "loginWithValidCredentials")
	public void loginWithInvalidCredentials() throws Exception {
	driver.findElement(By.linkText("My Account")).click();
	
	driver.findElement(By.linkText("Login")).click();
	
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda43243242342@gmail.com");
	
	driver.findElement(By.id("input-password")).sendKeys("Selenium@123434324324");
	
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@Test(priority = 3, dependsOnMethods = {"loginWithValidCredentials", "loginWithInvalidCredentials"})
	public void loginWihtoutAnyCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}

