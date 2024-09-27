package Pro.Tarining.Tech.Students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectors {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/tehminanazir/eclipse-workspace/Students/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.facebook.com/");
		
		WebElement newaccount=driver.findElement(By.partialLinkText("Create new account"));
		newaccount.click();
		Thread.sleep(1000);
	  
		
		WebElement fname=driver.findElement(By.xpath("//input[@aria-label='First name']"));
		fname.sendKeys("asd");
		Thread.sleep(2000);

		WebElement lname=driver.findElement(By.xpath("//input[@aria-label='Surname']"));
		lname.sendKeys("jkh");
		Thread.sleep(2000);
		
		
	WebElement email=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
	email.sendKeys("hit@yahoo.com");
	Thread.sleep(9000);
	
	WebElement passwd=driver.findElement(By.xpath("//input[@aria-label=\'New password\']"));
	passwd.sendKeys("1234");
	Thread.sleep(2000);
	
	WebElement birthday=driver.findElement(By.xpath("//select[@name=\'birthday_day\']"));
	Select ob=new Select(birthday);
	   ob.selectByIndex(12);
	   Thread.sleep(4000);
	
	
	
	 /*WebElement month=driver.findElement(By.name("birthday_day"));
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
	   Thread.sleep(7000);
	
	
	
	 WebElement female=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]"));
	   female.click();
	 
	    
	   WebElement signup=driver.findElement(By.xpath("//button[text()='Sign Up' and @name='websubmit']"));
	   signup.click();
	
	
	
	
	
	}

}
