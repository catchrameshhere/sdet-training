package basic;

import org.testng.annotations.Test;

public class PriorityExample {

	@Test(priority = 2)
	public void tc1() {
		System.out.println("from tc-1");
	}

	@Test(priority = 1)
	public void tc2() {
		System.out.println("from tc-2");
	}

	@Test(priority = 2)
	public void tc3() {
		System.out.println("from tc-3");
	}

	@Test(priority = 3)
	public void tc4() {
		System.out.println("from tc-4");
	}

	@Test(priority = 1)
	public void tc5() {
		System.out.println("from tc-5");
	}

	@Test(priority = 1)
	public void tc6() {
		System.out.println("from tc-6");
	}
}
