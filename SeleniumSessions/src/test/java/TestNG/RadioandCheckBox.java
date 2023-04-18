package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class RadioandCheckBox {
	
	WebDriver driver;
	String url="https://demo.guru99.com/test/radio.html";

  @Test
  public void radioButton() {
	  
		//input[@id='vfb-7-2']
		//input[@id='vfb-7-3']
	  
	WebElement option1=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
	WebElement option2=driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
	WebElement option3=driver.findElement(By.xpath("//input[@id='vfb-7-3']"));
	 option1.click();
	 Boolean val=option1.isSelected();
	 option2.click();
	 option3.click();
	 Assert.assertTrue(val);
	 Assert.assertFalse(option1.isSelected());
	 Assert.assertTrue(option3.isSelected());
  }
  @Test
  public void checkBox() {
	//input[@id='vfb-6-0']
	  WebElement check1=driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
	  WebElement check2=driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
	  WebElement check3=driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
	  Boolean val=check1.isSelected();
	  Assert.assertFalse(val);
	  System.out.println(val);
	  
		 check1.click();
		 check2.click();
		 check3.click();
		 Boolean val2=check1.isSelected();
		 Assert.assertTrue(val2);
		 System.out.println(val2);
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
