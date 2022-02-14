package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookLogin {

@SuppressWarnings("deprecation")
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Software\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement username=driver.findElement(By.id("email"));
	WebElement password=driver.findElement(By.id("pass"));
	WebElement login=driver.findElement(By.name("login"));
//	username.click();
//	username.clear();	
	username.sendKeys("vigoj73552@taukah.com");
	password.sendKeys("hey@ashu");
	//driver.findElement(By.id("tnc_checkbox")).click();
	login.click();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@aria-label=\"More options\"]//i")).click();
	driver.findElement(By.xpath("//span[contains(text(),\"Log Out\")]")).click();
	
}
	
}