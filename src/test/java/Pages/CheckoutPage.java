package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Pages.BaseQuickSite.driver;

public class CheckoutPage {

//    @FindBy(xpath = "//input[@placeholder='Enter your name']")
//    WebElement name;
//
//    @FindBy(xpath = "//input[@placeholder='Enter your Email']")
//    WebElement email;
//
//    @FindBy(xpath = "//input[@placeholder='Enter your phone number']")
//    WebElement phoneNumber;
//
//    @FindBy(xpath = "//input[@placeholder='Enter your city']")
//    WebElement city;
//
//    @FindBy(xpath = "//input[@placeholder='Enter your area']")
//    WebElement area;

    @FindBy(name = "deliveryType")
    WebElement selectDT;
    //select[@name='deliveryType'])[1]
    //select[@name='deliveryType']
    //*[@id="checkout"]/section/div/div[2]/form/div/div[1]/div[5]/select/option[2]

    @FindBy(xpath = "//*[@id=\"checkout\"]/section/div/div[2]/form/div/div[1]/div[5]/select")
    WebElement selectType;
    //("//div[@role="listitem"])[1]
//    /html/body/div/div[1]/div[4]/section/div/div[2]/form/div/div[1]/div[5]/select

    @FindBy(xpath = "//input[@placeholder='Enter your address']")
    WebElement address;

    @FindBy(xpath = "//input[@placeholder='Enter your Product Receving Address']")
    WebElement rAddress;

    @FindBy(xpath = "//span[@class='checkmark']")
    WebElement checkmark;

    @FindBy(xpath = "//option[@value='cash']")
    WebElement selectPT;
    //*[@id="checkout"]/section/div/div[2]/form/div/div[2]/div/div[5]/select/option[2]

    @FindBy(xpath = "//*[@id=\"checkout\"]/section/div/div[2]/form/div/div[2]/div/button")
    WebElement button;
    //button[normalize-space()='PLACE ORDER']


    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

//    public void typeName() throws InterruptedException {
//        name.sendKeys();
//        name.isDisplayed();
//        Thread.sleep(1000);
//    }
//
//    public void typeEmail() throws InterruptedException {
//        email.sendKeys();
//        email.isDisplayed();
//        Thread.sleep(1000);
//    }
//
//    public void typeNumber() throws InterruptedException {
//        phoneNumber.sendKeys();
//        phoneNumber.isDisplayed();
//        Thread.sleep(1000);
//    }
//
//    public void typeCity() throws InterruptedException {
//        city.sendKeys();
//        city.isDisplayed();
//        Thread.sleep(1000);
//    }
//
//    public void typeArea() throws InterruptedException {
//        area.sendKeys();
//        area.isDisplayed();
//        Thread.sleep(1000);
//    }

    public void getDropdown() throws InterruptedException{
        selectType.click();
        selectType.isSelected();
        selectType.isDisplayed();
        Thread.sleep(1000);
    }

    public void selectDeliveryType(String deliveryType) throws InterruptedException{
        selectDT.click();
        selectDT.sendKeys(deliveryType);
        selectDT.isSelected();
        selectDT.isDisplayed();
        Thread.sleep(1000);
    }

    public void typeAddress() throws InterruptedException {
        address.sendKeys();
        address.isDisplayed();
        Thread.sleep(1000);
    }

    public void typeDeliveryAddress() throws InterruptedException {
        rAddress.sendKeys();
        rAddress.isDisplayed();
        Thread.sleep(1000);
    }

    public void tickBox() throws InterruptedException {
        checkmark.click();
        checkmark.isSelected();
        checkmark.isDisplayed();
        Thread.sleep(1000);
    }

    public void selectPaymentMethod() throws InterruptedException {
        selectPT.click();
        selectPT.sendKeys();
        selectPT.isSelected();
        selectPT.isDisplayed();
        Thread.sleep(1000);
    }

    public void clickPlaceOrder() throws InterruptedException {
        button.click();
        button.isSelected();
        button.isDisplayed();
        Thread.sleep(1000);
    }

    public void selectDeliveryType() {
    }
}