package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class UploadandDownload {
	WebDriver driver;
	
	String url="https://demoqa.com/upload-download";
  @Test()
  public void download() {
	  
	  driver.get(url);
	//a[@id='downloadButton']
	  WebElement download=driver.findElement(By.xpath("//a[@id='downloadButton']"));
	  download.click();
  }
  @Test
  public void upload() {
	//input[@id='uploadFile']
	  
	  WebElement chooseFile=driver.findElement(By.xpath("//input[@id='uploadFile']"));
	  chooseFile.sendKeys("C:\\Users\\ebin\\eclipse-workspace\\SeleniumSessions\\src\\main\\resources\\UploadFiles\\sampleFile (1).jpeg");
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
