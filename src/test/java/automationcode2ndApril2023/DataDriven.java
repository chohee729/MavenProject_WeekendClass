package automationcode2ndApril2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Annotation is known as @DataProvider
//1.return a 2-D Object array
//2.pass all the elements of that 2-D arrays [initialization process of array]
//3.you have to create the @Test and pass the dataProvider
//4.You have to pass the arguments in the Method under!Test==cols of the 2-D array
public class DataDriven {

	public WebDriver driver;

	@Test(priority=1, dataProvider = "getDataTN",dataProviderClass = SeparateDataProvider.class)
	public void loginNinjaTest(String username, String password) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://tutorialsninja.com/demo");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys(username);
	driver.findElement(By.id("input-password")).sendKeys(password);
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@Test(priority=2, dataProvider = "getDataRediff",dataProviderClass = SeparateDataProvider.class)
	public void loginRediff(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.signinbtn")).click();
	}
	
	}

