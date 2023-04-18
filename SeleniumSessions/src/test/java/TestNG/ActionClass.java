package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionClass {
	WebDriver driver;
	String url1="https://demo.guru99.com/test/simple_context_menu.html\n";
	String url2="http://mrbool.com/";
	String url3="https://demoqa.com/droppable/";
	String url4="https://www.google.com/";


	@Test(enabled=false)
  public void contextClick() {
	  driver.get(url1);
	//span[contains(text(),'right')]
	  Actions obj=new Actions(driver);
	  WebElement rightClickme=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
 
	  obj.contextClick(rightClickme).build().perform();
	  
  }
  @Test(enabled=false)
  public void doubleClick() {
	  
	  driver.get(url1);
	  //button[contains(text(),'Double')]
	  Actions obj2=new Actions(driver);
	  WebElement doubleClick=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
      obj2.doubleClick(doubleClick).build().perform();
	  
	  
  }
  @Test(enabled=false)
  public void mouseHover() {
	  driver.get(url2);
	  Actions obj2=new Actions(driver);
	  WebElement mouse=driver.findElement(By.xpath("//a[@class='menulink']"));
	  obj2.moveToElement(mouse).build().perform();
	  WebElement article=driver.findElement(By.xpath("//a[contains(text(),'Articles')]"));
	  obj2.click(article).build().perform();
	  
  }
  @Test(enabled=false)
  public void dragndDrop()
  {
	driver.get(url3);
	Actions obj=new Actions(driver);
	  WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
	  WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	  obj.dragAndDrop(drag, drop).build().perform();
	  obj.clickAndHold(drag).moveToElement(drop).release().perform();
	  
  }
  @Test
  public void keyboardEvents()
  {
     driver.get(url4);
   //input[@title='Search']
     Actions obj=new Actions(driver);
	  WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
	 obj.keyDown(search, Keys.SHIFT).sendKeys(search, "emily").keyUp(search, Keys.SHIFT).build().perform();
     
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
