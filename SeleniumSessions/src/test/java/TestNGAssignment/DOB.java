package TestNGAssignment;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DOB {
	WebDriver driver;
	String url="https://demoqa.com/automation-practice-form";
  @Test
  public void dob() {
	  driver.get(url);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	  WebElement DOB=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
      js.executeScript("arguments[0].click();", DOB);
      WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
      Select obj=new Select(month);
      obj.selectByVisibleText("November");
      WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
      Select obj1=new Select(year);
      obj1.selectByVisibleText("1995");
      WebElement day=driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--018 react-datepicker__day--weekend']"));
      day.click();
      //
      
//     	  obj.contextClick(rightClickme).build().perform();
      
      WebElement music=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']//following::label[3]"));
      Boolean val=music.isSelected();
	  Assert.assertFalse(music.isSelected());
	  System.out.println(val);
      music.click();
	
	  WebElement sports=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']//following::label[1]"));
	  sports.click();
	  WebElement reading=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']//following::label[2]"));
	  reading.click();
	  
	  //Boolean val1=music.isSelected();
	 // Assert.assertTrue(music.isSelected());
	  //System.out.println(val1);
	  
	  js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
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
