package basic;

import org.openqa.selenium.By;

public class LocatorStrategyExample extends Base{
	
	public void locatorDemo() {
		//id
//		driver.findElement(By.id("email")).sendKeys("dan@gmail.com");
		
		//name
//		driver.findElement(By.name("email")).sendKeys("123456");
		
		//class name
//		driver.findElement(By.className("inputtext")).sendKeys("from class name-1");
//		driver.findElement(By.className("_55r1")).sendKeys("from class name-2");
//		driver.findElement(By.className("_6luy")).sendKeys("from class name-3");


		//tagname
//		driver.findElement(By.tagName("button")).click();
		
		//linktext
//		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//partial link text
//		driver.findElement(By.partialLinkText("Forgotten password?")).click();
//		driver.findElement(By.partialLinkText("F")).click();
//		driver.findElement(By.partialLinkText("For")).click();
//		driver.findElement(By.partialLinkText("gott")).click();
//		driver.findElement(By.partialLinkText("en p")).click();
//		driver.findElement(By.partialLinkText("password?")).click();
//		driver.findElement(By.partialLinkText("pass")).click();
//		driver.findElement(By.partialLinkText("wor")).click();
//		driver.findElement(By.partialLinkText("rd?")).click();
//		driver.findElement(By.partialLinkText("?")).click();
		
		//xpath
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("from xpath");
		
		//absolute path
//		String path = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input";
//		driver.findElement(By.xpath(path)).sendKeys("from abs path");		
		
		//relative path
//		driver.findElement(By.xpath("//form/div[1]/div[1]/input")).sendKeys("from relative path");

//		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("some example");
		
		//functions
		//starts-with
//		$x("//input[starts-with(@id, 'email')]")
//		$x("//input[starts-with(@id, 'emai')]")
//		$x("//input[starts-with(@id, 'ema')]")
//		$x("//input[starts-with(@id, 'em')]")
//		$x("//input[starts-with(@id, 'e')]")
		
//		driver.findElement(By.xpath("//input[starts-with(@id, 'em')]")).sendKeys("from starts with example");
		
		//contains
		$x("//input[contains(@id, 'email')]")
		$x("//input[contains(@id, 'emai')]")
		$x("//input[contains(@id, 'ema')]")
		$x("//input[contains(@id, 'em')]")
		$x("//input[contains(@id, 'e')]")
		
		$x("//input[contains(@id, 'mail')]")
		$x("//input[contains(@id, 'ail')]")
		$x("//input[contains(@id, 'il')]")
		$x("//input[contains(@id, 'l')]")
		
		$x("//input[contains(@id, 'mai')]")
		$x("//input[contains(@id, 'ema')]")
		$x("//input[contains(@id, 'ail')]")
		$x("//input[contains(@id, 'ai')]")
		$x("//input[contains(@id, 'email')]")
		
		//text
		$x("//h2[text()='Facebook helps you connect and share with the people in your life.']")
		$x("//a[text()='Forgotten password?']")
		$x("//button[text()='Log In']")
		
		//text+contains
		$x("//button[contains(text(),'Log In')]")
		$x("//button[contains(text(),' In')]")
		$x("//button[contains(text(),'Log')]")
		$x("//button[contains(text(),'g I')]")
		
		//text+starts-with
		$x("//button[starts-with(text(),'Log In')]")
		$x("//button[starts-with(text(),'Log I')]")
		$x("//button[starts-with(text(),'L')]")
		
		//Advanced
		//and
		$x("//input[contains(@class,'_55r1') and @id='pass']")
		
		//or
		$x("//button[text()='Log In' or text()='लॉग इन करें']")
		
		//index
		$x("//select[3]")//sibling
		$x("//input")[2]
				
		//chained
		$x("//form/div/div/input")
		$x("//form//input[@id='email']")
		$x("//form//input[@id='pass']")
		
		
		//Axes
		//child
		$x("//span[@data-name='birthday_wrapper']/child::span")
		
		//parent
		$x("//select[@id='month']/parent::span")
		
		
		//following-sibling
		$x("//select[@id='day']/following-sibling::select[@id='year']")
		$x("//select[@id='day']/following-sibling::select[2]")
		
		
		//following-sibling
		$x("//select[@id='day']/following::select[@id='year']")
		$x("//select[@id='day']/following::select[2]")
		$x("//input[@name='firstname']/following::select[@id='year']")
		
		//preceding
		$x("//select[@id='month']/preceding::input[@name='firstname']")
		$x("//select[@id='year']/preceding::select[@id='day']")
		$x("//select[@id='year']/preceding::select[2]")
		
		//preceding-sibling
		$x("//select[@id='year']/preceding-sibling::select[@id='day']")
		$x("//select[@id='year']/preceding-sibling::select[2]")
		
		//ancestor
		$x("//select[@id='year']/ancestor::div[@id='reg_box']")
		$x("//select[@id='year']/ancestor::form")
		$x("//select[@id='year']/ancestor::div[@id='reg_box']//select[2]")
		
		//descendant
		$x("//body/descendant::select[@id='month']")
		$x("//body//form/descendant::select[@id='month']")
		$x("//form/descendant::select[@id='month']")
		$x("//form/div/descendant::select[@id='month']")
		$x("//form//div/descendant::select[@id='month']")
		
		
		//css
//		driver.findElement(By.cssSelector("#email")).sendKeys("from css");
		
		//css ==> id attr
		$$("#email")
		
		//css ==> class attr
		$$(".inputtext")
		$$("._55r1")
		$$("._6luy")
		$$(".inputtext._55r1")
		$$("._55r1._6luy")
		$$(".inputtext._6luy")
		
		//css ==> id and class attr
		$$("#email.inputtext")
		$$("#email._55r1")
		$$("#email._6luy")
		$$("#email.inputtext._55r1")
		$$("#email._55r1._6luy")
		$$("#email.inputtext._6luy")
		$$("#email.inputtext._55r1._6luy")
		$$(".inputtext#email._55r1._6luy")
		$$(".inputtext._55r1#email._6luy")
		$$(".inputtext._55r1._6luy#email")
		$$(".inputtext#email")
		$$("._55r1#email")
		
		//css ==> html tagname
		$$("button")
		
		//css ==> html attribute
		$$("[id='email']")
		
		//css ==> html + html attribute
		$$("input[id='email']")
		
		//css ==> (css id + css class) + html (tagname + attribute)
		$$("input#email")
		$$("input#email.inputtext._55r1._6luy")
		$$("input[id='email']#email")
		$$("input[id='email']#email.inputtext")
		$$("input[id='email']#email.inputtext._55r1")
		$$("input[id='email']#email.inputtext._55r1._6luy")
		$$("input[id='email']#email.inputtext._55r1")
		$$("input[id='email']#email._55r1._6luy")
		$$("input[id='email']#email.inputtext._6luy")
		$$("input[id='email'].inputtext._55r1._6luy#email")
		$$("input[id='email'].inputtext._55r1#email._6luy")
		$$("input[id='email'].inputtext#email._55r1._6luy")
	
		//substring
		//starts with or prefix ==> ^
		$$("input[id^='email']")
		$$("input[id^='emai']")
		$$("input[id^='ema']")
		$$("input[id^='em']")
		$$("input[id^='e']")
		
		//ends with or postfix ==> $
		$$("input[id$='email']")
		$$("input[id$='mail']")
		$$("input[id$='ail']")
		$$("input[id$='il']")
		$$("input[id$='l']")
		
		//contains or substring==> *
		$$("input[id*='email']")
		$$("input[id*='emai']")
		$$("input[id*='ema']")
		$$("input[id*='em']")
		$$("input[id*='e']")
		
		$$("input[id*='mail']")
		$$("input[id*='mail']")
		$$("input[id*='ail']")
		$$("input[id*='il']")
		$$("input[id*='l']")
		
		$$("input[id*='email']")
		$$("input[id*='m']")
		$$("input[id*='ma']")
		$$("input[id*='ai']")
		$$("input[id*='mai']")
		
	}

	public static void main(String[] args) {
		LocatorStrategyExample obj = new LocatorStrategyExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.locatorDemo();
	}

}
