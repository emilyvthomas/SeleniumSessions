package TestNGAssignment;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropDown {
	WebDriver driver;
	String url="https://selenium.obsqurazone.com/select-input.php";
  @Test
  public void dropDown() {
	  
	//select[@id='single-input-field']
	  WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	  Select obj=new Select(dropdown);//Select is a parameterised constructor
	  obj.selectByVisibleText("Red");
	//div[@id='message-one']
	  WebElement msg=driver.findElement(By.xpath("//div[@id='message-one']"));
	  System.out.println(msg.getText());
	  System.out.println(obj.getOptions().size());
	  ArrayList li=(ArrayList) obj.getOptions();
	  for(Object webelement:li)
	   
		   System.out.println((((WebElement) webelement).getText()));
	   
	  //System.out.println("optins"+obj.getOptions());
	   
	
 
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
