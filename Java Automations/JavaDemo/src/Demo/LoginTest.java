package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Software\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/users/sign_in");
	WebElement username=driver.findElement(By.xpath("//input[@id=\"user_email_login\"]"));
	WebElement password=driver.findElement(By.id("user_password"));
	WebElement login=driver.findElement(By.name("commit"));
//	username.click();
//	username.clear();	
	username.sendKeys("paxeve6043@alfaceti.com");
	password.sendKeys("welcome@back");
	//driver.findElement(By.id("tnc_checkbox")).click();
	login.click();
	
	
	
}
	
}