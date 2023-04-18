package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.ArrayList;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SelectClass {
	WebDriver driver;
	String url="https://demo.guru99.com/test/newtours/register.php\n";
	String url2="http://demo.seleniumeasy.com/basic-select-dropdown-demo.html\n";
	
  @Test(enabled=false)
  public void singleDropdownSelect() {
	  
	  driver.get(url);
	  WebElement countryDropdown=driver.findElement(By.xpath("//select[@name='country']"));
	  Select obj=new Select(countryDropdown);//Select is a parameterised constructor

//single selection dropdown
	  obj.selectByVisibleText("ALGERIA");
	  obj.selectByValue("AMERICAN SAMOA");
	  obj.selectByIndex(10);
	  
  }
  
  @Test
  public void multiDropdownSelect() {
	  driver.get(url2);	 
	  WebElement multiDropdown=driver.findElement(By.xpath("//select[@id='multi-select']"));
	  Select obj2=new Select(multiDropdown);//Select is a parameterised constructor
	  System.out.println(obj2.getOptions().size());
	  for(int i=0;i<obj2.getOptions().size();i++)
	  {
		  obj2.selectByIndex(i);
	  }
//	  for(int i=0;i<obj2.getOptions().size();i++)
//	  {
//		  obj2.deselectByIndex(i);
//	  }
      ArrayList li=(ArrayList) obj2.getAllSelectedOptions();
      
	   for(Object webelement:li)
	   {
		   System.out.println((((WebElement) webelement).getText()));
	   }
	  System.out.println("first selected option"+obj2.getFirstSelectedOption());
	  obj2.deselectAll();
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
