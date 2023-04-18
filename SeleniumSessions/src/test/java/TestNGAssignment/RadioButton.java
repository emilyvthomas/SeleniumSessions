package TestNGAssignment;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class RadioButton {
	WebDriver driver;
	String url="https://demo.guru99.com/test/ajax.html";
  @Test
  public void radioButton() {
	  
	//input[@name='name']
	//input[@id='yes']
	  WebElement option1=driver.findElement(By.xpath("//input[@id='yes']"));

	  WebElement option2=driver.findElement(By.xpath("//input[@id='no'and@name='name']"));
	
	  System.out.println("Radio Buttons are selcted");
	  Assert.assertFalse(option1.isSelected());
	  Assert.assertFalse(option2.isSelected());
	  
	  
	  option2.click();
//	  String str1=option2.getText();
//	  System.out.println(str1);
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().minimize();
	  driver.get(url);
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
