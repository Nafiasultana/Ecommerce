package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Pages.BaseQuickSite.driver;

public class ProductPage{
    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

    Actions actions = new Actions(driver);
//    actions.getHover(elementToHover).perform();
//    Create an instance of Actions classActions actions = new Actions(driver);
//    Perform the hover actionactions.moveToElement(elementToHover).perform();

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[4]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[6]/div[1]/div[1]/ul[1]/li[3]")
    WebElement elementToHover;

    @FindBy(xpath = "(//i[@class='fa fa-shopping-bag'])[1]")
    WebElement cartIcon;

//    @FindBy(xpath = "//*[@id=\"react-aria7101942236-:r1:-tabpane-all\"]/div/div[6]/div/div[1]/ul/li[3]/button")
//    WebElement cartIcon;

//    @FindBy(xpath = "//div[@class='col-lg-3 col-md-3']//li[2]//a[1]")
//    WebElement bagIcon;

//    @FindBy(xpath = "//div[@class='header__cart']")
//    WebElement bagIcon;

    @FindBy(xpath = "//i[@class='fa fa-shopping-bag']")
    WebElement bagIcon;
    //i[@class='fa fa-shopping-bag']
    //*[@id="header"]/header/div/div[1]/div[3]/div/ul/li[2]/a/i

//    @FindBy(xpath = "//*[@id=\"shopping_cart\"]/section/div/div[1]/div/div")
//    WebElement shopCart;

    //*[@id="header"]/header/div/div[1]/div[3]/div/ul/li[2]
    //*[@id="header"]/header/div/div[1]/div[3]/div/ul/li[2]/a/i
    //td[@class='shoping__cart__item']//img

//    @FindBy(xpath = "//*[@id=\"react-aria1011197704-:r1:-tabpane-all\"]/div/div[6]/div/div[1]")
//    WebElement cauliflowerPic;

    @FindBy(xpath = "//i[@class='fa-solid fa-plus']")
    WebElement plusIcon;

//    @FindBy(xpath = "//button[normalize-space()='ADD TO CART']")
//    WebElement addToCartButton;

    @FindBy(xpath = "//a[normalize-space()='PROCEED TO CHECKOUT']")
    WebElement proceedToCheckoutButton;

//    @FindBy(xpath = "//*[@id=\"shopping_cart\"]/section/div/div[2]/div[3]/div/a")
//    WebElement checkoutButton;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public void getHover() throws InterruptedException{
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",elementToHover);
        actions.moveToElement(elementToHover).perform();
        Thread.sleep(1000);
    }

  /*  public void getBag() throws InterruptedException{
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",bagIcon);
//        javascriptExecutor.executeScript("window.scrollBy(0, -500);");
//        Thread.sleep(2000);
        actions.moveToElement(bagIcon).perform();
        Thread.sleep(1000);
    }*/

    public void hoverProduct() throws InterruptedException{
        elementToHover.click();
        Thread.sleep(1000);
    }

    public void getBag() throws InterruptedException{
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",cartIcon);
        Thread.sleep(1000);
        cartIcon.click();
        Thread.sleep(1000);
    }

    /*public void proshopCart() throws InterruptedException{
        shopCart.click();
        Thread.sleep(1000);
    }*/

    public void bagCon() throws InterruptedException{
        bagIcon.click();
        bagIcon.getLocation();
        Thread.sleep(1000);
    }

//    public void setCauliflowerPic() throws InterruptedException {
//        cauliflowerPic.isDisplayed();
//        Thread.sleep(1000);
//    }

    public void addProduct() throws InterruptedException{
        plusIcon.click();
        Thread.sleep(1000);
    }

//    public void addToCart() throws InterruptedException {
//        addToCartButton.click();
////        addToCartButton.wait(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
//        Thread.sleep(1000);
//    }

    public void proceedToCheckout() throws InterruptedException {
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",proceedToCheckoutButton);
        Thread.sleep(1000);
        proceedToCheckoutButton.click();
        Thread.sleep(1000);
//        proceedToCheckoutButton.getLocation();
//        Thread.sleep(1000);
//        javascriptExecutor.executeScript("window.scrollBy(0, -500);");
//        Thread.sleep(1000);
    }
}
