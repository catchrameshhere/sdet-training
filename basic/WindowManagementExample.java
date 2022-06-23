package basic;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class WindowManagementExample extends Base{
	
	
	public void demo() {
		/*
			driver.getWindowHandle();//getting the current window id
			driver.getWindowHandles();//getting all the id's
			driver.switchTo().window("<window-id>");//switch to the desired window id
			
			driver.close();//close the tab
			driver.quit();//quit the browser instance
		*/
		
		System.out.println("\n***********Before opening the insta page*************");
		System.out.println("total windows = " + driver.getWindowHandles());
		System.out.println("current focus is on - " + driver.getWindowHandle());
		
		
		System.out.println("clicking on insta page");
		driver.findElement(By.partialLinkText("Instagram")).click();
		System.out.println("\n***********After opening the insta page*************");
		System.out.println("total windows = " + driver.getWindowHandles());
		System.out.println("current focus is on - " + driver.getWindowHandle());
		System.out.println("page title = " + driver.getTitle());
		
		System.out.println("\n*************Switching to insta page************");
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println("page title = " + driver.getTitle());
		
		System.out.println("\n*****************closing insta page***********");
		driver.close();

		System.out.println("\n*************Switching to fb page************");
		driver.switchTo().window(tabs.get(0));
		System.out.println("page title = " + driver.getTitle());
		
		System.out.println("\n*************Closing the browser************");
		driver.quit();
	}

	public static void main(String[] args) {
		WindowManagementExample obj = new WindowManagementExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.demo();

	}

}
