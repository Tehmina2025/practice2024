package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSeller {
	
	WebDriver driver;
	@FindBy(linkText = "Kindle Store") public WebElement KindleStoreLink;
	
	public BestSeller(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void kindlestore() {
		KindleStoreLink.click();
	}
	
    
}
      
	


//locate the element
//page factory constructor
//create a method for each element according to action