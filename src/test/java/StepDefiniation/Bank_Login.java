package StepDefiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Bank_Login {
	public static WebDriver driver;
	@Given("user is on chrome browser of guru bank")
	public void user_is_on_chrome_browser_of_guru_bank() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		Thread.sleep(2000);
	}

	@When("user enters the url of guru banks")
	public void user_enters_the_url_of_guru_banks() throws InterruptedException {
		driver.navigate().to("https://demo.guru99.com/v4/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("hits enters on browser guru bank url")
	public void hits_enters_on_browser_guru_bank_url() throws InterruptedException {
		System.out.println("hits enters on browser guru bank url");
		Thread.sleep(2000);
	}

	@Then("user should see the username and password textboxes of guru bank")
	public void user_should_see_the_username_and_password_textboxes_of_guru_bank() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Bank Project']")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
	}
	@When("^users enters \"(.*)\" and \"(.*)\"$")
	public void users_enters_and_of_guru_bank(String UserName, String Password) throws InterruptedException {
		driver.findElement(By.name("uid")).sendKeys(UserName);
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(Password);
		Thread.sleep(3000);
	}
	@When("clicks on login of guru bank")
	public void clicks_on_login_of_guru_bank() throws InterruptedException {
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
	}

	@Then("user should see the home page of guru bank")
	public void user_should_see_the_home_page_of_guru_bank() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='New Customer']")).isDisplayed();
		Thread.sleep(2000);
	}
	@Given("user on fund transfer page")
	public void user_on_fund_transfer_page() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Fund Transfer']")).isDisplayed();    
		Thread.sleep(2000);	
	}

	@When("user clicks on fund transfer page")
	public void user_clicks_on_fund_transfer_page() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Fund Transfer']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Fund Transfer']")).click();
		Thread.sleep(2000);
		
	}

	@Then("user should see the Payers account no,Payees account no,Amount and Description textboxes")
	public void user_should_see_the_payers_account_no_payees_account_no_amount_and_description_textboxes() throws InterruptedException {
		System.out.println("user should see the Payers account no,Payees account no,Amount and Description textboxes");
		Thread.sleep(2000);
	}

	@When("user enters Payers account no,Payees account no,Amount and Description")
	public void user_enters_payers_account_no_payees_account_no_amount_and_description() throws InterruptedException {
		driver.findElement(By.name("payersaccount")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.name("payeeaccount")).sendKeys("14356");
		Thread.sleep(2000);
		driver.findElement(By.name("ammount")).sendKeys("2000");
		Thread.sleep(2000);
		driver.findElement(By.name("desc")).sendKeys("personal transaction");
		Thread.sleep(2000);
	}

	@When("clicks on submit button of fund transfer")
	public void clicks_on_submit_button_of_fund_transfer() throws InterruptedException {
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}

	@Then("clicks on backward button")
	public void clicks_on_backward_button() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
	}

	@Then("clicks on refresh button")
	public void clicks_on_refresh_button() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Given("user is on New _Account page")
	public void user_is_on_new__account_page() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='New Account']")).isDisplayed();
		Thread.sleep(2000);
	}

	@When("user clicks on New_Account")
	public void user_clicks_on_new_account() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='New Account']")).click();
		Thread.sleep(2000);
	}

	@Then("user should see the Customer id,Account type and Initial deposit	textboxes")
	public void user_should_see_the_customer_id_account_type_and_initial_deposit_textboxes() throws InterruptedException {
		System.out.println("user should see the Customer id,Account type and Initial deposit	textboxes");
		Thread.sleep(2000);
	}
	@When("user enters Customer id,Account type and Initial deposit	textboxes")
	public void user_enters_customer_id_account_type_and_initial_deposit_textboxes() throws InterruptedException {
		driver.findElement(By.name("cusid")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.name("selaccount")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("selaccount")).sendKeys("Savings");
		Thread.sleep(2000);
		driver.findElement(By.name("inideposit")).sendKeys("2500");
		Thread.sleep(2000);
	}
	@Then("clicks on submit button of New_Account")
	public void clicks_on_submit_button_of_new_account() throws InterruptedException {
		driver.findElement(By.name("button2")).click();
		Thread.sleep(2000);
	}

	@Then("user should get msg as account created successfully")
	public void user_should_get_msg_as_account_created_successfully() throws InterruptedException {
		System.out.println("user should get msg as account created successfully");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	@Given("user is on deposite page")
	public void user_is_on_deposite_page() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Deposit']")).isDisplayed();
		Thread.sleep(2000);
	}

	@When("user clicks on deposite button")
	public void user_clicks_on_deposite_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Deposit']")).click();  
		Thread.sleep(2000);
	}

	@Then("user should see the Account No,Amount and Description")
	public void user_should_see_the_account_no_amount_and_description() {
		System.out.println("user should see the Account No,Amount and Description");
	}

	@When("user enters Account No,Amount and Description")
	public void user_enters_account_no_amount_and_description() throws InterruptedException {
		driver.findElement(By.name("accountno")).sendKeys("123432");
		Thread.sleep(2000);
		driver.findElement(By.name("ammount")).sendKeys("2000");
		Thread.sleep(2000);
		driver.findElement(By.name("desc")).sendKeys("Personal transaction");
		Thread.sleep(2000);
	}

	@When("clicks on submit button of deposite")
	public void clicks_on_submit_button_of_deposite() throws InterruptedException {
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(2000);
	}

	@Then("user get msg as amount deposited successfully")
	public void user_get_msg_as_amount_deposited_successfully() throws InterruptedException {
		System.out.println("user get msg as amount deposited successfully");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
	}
}
