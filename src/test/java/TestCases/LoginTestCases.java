package TestCases;

import Pages.BaseQuickSite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Pages.LoginPage;
public class LoginTestCases extends BaseQuickSite {
    public LoginTestCases() {
        super();
    }

    WebDriver driver;
    LoginPage loginPage;

    @Test
    public void testLogin() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.loginButton();
        login.form();
        login.phoneNumberBox("01332505462");
        login.clicklogin();
        login.tearDown();
    }
}
