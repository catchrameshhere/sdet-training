package basic;

import org.testng.annotations.Test;

@Test(groups = {"regression", "module1"})//partial groups
public class GroupExample2 {
	
	@Test(groups = {"smoke"})
	public void tc1() {
		System.out.println("from tc-1");
	}

	@Test
	public void tc2() {
		System.out.println("from tc-2");
	}
	
	@Test
	public void tc3() {
		System.out.println("from tc-3");
	}
	
	@Test(groups = {"smoke"})
	public void tc4() {
		System.out.println("from tc-4");
	}

	@Test
	public void tc5() {
		System.out.println("from tc-5");
	}
}
