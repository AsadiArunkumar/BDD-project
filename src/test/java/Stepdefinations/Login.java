package Stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	private WebDriver driver;

	@Given("user entering the {string}")
	public void user_entering_the(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	@When("entering the {string} and {string}")
	public void entering_the_and(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@And("clicked the login button")
	public void clicked_the_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("home page should be visible")
	public void home_page_should_be_visible() {
	    String Expectedtitle = "OrangeHRM";
	    String Actualtitle = driver.getTitle();
	}
}
