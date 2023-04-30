package learningautomation031123;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	static WebDriver driver; // it is an instance variable declared under Class
	
	
	public static void main(String[] args) {
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://amazon.com");
		driver.quit();
		
		 

		 
	}

}
