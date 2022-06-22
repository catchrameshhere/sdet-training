package basic;

public class BrowserCommands extends Base{
	
	public void demo() {
		
		//Thread.sleep is used only for demo purposed
		
		//open url
//		driver.get("https://www.youtube.com");
		
		//page title
//		String title = driver.getTitle();
//		System.out.println(title);
		
		//get url
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
		
		//for demo purpose
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//close the tab
//		driver.close();
		
		//close the browser
		driver.quit();
		
	}
	

	public static void main(String[] args) {
		BrowserCommands obj = new BrowserCommands();
		obj.setupBrowser("chrome", "https://www.youtube.com");
		obj.demo();
	}

}
