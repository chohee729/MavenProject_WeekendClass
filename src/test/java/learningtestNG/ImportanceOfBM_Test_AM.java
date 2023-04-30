package learningtestNG;

import org.testng.annotations.*;

//tri combo - BM>TEST>AM
public class ImportanceOfBM_Test_AM {
	
	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("This is bm");
	}
	
	@Test
	public void testcase1() {
		System.out.println("This is Test Case1");
	
	}
	
	@AfterTest
	public void afterTestAnnotation() {
		System.out.println("This is After Test");
		}
}
