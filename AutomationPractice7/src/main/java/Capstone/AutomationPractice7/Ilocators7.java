package Capstone.AutomationPractice7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators7 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice7\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(9000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		Thread.sleep(3000);
		WebElement todaysdeals = driver.findElement(By.linkText("Today's Deals"));
		todaysdeals.click();
		Thread.sleep(6000);
		WebElement customerser = driver.findElement(By.partialLinkText("Customer"));
		customerser.click();
		Thread.sleep(3000);
		WebElement searchbox = driver.findElement(By.name("field-keywords"));
		searchbox.sendKeys("Computer");

	}

}
