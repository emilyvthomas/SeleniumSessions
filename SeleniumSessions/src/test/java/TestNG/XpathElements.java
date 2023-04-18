package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class XpathElements {
	WebDriver driver;
	String url="https://www.python.org\n";
  @Test(priority=1)
  public void xpathNormal() {
	  
	  WebElement searchbar=driver.findElement(By.xpath("//input[@id=\"id-search-field\"]"));
	  searchbar.sendKeys("Python");
  }
  @Test(priority=3)
  public void xpathText()
  {
	  WebElement donateButton=driver.findElement(By.xpath("//a[text()='Donate']"));
	  donateButton.click();
  }
  @Test(enabled=false)
  public void xpathContains()
  {
	  
	//h1[contains(text(),'Donation for the PSF')]
	  WebElement contains=driver.findElement(By.xpath("//h1[contains(text(),'Donation for the PSF')]"));
	  String str=contains.getText();
	  System.out.print(str);
  }
  @Test(priority=4)
  public void xpathStartwith()
  {
	  
	//h1[contains(text(),'Donation for the PSF')]
	  WebElement startwith=driver.findElement(By.xpath("//h1[starts-with(text(),'Donation ')]"));
	  String str=startwith.getText();
	  System.out.print(str);
	 
  }
  @Test(priority=2)
  public void xpathAndOr()
  {
	//button[@type='submit'and@name='submit']
	//  WebElement xpathOr=driver.findElement(By.xpath("//button[@type='submit'or@name='submit']"));
	//  String str=xpathOr.getText();
    //  xpathOr.click();
	  
	  WebElement xpathAnd=driver.findElement(By.xpath("//button[@type='submit'and@name='submit']"));
	  String str1=xpathAnd.getText();
	  xpathAnd.click();
	  driver.navigate().back();
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
