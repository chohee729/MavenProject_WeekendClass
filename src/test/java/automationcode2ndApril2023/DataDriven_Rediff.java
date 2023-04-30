package automationcode2ndApril2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven_Rediff {

	public WebDriver driver;

	@Test(dataProvider = "getData", dataProviderClass = SeparateDataProvider.class)
	public void loginNinjaTest(String username, String password) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://rediff.com");
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("login1")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	}
	
	@DataProvider

	public Object[][] getData(){

	Object[][] data = {{"seleniumpanda@rediffmail.com", "Selenium@123"},
	{ "seleniumpanda1@rediffmail.com", "Selenium@123"},
	{ "seleniumpanda2@rediffmail.com", "Selenium@123"},
	{ "seleniumpanda845@rediffmail.com", "Selenium@123" }};

	return data;
}}

