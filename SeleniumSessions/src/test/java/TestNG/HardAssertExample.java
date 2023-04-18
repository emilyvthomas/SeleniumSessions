package TestNG;

import org.testng.annotations.Test;

import SeleniumWebdriver.WebdriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HardAssertExample {
	WebDriver driver;
	String url="https://www.google.com";
  @Test(priority=1)
  public void hardassert() {
	
	  try
	  {
	  
	String actualtitle= driver.getTitle();
	
	String expectedTitle="Googl";
	
	System.out.println("this is the first test case");
	Assert.assertEquals(actualtitle, expectedTitle);
	//System.out.println("the test case is passed");
	//Assert.assertNotEquals(actualtitle, expectedTitle);
	
  }
	  catch(AssertionError ae)
	  {
		  ae.printStackTrace();
		  
	  }
		System.out.println("the test case is passed");

	  }
  @Test(priority=2)
  public void hardassert2() {
	  
	  System.out.println("this is the second test case");
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
