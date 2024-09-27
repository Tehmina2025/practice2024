package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	
	WebDriver driver;
	@FindBy(linkText = "Best Sellers")
	public WebElement BestSellerLink;
	//we defined WebElement as BestSellersLink we are saving locater which we have already defined @findBY
	// what happen if we define more then one locater

	public Home(WebDriver driver) {
		this.driver=driver;  
		//this.driver will pointing the global WebDriver driver, not the local one
		PageFactory.initElements(driver, this);
		
		
	}
				
	public void BestSellerClick() {
		BestSellerLink.click();
		
	}

}
