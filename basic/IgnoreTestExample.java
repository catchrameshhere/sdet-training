package basic;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class IgnoreTestExample {

	
	@Test
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
	
}
