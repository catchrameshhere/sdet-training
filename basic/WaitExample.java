package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample extends Base{
	
	public void demo() {
		System.out.println(driver.getCurrentUrl());
	}

	
	public void scriptLoadErrorDemo() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");//500 ms
		System.out.println("done");
	}

	
	public void explicitWaitExample() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		

//		WebElement email =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
//		email.sendKeys("dan@gmail.com");
		
		WebElement hiddenElem = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("jazoest"))));
		hiddenElem.sendKeys("test@123");
		
	}
	
	public void fluentWaitExample() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2));
//				.ignoring(NoSuchElementException.class);	


//		WebElement email =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
//		email.sendKeys("dan@gmail.com");
//		
		WebElement hiddenElem = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("jazoest"))));
		hiddenElem.sendKeys("test@123");
		
	}
	
	public static void main(String[] args) {
		
		WaitExample obj = new WaitExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
//		obj.demo();
//		obj.scriptLoadErrorDemo();
//		obj.explicitWaitExample();
		obj.fluentWaitExample();
		
		

	}

}
