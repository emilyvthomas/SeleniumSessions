package TestNGAssignment;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alerts {
	WebDriver driver;
	String url="http://demo.guru99.com/test/delete_customer.php";
  @Test(enabled=false)
  public void alerts() {
	  
  WebElement text=driver.findElement(By.xpath("//input[@name='cusid']"));
  //input[@name='cusid']
  text.sendKeys("101");
  WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
  submit.click();

  Alert alert=driver.switchTo().alert();
  alert.accept();

  Alert alert1=driver.switchTo().alert();
  alert1.accept();
  }
  @Test
  public void dismissalerts() {
	  
  WebElement text=driver.findElement(By.xpath("//input[@name='cusid']"));
  text.sendKeys("101");
  WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
  submit.click();

  Alert alert=driver.switchTo().alert();
  alert.dismiss();
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
