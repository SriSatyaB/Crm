package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Crm_LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Log In']")
	WebElement loginBtn;
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement submitBtn;
	@FindBy(xpath="//span[@class='user-display']")
	WebElement userDisplay;
	@FindBy(xpath="//div[@class='ui basic button floating item dropdown']/i")
	WebElement settingBtn;
	@FindBy(xpath="//span[text()='Log Out']")
	WebElement logoutBtn;
	@FindBy(xpath="//div[@class='ui negative message']/p")
	WebElement invalidUser;
	
	public Crm_LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	public void enterCredentials(String emailId,String pwd) {
		email.sendKeys(emailId);
		password.sendKeys(pwd);
	}
	public void clickOnSubmitBtn() {
		submitBtn.click();
	}
	public String verifyUser() {
		return userDisplay.getText();
		
	}
	public String verifyInvalidUser() {
		return invalidUser.getText();
		
	}
	public void logout() {
		settingBtn.click();
		logoutBtn.click();
	}

}
