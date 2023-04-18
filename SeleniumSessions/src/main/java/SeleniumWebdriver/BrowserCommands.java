package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ebin\\eclipse-workspace\\SeleniumSessions\\src\\main\\resources\\driverFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		
		
//		String title= driver.getTitle();
//		System.out.println(title);
//		
//		String current_url=driver.getCurrentUrl();
//		System.out.println(current_url);
//		
		//String source_code=driver.getPageSource();
		//System.out.println(source_code);
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();
		//driver.close();
		driver.quit();
		

	}

}
