package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;

	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4");
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password(String username, String password) throws Throwable {
		driver.findElement(By.name("uid")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
	}

	@Then("^Reset the credential$")
	public void Reset_the_credential() throws Throwable {
		 driver.findElement(By.name("btnReset")).click();
		 Thread.sleep(5000);
		 driver.close();
		 
	}

}