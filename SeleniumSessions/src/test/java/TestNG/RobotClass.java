package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RobotClass {
	WebDriver driver;
	String url="https://blueimp.github.io/jQuery-File-Upload/";
	String filepath="C:\\Users\\ebin\\eclipse-workspace\\SeleniumSessions\\src\\main\\resources\\UploadFiles\\sampleFile (1).jpeg";
	  
  @Test
  public void robotclassUpload() throws AWTException {
	 
      StringSelection s=new StringSelection(filepath);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);//clipboard copy for coping the path of file
	//input[@type='file']
	  WebElement addfile=driver.findElement(By.xpath("//span[@class='btn btn-success fileinput-button']"));
	  addfile.click();
	  Robot robot=new Robot();
	  robot.delay(250);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V);
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_V);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.delay(250);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	 
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
