package filehandling_8thApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TN_Register_Validate {

	public WebDriver driver;
	
	@Test(priority=1, dataProvider="TN", dataProviderClass=ExcelData.class)
	public void registertn(String firstname, String lastname, String email, String telephone, String password, String confirmpassword){
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("firstname");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("lastname");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("email");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("telephone");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("confirmpassword");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}


