package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "identifierId")
	@CacheLookup
	WebElement txtFieldEmail;
	
	@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/div[2]")
	@CacheLookup
	WebElement nextEmailBtn;
	
	
	@FindBy(xpath = "//*[@id=\"password\"]//div[1]/input")
	@CacheLookup
	WebElement txtFieldPassword;
	
	@FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button/div[2]")
	@CacheLookup
	WebElement nextPwdBtn;
	
	
	@FindBy(xpath = "//div[contains(text(),'Compose')]")
	@CacheLookup
	WebElement composeButton;
	
	
	@FindBy(xpath = "//textarea[@name='to']")
	@CacheLookup
	WebElement fieldTo;
	
	@FindBy(xpath = "//input[@name='subjectbox']")
	@CacheLookup
	WebElement subjectField;
	
	@FindBy(xpath = "//div[@class='Am Al editable LW-avf']")
	@CacheLookup
	WebElement messageBody;
	
	@FindBy(xpath = "//div[text()='Send']")
	@CacheLookup
	WebElement btnSend;
	
	public void clickNext1() {
		nextEmailBtn.click();
	}
	
	public void clickNext2() {
		nextPwdBtn.click();
	}
	
	public void setUserEmail(String userEmail) {
		txtFieldEmail.clear();
		txtFieldEmail.sendKeys(userEmail);
	}
	
	public void setPassword(String pwd) {
		txtFieldPassword.clear();
		txtFieldPassword.sendKeys(pwd);
	}
	
	public void clickCompose() {
		composeButton.click();
	}
	
	public void enterToField(String recipient) {
		fieldTo.clear();
		fieldTo.sendKeys(recipient);
	}
	
	public void enterSubject(String subject) {
		subjectField.clear();
		subjectField.sendKeys(subject);
	}
	
	public void message(String msg) {
		messageBody.clear();
		messageBody.sendKeys(msg);
	}	
	
	public void clickSend() {
		btnSend.click();
	}

}
