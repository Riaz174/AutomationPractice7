package Capstone.AutomationPractice7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice7\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement createaccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createaccount.click();
		Thread.sleep(6000);
//		WebElement fname = driver.findElement(By.name("firstname"));
//		fname.sendKeys("john");
//		Thread.sleep(3000);
//		WebElement sname = driver.findElement(By.name("lastname"));
//		sname.sendKeys("Doe");
//		Thread.sleep(6000);
//		WebElement emailField = driver.findElement(By.name("reg_email__"));
//		emailField.sendKeys("john@gmail.com");
//		Thread.sleep(6000);
//		WebElement pword = driver.findElement(By.name("reg_passwd__"));
//		pword.sendKeys("abcdef");
		WebElement birthday = driver.findElement(By.name("birthday_day"));
		Select ob = new Select(birthday);
		ob.selectByIndex(6);
		WebElement birthmonth = driver.findElement(By.name("birthday_month"));
		Select om =new Select(birthmonth);
		om.selectByValue("9");
		WebElement birthyear = driver.findElement(By.name("birthday_year"));
		Select oy = new Select(birthyear);
		oy.selectByVisibleText("1953");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		gender.click();


	}

}
