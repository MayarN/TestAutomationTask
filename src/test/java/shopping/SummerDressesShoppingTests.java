package shopping;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;
import static org.testng.Assert.*;


public class SummerDressesShoppingTests extends BaseTests {
    HomePage homePage = new HomePage(driver);
    MyAccountPage myAccountPage = new MyAccountPage(driver);
    SummerDressesPage summerDressesPage = new SummerDressesPage(driver);
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
    OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);

    @Test(priority = 3)
    public void testBuyingSummerDress(){
      myAccountPage.clickHomeButton();
      homePage.selectSummerDresses();
      summerDressesPage.clickLSize();
      summerDressesPage.selectOrange();
      summerDressesPage.clickAddToCart();
      summerDressesPage.clickProceedToCheckout();
      shoppingCartPage.clickProceedToCheckoutSummary();
      shoppingCartPage.clickProceedToCheckoutAddress();
      shoppingCartPage.agreeToTermsOfService();
      shoppingCartPage.clickProceedToCheckoutShipping();
      shoppingCartPage.clickPayByCheck();
      shoppingCartPage.clickIConfirmMyOrder();
      shoppingCartPage.clickBackToOrders();
      assertEquals(orderHistoryPage.getOrderDate(), "09/01/2022", "Msg is correct");


    }
}
