package login;

import base.BaseTests;
import dataProvider.DataProv;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

import static org.testng.Assert.*;


public class LoginTests extends BaseTests {
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    MyAccountPage myAccountPage = new MyAccountPage(driver);


    @Test(priority = 2, dataProvider = "validLogin", dataProviderClass = DataProv.class)
    public void testValidLogin(String email, String password){
        homePage.clickSignIn();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickSignIn();
        assertTrue(myAccountPage.checkMyAccountHeader());

    }
}
