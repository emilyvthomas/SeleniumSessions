package TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationClass {
  @Test
  public void testcase() {

	  	System.out.println("This is testcase");
  }
  
  @Test
  public void testcase1() {

	  	System.out.println("This is testcase1");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is BeforeMethod");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is Aftermethod");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is BeforeClass");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is Afterclass");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is Beforetest");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is Aftertest");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is BeforeSuite");

  }

  @AfterSuite
  public void afterSuite() {
		System.out.println("This is AfterSuite");
  }
  


}
