package StepDefiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class actiTime_Login {
	public static WebDriver driver;
	@Given("user is on firefox browser of actitime application")
	public void user_is_on_firefox_browser_of_actitime_application() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		
	}

	@When("user enters the url of")
	public void user_enters_the_url_of() {
	 driver.get("https://demo.actitime.com/login.do");  
	 driver.manage().window().maximize();	
	}

	@Then("user should see the username and password textboxes of actitime application")
	public void user_should_see_the_username_and_password_textboxes_of_actitime_application() {
	  System.out.println("user should see the username and password textboxes of actitime application");  
		
	}

	@When("^naveen enters \"(.*)\" and \"(.*)\"$")
	public void naveen_enters_and(String string, String string2) throws InterruptedException {
	 driver.findElement(By.name("username")).sendKeys();  
	 Thread.sleep(2000);
	 driver.findElement(By.name("pwd")).sendKeys();
	 Thread.sleep(2000);
		
	}

	@When("hits on login button of actitime application")
	public void hits_on_login_button_of_actitime_application() {
	 driver.findElement(By.xpath("//div[text()='Login ']")).click();   
		
	}

	@Then("user should see the home page of actitime application")
	public void user_should_see_the_home_page_of_actitime_application() {
    System.out.println("user should see the home page of actitime application");

	}
	
}
