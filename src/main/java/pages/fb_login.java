package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseContainer.TestBase;
import baseContainer.utility;

public class fb_login extends TestBase{
	utility utils = new utility();
    String emailField_XPATH = OR.getProperty("emailInputField_XPATH");

    String passwordField_XPATH = OR.getProperty("passwordField_XPATH");

    String loginBtn = OR.getProperty("loginBtn_XPATH");
    
    String postBtn = OR.getProperty("createPostBTN");
    
    String postMessage = OR.getProperty("postBoxMessage");
    
    String postToUser = OR.getProperty("postBtn");
    
    public fb_login(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(TestBase.driver, this);
    }
    
    public void inputEmail(String username) throws Exception {
    	driver.findElement(By.xpath(emailField_XPATH)).click();
    	driver.findElement(By.xpath(emailField_XPATH)).sendKeys(utils.fetchData(username));
    }
    
    public void inputPassword(String password) throws Exception {
    	driver.findElement(By.xpath(passwordField_XPATH)).click();
    	driver.findElement(By.xpath(passwordField_XPATH)).sendKeys(utils.fetchData(password));
    }
    
    public void clickLogin() {
    	driver.findElement(By.xpath(loginBtn)).click();
    }
    
    public void clickCreatePost() {
    	driver.findElement(By.xpath(postBtn)).isDisplayed();
    	driver.findElement(By.xpath(postBtn)).click();
    }
    
    public void createPostContent() throws Exception {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath(postMessage)).click();
    	driver.findElement(By.xpath(postMessage)).sendKeys(utils.fetchData("fbPost"));
    }
    
    public void postToUser() {
    	driver.findElement(By.xpath(postToUser)).isEnabled();
    	driver.findElement(By.xpath(postToUser)).click();
    }

}
