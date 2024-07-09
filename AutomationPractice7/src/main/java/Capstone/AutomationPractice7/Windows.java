package Capstone.AutomationPractice7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository16\\AutomationPractice7\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement opwindow = driver.findElement(By.id("openwindow"));
		opwindow.click();
		Thread.sleep(3000);
		String currentwindowhandle = driver.getWindowHandle();
		System.out.println(currentwindowhandle);
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterators = windowhandles.iterator();
		String Firsthandlestore = iterators.next();
		String Secondhandlestore = iterators.next();
		System.out.println("This is First = " + Firsthandlestore);
		System.out.println("This is Seconde = " + Secondhandlestore);
		driver.switchTo().window(Secondhandlestore);
		Thread.sleep(6000);
		WebElement courses = driver.findElement(By.xpath("(//*[text()='Courses'])[1]"));
		courses.click();
		

	}

}
