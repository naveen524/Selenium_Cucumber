package StepDefiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_Login {
	public static WebDriver driver;
	@Given("user is on login page of gmail")
	public void user_is_on_login_page_of_gmail() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
	}

	@When("user clicks on login button of gmail")
	public void user_clicks_on_login_button_of_gmail() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	Thread.sleep(2000);
	}

	@Then("user should see the email or textbox")
	public void user_should_see_the_email_or_textbox() throws InterruptedException {
	driver.findElement(By.id("identifierId")).isDisplayed();
	Thread.sleep(4000);
	}

	@When("user enters gmail_id")
	public void user_enters_gmail_id() throws InterruptedException {
	driver.findElement(By.id("identifierId")).sendKeys("naveenmanneela@gmail.com");
	Thread.sleep(4000);
	}

	@When("clicks on next button of gmail")
	public void clicks_on_next_button_of_gmail() throws InterruptedException {
	driver.findElement(By.xpath("//span[text()='Next']")).click();    
	Thread.sleep(4000);
	}

	@Then("user should see the enter your password textbox")
	public void user_should_see_the_enter_your_password_textbox() throws InterruptedException {
	driver.findElement(By.name("password")).isDisplayed();
	Thread.sleep(4000);
	}
	@When("user enters the password of gmail")
	public void user_enters_the_password_of_gmail() throws InterruptedException {
    driver.findElement(By.name("password")).sendKeys("Gmail@1234"); 
    Thread.sleep(4000);
	}
	@Then("clicks on next button of the gmail")
	public void clicks_on_next_button_of_the_gmail() throws InterruptedException {
	  driver.findElement(By.xpath("//span[text()='Next']")).click(); 
	  Thread.sleep(4000);
	}
	@Then("user should see the homepage of gmail")
	public void user_should_see_the_homepage_of_gmail() throws InterruptedException {    
	driver.findElement(By.xpath("//*[@id=\":kr\"]/div/div")).isDisplayed();	
	Thread.sleep(2000);
	}

}
