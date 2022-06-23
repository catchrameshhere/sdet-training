package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollExample extends Base{

	public void youtubeExample() {
		setupBrowser("chrome", "https://www.youtube.com");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 3000)");
	}

	public void githubExample() {
		setupBrowser("chrome", "https://www.github.com");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void amazonExample() {
		String url = "https://www.amazon.in/Redmi-9A-Sport-Octa-core-Processor/dp/B09GFLXVH9/ref=sr_1_3?crid=1U22MIPTDLI58&keywords=mobile&qid=1655960192&sprefix=mobil%2Caps%2C217&sr=8-3&th=1";
	
		setupBrowser("chrome", url);

		WebElement techDetails = driver.findElement(By.xpath("//h1[text()='Technical Details']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", techDetails );
	
	}

	public static void main(String[] args) {
		ScrollExample obj = new ScrollExample();
//		obj.youtubeExample();
//		obj.githubExample();
		obj.amazonExample();

	}

}
