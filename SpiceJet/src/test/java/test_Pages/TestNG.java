package test_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import spiceJet_Pages.ChromeBrowser;
import spiceJet_Pages.PassengerDetails;
import spiceJet_Pages.Payment;
import spiceJet_Pages.Select_Flight;
import spiceJet_Pages.Select_Seat_Meals;
import spiceJet_Pages.Welcome_Board;

public class TestNG {

static WebDriver driver = null;
	
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:/Users/gourav.vig/eclipse-workspace/Cucumber/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	
	
	@Test(priority = 0)
	public static void welcomeBoard() {
		Welcome_Board WB = new Welcome_Board(driver);
		WB.fromLocation();
		WB.toLocation();
		WB.departureDate();
		WB.searchButton();
	}
	@Test(priority = 1)
	public static void selectFlight() {
		Select_Flight SF = new Select_Flight(driver);
		SF.selectFlight();
		SF.continueButton();
	}
	@Test(priority = 2)
	public static void passengerDetails() {
		PassengerDetails PD = new PassengerDetails(driver);
		PD.details();
		PD.continueButton2();
	}
	@Test(priority = 3)
	public static void selectSeatAndMeal() throws InterruptedException {
		Select_Seat_Meals SM = new Select_Seat_Meals(driver);
		SM.selectSeat();
		SM.adjacentSeat();
		SM.accept();
		SM.cont_Meal_Button();
		SM.selectMeal();
		SM.continueButtonAgain();
	}
	@Test(priority = 4)
	public static void payment() {
		Payment pay = new Payment(driver);
		pay.fetchData();
		pay.verifyData();
		pay.convenienceFee();
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
