package SeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		
		
		WebDriver driver=new ChromeDriver();// WebDriver is the interface and chromedriver() is the constructor of WebDriver
		// using abstraction
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().window().minimize();
		
		
	}

}
