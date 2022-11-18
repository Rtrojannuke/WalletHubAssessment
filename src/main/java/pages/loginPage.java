package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseContainer.TestBase;
import baseContainer.utility;

public class loginPage extends TestBase{
	utility utils = new utility();
	
	String WalletLog = OR.getProperty("WalletLog");
	
    String emailField = OR.getProperty("WalletEmailField");

    String passwordField = OR.getProperty("WalletPasswordField");

    String loginBtn = OR.getProperty("WalletLoginBtn");
    
    public loginPage(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(TestBase.driver, this);
    }
    
    public void clickLoginOnLpg() {
    	driver.findElement(By.xpath(WalletLog)).click();
    }
    
    public void inputEmail(String username) throws Exception {
    	driver.findElement(By.xpath(emailField)).click();
    	driver.findElement(By.xpath(emailField)).sendKeys(utils.fetchData(username));
    }
    
    public void inputPassword(String password) throws Exception {
    	driver.findElement(By.xpath(passwordField)).click();
    	driver.findElement(By.xpath(passwordField)).sendKeys(utils.fetchData(password));
    }
    
    public void clickLogin() {
    	driver.findElement(By.xpath(loginBtn)).click();
    }

}
