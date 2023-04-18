package TestNGAssignment;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Scroll {
	WebDriver driver;
	String url="https://demoqa.com/automation-practice-form";
  @Test
  public void scrollUp() throws Exception {

	  {
	     driver.get(url);
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     
		  WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
          firstname.sendKeys("Emily");
          
	    //input[@id='lastName']
          WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
          lastname.sendKeys("V Thomas");
          
       //input[@id='userEmail']
       WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
       email.sendKeys("emily@gmail.com");
	    
       WebElement option2=driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
	   option2.click();
       //input[@id='userNumber']
	    
	    
       WebElement userNumber=driver.findElement(By.xpath("//input[@id='userNumber']"));
       userNumber.sendKeys("8921612759");
       
       WebElement DOB=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
       js.executeScript("arguments[0].click();", DOB);
       WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
       Select obj=new Select(month);
       obj.selectByVisibleText("November");
       WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
       Select obj1=new Select(year);
       obj1.selectByVisibleText("1995");
       WebElement day=driver
    		     .findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--018 react-datepicker__day--weekend']"));
       day.click();
       
     //input[@id='subjectsInput']
       WebElement subject=driver.findElement(By.xpath("//input[@id='subjectsInput']"));
       subject.sendKeys("MCA");
       
      
 	  WebElement sports=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']//following::label[1]"));
 	  // sports.click();
 	  js.executeScript("arguments[0].click();", sports);
 	  WebElement reading=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']//following::label[2]"));
 	  js.executeScript("arguments[0].click();", reading);
 	  //reading.click();
 	  WebElement music=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']//following::label[3]"));
	  //music.click();
 	  //Boolean val=music.isSelected();
 	  // Assert.assertfalse(music.isSelected());
 	  //System.out.println(val);
 	 js.executeScript("arguments[0].click();", music);
 	  
 	 
 	  //Boolean val1=music.isSelected();
 	  // Assert.assertTrue(music.isSelected());
 	  //System.out.println(val1);
 	  
 	  
       
	   WebElement chooseFile=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	   chooseFile.sendKeys("C:\\Users\\ebin\\eclipse-workspace\\SeleniumSessions\\src\\main\\resources\\UploadFiles\\sampleFile (1).jpeg");
		//textarea[@id='currentAddress']
	   
	 
	   
	   WebElement textarea=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
       textarea.sendKeys("ABC HOUSE");
      
       js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
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
