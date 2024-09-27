package Pro.Tarining.Tech.Students;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alerts  {

			public static void main(String[] args) throws InterruptedException{
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","/Users/tehminanazir/eclipse-workspace/Students/Drivers/chromedriver");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
				Thread.sleep(2000);
				driver.navigate().refresh();
				driver.manage().window().maximize();
				WebElement submission=driver.findElement(By.name("submit"));
				submission.click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				//driver.switchTo().alert().dismiss();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
		
		
		
		
	}

}
