package Pro.Tarining.Tech.Students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/tehminanazir/eclipse-workspace/Students/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		    driver.navigate().to("http://www.amazon.com/");
		Thread.sleep(400);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		   
		
		WebElement signs=driver.findElement(By.id("nav-line-1-container"));
		Actions ob=new Actions(driver);
		Thread.sleep(4000);
		ob.moveToElement(signs).build().perform();
		
		
		
	}
}

