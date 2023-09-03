package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginDemo {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
	 WebDriverManager.chromedriver().setup();
	 
	 driver = new ChromeDriver();
	 
	 
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		driver.get("https://www.youtube.com/watch?v=g6Bv57iXjJw&list=PLhW3qG5bs-L_mFHirOLEYJ7X2rIXu8SR2&index=4");
	 
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() {
	   
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    
	}

	@Then("user is navigate to the home page")
	public void user_is_navigate_to_the_home_page() {
	   
	}
}
