package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    private By genderMrs = By.id("id_gender2");
    private By firstName = By.name("customer_firstname");
    private By lastName = By.name("customer_lastname");
    private By password = By.id("passwd");
    private By firstName_address = By.id("firstname");
    private By lastName_address = By.id("lastname");
    private By address = By.id("address1");
    private By city = By.id("city");
    private By state = By.id("id_state");
    private By postalCode = By.id("postcode");
    private By country = By.id("id_country");
    private By mobilePhone = By.id("phone_mobile");
    private By alias = By.id("alias");
    private By registerButton = By.id("submitAccount");

    public void chooseGender_Mrs()
    {
        click(driver.findElement(genderMrs));
    }

    public void enterFirstName(String customerFirstName)
    {
        enterText(driver.findElement(firstName), customerFirstName);
    }

    public void enterLastName(String customerLastName)
    {
        enterText(driver.findElement(lastName), customerLastName);
    }


    public void enterPassword(String customerPassword)
    {
        enterText(driver.findElement(password), customerPassword);
    }

    public void enterFirstName_Address(String addressFirstName)
    {
        enterText(driver.findElement(firstName_address), addressFirstName);
    }
    public void enterLastName_Address(String addressLastName)
    {
        enterText(driver.findElement(lastName_address), addressLastName);
    }
    public void enterAddress(String customerAddress)
    {
        enterText(driver.findElement(address), customerAddress);
    }
    public void enterCity(String cityName)
    {
        enterText(driver.findElement(city), cityName);
    }
    public void selectState(String stateName)
    {
        dropdown = new Select(driver.findElement(state));
        dropdown.selectByVisibleText(stateName);
    }
    public void enterZipCode(String zipCode)
    {
        enterText(driver.findElement(postalCode), zipCode);
    }
    public void selectCountry(String countryName)
    {
        dropdown=new Select(driver.findElement(country));
        dropdown.selectByVisibleText(countryName);
    }

    public void enterMobilePhone(String mobile)
    {
        enterText(driver.findElement(mobilePhone), mobile);
    }
    public void enterAlias(String addressAlias)
    {
        enterText(driver.findElement(alias),addressAlias);
    }
    public void clickRegisterButton()
    {
        click(driver.findElement(registerButton));
    }
}
