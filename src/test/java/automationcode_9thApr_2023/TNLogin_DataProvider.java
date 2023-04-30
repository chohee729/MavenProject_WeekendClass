package automationcode_9thApr_2023;

import org.testng.annotations.DataProvider;

public class TNLogin_DataProvider {

	@DataProvider(name = "TN", parallel=true)

	public static Object[][] getNinjaData() {

		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" }};
				                     
       return data;
}}
