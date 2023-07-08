package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import PageObject.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LandingPage_SD {
	
	//private LandingPage landingPage = new LandingPage();
	public static WebDriver driver;
	String url = "https://dsportalapp.herokuapp.com/";
	String title1;
	
	@FindBy(xpath = "//button[text()='Get Started']")WebElement getStarted_btn;
    @FindBy(xpath = "//a[text()='NumpyNinja']")WebElement getTitle;
//	WebElement p=driver.findElement(By.xpath("//a[text()='NumpyNinja']"));
	
	
//	public LandingPage_SD( WebDriver driver) {
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
//	}

	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		driver=new ChromeDriver();
		driver.get(url);
	    System.out.println("Landing Page opened");    
	}

	@When("User click Get Started Button")
	public void user_click_get_started_button() throws InterruptedException {
		
    	PageFactory.initElements(driver, this);
		Thread.sleep(3000);
		getStarted_btn.click();
		
	}

	@Then("User navigates to Home page")
	public void user_navigates_to_home_page() {
		System.out.println("Navigating to home page");
	}

	@Then("Title of the page should be {string}")
	public void title_of_the_page_should_be(String title) {
		System.out.println("Title Actual= "+title);
		PageFactory.initElements(driver, this);
//		WebElement p=driver.findElement(By.xpath("//a[text()='NumpyNinja']"));
//		String title1=p.getText();
		String title1=getTitle.getText();
		System.out.println("Title1111111= "+title1);
		Assert.assertEquals(title, title1);
		driver.close();
	}


	

}
