package TestCases;

import Pages.BaseQuickSite;
import Pages.LoginPage;
import Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProductTestCases extends BaseQuickSite {
    public ProductTestCases() {super();}

    WebDriver driver;
    LoginPage loginPage;
    ProductPage productPage;

    @Test
    public void testProduct() throws InterruptedException {
        loginPage = new LoginPage();
        loginPage.loginButton();
        loginPage.form();
        loginPage.phoneNumberBox("01332505642");
        loginPage.clicklogin();
        Thread.sleep(2000);
        ProductPage product = new ProductPage();
        product.getHover();
        product.hoverProduct();
//        product.cartCon();
//        product.proshopCart();
        product.getBag();
        product.bagCon();
//        product.setCauliflowerPic();
        product.addProduct();
//        product.addToCart();
        product.proceedToCheckout();
        Thread.sleep(2000);
    }
}
