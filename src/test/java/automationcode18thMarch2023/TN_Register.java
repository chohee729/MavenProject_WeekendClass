package automationcode18thMarch2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_Register {

	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void OpenBrowser() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
}
	
	@Test
	public void clickRegister(){
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Cho");
		driver.findElement(By.id("input-lastname")).sendKeys("Park");
		driver.findElement(By.id("input-email")).sendKeys("cho123@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("2012345678");
		driver.findElement(By.id("input-password")).sendKeys("Cho123456");
		driver.findElement(By.id("input-confirm")).sendKeys("Cho123456");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
