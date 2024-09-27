package Pro.Tarining.Tech.Students;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiplebrowserwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","/Users/tehminanazir/eclipse-workspace/Students/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.amazon.com/");
		Thread.sleep(16000);
		//driver.navigate().refresh();
		//Thread.sleep(6000);
		driver.manage().window().maximize();
		Thread.sleep(16000);
		String currentwindow=driver.getWindowHandle();
		System.out.println(currentwindow);
		driver.switchTo().window(currentwindow);
		//Thread.sleep(16000);
		WebElement sell=driver.findElement(By.linkText("Sell"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.LEFT_SHIFT).build().perform();
		sell.click();
		ob.keyUp(Keys.LEFT_SHIFT).build().perform();
		
	
		
		//we use set <string> if we have more then one value to return as handles will return more then one value.
		
		Set<String> windowshandlesbrowsers=driver.getWindowHandles();
		Iterator<String> iterators=windowshandlesbrowsers.iterator();
		String FirstWindowHandler=iterators.next();
		String SecondWindowHandler=iterators.next();
		System.out.println("This is first handle= "+FirstWindowHandler);
		System.out.println("This is secondhandle= "+SecondWindowHandler);
		driver.switchTo().window(SecondWindowHandler);
		
		WebElement allmenu=driver.findElement(By.linkText("All"));
		allmenu.click();
		
		
		
	}

}  
