package learningtestNG;

import org.testng.annotations.*;


public class TestNG_Annotations {
	
	//@AnnotationName Ctrl+shift+o
	//below the annotation you have to create a method
	
	@BeforeSuite
	public void beforeSuiteAnnotation() {
		System.out.println("This is Before Suite");
	}
	@BeforeTest
	public void beforeTestAnnotation() {
	System.out.println("This is Before Test");
	}
	
	@BeforeClass
	public void beforeClassAnnotation() {
		System.out.println("This is Before Class");
	}
	
	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("This is Before Method");
	}
	
	@Test
	public void testCaseAnnotation() {
		System.out.println("This is TestCase1");
	}
	
	@Test
	public void testCase2Annotation() {
		System.out.println("This is TestCase2");
	}
	
	@AfterMethod
	public void afterMethodAnnotation() {
		System.out.println("This is After Method");
	
	}
	
	@AfterClass
	public void afterClassAnnotation() {
	System.out.println("This is After Class");
	}

	@AfterTest
	public void afterTestAnnotation() {
	System.out.println("This is After Test");
	}

	@AfterSuite
	public void afterSuiteAnnotation() {
	System.out.println("This is After Suite");
	
	}	
}
