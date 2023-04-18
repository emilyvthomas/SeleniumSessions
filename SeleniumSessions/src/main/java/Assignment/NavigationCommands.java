package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {


public static void main(String[] args) {
			
	WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
				
			driver.manage().window().maximize();
		    driver.get("https://selenium.obsqurazone.com/index.php");
		    driver.navigate().to("https://www.google.com");
			driver.navigate().back();
	        driver.navigate().forward();
			driver.navigate().refresh();
			driver.get("https://selenium.obsqurazone.com/index.php");

		}

	}
