package Capstone.AutomationPractice7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice7\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement alerts = driver.findElement(By.name("alert"));
		alerts.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement confirm = driver.findElement(By.name("confirmation"));
		confirm.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement promp = driver.findElement(By.name("prompt"));
		promp.click();
//		driver.switchTo().alert().sendKeys("Alert is displayed");
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		Alert prompAlert = driver.switchTo().alert();
		String alertText = prompAlert.getText();
		System.out.println("Alert Text is " + " _ " + alertText);
		prompAlert.sendKeys("Text User");
		Thread.sleep(6000);
		prompAlert.accept();
		
		
		

	}

}
