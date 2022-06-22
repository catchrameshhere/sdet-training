package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void fetchDemo() {
		WebElement email = driver.findElement(By.id("email"));
		WebElement instaLink = driver.findElement(By.partialLinkText("Instagram"));
		WebElement logInBtn = driver.findElement(By.tagName("button"));
		WebElement welMsg = driver.findElement(By.xpath("//h2"));
		
		//getAttribute
//		String attrValue = email.getAttribute("placeholder");
//		System.out.println(attrValue);
		
		//tool example
//		String toolTip = instaLink.getAttribute("Title");
//		System.out.println(toolTip);
		
		//getTagname
//		String tagName = email.getTagName();
//		System.out.println("Tagname of email textbox = " + tagName);
		
		//get Text
//		String txt = logInBtn.getText();
//		System.out.println("text = " + txt);
//		String welcomeMessage = welMsg.getText();
//		System.out.println(welcomeMessage);
		
		
		//getLocation
//		driver.manage().window().maximize();
//		System.out.println("Point value = " + logInBtn.getLocation());
//		System.out.println("Point (x)value = " + logInBtn.getLocation().x);
//		System.out.println("Point (y)value = " + logInBtn.getLocation().y);
		
		//get size
//		System.out.println("Dimension - " + logInBtn.getSize());
//		System.out.println("Dimension height- " + logInBtn.getSize().height);
//		System.out.println("Dimension width- " + logInBtn.getSize().width);
		
		
		//get css value
//		System.out.println("font size of login btn = " + logInBtn.getCssValue("font-size"));
	}
	
	
	public void actionDemo() {
		WebElement email = driver.findElement(By.id("email"));
		WebElement instaLink = driver.findElement(By.partialLinkText("Instagram"));
		WebElement logInBtn = driver.findElement(By.tagName("button"));
		WebElement loginForm = driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));	
		
		//type
//		email.sendKeys("dan@gmail.com");
		
		//clear
//		email.clear();
//		email.sendKeys("john@gmail.com");
		
		//click
//		logInBtn.click();
//		instaLink.click();
		
		//Submit
//		loginForm.submit();
		logInBtn.submit();
	}
	
	
	public void stateDemo() {
		WebElement email = driver.findElement(By.id("email"));
		WebElement hiddenElem = driver.findElement(By.name("jazoest")); 
		
		//visible
//		System.out.println("is email element displayed = " + email.isDisplayed());
//		System.out.println("is the hidden element displayed = " + hiddenElem.isDisplayed());
		
		//editable or enabled
//		System.out.println("is email element editable - " + email.isEnabled());
		
		//is selected
		driver.findElement(By.partialLinkText("Sign Up")).click();
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[contains(@id,'u_0_5')]"));
		
		System.out.println("Before clicking - is the radio button selected " + maleRadioBtn.isSelected());
		maleRadioBtn.click();
		System.out.println("After clicking - is the radio button selected " + maleRadioBtn.isSelected());
		
		
	}
	

	public static void main(String[] args) {
		WebElementCommands obj = new WebElementCommands();
		obj.setupBrowser("chrome", "https://www.facebook.com");
//		obj.fetchDemo();
//		obj.actionDemo();
		obj.stateDemo();
	}

}












