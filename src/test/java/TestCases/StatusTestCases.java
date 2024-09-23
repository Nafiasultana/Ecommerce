package TestCases;

import Pages.BaseQuickSite;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.CheckoutPage;
import Pages.StatusCard;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static Pages.BaseQuickSite.driver;

public class StatusTestCases extends BaseQuickSite {

    public StatusTestCases() {super();}

    WebDriver driver;
    LoginPage loginPage;
    ProductPage productPage;
    CheckoutPage checkoutPage;
    StatusCard statusCard;

    @Test
    public void testStatus() throws InterruptedException {
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
        checkoutPage = new CheckoutPage();
        checkoutPage.getDropdown();
        checkoutPage.tickBox();
        checkoutPage.setdropDown();
        checkoutPage.clickPlaceOrder();
        Thread.sleep(2000);
        StatusCard status = new StatusCard();
        status.bKashApp();
        status.bWallet();
//        status.bPayment();
        status.bBtn();
        status.bOTP();
        status.bBtn();
        status.bPIN();
        status.bBtn();
        status.boxCard();
        status.upSide();
        status.lowSide();
        status.message();
        status.continueBtn();
        Thread.sleep(4000);
    }
}
