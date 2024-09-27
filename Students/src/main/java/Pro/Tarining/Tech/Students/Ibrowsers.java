package Pro.Tarining.Tech.Students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ibrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//how to setup your browser and how to open the website browser//
	
	
	System.setProperty("webdriver.chrome.driver","/Users/tehminanazir/eclipse-workspace/Students/Drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.facebook.com/");
	/*Thread.sleep(6000);
	driver.navigate().refresh();
	Thread.sleep(6000);
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.navigate().back();
	Thread.sleep(6000);
	driver.navigate().forward();
	String sessions=driver.getWindowHandle();// get session id from background
	System.out.println(sessions);
	String titles=driver.getTitle();
	System.out.println(titles);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String page=driver.getPageSource();
	System.out.println(page);
	
	WebElement emailentrs =driver.findElement(By.id("email"));
	
	emailentrs.sendKeys("hitehmi@yahoo.com");

	
	WebElement pass=driver.findElement(By.name("pass"));
	pass.sendKeys("jasdgh");*/
	
	
	
	/*WebElement forgotlk=driver.findElement(By.linkText("Forgotten password?"));
	forgotlk.click();*/
	
	/*WebElement login=driver.findElement(By.name("login"));
	login.submit();*/
	
	
	WebElement newaccount=driver.findElement(By.partialLinkText("Create new account"));
	newaccount.click();
	Thread.sleep(1000);
	
   WebElement fname=driver.findElement(By.name("firstname"));
   fname.sendKeys("Umer");
   Thread.sleep(1000);
   
   
   
  WebElement lname=driver.findElement(By.name("lastname"));
   lname.sendKeys("Khan");
   
   Thread.sleep(1000);
   
   WebElement email=driver.findElement(By.name("reg_email__"));
   email.sendKeys("hitehmi@yahoo.com");
   
   Thread.sleep(1000);
   
  
   WebElement email1=driver.findElement(By.name("reg_email_confirmation__"));
   email1.sendKeys("hitehmi@yahoo.com");
   
   Thread.sleep(500);
   
   //reg_passwd__
   WebElement passwd=driver.findElement(By.name("reg_passwd__"));
   passwd.sendKeys("sdfasf");
   Thread.sleep(500);
   
   /*WebElement day=driver.findElement(By.name("birthday_day"));
   day.sendKeys("28");
   Thread.sleep(500);
   
   WebElement month=driver.findElement(By.name("birthday_month"));
   month.sendKeys("March");
   Thread.sleep(500);
   
   WebElement year=driver.findElement(By.name("birthday_year"));
   year.sendKeys("2003");
   Thread.sleep(500);*/
   
   WebElement month=driver.findElement(By.name("birthday_day"));
   Select ob=new Select(month);
   ob.selectByIndex(1);
   Thread.sleep(4000);
   /*ob.selectByValue("6");
   Thread.sleep(4000);
   ob.selectByVisibleText("Aug");*/
   
   WebElement day=driver.findElement(By.name("birthday_month"));
   Select obj=new Select(day);
   obj.selectByIndex(6);
   Thread.sleep(4000);
   
   WebElement year=driver.findElement(By.name("birthday_year"));
   Select obc=new Select(year);
   obc.selectByValue("2023");
   Thread.sleep(4000);
   
   /*WebElement gender=driver.findElement(By.name("sex"));
   gender.click();
   Thread.sleep(1000);*/
   
   /*WebElement pagesubmit=driver.findElement(By.name("websubmit"));
	pagesubmit.click();*/
	
  
  
	}
	

	private static By ById(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static By ByLinkText(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
