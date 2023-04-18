package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class XpathAxes {
	WebDriver driver;
	String url="https://www.python.org\n";
  @Test
  public void xpathAxes() {
	  
	//FOLLING
	  //xpath---//input[@id='id-search-field']//following::button
	  //WebElement xpathAxes=driver.findElement(By.xpath("//input[@id='id-search-field']//following::button"));
	 // xpathAxes.click();
	  
	//child
	  
	//xpath---//fieldset[@title='Search Python.org']//child::button
	// WebElement xpathAxes1=driver.findElement(By.xpath("//fieldset[@title='Search Python.org']//child::button"));
	//  xpathAxes1.click();
	
   //parent
	  
	//xpath---//fieldset[@title='Search Python.org']//parent::button
	  
	 // grant-parent ancestor
	  
	// xpath---//button[@id='submit']//ancestor::div[1]
	  
	//xpath---//form[@class='search-the-site']//descendant::button
	  
	  WebElement xpathAxes1=driver.findElement(By.xpath("//form[@class='search-the-site']//descendant::button"));
	  xpathAxes1.click();
	  
	//Sibling
	// xpath---//label[@class="screen-reader-text"]//following-sibling::button
	  
	//preceeding
	  
	// xpath---//input[@id="id-search-field"]//preceding::label
	  
	//self
	  
	//xpath---//*[@id="id-search-field"]//self::input
	//xpath---//input[@id="id-search-field"]//self::input
	  
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
