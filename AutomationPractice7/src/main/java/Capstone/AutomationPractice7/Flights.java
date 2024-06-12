package Capstone.AutomationPractice7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice7\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement flight = driver.findElement(By.xpath("//*[@id=\"multi-product-search-form-1\"]/div/div/div[1]/ul/li[2]/a/span"));
		flight.click();
		Thread.sleep(6000);
		WebElement dates = driver.findElement(By.xpath("//*[@data-testid='uitk-date-selector-input1-default']"));
		dates.click();
		Thread.sleep(6000);
		WebElement depatdate = driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]/div/section/div[2]/div/div/div[3]/div/div[1]/table/tbody/tr[5]/td[7]/div"));
		depatdate.click();
		

	}

}
