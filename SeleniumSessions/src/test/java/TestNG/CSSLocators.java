package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class CSSLocators {
	WebDriver driver;
	String url="https://www.python.org\n";
	
  @Test(priority=1)
  public void tagAndId() {
	  
	 // css=input#id-search-field;
	  WebElement searchbar=driver.findElement(By.cssSelector("input#id-search-field"));
	  searchbar.sendKeys("python");
	  
  }
  @Test(priority=2)
  public void tagAndClass()
  {
	  //search-button
	  //css=button.search-button
	  WebElement goButton=driver.findElement(By.cssSelector("button.search-button"));
	  goButton.click();
  }
  @Test(priority=3)
  public void tagAndAttribute()
  {
	  //input[placeholder=Search]
	  WebElement searchbar1=driver.findElement(By.cssSelector("input[placeholder=Search]"));
	  searchbar1.clear();

  }
  @Test(priority=4)
  public void tagclassAttribute()
  {
	  //input.search-field[role=textbox]
	  WebElement searchbar2=driver.findElement(By.cssSelector("input.search-field[role=textbox]"));
	  searchbar2.sendKeys("IOS");
	  
	 //WEB ELEMENT COMMANDS
	  
	  String text=searchbar2.getTagName();
	  System.out.println(text);
	  String attributevalue=searchbar2.getAttribute("id");
	  System.out.println(attributevalue);
	  String cssproerty=searchbar2.getCssValue("font-size");
	  System.out.println(cssproerty);
	  System.out.println(searchbar2.getSize());
	  System.out.println(searchbar2.getLocation());
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
