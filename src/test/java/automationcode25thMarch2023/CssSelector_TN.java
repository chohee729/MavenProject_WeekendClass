package automationcode25thMarch2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssSelector_TN {
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenUrl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://http://tutorialsninja.com/demo/");
	}
	
	@Test
	public void MyAccountLogin() {
		driver.findElement(By.cssSelector("i.fa.fa-user+span")).click();
		
		
	}
}

