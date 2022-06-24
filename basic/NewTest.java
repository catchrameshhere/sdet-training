package basic;

import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void createUser() {
		System.out.println("from create user");
	}

	@Test(dependsOnMethods = {"createUser"})
	public void updateUser() {
		System.out.println("from update user");
	}

	@Test(dependsOnMethods = {"updateUser"})
	public void deleteUser() {
		System.out.println("from delete user");
	}
}
