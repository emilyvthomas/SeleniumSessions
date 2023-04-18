package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FakerClass {

    WebDriver driver;

    String url= "https://demoqa.com/automation-practice-form";
    @Test
    public void testForm() {
 
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String  email = faker.internet().emailAddress();
        String phoneNumber = faker.phoneNumber().cellPhone();
      //  String address = faker.address().fullAddress();


	    WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
        firstname.sendKeys(name);
        WebElement email1=driver.findElement(By.xpath("//input[@id='userEmail']"));
        email1.sendKeys(email);
        
        WebElement userNumber=driver.findElement(By.xpath("//input[@id='userNumber']"));
        userNumber.sendKeys(phoneNumber);
      
    }
    @BeforeTest
    public void beforeTest() {
  	  
  	  WebDriverManager.chromedriver().setup();
  	  driver=new ChromeDriver();
  	  driver.manage().window().maximize();
  	  driver.get(url);
    }
    
}