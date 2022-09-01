package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummerDressesPage extends BasePage{
    public SummerDressesPage(WebDriver driver) {
        super(driver);
    }

    private By lSize = By.id("layered_id_attribute_group_3");
    private By orangeColor = By.id("layered_id_attribute_group_13");
    private By addToCartButton = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span");
    private By proceedToCheckout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");

    public void clickLSize(){
        click(driver.findElement(lSize));
    }

    public void selectOrange(){
        click(driver.findElement(orangeColor));
    }

    public void clickAddToCart(){
        click(driver.findElement(addToCartButton));
    }

    public void clickProceedToCheckout(){
        click(driver.findElement(proceedToCheckout));
    }

}
