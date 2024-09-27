package Pro.Tarining.Tech.Students;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","/Users/tehminanazir/eclipse-workspace/Students/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.amazon.com/");
		Thread.sleep(16000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.name("field-keywords"));
		search.sendKeys("Computer");
		Actions ob=new Actions(driver);
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		//select All, copy the text and clear
		ob.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		Thread.sleep(6000);
		search.clear();
		search.click();
		Thread.sleep(8000);
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		  
		  
		
	}

}
