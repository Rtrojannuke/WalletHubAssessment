package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseContainer.TestBase;
import baseContainer.utility;
import pages.fb_login;

public class fbtests extends TestBase{
	utility utils = new utility();
	
	@Test(dataProvider = "facebook")
	public void loginTest(String username, String password) throws Exception {
		fb_login login = new fb_login(driver);
		login.inputEmail(username);
		login.inputPassword(password);
		login.clickLogin();
		login.clickCreatePost();
		login.createPostContent();
		login.postToUser();
	}
	
	@DataProvider(name = "facebook")
    public Object[][] testData() throws Exception
    {
        return new Object[][]
                {
                        {"username", "passwd"}
                };
    }

}
