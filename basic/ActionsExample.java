package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample extends Base{
	
	//mouse over
	public void amazonExample() {
		setupBrowser("chrome", "https://www.amazon.in/");
		
		WebElement navIcon = driver.findElement(By.xpath("//span[text()='Account & Lists']/span"));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(navIcon).build().perform();
		
		WebElement createWishList = driver.findElement(By.partialLinkText("Create a Wish List"));
		createWishList.click();
		
	}
	
	//drag-drop
	public void dragDropExample() {
		setupBrowser("chrome", "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement norway = driver.findElement(By.id("box101"));
		
		System.out.println("before moving color = " + oslo.getCssValue("background-color"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(oslo, norway).build().perform();
		
		System.out.println("after moving color = " + oslo.getCssValue("background-color"));
		
	}
	

	public static void main(String[] args) {
		ActionsExample obj = new ActionsExample();
//		obj.amazonExample();
		obj.dragDropExample();

	}

}
