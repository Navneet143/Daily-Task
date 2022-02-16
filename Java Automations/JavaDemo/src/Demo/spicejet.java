package Demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Software\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.spicejet.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement city = driver.findElement(By.xpath("//input[@value=\"Select Destination\"]"));
		city.sendKeys("BLR");
		//WebElement calender =driver.findElement(By.cssSelector("div[data-testid=\"departure-date-dropdown-label-test-id\"]"));
		//calender.click();
		WebElement date = driver.findElement(
				By.xpath("//div[contains(@data-testid,\"February-2022\")]//div[contains(@data-testid,\"day-26\")]"));
		System.out.println(date.toString());
		date.click();
		WebElement search=driver.findElement(By.xpath("//div[@data-testid=\"home-page-flight-cta\"]"));
		search.click();
		driver.findElement(By.xpath("//div[@data-testid=\"continue-search-page-cta\"]")).click();
		
	}
}