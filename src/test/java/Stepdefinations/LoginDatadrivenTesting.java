package Stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDatadrivenTesting {

	private WebDriver driver;
	
	@Given("user entering the {string}")
	public void user_entering_the(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
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

	@Then("Homepage should not be open")
	public void homepage_should_not_be_open() {
		boolean visible = driver.findElement(By.id("spanMessage")).isDisplayed();
		if(visible) {
			
			Assert.assertTrue("credentials are invalid login is not perfroming (((", true);
		}else {
			
			Assert.assertFalse("credentials are invalid login is perforing **",true);
		}
		
	}
}
