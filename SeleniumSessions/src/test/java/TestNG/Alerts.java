package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Alerts {
	WebDriver driver;
	String url="http://demo.automationtesting.in/Alerts.html";
  @Test(enabled=false)
  public void simpleAlerts() {
	//button[@class='btn btn-danger']
	  WebElement simplealert=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	  simplealert.click();
	  
	  Alert alert=driver.switchTo().alert();
	  alert.accept();
	  
  }
  @Test(enabled=false)
  public void confirmAlert() {
	  
	//a[contains(text(),'Alert with OK & Cancel ')]
	  WebElement confirmalert=driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]"));
	  confirmalert.click(); 
	  
	//button[@class ='btn btn-primary']
	  WebElement clickme=driver.findElement(By.xpath("//button[@class ='btn btn-primary']"));
	  clickme.click(); 
	  
	  Alert alert=driver.switchTo().alert();
	  System.out.println(alert.getText());
	  alert.dismiss();
	  WebElement value=driver.findElement(By.xpath("//p[@id='demo']"));
	  String actualResult=value.getText();
	  String expectedResult="You Pressed Cancel";
	  Assert.assertEquals(actualResult, expectedResult);
  }
  @Test
  public void promptAlert()
  {
	//a[contains(text(),'Alert with Textbox ')]
	  WebElement tabbutton=driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]"));
	  tabbutton.click();
	  WebElement clickpress=driver.findElement(By.xpath("//button[@class='btn btn-success navbar-toggle']"));
	  clickpress.click();
	  Alert alert=driver.switchTo().alert();
	  alert.sendKeys("prompt alert");
	  alert.accept();
	  
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
