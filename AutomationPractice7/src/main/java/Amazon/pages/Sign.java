package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	public static WebDriver driver;
	@FindBy(id = "email") WebElement email;
	@FindBy(id = "pass") WebElement Pword;
	public Sign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void emailSendKeys() {
		email.sendKeys("john@gmail.com");
	}
	public void PwordSendKeys() {
		Pword.sendKeys("xyzabc");
		
	}
	

}
