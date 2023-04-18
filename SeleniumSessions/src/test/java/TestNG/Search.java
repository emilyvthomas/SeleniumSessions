package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {
	WebDriver driver;
	String url="https://www.w3schools.com/html/html_tables.asp";

  @Test
  public void searchData() {
	      String searchData = "Laughing Bacchus Winecellars";
	       if (searchData.equals("")) {
	      Assert.fail("Search data is empty");
	    }
	    // locate the table
	    WebElement table = driver.findElement(By.id("customers"));
	     List<WebElement> rows = table.findElements(By.tagName("tr"));
	      boolean isDataFound = false;
	       for (int i = 0; i < rows.size(); i++) {
	           List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
	          for (int j = 0; j < cells.size(); j++) {
	            String cellText = cells.get(j).getText();
	              if (cellText.contains(searchData)) {
	                isDataFound = true;
	               break;
	            }
	             
	        }
	    }
	       
	    Assert.assertTrue(isDataFound);
	    
	    if(!isDataFound) 
      	    	Assert.fail("Search data not found");
	    
   
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
  }
  
  @AfterTest
  public void afterTest() throws Exception {

	  Thread.sleep(10000);
	  driver.close();
}
}