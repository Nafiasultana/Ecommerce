package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends BaseQuickSite {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='modal-body']//form")
    WebElement form;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @FindBy(xpath = "//input[@placeholder='Enter your phone number']")
    WebElement phoneNumberBox;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement clicklogin;

    public void loginButton() throws InterruptedException {
        loginButton.isDisplayed();
        loginButton.click();
        Thread.sleep(2000);
    }

    public void form() throws InterruptedException {
        form.isDisplayed();
        form.click();
        Thread.sleep(2000);
    }

    public void phoneNumberBox(String phonenumber) throws InterruptedException {
        phoneNumberBox.sendKeys("01332505462");
        Thread.sleep(2000);
    }

    public void clicklogin() throws InterruptedException {
        clicklogin.isDisplayed();
        clicklogin.click();
        Thread.sleep(2000);
//        tearDown();
}}