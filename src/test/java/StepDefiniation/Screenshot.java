package StepDefiniation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static WebDriver driver;
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	TakesScreenshot ts =(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("./Screenshot/ss.png");
	FileUtils.copyFile(source, destination);
	
}
}
