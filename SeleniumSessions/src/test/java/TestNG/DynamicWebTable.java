package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DynamicWebTable {
	WebDriver driver;
	String url="https://www.w3schools.com/html/html_tables.asp";
  @Test
  public void dynamicwebTable() {
	  
	  driver.get(url);
	//table[@class='ws-table-all']/tbody/tr[2]/td[1]//----to handle static table
	//table[@class='ws-table-all']/tbody/tr
	  
	  List<WebElement> rows1=driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr"));
	  int rowcount=rows1.size();
	  System.out.println(rowcount);
	  List<WebElement> column1=driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr[2]/td"));
	  int columncount=column1.size();
	  System.out.println(columncount);
	  for(int i=2;i<=rowcount;i++)
	  {
		  for(int j=1;j<=columncount;j++)
		  {
			  String webdata=driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr["+i+"]/td["+j+"]")).getText();
			  System.out.println(webdata);
		  }
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
