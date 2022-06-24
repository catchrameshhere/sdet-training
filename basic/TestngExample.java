package basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngExample {

	@Test
	public void tc1() {
		System.out.println("from tc-1");
	}

	@BeforeMethod
	public void beforeTest() {
		System.out.println("**********before test method**********");
	}

	@AfterMethod
	public void afterTest() {
		System.out.println("**********from after test method**********");
	}

	@Test(description = "Test case to validate password update feature")
	public void tc2() {
		System.out.println("from tc-2");
	}

}
