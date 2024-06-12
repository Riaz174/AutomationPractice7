package Capstone.AutomationPractice7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes7 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice7\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(9000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
//		WebElement searchbox = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
//		searchbox.sendKeys("Computer");
		WebElement phoneField = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		phoneField.sendKeys("john@gmail.com");
		WebElement pword = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pword.sendKeys("abcdef");
		Thread.sleep(3000);
		WebElement loginField = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		loginField.click();
		Thread.sleep(3000);
		WebElement forgotpword = driver.findElement(By.linkText("Forgotten password?"));
		forgotpword.click();

	}

}
