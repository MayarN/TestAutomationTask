package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage{
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    private By summaryProceedToCheckout = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
    private By addressProceedToCheckout = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
    private By termsOfServiceTick = By.id("cgv");
    private By shippingProceedToCheckout = By.xpath("//*[@id=\"form\"]/p/button/span");
    private By payByCheck = By.className("cheque");
    private By confirmOrderButton = By.xpath("//*[@id=\"cart_navigation\"]/button/span");
    private By backToOrders = By.className("button-exclusive btn btn-default");

    public void clickProceedToCheckoutSummary(){
        click(driver.findElement(summaryProceedToCheckout));
    }
    public void clickProceedToCheckoutAddress(){
        click(driver.findElement(addressProceedToCheckout));
    }

    public void clickProceedToCheckoutShipping(){
        click(driver.findElement(shippingProceedToCheckout));
    }

    public void agreeToTermsOfService(){
        click(driver.findElement(termsOfServiceTick));
    }

    public void clickPayByCheck(){
        click(driver.findElement(payByCheck));
    }

    public void clickIConfirmMyOrder(){
        click(driver.findElement(confirmOrderButton));
    }

    public void clickBackToOrders(){
        click(driver.findElement(backToOrders));
    }
}
