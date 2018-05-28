package ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_objects {

	WebDriver driver;
	
	public Login_objects(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(css="input[type=\"submit\"]")
	WebElement submit;
	
	
	public WebElement pass() {
		return password;
	}
	
	public WebElement email() {
		
		return email;
	}
	
	public WebElement submit() {
		
		return submit;
	}
	
	public String pagetitle() {
		
		return driver.getTitle();
		
	}
	
}
