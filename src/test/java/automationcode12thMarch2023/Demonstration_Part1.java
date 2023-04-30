package automationcode12thMarch2023;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demonstration_Part1 {

		public static WebDriver driver;
		public static ChromeOptions options;
		
	public static void main(String[] args) {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("incognito");
		options.addArguments("--remote-allow-origins = http://rediff.com");
		driver = new ChromeDriver(options);
		driver.get("http://rediff.com");

	}

}
