package automationcode18thMarch2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoreConcepts_Automation {

	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void openBrowser() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://rediff.com");
		
			
		}
	@Test
	public void clicksignin(){
		driver.findElement(By.className("signin")).click();
		
	}
	
	@Test
	public void loginCredentials() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediff.com");
		driver.findElement(By.id("password")).sendKeys("Selenium123");
		driver.findElement(By.className("signinbtn")).click();

	}
	
	@Test
	public void ClickOnLogoutlink() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediff.com");
		driver.findElement(By.id("password")).sendKeys("Selenium123");
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
