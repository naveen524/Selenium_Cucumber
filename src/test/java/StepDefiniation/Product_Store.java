package StepDefiniation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Product_Store {
	public static WebDriver driver;
	@Given("user is on webbrowser")
	public void user_is_on_webbrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();	
	}

	@When("user enters the url of products store")
	public void user_enters_the_url_of_products_store() throws InterruptedException {
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}

	@Then("user should see the login or signup button of products store")
	public void user_should_see_the_login_or_signup_button_of_products_store() throws InterruptedException {
		driver.findElement(By.id("login2")).isDisplayed();
		Thread.sleep(2000);
	}

	@When("user clicks on login button of products store")
	public void user_clicks_on_login_button_of_products_store() throws InterruptedException {
		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);
	}

	@Then("user should see the username and password textboxes of products store")
	public void user_should_see_the_username_and_password_textboxes_of_products_store() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Log in']")).isDisplayed();
		Thread.sleep(2000);
	}

	@When("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password_of_products_store(String userName,String Password) throws InterruptedException {
		driver.findElement(By.id("loginusername")).sendKeys(userName); 
		Thread.sleep(2000);
		driver.findElement(By.id("loginpassword")).sendKeys(Password);
		Thread.sleep(2000);	
	}

	@When("clicks on login button of products store")
	public void clicks_on_login_button_of_products_store() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Log in']")).click(); 
		Thread.sleep(3000);
	}

	@Then("user should see the homepage of products store")
	public void user_should_see_the_homepage_of_products_store() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Welcome naveenmanneela@gmail.com']")).isDisplayed();
		Thread.sleep(4000);
	}
	@When("user clicks on phones")
	public void user_clicks_on_phones() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Phones']")).click();
		Thread.sleep(4000);
	}

	@Then("user should see the Iphone")
	public void user_should_see_the_iphone() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Iphone 6 32gb']")).isDisplayed();
		Thread.sleep(4000);
	}

	@When("user clicks on Iphone")
	public void user_clicks_on_iphone() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Iphone 6 32gb']")).click();   
		Thread.sleep(4000);
	}

	@Then("user should see the add to cart button")
	public void user_should_see_the_add_to_cart_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Add to cart']")).isDisplayed();
		Thread.sleep(4000);
	}

	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);

	}

	@And("user clicks on cart of products store")
	public void user_clicks_on_cart_of_products_store() throws InterruptedException {
		driver.findElement(By.id("cartur")).click();  
		Thread.sleep(4000);

	}

	@Then("user should see the place order button of products store")
	public void user_should_see_the_place_order_button_of_products_store() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Place Order']")).isDisplayed();   
		Thread.sleep(4000);
	}

	@When("user clicks on place order button of products store")
	public void user_clicks_on_place_order_button_of_products_store() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();    
		Thread.sleep(4000);
	}

	@Then("user should textboxes like name,contry,city textboxes of products store")
	public void user_should_textboxes_like_name_contry_city_textboxes_of_products_store() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Purchase']")).isDisplayed();   
		Thread.sleep(4000);	
		driver.close();
	}

}

