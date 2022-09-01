package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    private By signInButton = By.className("login");
    private By dressesDropdown = By.className("sf-with-ul");
    private By summerDresses = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a");


    public void clickSignIn(){
        click(driver.findElement(signInButton));
    }

    public void selectSummerDresses(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(dressesDropdown)).perform();
        click(driver.findElement(summerDresses));
    }


}
