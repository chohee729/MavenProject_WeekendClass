package automationcode1stApril2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Keyboard {

	public WebDriver driver;
	
	@Test
	public void keyBoardActionItem() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		Actions action = new Actions(driver);
		
		WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		loginButton.sendKeys(Keys.ENTER);
	}
}
