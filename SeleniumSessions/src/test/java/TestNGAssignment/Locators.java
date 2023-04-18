package TestNGAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	WebDriver driver;
	String url="https://selenium.obsqurazone.com/simple-form-demo.php";
  @Test
  public void idLoc() {
	  
	  WebElement messagebox=driver.findElement(By.id("single-input-field"));
	  messagebox.sendKeys("Hello");
	  WebElement button1=driver.findElement(By.id("button-one"));
	  button1.click();
	  WebElement message=driver.findElement(By.id("message-one"));
	  String text=message.getText();
	  System.out.println(text);
  }
  
  @Test
  public void classNameLoc() {
	  
	  WebElement title1=driver.findElement(By.className("card-header"));
	  Boolean val=title1.isDisplayed();
	  System.out.println(val);
	  Boolean val2=title1.isEnabled();
	  System.out.println(val2);
	  String text=title1.getText();
	  System.out.println(text);
  }
  @Test
  public void getTotal() {
	  
	 WebElement valueA=driver.findElement(By.id("value-a"));
	 valueA.sendKeys("10");
	 WebElement valueB=driver.findElement(By.id("value-b"));
	 valueB.sendKeys("10");
	 valueA.clear();
	 valueA.sendKeys("20");
	 WebElement button2=driver.findElement(By.id("button-two"));
	 button2.click();
	 
	 WebElement message=driver.findElement(By.id("message-two"));
	 String text2=message.getText();
	 System.out.println(text2);
	 
	 
  }
  

  @Test
  public void linkTest()
  {
	  WebElement radiobutton=driver.findElement(By.linkText("Radio Buttons Demo"));
	  Boolean val= radiobutton.isDisplayed();
	  System.out.println(val);
	  
	 
  }
  
  @Test
  public void partiallinkTest()
  {
	  WebElement radio=driver.findElement(By.partialLinkText("Radio"));
	  radio.click();
	  WebElement str=driver.findElement(By.className("form-check-label"));
	  Boolean val3=str.isSelected();
	  System.out.println(val3);
	  
	 
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
	  driver.close();
  }

}
