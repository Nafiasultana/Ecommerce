package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static Pages.BaseQuickSite.driver;

public class CheckoutPage {

    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

    Actions actions = new Actions(driver);


    @FindBy(xpath = "//*[@id=\"checkout\"]/section/div/div[2]/form")
    WebElement form2;

    @FindBy(xpath = "//input[@placeholder='Enter your name']")
    WebElement name;

    @FindBy(xpath = "//input[@placeholder='Enter your Email']")
    WebElement email;

    @FindBy(xpath = "//input[@placeholder='Enter your phone number']")
    WebElement phoneNumber;

    @FindBy(xpath = "//input[@placeholder='Enter your city']")
    WebElement city;

    @FindBy(xpath = "//input[@placeholder='Enter your area']")
    WebElement area;

    @FindBy(xpath = "//select[@name='deliveryType']")
    WebElement selectDT;

//    /html[1]/body[1]/div[1]/div[1]/div[4]/section[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[5]/select[1]
//    @FindBy(name = "deliveryType")
    //select[@name='deliveryType'])[1]
    //*[@id="checkout"]/section/div/div[2]/form/div/div[1]/div[5]/select/option[2]

//    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[4]/section[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[5]/select[1]/option[2]")
//    WebElement inD;
    //option[@value='InSideDhaka'])

    @FindBy(xpath = "//*[@id=\"checkout\"]/section/div/div[2]/form/div/div[1]/div[5]/select/option[2]")
    WebElement selectType;

    //*[@id="checkout"]/section/div/div[2]/form/div/div[1]/div[5]/select
    //*[@id="checkout"]/section/div/div[2]/form/div/div[1]/div[6]
//    /html/body/div/div[1]/div[4]/section/div/div[2]/form/div/div[1]/div[5]/select

    @FindBy(xpath = "//input[@placeholder='Enter your address']")
    WebElement address;

    @FindBy(xpath = "//input[@placeholder='Enter your Product Receving Address']")
    WebElement rAddress;

    @FindBy(xpath = "//span[@class='checkmark']")
    WebElement checkmark;

    @FindBy(xpath = "//select[@name='payment_type']")
    WebElement selectPT;
    //select[@name='payment_type']
    //div[@class='checkout__order']//div[@class='checkout__input']
    //option[@value='cash']
    //*[@id="checkout"]/section/div/div[2]/form/div/div[2]/div/div[5]
    //*[@id="checkout"]/section/div/div[2]/form/div/div[2]/div/div[5]/select
//    /html/body/div/div[1]/div[4]/section/div/div[2]/form/div/div[2]/div/div[5]/select
//    <select class="w-100 border-1 border-success rounded-2 px-2" name="payment_type" required="" style="height: 50px;" xpath="1"><option value="">Select Payment Method</option><option value="cash">Cash On Delivery</option><option value="bkash">Bkash</option></select>

    @FindBy(xpath = "//*[@id=\"checkout\"]/section/div/div[2]/form/div/div[2]/div/button")
    WebElement button;
    //button[normalize-space()='PLACE ORDER']
    //*[@id="checkout"]/section/div/div[2]/form/div/div[2]/div/button


    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    public void getform2() throws InterruptedException {
        form2.getLocation();
        form2.isDisplayed();
        Thread.sleep(1000);
    }

    public void typeName() throws InterruptedException {
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", name);
        actions.moveToElement(name).perform();
        name.isDisplayed();
        Thread.sleep(1000);
    }

    public void typeEmail() throws InterruptedException {
        email.isDisplayed();
        Thread.sleep(1000);
    }

    public void typeNumber() throws InterruptedException {
        phoneNumber.isDisplayed();
        Thread.sleep(1000);
    }

    public void typeCity() throws InterruptedException {
//        city.sendKeys();
        city.isDisplayed();
        Thread.sleep(1000);
    }

    public void typeArea() throws InterruptedException {
//        area.sendKeys();
        area.isDisplayed();
        Thread.sleep(1000);
    }

    public void selectDeliveryType() throws InterruptedException {
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", selectDT);
        Thread.sleep(1000);
        selectDT.click();
//        selectDT.sendKeys();
//        selectDT.isSelected();
//        selectDT.isDisplayed();
        Thread.sleep(1000);
    }

    public void getDropdown() throws InterruptedException {
        Select select = new Select(selectDT);
        select.selectByValue("OutSideDhaka");
        selectType.click();
        /*electType.isSelected();
        selectType.isDisplayed();
        selectType.getText();
        selectType.clear();*/
        Thread.sleep(1000);
    }

//    public void insideDha() throws InterruptedException {
//        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",inD);
//        Thread.sleep(1000);
//        inD.click();
//        inD.isSelected();
//        Thread.sleep(1000);
//    }

    public void typeAddress() throws InterruptedException {
//        address.sendKeys();
        address.isDisplayed();
        Thread.sleep(1000);
    }

    public void typeDeliveryAddress() throws InterruptedException {
//        rAddress.sendKeys();
        rAddress.isDisplayed();
        Thread.sleep(1000);
    }

    public void tickBox() throws InterruptedException {
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", checkmark);
        Thread.sleep(1000);
        checkmark.click();
//        checkmark.isSelected();
//        checkmark.isDisplayed();
        Thread.sleep(1000);
    }

    public void selectPaymentMethod() throws InterruptedException {
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", selectPT);
        Thread.sleep(1000);
        selectPT.click();
//        selectPT.isSelected();
//        selectPT.isDisplayed();
    }

    public void setdropDown() throws InterruptedException {
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", selectPT);
        Select select = new Select(selectPT);
        select.selectByValue("bkash");
        Thread.sleep(1000);
    }

    public void clickPlaceOrder() throws InterruptedException {
        button.isDisplayed();
        button.click();
        Thread.sleep(1000);
    }
}