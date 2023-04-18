package TestNGAssignment;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DrapandDrop {
	WebDriver driver;
	String url="http://jqueryui.com/droppable/";
  @Test
  public void draganddrop() {
	  driver.get(url);
	//iframe[@class='demo-frame']
    WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
   driver.switchTo().frame(iframe);
	 // driver.switchTo().frame("demo-frame");
	  
		Actions obj=new Actions(driver);
		  WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		  WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		//  obj.dragAndDrop(drag, drop).build().perform();
		  obj.clickAndHold(drag).moveToElement(drop).release().perform();
		
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
