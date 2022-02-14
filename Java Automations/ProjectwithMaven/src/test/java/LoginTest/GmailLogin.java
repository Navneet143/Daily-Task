package LoginTest;




import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	WebDriver driver;
	@Rule public TestName testname = new TestName();
	@Before
	public void RunBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	@After
	public void AttheEnd() {
		System.out.println(testname.getMethodName() +" Test has Ended");
	}
	@Test
	public void Gmail() {
		String url="https://accounts.google.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys("navneetjuneja567@gmail.com");
		driver.findElement(By.xpath("//button[@jscontroller and @jsname]")).click();
	}
}
