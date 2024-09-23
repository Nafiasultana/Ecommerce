package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Pages.BaseQuickSite.driver;

public class StatusCard {

    @FindBy(xpath = "//div[@class='container']")
    WebElement bKashBox;
    //*[@id="app"]/div/div[2]
    //div[@id='app']
    //*[@id="app"]/div

    @FindBy(xpath = "//input[@id='wallet']")
    WebElement bKashWallet;
    //input[@id='wallet']

//    @FindBy(xpath = "//div[@class='payment']")
//    WebElement bKashNumber;
    //*[@id="app"]/div/div[2]

    @FindBy(xpath = "//button[normalize-space()='CONFIRM']")
    WebElement bconBtn;
    //*[@id="app"]/div/div[3]/div/div/div[2]/div/button[2]

    @FindBy(xpath = "//input[@id='otp']")
    WebElement otp;
    //*[@id="otp"]

    //button[normalize-space()='CONFIRM']
    //*[@id="app"]/div/div[3]/div/div/div[2]/div/button[2]

    @FindBy(xpath = "//input[@id='pin']")
    WebElement pin;
    //*[@id="pin"]
//    <input data-v-5a2b0f42="" data-v-151d1c81="" type="password" class="formControl" pattern="[0-9]*" inputmode="numeric" placeholder="Enter PIN" maxlength="5" autocomplete="one-time-code" required="" id="pin" style="" xpath="1">

    //button[normalize-space()='CONFIRM']
    //*[@id="app"]/div/div[3]/div/div/div[2]/div/button[2]

    @FindBy(xpath = "//div[@id='card']")
    WebElement cardBox;
    //*[@id="card"]

    @FindBy(xpath = "//div[@id='upper-side']")
    WebElement upperSide;

    @FindBy(xpath = "//div[@id='lower-side']")
    WebElement lowerSide;

    @FindBy(xpath = "//*[@id=\"message\"]")
    WebElement text;

    @FindBy(xpath = "//*[@id=\"contBtn\"]")
    WebElement conBtn;
    //*[@id="contBtn"]
    //a[@id='contBtn']


    public StatusCard() {PageFactory.initElements(driver, this);}

    public void bKashApp() throws InterruptedException {
        bKashBox.getLocation();
        bKashBox.isDisplayed();
        bKashBox.click();
        Thread.sleep(1000);
    }

    public void bWallet() throws InterruptedException {
        bKashWallet.sendKeys("01929918378");
        bKashWallet.click();
        Thread.sleep(1000);
    }

//    public void bPayment() throws InterruptedException {
//        bKashNumber.getLocation();
//        Thread.sleep(1000);
//    }

    public void bBtn() throws InterruptedException {
        bconBtn.isDisplayed();
        bconBtn.click();
        Thread.sleep(1000);
    }

    public void bOTP() throws InterruptedException {
        otp.sendKeys("123456");
        otp.getLocation();
        Thread.sleep(1000);
//        wait.until (ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contBtn\"]")));
//        otp.click();
//        Thread.sleep(1000);
    }

    public void bPIN() throws InterruptedException {
        pin.sendKeys("12121");
        pin.getLocation();
        Thread.sleep(1000);
    }

    public void boxCard() throws InterruptedException {
        cardBox.getLocation();
        cardBox.isDisplayed();
        cardBox.click();
        Thread.sleep(1000);
    }

    public void upSide() throws InterruptedException {
        upperSide.isDisplayed();
        upperSide.click();
        Thread.sleep(1000);
    }

    public void lowSide() throws InterruptedException {
        lowerSide.isDisplayed();
        lowerSide.click();
        Thread.sleep(1000);
    }

    public void message() throws InterruptedException {
        text.isDisplayed();
        text.click();
        Thread.sleep(1000);
    }

    public void continueBtn() throws InterruptedException {
        conBtn.isDisplayed();
        conBtn.click();
        Thread.sleep(2000);
    }
}

//div[@id='card']
//*[@id="card"]
//*[@id="upper-side"]
//div[@id='upper-side']
//*[@id="checkmark"]
//div[@id='upper-side']//*[name()='svg']
//*[@id="status"]
//h3[@id='status']
//*[@id="lower-side"]
//div[@id='lower-side']
//*[@id="message"]
//p[@id='message']
//*[@id="contBtn"]
//a[@id='contBtn']