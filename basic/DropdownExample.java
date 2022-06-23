package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample extends Base {
	
	public void dropdownDemo() {
		
		Select month = new Select(driver.findElement(By.id("month")));
		
//		month.selectByIndex(2);
//		month.selectByValue("8");
//		month.selectByVisibleText("Oct");
		
		//first selected option
//		System.out.println(month.getFirstSelectedOption().getText());
		
		//all selected options
//		List<WebElement> allSelectedOptions = month.getAllSelectedOptions();
//		for (WebElement elem : allSelectedOptions) {
//			System.out.println(elem.getText());
//		}
		
		//get all the drop down options
//		List<WebElement> allOptions = month.getOptions();
//		for (WebElement elem : allOptions) {
//			System.out.println(elem.getText());
//		}
		
		//multi select check
//		System.out.println(month.isMultiple());
		
		
	}

	public static void main(String[] args) {
		DropdownExample obj = new DropdownExample();
		obj.setupBrowser("chrome", "https://www.facebook.com/reg/");
		obj.dropdownDemo();
	}

}
