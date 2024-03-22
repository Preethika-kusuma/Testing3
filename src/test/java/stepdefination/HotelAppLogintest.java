package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class HotelAppLogintest {
 
WebDriver driver;
//ExtentReports extent;
//ExtentTest testCase;
 
	
	@Given("Successful login into HotelApp1")
	public void successful_login_into_hotel_app1() {
		driver=new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
	}
 
	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
 
	@When("When I enter the password as {string}")
	public void when_i_enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
 
	@When("When I click on login button")
	public void when_i_click_on_login_button() {
		driver.findElement(By.id("login")).click();
	}
 
	@Then("I should be redirected to the HotelApp1")
	public void i_should_be_redirected_to_the_hotel_app1() {
		String expected="Hello Shinchan@21!";
		String actual=driver.findElement(By.id("username_show")).getAttribute("value");
		AssertJUnit.assertTrue(actual.equalsIgnoreCase(expected));
	}
	System.out.println("Added");
 
}





