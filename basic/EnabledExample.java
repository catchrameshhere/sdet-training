package basic;

import org.testng.annotations.Test;

public class EnabledExample {
	
	@Test
	public void tc1() {
		System.out.println("from tc-1");
	}

	@Test(enabled=false)
	public void tc2() {
		System.out.println("from tc-2");
	}
	
	@Test
	public void tc3() {
		System.out.println("from tc-3");
	}
	
}
