package basic;

import org.testng.annotations.Test;

public class TestAnnotationExample {

	@Test(description = "Test case to validate password update feature")
	public void updatePassword() {
		System.out.println("tc updated successfully");
	}

}
