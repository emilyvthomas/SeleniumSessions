package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Screenshot {
	
	WebDriver driver;
	String url="https://www.techlistic.com/p/demo-selenium-practice.html";
  @Test
  public void screenshots() {
	  driver.get(url);
	  WebElement title=driver.findElement(By.xpath("//div[text()='Techlistic ']"));
	 String actualTitle=title.getText();
	 String ExpectedTitle="Techlisti";
	 //System.out.println("actualTitle"+actualTitle);
	 Assert.assertEquals(actualTitle, ExpectedTitle);
  }
  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException
  {
	  System.out.println(ITestResult.FAILURE);
	  System.out.println(result.getStatus());//gets the status of the testcase ran just before the aftermethod
	  if(ITestResult.FAILURE==result.getStatus())
	  {
		  
      Date d=new Date();
      String date=d.toString().replace(":", "_").replace(" ", "_");
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File sourceFile=ts.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(sourceFile, new File("./Screenshot/"+result.getName()+"_"+date+".jpg"));
	  System.out.println("Screenshot Taken");
	  }
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
