package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SoftAssertion {
	 WebDriver driver;
	 String url="https://www.google.com";
	 SoftAssert softassert=new SoftAssert();
	
  @Test
  public void softAssertS() {	 
	 String actual=driver.getCurrentUrl();
	 boolean trufal=true;
	 //softassert.assertEquals(actual, url);
	 //softassert.assertNotEquals(actual, url);
	 //softassert.assertFalse(trufal);
	 softassert.assertTrue(trufal);
	 //softassert.assertNull(actual);
	 softassert.assertNotNull(actual);
	 System.out.println("Test SA");
	 softassert.assertAll();
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
  }

}
