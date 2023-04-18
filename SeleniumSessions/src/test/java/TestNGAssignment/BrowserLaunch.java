package TestNGAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	WebDriver driver;
	String url="https://selenium.obsqurazone.com/index.php";
  @Test
  public void browser_launch() {
	  
	  
	String actualtitle= driver.getTitle();
	
	String expectedTitle="Obsqura Testing";
	
	System.out.println("this method will return the actual and expected title");
	Assert.assertEquals(actualtitle, expectedTitle);
	  
	  
		System.out.println("the browser is launched");
		System.out.println("actualtitle"+actualtitle);
		System.out.println("expectedTitle"+expectedTitle);

	  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
