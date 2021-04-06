package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageobjects.LoginPage;

@SuppressWarnings("deprecation")
public class Compose {
	public WebDriver driver;
	public LoginPage loginPage;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();	    
	}

	@When("User enters Email as {string}")
	public void user_enters_email_as(String email) throws InterruptedException{
		loginPage.setUserEmail(email);
		Thread.sleep(3000);
	}

	@When("Click on Next")
	public void click_on_next() throws InterruptedException {
		loginPage.clickNext1(); 
		Thread.sleep(10000);
	}

	@When("User enters Password as {string}")
	public void user_enters_password_as(String pwd) throws InterruptedException {
		Thread.sleep(10000);
		loginPage.setPassword(pwd);
		Thread.sleep(3000);
	}

	@When("Click on Login")
	public void click_on_login() {
		loginPage.clickNext2(); 
	}

	@SuppressWarnings("deprecation")
	@Then("Page Title should contain {string}")
	public void page_title_should_contain(String string) {
		if(driver.getTitle().contains(string))
		{
			Assert.assertTrue(true);
			
		}else {
			driver.close();
			Assert.assertTrue(false);
		}
	}
	
	@Then("Click on Compose button")
	public void click_on_compose_button() {
		loginPage.clickCompose();; 
	}

	@Then("User enters To {string}")
	public void user_enters_to(String string) {
		loginPage.enterToField(string);
	    
	}

	@Then("User enters Subject {string}")
	public void user_enters_subject(String string) {
	   loginPage.enterSubject(string);
	}

	@Then("User enters messageBody {string}")
	public void user_enters_message_body(String string) {
	    loginPage.message(string);
	}

	@Then("Click on Send")
	public void click_on_send() {
	    loginPage.clickSend();
	}



	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}


}
