package automationcode1stApril2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Mouse_hovering_rightclick_leftclick {

	public static WebDriver driver;
	
	@Test
	public void mouseActionsTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://jqueryui.com/draggable");
		driver.get("https://browserstack.com");
		Actions action=new Actions(driver);
		
		WebElement getADemoButton = driver.findElement(By.xpath("//div[@class='relative']/preceding::button[1]"));
		action.moveToElement(getADemoButton).perform();
		
		WebElement getStartedFreeButton = driver.findElement(By.id("signupModalButton"));
		action.moveToElement(getStartedFreeButton).click().perform();
		
		driver.navigate().back();
		
		
		WebElement getStartedFreeButton1 = driver.findElement(By.id("signupModalButton"));
		action.moveToElement(getStartedFreeButton1).contextClick().perform();
		}

}
