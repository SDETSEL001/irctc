package testScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) throws Exception {

		//Launch the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		// open the NC application with login page.
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		// maximize the browser
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		// close the browser
		driver.quit();
		
		
	}

}
