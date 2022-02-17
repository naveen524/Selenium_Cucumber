package StepDefiniation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Login {
	public static WebDriver driver;
	@Given("user is on browser of flipkart")
	public void user_is_on_browser_of_flipkart() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	}

	@When("user enters url of flipkart")
	public void user_enters_url_of_flipkart() throws InterruptedException {
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	Thread.sleep(2000);
	}
	@Then("user should see email or mobilenum and enter password textboxes")
	public void user_should_see_email_or_mobilenum_and_enter_password_textboxes() throws InterruptedException {
	driver.findElement(By.xpath("(//span[text()='Login'])[2]")).isDisplayed();
	Thread.sleep(2000);
	}

	@When("user enters username and password of flipkart")
	public void user_enters_username_and_password_of_flipkart() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("6302707546");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Flipkart@1234");
	Thread.sleep(2000);
	}
	@When("cliks on on login button of flipkart")
	public void cliks_on_on_login_button_of_flipkart() throws InterruptedException {
	driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	Thread.sleep(3000);
	}

	@Then("user should see the homepage of flipkart application")
	public void user_should_see_the_homepage_of_flipkart_application() throws InterruptedException {
	driver.findElement(By.xpath("//div[text()='naveen']")).isDisplayed();
	Thread.sleep(5000);
	}
	@When("user mouseover on fashion")
	public void user_mouseover_on_fashion() throws InterruptedException {
	WebElement fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
	Thread.sleep(3000);
	Actions action = new Actions(driver);
	action.moveToElement(fashion).perform();
	Thread.sleep(4000);
	}

	@When("clicks on mens foot wear")
	public void clicks_on_mens_foot_wear() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[5]")).click();    
	Thread.sleep(4000);
	}

	@Then("user should see the foot wear products")
	public void user_should_see_the_foot_wear_products() throws InterruptedException {
	System.out.println("user should see the foot wear products"); 
	Thread.sleep(4000);
	}

	@When("user clicks on liked product")
	public void user_clicks_on_liked_product() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='wndr-13 sports shoes for men | Latest Stylish Casual sp...']")).click();
	Thread.sleep(5000);
	}

	@Then("click on size of the shoes")
	public void click_on_size_of_the_shoes() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='9']")).click();
	Thread.sleep(4000);
	}

	@Then("clicks on add to cart")
	public void clicks_on_add_to_cart() throws InterruptedException {
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']/..")).click();
	Thread.sleep(4000);
	}

	@Then("user should see the place order button")
	public void user_should_see_the_place_order_button() throws InterruptedException {
	driver.findElement(By.xpath("//span[text()='Place Order']/..")).isDisplayed();
	Thread.sleep(3000);
	}

	@When("user clicks on place order")
	public void user_clicks_on_place_order() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Place Order']/..")).click();   
		Thread.sleep(3000);
	}
	@When("clicks on delivery here")
	public void clicks_on_delivery_here() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Deliver Here']")).click();
	Thread.sleep(3000);
	driver.close();
	}

	
}
