package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertsExample extends Base{
	
	public void alertExample() {
		WebElement infoAlert = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
		WebElement confirmAlert = driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
		WebElement promptAlert = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		
		

//		infoAlert.click();
//		confirmAlert.click();
		promptAlert.click();
		
		//get alert message
		String msg = driver.switchTo().alert().getText();
		System.out.println("alert msg = " + msg);
		
		//accept
//		driver.switchTo().alert().accept();
		
		//dismiss
//		driver.switchTo().alert().dismiss();
		
		//type
		driver.switchTo().alert().sendKeys("dan@gmail.com");
		
		
	}

	public static void main(String[] args) {
		AlertsExample obj = new AlertsExample();
		obj.setupBrowser("firefox", "https://the-internet.herokuapp.com/javascript_alerts");
		obj.alertExample();

	}

}
