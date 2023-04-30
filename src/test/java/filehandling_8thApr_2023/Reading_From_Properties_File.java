package filehandling_8thApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Reading_From_Properties_File {
	//Step 1 - Create the Object of Properties class
	//Step 2 - Create the Object of FileInputStream class
	
	public WebDriver driver;
	
	@Test(priority=1)
	public void TNLogin() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}
	@Test
	public void rediffLogin() {
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
}}