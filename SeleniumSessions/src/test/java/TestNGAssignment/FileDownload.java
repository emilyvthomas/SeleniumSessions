package TestNGAssignment;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FileDownload {
	  WebDriver driver;
	  String url="https://selenium.obsqurazone.com/file-download.php";
  @Test
  public void download() {
	  
	  driver.get(url);
	  WebElement textarea=driver.findElement(By.xpath("//textarea[@id='textbox']"));
	  textarea.sendKeys("enter the data");
	  
		 WebElement generate=driver.findElement(By.xpath("//button[@id='create']"));
		 generate.click();
		 WebElement download=driver.findElement(By.xpath("//a[@id='download-file']"));
		 download.click();
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
