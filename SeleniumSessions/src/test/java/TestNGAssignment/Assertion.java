package TestNGAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {

	WebDriver driver;
	String url="https://selenium.obsqurazone.com/index.php";

  @Test
 public void hardassert() {
		
		
		  
		String actualtitle= driver.getTitle();
		
		String expectedTitle="Obsqura Testing";
		
		System.out.println("this is hard Assertion");
		Assert.assertEquals(actualtitle, expectedTitle);
		
		//Assert.assertNull(driver);
		Assert.assertNotNull(driver);
		
		System.out.println("actualtitle is " +actualtitle);
		System.out.println("expectedTitle is " +expectedTitle);
		
	  }
		 
		  
	  @Test(priority=2)
	  public void softassert() {
		  
		
		  SoftAssert sa=new SoftAssert();
		  System.out.println("this is soft Assertion");
		  String actualtitle= driver.getTitle();
			
			String expectedTitle="Obsqura Testing";
			
			sa.assertEquals(actualtitle, expectedTitle);
			System.out.println("actualtitle is " +actualtitle);
			System.out.println("expectedTitle is " +expectedTitle);
			
			sa.assertNotNull(driver);
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