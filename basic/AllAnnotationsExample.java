package basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotationsExample {

	@Test
	public void tc2() {
		System.out.println("from tc-2");
	}

	@Test
	public void tc1() {
		System.out.println("from tc-1");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("from before method");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("from after method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("from before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("from after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("from before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("from after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("from before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("from after suite");
	}

}
