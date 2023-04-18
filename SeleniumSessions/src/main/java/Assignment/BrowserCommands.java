package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
      WebDriverManager.chromedriver().setup();
		
	 WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/index.php");
		//driver.manage().window().minimize();
		String title= driver.getTitle();
        System.out.println(title);
	
        String current_url=driver.getCurrentUrl();
        System.out.println(current_url);
        driver.close();
		driver.quit();
		

	}

}