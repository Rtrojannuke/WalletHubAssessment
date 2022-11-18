package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseContainer.TestBase;
import pages.fb_login;
import pages.loginPage;

public class Wallet_LoginTest extends TestBase{
	@Test(dataProvider = "WalletHubData")
	public void loginTest(String username, String password) throws Exception {
		loginPage login = new loginPage(driver);
		login.clickLoginOnLpg();
		Thread.sleep(2000);
		login.inputEmail(username);
		login.inputPassword(password);
		login.clickLogin();
	}
	
	@DataProvider(name = "WalletHubData")
    public Object[][] testData() throws Exception
    {
        return new Object[][]
                {
                        {"walletUsername", "walletPassword"}
                };
    }

}
