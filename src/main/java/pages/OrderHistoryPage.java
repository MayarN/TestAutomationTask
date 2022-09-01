package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPage extends BasePage{
    public OrderHistoryPage(WebDriver driver) {
        super(driver);
    }

    private By orderDate = By.className("history_date bold");

    public String getOrderDate(){
        return driver.findElement(orderDate).getText();
    }
}
