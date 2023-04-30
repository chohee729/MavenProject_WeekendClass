package automationcode2ndApril2023;

import org.testng.annotations.DataProvider;

public class SeparateDataProvider {
	@DataProvider (name="getDataRediff")
	public static Object[][] getDataRediff(){

		Object[][] data = {{"seleniumpanda@rediffmail.com", "Selenium@123"},
		{ "seleniumpanda1@rediffmail.com", "Selenium@123"},
		{ "seleniumpanda2@rediffmail.com", "Selenium@123"},
		{ "seleniumpanda845@rediffmail.com", "Selenium@123" }};

		return data;
}
	@DataProvider(name="getDataTN")

	public static Object[][] getDataTN(){

	Object[][] data = {{"seleniumpanda@gmail.com", "Selenium@123"},
	{ "seleniumpanda1@gmail.com", "Selenium@123"},
	{ "seleniumpanda2@gmail.com", "Selenium@123"},
	{ "seleniumpanda845@gmail.com", "Selenium@123" }};

	return data;	
}}
