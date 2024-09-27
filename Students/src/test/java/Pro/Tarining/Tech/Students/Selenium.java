package Pro.Tarining.Tech.Students;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Selenium {
  @Test
  public void f() {
	  
	  System.out.println("This is a test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("This is before Method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("This is after method annotation");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class innotation");
  }
  //before method and after method will run with every test case no matter how many test cases do you have
  //while remaining suite and classes will be run in same sequence.
  
  
  @Test
  public void second() {
	  System.out.println("This is second test annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite annotation");
  }

}
