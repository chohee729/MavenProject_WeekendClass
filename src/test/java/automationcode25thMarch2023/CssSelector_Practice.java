package automationcode25thMarch2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssSelector_Practice {
	public WebDriver driver;
	public Select select;
	
	@BeforeMethod
	public void OpenUrl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
	}
	
	@Test
	public void clickOnSigninLink() {
		driver.findElement(By.cssSelector("a.signin")).click();	
	}
	@Test
	public void loginmethod() {
	driver.findElement(By.cssSelector("a.signin")).click();
	driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	}
	
	@Test
	public void logoutMethod () {
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		driver.findElement(By.cssSelector("a.rd_logout")).click();
	}
}

