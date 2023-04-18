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

public class CheckBox {
	WebDriver driver;
	String url="https://demoqa.com/automation-practice-form";
  @Test
  public void checkBox() {
	//input[@id='hobbies-checkbox-1']
	  
	  WebElement check1=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
	  WebElement check2=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
	  WebElement check3=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
		  
	  Boolean val1=check1.isSelected();
	  Boolean val2=check2.isSelected();
	  Boolean val3=check2.isSelected();
	  System.out.println("Checkbox -1 is selected ");
	  System.out.println(val1);
	  System.out.println("Checkbox -2 is selected ");
	  System.out.println(val2);
	  System.out.println("Checkbox -3 is selected ");
	  System.out.println(val3);
	  //Boolean val3=check2.isSelected();
	 
      System.out.println("CheckBox-1 is not selcted");
      Assert.assertFalse(check1.isSelected());
	  System.out.println("CheckBox-2 is not selcted");
	  Assert.assertFalse(check2.isSelected());
      System.out.println("CheckBox-3 is not selcted");
      Assert.assertFalse(check3.isSelected());
     
     check1.click();
	 check2.click();
	 check3.click();
	 Assert.assertTrue(check1.isSelected());
	 Assert.assertTrue(check2.isSelected());
	 Assert.assertTrue(check3.isSelected());
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
