package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	WebDriver driver;
	
	public Home_page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="fb_stories_card_root")
	WebElement stories;
	
	@FindBy(linkText="See More")
	WebElement seemore;
	
	public WebElement Stories() {
		
		return stories;
	}
	
	public WebElement seemore() {
		
		return seemore;
	}
}
