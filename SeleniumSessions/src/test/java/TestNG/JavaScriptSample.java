package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class JavaScriptSample {
	WebDriver driver;
	String url="http://demo.guru99.com/test/guru99home/";
	String url1="http://demo.guru99.com/test/guru99home/scrolling.html";
	String url2="https://www.google.com";
  @Test(enabled=false)
  public void verticalScroll() {
	  
	  driver.get(url);
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
//	  js.executeScript("window.scrollBy(0,1000)");//+ve cordinate value scroll upwards
//	  js.executeScript("window.scrollBy(0,-800)");//scroll downwards
//	  js.executeScript("window.scrollTo(0,document.body.scrollHeight()");
	  
	  
	//a[text()='Linux']
	  WebElement linux=driver.findElement(By.xpath("//a[text()='Linux']"));
	//  js.executeScript("arguments[0].scrolllnToView();", linux);
	  js.executeScript("arguments[0].scrollIntoView();", linux);
  }
  @Test(enabled=false)
  public void horizontalScroll() 
  {
     driver.get(url1);
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(500,0)");
  }
  @Test
  public void javascriptClick() 
  {
	  driver.get(url2);
	//input[@name='q']
	//input[@class='gNO89b']
	  WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].value='sample';", searchbox);
	  WebElement searchbar=driver.findElement(By.xpath("//input[@class='gNO89b']"));
	//WebElement searchtext=driver.findElement(By.xpath(url));
	  js.executeScript("arguments[0].click();", searchbar);
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
