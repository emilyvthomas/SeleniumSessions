package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class WaitSample {
	WebDriver driver;
	String url="http://demo.guru99.com/test/guru99home/";
  @Test(enabled=false)
  public void implicitWaitSample() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get(url);
  }
  @Test(enabled=false)
  public void explicitWaitSample() {
	  driver.get(url);
	  WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Agile Project']")));
	  
  }
  @Test
  public void fluentWaitSample() {
	  driver.get(url);
	  Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
			  												.pollingEvery(Duration.ofSeconds(2))
			  												.ignoring(Exception.class);
			  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
