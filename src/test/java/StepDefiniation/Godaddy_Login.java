package StepDefiniation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Godaddy_Login {
	public static WebDriver driver;
	@Given("user is chrome browser of godaddy")
	public void user_is_chrome_browser_of_godaddy() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}

	@When("user enters the url of godaddy")
	public void user_enters_the_url_of_godaddy() throws InterruptedException {
		driver.navigate().to("https://in.godaddy.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("hits enters on godaddy")
	public void hits_enters_on_godaddy() throws InterruptedException {
		System.out.println("hits enters on godaddy");
		Thread.sleep(2000);
	}

	@Then("user should see sign-in oage")
	public void user_should_see_sign_in_oage() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Sign In']")).isDisplayed();
		Thread.sleep(3000);
	}

	@When("user clicks on sign-in button of godaddy")
	public void user_clicks_on_sign_in_button_of_godaddy() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Sign In']")).click(); 
		Thread.sleep(3000);

	}

	@When("again user should see the sign-in button")
	public void again_user_should_see_the_sign_in_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Sign In']")).isDisplayed();
		Thread.sleep(3000);
	}

	@When("again user clicks on sign-in button of godaddy")
	public void again_user_clicks_on_sign_in_button_of_godaddy() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();  
		Thread.sleep(3000);
	}

	@Then("user should see the username or customer textbox  of godaddy")
	public void user_should_see_the_username_or_customer_textbox_of_godaddy() throws InterruptedException {
		driver.findElement(By.id("username")).isDisplayed();
		Thread.sleep(3000);
	}

	@When("user enters text in username textbox")
	public void user_enters_text_in_username_textbox() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("naveenmanneela503@gmail.com");
		Thread.sleep(3000);
	}

	@When("clicks on continue button of godaddy")
	public void clicks_on_continue_button_of_godaddy() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(3000);
	}

	@Then("user should see the password textbox of godaddy")
	public void user_should_see_the_password_textbox_of_godaddy() throws InterruptedException {
		driver.findElement(By.id("password")).isDisplayed();
		Thread.sleep(3000);
	}

	@When("user enters the password of godaddy")
	public void user_enters_the_password_of_godaddy() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("Godaddy@1234");
		Thread.sleep(3000);
	}

	@Then("clicks on keep me sign in this device")
	public void clicks_on_keep_me_sign_in_this_device() throws InterruptedException {
		driver.findElement(By.id("remember-me"));
		Thread.sleep(3000);
	}

	@Then("clicks on sign-in button of godaddy")
	public void clicks_on_sign_in_button_of_godaddy() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(4000);
	}

	@Then("user should see the Start Shopping button")
	public void user_should_see_the_start_shopping_button() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Start Shopping']")).isDisplayed();  
		Thread.sleep(4000);
	}

	@When("user clicks on starts shopping button")
	public void user_clicks_on_starts_shopping_button() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Start Shopping']")).click();
		Thread.sleep(2000);
	}

	@Then("user should see the homepage of godaddy")
	public void user_should_see_the_homepage_of_godaddy() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//span[text()='Search Domain']")).isDisplayed();
		Thread.sleep(2000);
	driver.close();
	}	
	}


