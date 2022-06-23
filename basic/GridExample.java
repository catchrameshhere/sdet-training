package basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample {
	WebDriver driver;
	String url = "https://www.facebook.com";
	String hubUrl = "http://172.24.112.1:4444";

	public void setupGrid() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("firefox");
		
		try {
			driver = new RemoteWebDriver(new URL(hubUrl), cap);
		} catch (MalformedURLException e) {
			System.out.println("Something went wrong while connecting to the hub url");
			e.printStackTrace();
		}
		
		//application url
		driver.get(url);
	}
	
	public void getTitleExample() {
		System.out.println(driver.getTitle());
	}
	
	public static void main(String[] args) {
		GridExample obj = new GridExample();
		obj.setupGrid();
		obj.getTitleExample();
	}

}
