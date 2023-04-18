package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WindowHandling {
	WebDriver driver;
	String url="https://demoqa.com/browser-windows";
  @Test
  public void getWindowHandle() {
	//button[@id='tabButton']
	  
	  WebElement newtab=driver.findElement(By.xpath("//button[@id='tabButton']"));
	  newtab.click();
	  String parentwindow=driver.getWindowHandle();
	  System.out.println(parentwindow);
	  Set<String> allwindow=driver.getWindowHandles();
	  System.out.println(allwindow);
	  Iterator<String> itr=allwindow.iterator();
	  while(itr.hasNext()) {
		  String childwindow=itr.next();//current location is moved to childwindow ,ie parent window is moved to childwindow and move to next loc ie childwindow is in itr
			 
		  if(!parentwindow.equalsIgnoreCase(childwindow))
		  {
			  driver.switchTo().window(childwindow);
			  
		  
	  }
	 
	  }
	  WebElement text=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	  System.out.println(text.getText());
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
