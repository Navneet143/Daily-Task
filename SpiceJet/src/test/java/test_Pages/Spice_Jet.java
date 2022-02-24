package test_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import spiceJet_Pages.ChromeBrowser;
import spiceJet_Pages.PassengerDetails;
import spiceJet_Pages.Payment;
import spiceJet_Pages.Select_Flight;
import spiceJet_Pages.Select_Seat_Meals;
import spiceJet_Pages.Welcome_Board;

public class Spice_Jet {

    static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/gourav.vig/eclipse-workspace/Cucumber/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		welcomeBoard();
		selectFlight();
		passengerDetails();
		selectSeatAndMeal();
		payment();
		driver.quit();
		
	}
	
	
	public static void chromeBrowser() {
		ChromeBrowser browser = new ChromeBrowser(driver);
		browser.launch_ChromeBrowser();
	}
	
	public static void welcomeBoard() {
		Welcome_Board WB = new Welcome_Board(driver);
		WB.fromLocation();
		WB.toLocation();
		WB.departureDate();
		WB.searchButton();
	}
	
	public static void selectFlight() {
		Select_Flight SF = new Select_Flight(driver);
		SF.selectFlight();
		SF.continueButton();
	}
	
	public static void passengerDetails() {
		PassengerDetails PD = new PassengerDetails(driver);
		PD.details();
		PD.continueButton2();
	}
	
	public static void selectSeatAndMeal() throws InterruptedException {
		Select_Seat_Meals SM = new Select_Seat_Meals(driver);
		SM.selectSeat();
		SM.adjacentSeat();
		SM.accept();
		SM.cont_Meal_Button();
		SM.selectMeal();
		SM.continueButtonAgain();
	}
	
	public static void payment() {
		Payment pay = new Payment(driver);
		pay.fetchData();
		pay.verifyData();
		pay.convenienceFee();
	}
	
}
