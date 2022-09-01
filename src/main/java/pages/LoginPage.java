package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By createEmail = By.id("email_create");
    private By createAccountButton = By.id("SubmitCreate");
    private By email = By.id("email");
    private By password = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");


    public void enterEmailRegister(String email)
    {
        enterText(driver.findElement(createEmail), email);
    }
    public void clickCreateAnAccount()
    {
        click(driver.findElement(createAccountButton));
    }
    public void enterEmail(String userEmail)
    {
        enterText(driver.findElement(email), userEmail);
    }
    public void enterPassword(String userPassword)
    {
        enterText(driver.findElement(password), userPassword);
    }
    public void clickSignIn()
    {
        click(driver.findElement(signInButton));
    }
}
