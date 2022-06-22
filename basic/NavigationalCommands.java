package basic;

public class NavigationalCommands extends Base{
	
	
	public void navDemo() throws InterruptedException {
		
		//Thread.sleep is used only for demo purposed
		
		//to
		System.out.println("Navigating to youtube page");
		Thread.sleep(5000);
		driver.navigate().to("https://www.youtube.com");
		
		//back
		System.out.println("Navigating back to google page");
		Thread.sleep(5000);
		driver.navigate().back();
		
		//forward
		System.out.println("Navigating forward youtube page");
		Thread.sleep(5000);
		driver.navigate().forward();
		
		//refresh
		System.out.println("Refreshing youtube page");
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	

	public static void main(String[] args) {
		NavigationalCommands obj = new NavigationalCommands();
		obj.setupBrowser("chrome", "https://www.google.com");
		try {
			obj.navDemo();
		}
		catch (Exception e) {
			System.out.println("something went wrong");
		}

	}

}
