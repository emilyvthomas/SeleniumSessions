package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LocatorSamples {
	WebDriver driver;
	String url="https://www.python.org\n";
  @Test
  public void idExample() {
	 
	  WebElement searchBar=driver.findElement(By.id("id-search-field"));
	 searchBar.sendKeys("python");  
  }
  @Test
  public void nameExample()
  {
	  WebElement goButton=driver.findElement(By.name("submit"));
	  goButton.click();
  }
  @Test
  public void tagnameExample()
  {
	  WebElement searchResult=driver.findElement(By.tagName("h2"));
	  String text=searchResult.getText();
	  System.out.println(text);
  }
  @Test
  public void classnameExample()
  {
	  WebElement donateButton=driver.findElement(By.className("donate-button"));
	  Boolean val=donateButton.isDisplayed();
	  System.out.println(val);
  }
  @Test
  public void linkTestExample()
  {
	  WebElement learnmaore=driver.findElement(By.linkText("Learn More"));
	  Boolean val= learnmaore.isDisplayed();
	  System.out.println(val);
	 
  }
  @Test
  public void partialLinkTestExample()
  {
	  WebElement learn=driver.findElement(By.partialLinkText("Learn"));
	  learn.click();
	 
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
	  //driver.close();
  }

}
