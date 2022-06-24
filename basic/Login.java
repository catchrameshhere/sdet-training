package basic;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {

	@Parameters({"validUsername", "validPassword"})
	@Test
	public void validUsernameValidPassword(String username, String password) {
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	
	
	@Parameters({"invalidUsername", "validPassword"})
	@Test
	public void invalidUsernameValidPassword(String username, String password) {
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	
	@Parameters({"validUsername", "invalidPassword"})
	@Test
	public void validUsernameInvalidPassword(String username, String password) {
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	
	@Parameters({"invalidUsername", "invalidPassword"})
	@Test
	public void invalidUsernameInvalidPassword(String username, String password) {
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	
	@Parameters({"validUsername"})
	@Test
	public void validUsernameBlankPassword(String username) {
		String password = "";
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	
	@Parameters({"validPassword"})
	@Test
	public void blankUsernameValidPassword(String password) {
		String username = "";
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	

	@Test
	public void blankUsernameBlankPassword() {
		String username = "";
		String password = "";
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	
	
}
