package TestCases;

import Pages.BaseQuickSite;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PlaceOrderTestCases extends BaseQuickSite {
    public PlaceOrderTestCases() {super();}

    WebDriver driver;
    LoginPage loginPage;
    ProductPage productPage;
    CheckoutPage checkoutPage;

    @Test
    public void testBillingDetails() throws InterruptedException {
        loginPage = new LoginPage();
        loginPage.loginButton();
        loginPage.form();
        loginPage.phoneNumberBox("01332505462");
        loginPage.clicklogin();
        Thread.sleep(2000);
        productPage = new ProductPage();
        productPage.getHover();
        productPage.hoverProduct();
        productPage.getBag();
        productPage.bagCon();
        productPage.addProduct();
        productPage.proceedToCheckout();
        Thread.sleep(2000);
        CheckoutPage checkout = new CheckoutPage();
        /*checkout.getform2();
        checkout.typeName();
        checkout.typeEmail();
        checkout.typeNumber();
        checkout.typeCity();
        checkout.typeArea();*/
//        checkout.selectDeliveryType();
        checkout.getDropdown();
//        checkout.insideDha();
        /*checkout.typeAddress();
        checkout.typeDeliveryAddress();*/
        checkout.tickBox();
//        checkout.selectPaymentMethod();
        checkout.setdropDown();
        checkout.clickPlaceOrder();
        Thread.sleep(4000);
    }
}

/*public void backToHomepage() {
    backToHomepageButton.click();
}
}
public static void billingDetails() {
}
public static void backToHomePage() {
}*/
