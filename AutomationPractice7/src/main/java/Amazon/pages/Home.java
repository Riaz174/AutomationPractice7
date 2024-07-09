package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public static WebDriver driver;
	@FindBy(name = "email") WebElement sign;
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void signClick() {
		sign.sendKeys("doe@gmail.com");
	}

}
