package testing_assertions_2ndApr_2023;
//2forms of Assertions in TestNG

import org.testng.Assert;
import org.testng.annotations.Test;

//1.Assert
//2.Soft Assert

public class HardAssert {

	@Test
	public void logicTest() {
		
		if(2!=3) {
			System.out.println(2+3);
			Assert.assertTrue(true);
			
			
			Assert.fail();
			
			if(true!=false) {
				System.out.println("My logic is true");
			}
		}
	}
}
