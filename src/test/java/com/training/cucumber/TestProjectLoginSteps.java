package com.training.cucumber;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.training.pages.LoginPage;
import com.training.pages.LoginPage_PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProjectLoginSteps {
	String browserName = "edge";
	WebDriver driver;
	//LoginPage loginPage;
	LoginPage_PageFactory loginPage;

	@Given("new tab is open")
	public void new_tab_is_open() {
		if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		loginPage = new LoginPage_PageFactory(driver);
	}
	@Given("user is on login page of test project")
	public void user_is_on_login_page_of_test_project() {
		driver.get("https://example.testproject.io/web/");
		assertTrue(loginPage.checkLoginDisplayed());
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
	}
	@When("user clicks on login button of test project")
	public void user_clicks_on_login_button_of_test_project() {
		loginPage.clickLogin();
	}
	@Then("user is navigated to the home page of test project")
	public void user_is_navigated_to_the_home_page_of_test_project() {
		assertTrue(loginPage.checkLogoutDisplayed());

	}

}
