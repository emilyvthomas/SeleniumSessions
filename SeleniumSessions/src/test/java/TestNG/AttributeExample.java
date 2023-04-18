package TestNG;

import org.testng.annotations.Test;

public class AttributeExample {
	
//  @Test(priority=3,description="Testing Annotation Attribute Priority")
//  public void test1() {
//	  
//	  System.out.println("This is the third testcase");
//	  
//  }
//  @Test(priority=2,enabled=false,description="Testing Annotation Attribute Enabled")
//  public void test2() {
//	  
//	  System.out.println("This is the second testcase");
//	  
//  }
//	  @Test(priority=1,invocationCount=2,invocationTimeOut=90,description="Testing Annotation Attribute invocationCount")
//	  public void test3() {
//		  
//		  System.out.println("This is the first testcase");
//		  
//	  }
	  
  @Test(dependsOnMethods="test5",alwaysRun=true)
  public void test4()
  {
	  System.out.println("This is the fourth testcase");
  }
  
  @Test//if test 4 fails then test 5 will also fail
  public void test5()
  
  {
	  int array[]= {1,2,3,4};
	  for(int i=0;i<5;i++)
{
		  System.out.println(array[i]); 
}
	  System.out.println("This is the fifth testcase");
  }
 
  
		 
}
