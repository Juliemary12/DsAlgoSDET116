package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPage {

    
	@FindBy(xpath="//button[text()='Get Started']")
	WebElement getStarted_btn;
	
	@FindBy(xpath = "//a[text()='NumpyNinja']")
	WebElement getTitle;
	
	public LandingPage() {
		WebDriver driver= new ChromeDriver ();
		driver.get("https://dsportalapp.herokuapp.com/");
	}
	
	public void click_Btn() throws InterruptedException {
		Thread.sleep(3000);
		getStarted_btn.click();
	
	}
	
	public String get_Title() {
		
		return getTitle.getText();
		
	}
	

	
	}
	
	

	

