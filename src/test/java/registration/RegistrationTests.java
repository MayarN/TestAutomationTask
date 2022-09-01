package registration;

import base.BaseTests;
import dataProvider.DataProv;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import static org.testng.Assert.*;


public class RegistrationTests extends BaseTests {
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    RegistrationPage registrationPage = new RegistrationPage(driver);
    MyAccountPage myAccountPage = new MyAccountPage(driver);

    @Test(priority = 1, dataProvider = "validRegister", dataProviderClass = DataProv.class)
    public void testValidRegistration(String email,String firstName, String lastName, String password, String firstNameAddress, String lastNameAddress,String address, String city, String state,String postalCode,String country,String mobile, String alias){
        homePage.clickSignIn();
        loginPage.enterEmailRegister(email);
        loginPage.clickCreateAnAccount();
        registrationPage.chooseGender_Mrs();
        registrationPage.enterFirstName(firstName);
        registrationPage.enterLastName(lastName);
        registrationPage.enterPassword(password);
        registrationPage.enterFirstName_Address(firstNameAddress);
        registrationPage.enterLastName_Address(lastNameAddress);
        registrationPage.enterAddress(address);
        registrationPage.enterCity(city);
        registrationPage.selectState(state);
        registrationPage.enterZipCode(postalCode);
        registrationPage.selectCountry(country);
        registrationPage.enterMobilePhone(mobile);
        registrationPage.enterAlias(alias);
        registrationPage.clickRegisterButton();
        assertTrue(myAccountPage.checkMyAccountHeader());
        myAccountPage.signOut();


    }
}

