package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v123.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonKindle {
	
	WebDriver driver;
	@FindBy(xpath = "//*[text()='Best Sellers in Kindle Store']")
	public WebElement KindleStoreText;
	public AmazonKindle(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String AmazonKindleget() {
		String storesjk=KindleStoreText.getText();
		return storesjk;
		
	}
	

}
