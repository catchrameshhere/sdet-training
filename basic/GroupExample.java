package basic;

import org.testng.annotations.Test;

public class GroupExample {
	@Test(groups = {"smoke", "regression"})
	public void tc1() {
		System.out.println("from tc-1");
	}

	@Test(groups = {"regression"})
	public void tc2() {
		System.out.println("from tc-2");
	}
	
	@Test(groups = {"regression"})
	public void tc3() {
		System.out.println("from tc-3");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void tc4() {
		System.out.println("from tc-4");
	}

	@Test(groups = {"regression"})
	public void tc5() {
		System.out.println("from tc-5");
	}
}
