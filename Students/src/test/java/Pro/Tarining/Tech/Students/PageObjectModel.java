package Pro.Tarining.Tech.Students;

import org.testng.asserts.SoftAssert;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AmazonKindle;
import Pages.BestSeller;
import Pages.Home;

public class PageObjectModel {
	
	WebDriver driver;
	@Test
  public void f() throws InterruptedException {
		
	  Home ob=new Home(driver);
	  Thread.sleep(6000);
	  ob.BestSellerLink.click();
	  Thread.sleep(8000);
	  
	  BestSeller oj=new BestSeller(driver);
	
	  oj.KindleStoreLink.click();
	  Thread.sleep(8000);
	 
	  
	  
	  AmazonKindle ok=new AmazonKindle(driver);
	  String KindleStoreText=ok.AmazonKindleget();
	  System.out.println(KindleStoreText);
	  
	  SoftAssert jk=new SoftAssert();
	  jk.assertEquals(KindleStoreText, "Best Sellers in Kindle Store");
	  
	  //soft assert will allow to execute code even after failure while hard assert will stop execution of code right after assert fial.
	  
	  System.out.println("This is after assertion");
	  jk.assertAll();
	}
	  		
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  browsers("Chrome");
	  
  }

  @AfterMethod
 
	 	 public void afterMethod() throws InterruptedException {
		  
		  Thread.sleep(8000);
		  driver.quit();
  }
   

  @Test
public void browsers(String browser) throws InterruptedException {
	
	if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","/Users/tehminanazir/eclipse-workspace/Students/Drivers/chromedriver");
	    driver=new ChromeDriver();
	    driver.navigate().to("http://www.amazon.com/");
		Thread.sleep(16000);
		driver.navigate().refresh();
		Thread.sleep(16000);
		driver.manage().window().maximize();}
	else if(browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.Edge.driver","/Users/tehminanazir/eclipse-workspace/Students/Drivers/msedgedriver.exe");
	    driver=new EdgeDriver();
	    driver.navigate().to("http://www.amazon.com/");
		Thread.sleep(16000);
		driver.navigate().refresh();
		Thread.sleep(16000);
		driver.manage().window().maximize();}
	
	else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.Edge.driver","/Users/tehminanazir/eclipse-workspace/Students/Drivers/geckodriver");
	    driver=new FirefoxDriver();
	    driver.navigate().to("http://www.amazon.com/");
		Thread.sleep(16000);
		driver.navigate().refresh();
		Thread.sleep(16000);
		driver.manage().window().maximize();}
	}
	
  
 
 	public void takescreenshot() throws IOException {
 		  Date dt=new Date();
 		  String jk=dt.toString().replace(" ","_").replace(":","_");
 		  System.out.println(jk);
 		 
 			File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 			FileHandler.copy(capture, new File("/Users/tehminanazir/eclipse-workspace/Students/Pictures/"+jk+"output.jpg"));  

 			
 		    }
	
	}


