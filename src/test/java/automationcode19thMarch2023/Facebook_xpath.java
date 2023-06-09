package automationcode19thMarch2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_xpath {
	public WebDriver driver;
	public ChromeOptions options;

@BeforeMethod
public void OpenBrowser() {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	options.addArguments("--start-maximized");
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get("http://facebook.com");
}

@Test
public void clickOnCreateNewAccount() {
	driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
	
	
}


@Test
public void createaccount() {
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
	driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Selenium");
	driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Panda");
	driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("seleniumpanda111@gmail.com");
	driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("seleniumpanda111@gmail.com");
	driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("seleniumpanda111@gmail.com");
	
}



@AfterMethod
public void tearDown() {
	driver.quit();
}
}
