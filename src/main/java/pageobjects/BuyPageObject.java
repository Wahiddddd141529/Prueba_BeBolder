package pageobjects;

import io.cucumber.java.eo.Se;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BuyPageObject  extends PageObject {
    By btnTShirt = By.xpath("//a[@title='T-shirts']");
    By imgTshirt = By.xpath("//a[@itemprop='url' and @title='Faded Short Sleeve T-shirts' and @class='product-name']");
    By imgDress = By.xpath("//a[@itemprop='url' and @title='Printed Dress' and @class='product-name']");
    By selectSize = By.cssSelector("select");
    By txtQuantity = By.xpath("//input[@id='quantity_wanted']");
    By addToCart = By.xpath("//button[@class='exclusive']");
    By checkOut = By.xpath("//a[@title='Proceed to checkout']");
    By proccedAddress = By.xpath("//button[@class='button btn btn-default button-medium']");
    By TyC = By.xpath("//input[@id='cgv']");
    By finishBuy = By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']");
    By payForCheque = By.xpath("//a[@class='cheque']");
    By confirmOrder = By.xpath("//button[@class='button btn btn-default button-medium']");
    By orderConfirm = By.xpath("//p[contains(text(), 'Your order on My Shop is complete.')]");
    public By getBtnTShirt() {
        return btnTShirt;
    }

    public By getImgTshirt() {
        return imgTshirt;
    }

    public By getSelectSize() {
        return selectSize;
    }

    public By getAddToCart() {
        return addToCart;
    }

    public By getCheckOut() {
        return checkOut;
    }
    public By getProccedAddress() {
        return proccedAddress;
    }
    public By getTyC() {
        return TyC;
    }
    public By getFinishBuy() {
        return finishBuy;
    }

    public By getPayForCheque() {
        return payForCheque;
    }

    public By getConfirmOrder() {
        return confirmOrder;
    }

    public By getOrderConfirm() {
        return orderConfirm;
    }

    public By getImgDress() {
        return imgDress;
    }

    public By getTxtQuantity() {
        return txtQuantity;
    }


    public void buyTShirt() throws InterruptedException {
        getDriver().get("http://www.automationpractice.pl/index.php?id_category=5&controller=category");
        getDriver().findElement(getImgTshirt()).click();
        Thread.sleep(5000);
        Select selectSize = new Select(getDriver().findElement(getSelectSize()));
        selectSize.selectByValue("3");
        Serenity.takeScreenshot();
        getDriver().findElement(getAddToCart()).click();
        getDriver().findElement(getCheckOut()).click();
        List<WebElement> itemGroup = getDriver().findElements(getCheckOut());
        for (int i = 0; i <= itemGroup.size(); i++) {
            if (itemGroup.get(i).isDisplayed()) {
                itemGroup.get(i).click();
                break;
            }
            Serenity.takeScreenshot();
        }
        getDriver().findElement(getProccedAddress()).click();
        Thread.sleep(2000);
        Serenity.takeScreenshot();
        getDriver().findElement(getTyC()).click();
        Thread.sleep(2000);
        Serenity.takeScreenshot();
        getDriver().findElement(getFinishBuy()).click();
        Thread.sleep(2000);
        getDriver().findElement(getPayForCheque()).click();
        Serenity.takeScreenshot();
        Thread.sleep(2000);
        getDriver().findElement(getConfirmOrder()).click();
        Serenity.takeScreenshot();
        if(getDriver().findElement(getOrderConfirm()).isEnabled()){
            System.out.println("Orden Confirmada");
        }
    }

    public void buyDress() throws InterruptedException {
        getDriver().get("http://www.automationpractice.pl/index.php?id_category=8&controller=category");
        getDriver().findElement(getImgDress()).click();
        Thread.sleep(5000);
        Select selectSize = new Select(getDriver().findElement(getSelectSize()));
        selectSize.selectByValue("2");
        getDriver().findElement(getTxtQuantity()).clear();
        getDriver().findElement(getTxtQuantity()).sendKeys("10");
        Serenity.takeScreenshot();
        getDriver().findElement(getAddToCart()).click();
        getDriver().findElement(getCheckOut()).click();
        List<WebElement> itemGroup = getDriver().findElements(getCheckOut());
        for (int i = 0; i <= itemGroup.size(); i++) {
            if (itemGroup.get(i).isDisplayed()) {
                itemGroup.get(i).click();
                break;
            }
            Serenity.takeScreenshot();
        }
        getDriver().findElement(getProccedAddress()).click();
        Thread.sleep(2000);
        Serenity.takeScreenshot();
        getDriver().findElement(getTyC()).click();
        Thread.sleep(2000);
        Serenity.takeScreenshot();
        getDriver().findElement(getFinishBuy()).click();
        Thread.sleep(2000);
        getDriver().findElement(getPayForCheque()).click();
        Serenity.takeScreenshot();
        Thread.sleep(2000);
        getDriver().findElement(getConfirmOrder()).click();
        Serenity.takeScreenshot();
        if(getDriver().findElement(getOrderConfirm()).isEnabled()){
            System.out.println("Orden Confirmada");
        }
    }
}