package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    private By myAccountHeader = By.className("page-heading");
    private By signOutButton = By.className("logout");
    private By homeButton = By.xpath("//*[@id=\"center_column\"]/ul/li/a/span");

    public boolean checkMyAccountHeader()
    {
        return driver.findElement(myAccountHeader).isDisplayed();
    }
    public void signOut()
    {
        click(driver.findElement(signOutButton));
    }

    public void clickHomeButton(){
        click(driver.findElement(homeButton));
    }
}
